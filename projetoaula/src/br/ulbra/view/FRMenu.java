/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

/**
 *
 * @author aluno.saolucas
 */
public class FRMenu extends javax.swing.JFrame {

    /**
     * Creates new form FRMenu
     */
    public FRMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cadastro = new javax.swing.JMenu();
        MEUsuarioCad = new javax.swing.JMenuItem();
        CadJogo = new javax.swing.JMenuItem();
        MESairCad = new javax.swing.JMenuItem();
        Consulta = new javax.swing.JMenu();
        MEUsuarioCon = new javax.swing.JMenuItem();
        MEnseiCon = new javax.swing.JMenuItem();
        Ajuda = new javax.swing.JMenu();
        MEsobreAju = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("(ULBRA) -MENU");

        jPanel1.setBackground(new java.awt.Color(0, 204, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(108, 108, 108))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(53, 53, 53))
        );

        Cadastro.setText("Cadastros");

        MEUsuarioCad.setText("Usuarios");
        MEUsuarioCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEUsuarioCadActionPerformed(evt);
            }
        });
        Cadastro.add(MEUsuarioCad);

        CadJogo.setText("Cadastrar jogo");
        CadJogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadJogoMouseClicked(evt);
            }
        });
        CadJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadJogoActionPerformed(evt);
            }
        });
        Cadastro.add(CadJogo);

        MESairCad.setText("Sair");
        MESairCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MESairCadActionPerformed(evt);
            }
        });
        Cadastro.add(MESairCad);

        jMenuBar1.add(Cadastro);

        Consulta.setText("Consultas");

        MEUsuarioCon.setText("Usuarios");
        MEUsuarioCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEUsuarioConActionPerformed(evt);
            }
        });
        Consulta.add(MEUsuarioCon);

        MEnseiCon.setText("Comparar jogos");
        MEnseiCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEnseiConActionPerformed(evt);
            }
        });
        Consulta.add(MEnseiCon);

        jMenuBar1.add(Consulta);

        Ajuda.setText("Ajuda");

        MEsobreAju.setText("Sobre");
        MEsobreAju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEsobreAjuActionPerformed(evt);
            }
        });
        Ajuda.add(MEsobreAju);

        jMenuBar1.add(Ajuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MEUsuarioCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEUsuarioCadActionPerformed
        new FRcaduso(this,rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_MEUsuarioCadActionPerformed

    private void MEUsuarioConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEUsuarioConActionPerformed
        new FRConusu(this,rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_MEUsuarioConActionPerformed
    
    private void MESairCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MESairCadActionPerformed
       this.dispose();
    }//GEN-LAST:event_MESairCadActionPerformed

    private void MEsobreAjuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEsobreAjuActionPerformed
       new FRSobre(this,rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_MEsobreAjuActionPerformed

    private void CadJogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadJogoMouseClicked
        new FRCadjog(this,rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_CadJogoMouseClicked

    private void CadJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadJogoActionPerformed
        new FRCadjog(this,rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_CadJogoActionPerformed

    private void MEnseiConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEnseiConActionPerformed
        new FRCompararjog(this,rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_MEnseiConActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ajuda;
    private javax.swing.JMenuItem CadJogo;
    private javax.swing.JMenu Cadastro;
    private javax.swing.JMenu Consulta;
    private javax.swing.JMenuItem MESairCad;
    private javax.swing.JMenuItem MEUsuarioCad;
    private javax.swing.JMenuItem MEUsuarioCon;
    private javax.swing.JMenuItem MEnseiCon;
    private javax.swing.JMenuItem MEsobreAju;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
