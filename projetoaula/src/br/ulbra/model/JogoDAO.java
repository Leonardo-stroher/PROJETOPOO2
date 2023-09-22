/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonardo-stroher
 */
public class JogoDAO {
    
     private GerenciadorConexao gerenciador;

    public JogoDAO() {
        this.gerenciador = GerenciadorConexao.getInstancia();
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
}
