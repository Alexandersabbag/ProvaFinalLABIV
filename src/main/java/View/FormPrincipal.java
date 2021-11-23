package View;

import javax.swing.JFrame;

public class FormPrincipal extends javax.swing.JFrame {

    public FormPrincipal() {
        initComponents();
        configurarForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        Menu = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        MenuCadastroUsuario = new javax.swing.JMenuItem();
        MenuCadastroEndereco = new javax.swing.JMenuItem();
        MenuCadastroEntrega = new javax.swing.JMenuItem();
        MenuCadastroVeiculo = new javax.swing.JMenuItem();
        MenuPesquisa = new javax.swing.JMenu();
        menuAtualizarUsuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        MenuCadastro.setText("Cadastro");

        MenuCadastroUsuario.setText("Usuários");
        MenuCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroUsuarioActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroUsuario);

        MenuCadastroEndereco.setText("Endereços");
        MenuCadastro.add(MenuCadastroEndereco);

        MenuCadastroEntrega.setText("Entregas");
        MenuCadastro.add(MenuCadastroEntrega);

        MenuCadastroVeiculo.setText("Veículos");
        MenuCadastro.add(MenuCadastroVeiculo);

        Menu.add(MenuCadastro);

        MenuPesquisa.setText("Buscar/Atualizar");

        menuAtualizarUsuarios.setText("Usuários");
        MenuPesquisa.add(menuAtualizarUsuarios);

        Menu.add(MenuPesquisa);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCadastroUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenuItem MenuCadastroEndereco;
    private javax.swing.JMenuItem MenuCadastroEntrega;
    private javax.swing.JMenuItem MenuCadastroUsuario;
    private javax.swing.JMenuItem MenuCadastroVeiculo;
    private javax.swing.JMenu MenuPesquisa;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem menuAtualizarUsuarios;
    // End of variables declaration//GEN-END:variables
    
    private void configurarForm(){
        this.setTitle("Menu Principal");
        this.setResizable(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
}
