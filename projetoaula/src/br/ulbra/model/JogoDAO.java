/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;

import br.ulbra.utils.Utils;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo-stroher
 */
public class JogoDAO {

    private GerenciadorConexao gerenciador;

    public JogoDAO() {
        this.gerenciador = GerenciadorConexao.getInstancia();
    }

    public List<Jogo> read() {
        String sql = "SELECT * FROM tbjogos";
        List<Jogo> jogos = new ArrayList<>();

        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Jogo jogo = new Jogo();

                jogo.setNomejog(rs.getString("nomejog"));
                jogo.setPrecojog(rs.getDouble("precojog"));
                jogo.setLojajog(rs.getString("lojajog"));
                jogo.setDescricaojog(rs.getString("descricaojog"));

                jogos.add(jogo);
            }

        } catch (SQLException ex) {
            Logger.getLogger(JogoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            GerenciadorConexao.closeConnection(con, stmt, rs);
        }

        return jogos;
    }

    public List<Jogo> readDescJogo(String nome) {
        String sql = "SELECT * FROM tbjogos WHERE nomejog LIKE ?";
        List<Jogo> jogos = new ArrayList<>();

        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Jogo jogo = new Jogo();

                jogo.setPkjogo(rs.getInt("pkjogo"));
                jogo.setNomejog(rs.getString("nomejog"));
                jogo.setPrecojog(rs.getDouble("precojog"));
                jogo.setLojajog(rs.getString("lojajog"));
                jogo.setDescricaojog(rs.getString("descricaojog"));

                jogos.add(jogo);
            }

        } catch (SQLException ex) {
            Logger.getLogger(JogoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            GerenciadorConexao.closeConnection(con, stmt, rs);
        }

        return jogos;
    }

    public Jogo readForPKjogo(int pk) {
        String sql = "SELECT * FROM tbjogos WHERE pkjogo = ?";
        GerenciadorConexao gerenciador = GerenciadorConexao.getInstancia();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Jogo jogo = new Jogo();

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, pk);

            rs = stmt.executeQuery();

            while (rs.next()) {
                jogo.setPkjogo(rs.getInt("pkjogo"));
                jogo.setNomejog(rs.getString("nomejog"));
                jogo.setPrecojog(rs.getDouble("Precojog"));
                jogo.setLojajog(rs.getString("Lojajog"));
                jogo.setDescricaojog(rs.getString("descricaojog"));

                byte[] bytes = rs.getBytes("imagemJogo");
                if (bytes != null) {
                    ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
                    BufferedImage imagem = ImageIO.read(bis);

                    jogo.setImagemJogo(new ImageIcon(imagem));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(JogoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage());
        } finally {
            GerenciadorConexao.closeConnection(con, stmt, rs);
        }
        return jogo;
    }

    public boolean adicionarJogo(Jogo j) {
        String sql = "INSERT into TBJOGOS (nomejog, precojog, lojajog,  descricaojog, imagemjogo) "
                + "VALUES (?,?,?,?,?)";
        try {
            byte[] iconbyte = Utils.iconToBytes(j.getImagemJogo());

            PreparedStatement stmt = gerenciador.getConexao().prepareStatement(sql);
            stmt.setString(1, j.getNomejog());
            stmt.setDouble(2, j.getPrecojog());
            stmt.setString(3, j.getLojajog());
            stmt.setString(4, j.getDescricaojog());
            stmt.setBytes(5, iconbyte);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Jogo: " + j.getNomejog() + " inserido com sucesso!");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        }
        return false;
    }

}
