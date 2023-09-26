/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;

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
                jogo.setDatalancjog(rs.getString("datalancjogo"));
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
                jogo.setDatalancjog(rs.getString("datalancjog"));
                jogo.setDescricaojog(rs.getString("descricaojog"));

                byte[] bytes = rs.getBytes("imagemJogo");
                ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
                BufferedImage imagem = ImageIO.read(bis);

                jogo.setImagemJogo(new ImageIcon(imagem));
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
}
