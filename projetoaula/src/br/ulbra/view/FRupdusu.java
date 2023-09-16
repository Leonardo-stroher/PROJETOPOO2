/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.controller.UsuarioController;
import br.ulbra.model.Usuario;
import br.ulbra.utils.Utils;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class FRupdusu extends javax.swing.JFrame {

    private int pkUsuario;

    public void setPKUsuario(int pk) {
        this.pkUsuario = pk;
    }

    /**
     * Creates new form FRupdusu
     */
    public FRupdusu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CaixaNome = new javax.swing.JTextField();
        CaixaNasc = new javax.swing.JTextField();
        CaixaEmail = new javax.swing.JTextField();
        BotãoAlterar = new javax.swing.JToggleButton();
        BotãoExcluir = new javax.swing.JToggleButton();
        MarcarAtivo = new javax.swing.JCheckBox();
        BotãoVoltar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        CaixaCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CaixaSenha = new javax.swing.JPasswordField();
        CaixaRepetirSenha = new javax.swing.JPasswordField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/edit.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("USUÁRIO");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("NOME");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("EMAIL");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("DT. NASC");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("SENHA");

        CaixaNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        CaixaNasc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        CaixaEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        BotãoAlterar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BotãoAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/editar.png"))); // NOI18N
        BotãoAlterar.setText("ALTERAR");
        BotãoAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotãoAlterarMouseClicked(evt);
            }
        });
        BotãoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoAlterarActionPerformed(evt);
            }
        });

        BotãoExcluir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BotãoExcluir.setText("EXCLUIR");
        BotãoExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotãoExcluirMouseClicked(evt);
            }
        });

        MarcarAtivo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        MarcarAtivo.setText("Ativo");

        BotãoVoltar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BotãoVoltar.setText("VOLTAR");
        BotãoVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotãoVoltarMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("CÓDIGO");

        CaixaCodigo.setEditable(false);
        CaixaCodigo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CaixaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaCodigoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("REPETIR SENHA");

        CaixaSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        CaixaRepetirSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CaixaRepetirSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaRepetirSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(BotãoAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotãoExcluir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel7)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel6)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CaixaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CaixaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CaixaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CaixaNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(CaixaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addGap(26, 26, 26)
                                .addComponent(CaixaRepetirSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotãoVoltar)
                    .addComponent(MarcarAtivo))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(MarcarAtivo)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(CaixaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CaixaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CaixaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CaixaNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CaixaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CaixaRepetirSenha))
                        .addGap(44, 44, 44)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotãoAlterar)
                    .addComponent(BotãoExcluir)
                    .addComponent(BotãoVoltar))
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotãoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotãoAlterarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        UsuarioController controller = new UsuarioController();
        Usuario usu = controller.readForPK(pkUsuario);

        String codigo = String.valueOf(usu.getPkusuario());
        CaixaCodigo.setText(codigo);
        CaixaNome.setText(usu.getNomeUsu());
        CaixaEmail.setText(usu.getEmailUsu());
        CaixaNasc.setText(usu.getDataNascUsu());
        CaixaSenha.setText(usu.getSenhaUsu());
        CaixaRepetirSenha.setText(usu.getSenhaUsu());
        MarcarAtivo.setSelected(usu.isAtivoUsu() == 1);
    }//GEN-LAST:event_formWindowActivated

    private void CaixaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaixaCodigoActionPerformed

    private void BotãoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoVoltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_BotãoVoltarMouseClicked

    private void BotãoExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoExcluirMouseClicked
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja excluir o usuario?",
                "confirmação", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            UsuarioController controller = new UsuarioController();
            if (controller.excluirUsuario(pkUsuario)) {
                this.dispose();
            }
        }


    }//GEN-LAST:event_BotãoExcluirMouseClicked
    private boolean verificarCampos() {
        if (CaixaNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo 'nome' em branco");
            return false;
        }
        String texto = CaixaNome.getText();
        if (!texto.matches("^[\\p{L} ]+$")) {
            JOptionPane.showMessageDialog(null, "Campo 'nome' não pode conter caracteres especias ou numeros");
            return false;
        }

        if (CaixaEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo 'email' em branco");
            return false;
        }

        if (!CaixaEmail.getText().matches("^[a-zA-Z._0-9]+@[a-zA-Z._]+.[a-zA-Z._]+$")) {
            JOptionPane.showMessageDialog(null, "Campo 'email' não pode conter caracteres especias");

            return false;
        }
        if (!CaixaNasc.getText().matches("^[0-9]{2}/[0-9]{2}/[0-9]{4}$")) {
            JOptionPane.showMessageDialog(null, "Campo 'data nascimento' "
                    + "possui informações inválidas"
                    + "Ex:01/01/2000");
            return false;
        }

        char[] senha = CaixaSenha.getPassword();
        if (new String(senha).length() < 8) {
            JOptionPane.showMessageDialog(null, "Campo 'senha' deve ser maior que 8 caracteres");

            return false;
        }

        if (!new String(senha).equals(new String(CaixaSenha.getPassword()))) {
            JOptionPane.showMessageDialog(null, "As senhas não são iguais");

            return false;
        }

        return true;
    }

    private void BotãoAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoAlterarMouseClicked
        if (!verificarCampos()) {
            return;
        }

        UsuarioController controller = new UsuarioController();
        String senha = new String(CaixaSenha.getPassword());
        Usuario usuario = new Usuario();
        usuario.setPkusuario(pkUsuario);
        usuario.setnomeUsu(CaixaNome.getText());
        usuario.setEmailUsu(CaixaEmail.getText());
        usuario.setDataNascUsu(CaixaNasc.getText());
        usuario.setSenhaUsu(senha);
        usuario.setAtivoUsu(Utils.salvarBoolean(MarcarAtivo.isSelected()));
        if (controller.alterarUsuario(usuario)) {
            this.dispose();
        };

    }//GEN-LAST:event_BotãoAlterarMouseClicked

    private void CaixaRepetirSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaRepetirSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaixaRepetirSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(FRupdusu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRupdusu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRupdusu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRupdusu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRupdusu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotãoAlterar;
    private javax.swing.JToggleButton BotãoExcluir;
    private javax.swing.JButton BotãoVoltar;
    private javax.swing.JTextField CaixaCodigo;
    private javax.swing.JTextField CaixaEmail;
    private javax.swing.JTextField CaixaNasc;
    private javax.swing.JTextField CaixaNome;
    private javax.swing.JPasswordField CaixaRepetirSenha;
    private javax.swing.JPasswordField CaixaSenha;
    private javax.swing.JCheckBox MarcarAtivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
