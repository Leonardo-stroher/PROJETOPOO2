package br.ulbra.model;

import br.ulbra.utils.Utils;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class UsuarioDAO {

    private GerenciadorConexao gerenciador;

    public UsuarioDAO() {
        this.gerenciador = GerenciadorConexao.getInstancia();
    }

    public boolean autenticar(String email, String senha) {
        String sql = "SELECT * from TBUSUARIO WHERE emailUsu = ? and senhaUsu = ? and ativoUsu = 1";
        try {
            PreparedStatement stmt = gerenciador.getConexao().prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }

    public boolean adicionarUsuario(Usuario u) {
        String sql = "INSERT into TBUSUARIO (nomeUsu, emailUSU, senhaUSU,  dataNascUsu, ativoUsu, imagemUsu) "
                + "VALUES (?,?,?,?,?,?)";
        try {
            byte[] iconbyte = Utils.iconToBytes(u.getImagemUsu());

            PreparedStatement stmt = gerenciador.getConexao().prepareStatement(sql);
            stmt.setString(1, u.getNomeUsu());
            stmt.setString(2, u.getEmailUsu());
            stmt.setString(3, u.getSenhaUsu());
            stmt.setString(4, u.getDataNascUsu());
            stmt.setInt(5, u.isAtivoUsu());
            stmt.setBytes(6, iconbyte);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário: " + u.getNomeUsu() + " inserido com sucesso!");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        }
        return false;
    }

    public List<Usuario> read() {
        String sql = "SELECT * FROM tbusuario";
        List<Usuario> usuarios = new ArrayList<>();

        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario usuario = new Usuario();

                usuario.setPkusuario(rs.getInt("pkusuario"));
                usuario.setnomeUsu(rs.getString("nomeusu"));
                usuario.setEmailUsu(rs.getString("emailusu"));
                usuario.setSenhaUsu(rs.getString("senhausu"));
                usuario.setDataNascUsu(rs.getString("datanascusu"));
                usuario.setAtivoUsu(rs.getInt("ativousu"));

                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            GerenciadorConexao.closeConnection(con, stmt, rs);
        }

        return usuarios;
    }

    public List<Usuario> readForDesc(int tipo, String desc) {
        String sql;
        if (tipo == 0 || tipo == 1) {
            sql = "SELECT * FROM tbusuario WHERE nomeusu LIKE ?";
        } else {
            sql = "SELECT * FROM tbusuario WHERE emailusu LIKE ?";
        }
        GerenciadorConexao gerenciador = GerenciadorConexao.getInstancia();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            if (tipo == 0 || tipo == 2) {
                stmt.setString(1, "%" + desc + "%");
            } else {
                stmt.setString(1, "%" + desc + "%");
            }

            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario usuario = new Usuario();

                usuario.setPkusuario(rs.getInt("pkusuario"));
                usuario.setnomeUsu(rs.getString("nomeusu"));
                usuario.setEmailUsu(rs.getString("emailusu"));
                usuario.setSenhaUsu(rs.getString("senhausu"));
                usuario.setDataNascUsu(rs.getString("datanascusu"));
                usuario.setAtivoUsu(rs.getInt("ativousu"));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            GerenciadorConexao.closeConnection(con, stmt, rs);
        }
        return usuarios;
    }

    public Usuario readForPK(int pk) {
        String sql = "SELECT * FROM tbusuario WHERE pkusuario = ?";
        GerenciadorConexao gerenciador = GerenciadorConexao.getInstancia();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = new Usuario();

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, pk);

            rs = stmt.executeQuery();

            while (rs.next()) {
                usuario.setPkusuario(rs.getInt("pkusuario"));
                usuario.setnomeUsu(rs.getString("nomeusu"));
                usuario.setEmailUsu(rs.getString("emailusu"));
                usuario.setSenhaUsu(rs.getString("senhausu"));
                usuario.setDataNascUsu(rs.getString("datanascusu"));
                usuario.setAtivoUsu(rs.getInt("ativousu"));

                byte[] bytes = rs.getBytes("imagemUsu");
                ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
                BufferedImage imagem = ImageIO.read(bis);

                usuario.setImagemUsu(new ImageIcon(imagem));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage());
        } finally {
            GerenciadorConexao.closeConnection(con, stmt, rs);
        }
        return usuario;
    }

    public boolean alterarUsuario(Usuario u) {
        GerenciadorConexao gerenciador = GerenciadorConexao.getInstancia();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;

        try {
            byte[] iconBytes = Utils.iconToBytes(u.getImagemUsu());

            stmt = con.prepareStatement("UPDATE tbusuario SET nomeusu = ?, "
                    + " emailusu = ?, senhausu = ?, datanascusu = ?, imagemUsu = ?, " + "ativousu = ? WHERE pkusuario = ?");
            stmt.setString(1, u.getNomeUsu());
            stmt.setString(2, u.getEmailUsu());
            stmt.setString(3, u.getSenhaUsu());
            stmt.setString(4, u.getDataNascUsu());
            stmt.setBytes(5, iconBytes);
            stmt.setInt(6, u.isAtivoUsu());
            stmt.setInt(7, u.getPkusuario());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de atualização" + ex);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        } finally {
            GerenciadorConexao.closeConnection(con, stmt);
        }
        return false;
    }

    public boolean excluirUsuario(int pkusuario) {
        GerenciadorConexao gerenciador = GerenciadorConexao.getInstancia();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tbusuario WHERE pkusuario = ?");
            stmt.setInt(1, pkusuario);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de exclusão" + ex);
        } finally {
            GerenciadorConexao.closeConnection(con, stmt);
        }
        return false;
    }
}
