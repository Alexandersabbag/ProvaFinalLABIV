package View;

//Bibliotecas
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class FormPrincipal extends javax.swing.JFrame {

    public static boolean login = false;
    public static boolean admin = false;
    
    public FormPrincipal() {
        initComponents();
        configurarForm();
        abrirForm(new FormLogin());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaTrabalho = new javax.swing.JDesktopPane();
        Menu = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        MenuCadastroUsuario = new javax.swing.JMenuItem();
        MenuCadastroEndereco = new javax.swing.JMenuItem();
        MenuCadastroEntrega = new javax.swing.JMenuItem();
        MenuCadastroVeiculo = new javax.swing.JMenuItem();
        MenuPesquisa = new javax.swing.JMenu();
        menuConsultaUsuarios = new javax.swing.JMenuItem();
        menuConsultaEndereco = new javax.swing.JMenuItem();
        menuConsultaEntrega = new javax.swing.JMenuItem();
        menuConsultaVeiculo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout areaTrabalhoLayout = new javax.swing.GroupLayout(areaTrabalho);
        areaTrabalho.setLayout(areaTrabalhoLayout);
        areaTrabalhoLayout.setHorizontalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        areaTrabalhoLayout.setVerticalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
        MenuCadastroEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroEnderecoActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroEndereco);

        MenuCadastroEntrega.setText("Entregas");
        MenuCadastroEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroEntregaActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroEntrega);

        MenuCadastroVeiculo.setText("Veículos");
        MenuCadastroVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroVeiculoActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroVeiculo);

        Menu.add(MenuCadastro);

        MenuPesquisa.setText("Consultar/Atualizar");

        menuConsultaUsuarios.setText("Usuários");
        menuConsultaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaUsuariosActionPerformed(evt);
            }
        });
        MenuPesquisa.add(menuConsultaUsuarios);

        menuConsultaEndereco.setText("Endereço");
        menuConsultaEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaEnderecoActionPerformed(evt);
            }
        });
        MenuPesquisa.add(menuConsultaEndereco);

        menuConsultaEntrega.setText("Entregas");
        menuConsultaEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaEntregaActionPerformed(evt);
            }
        });
        MenuPesquisa.add(menuConsultaEntrega);

        menuConsultaVeiculo.setText("Veículos");
        menuConsultaVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaVeiculoActionPerformed(evt);
            }
        });
        MenuPesquisa.add(menuConsultaVeiculo);

        Menu.add(MenuPesquisa);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaTrabalho)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaTrabalho)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroUsuarioActionPerformed
        //Cadastro de Usuários
        if(verificarLogin() == true)
            abrirForm(new FormCadastroUsuario());
    }//GEN-LAST:event_MenuCadastroUsuarioActionPerformed

    private void MenuCadastroEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroEnderecoActionPerformed
        //Cadastro de Enderecos
        if(verificarLogin() == true)
            abrirForm(new FormCadastroEndereco());
    }//GEN-LAST:event_MenuCadastroEnderecoActionPerformed

    private void MenuCadastroEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroEntregaActionPerformed
        //Cadastro de Entregas
        if(verificarLogin() == true)
            abrirForm(new FormCadastroEntrega());
    }//GEN-LAST:event_MenuCadastroEntregaActionPerformed

    private void MenuCadastroVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroVeiculoActionPerformed
        //Cadastro de Veículos
        if(verificarLogin() == true)
            abrirForm(new FormCadastroVeiculo());
    }//GEN-LAST:event_MenuCadastroVeiculoActionPerformed

    private void menuConsultaEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaEntregaActionPerformed
        //Consultar Entregas
        if(verificarLogin() == true)
            abrirForm(new FormConsultaEntrega());
    }//GEN-LAST:event_menuConsultaEntregaActionPerformed

    private void menuConsultaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaUsuariosActionPerformed
        //Consultar Usuarios
        if(verificarLogin() == true){
            if(admin == false){
                JOptionPane.showMessageDialog(null, 
                    "ERRO: Acesso negado", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            }
            else
            abrirForm(new FormConsultaUsuario());
        }
    }//GEN-LAST:event_menuConsultaUsuariosActionPerformed

    private void menuConsultaEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaEnderecoActionPerformed
        //Consultar Endereços
        if(verificarLogin() == true)
            abrirForm(new FormConsultaEndereco());
    }//GEN-LAST:event_menuConsultaEnderecoActionPerformed

    private void menuConsultaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaVeiculoActionPerformed
        //Consultar veículos
        if(verificarLogin() == true)
            abrirForm(new FormConsultaVeiculo());
    }//GEN-LAST:event_menuConsultaVeiculoActionPerformed

    public static void main(String args[]) {      
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
    private javax.swing.JDesktopPane areaTrabalho;
    private javax.swing.JMenuItem menuConsultaEndereco;
    private javax.swing.JMenuItem menuConsultaEntrega;
    private javax.swing.JMenuItem menuConsultaUsuarios;
    private javax.swing.JMenuItem menuConsultaVeiculo;
    // End of variables declaration//GEN-END:variables
    
    private void configurarForm()
    {
        this.setTitle("Menu Principal");
        this.setResizable(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
   
    //Função para abrir formulários
    private void abrirForm(JInternalFrame f)
    {
        if (areaTrabalho.getAllFrames().length == 0)
        {
            Dimension d = areaTrabalho.getSize();
            areaTrabalho.add(f);
            f.setLocation( (d.width-f.getSize().width)/2,
                           (d.height-f.getSize().height)/2);
            f.setVisible(true);
        }
    }
    
    private boolean verificarLogin(){
        if(login == false){
            JOptionPane.showMessageDialog(null, 
                "ERRO: faça login primeiro",
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
            
            return false;
            
        }
        else
        {
            return true;        
        }
            
    }
}
