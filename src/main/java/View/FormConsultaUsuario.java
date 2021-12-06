package View;

//Bibliotecas
import Controller.UsuarioDAO;
import java.awt.Dimension;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Model.Usuario;
import javax.swing.JOptionPane;

public class FormConsultaUsuario extends javax.swing.JInternalFrame {

    public FormConsultaUsuario() 
    {
        initComponents();
        configurarForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblListaFuncionario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabAtualizarFuncionario = new javax.swing.JTable();

        lblListaFuncionario.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        lblListaFuncionario.setText("Selecione um funcionário da lista");

        tabAtualizarFuncionario.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        tabAtualizarFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabAtualizarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabAtualizarFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabAtualizarFuncionario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblListaFuncionario)
                        .addGap(0, 463, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblListaFuncionario)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //EDITAR DADOS
    private void tabAtualizarFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAtualizarFuncionarioMouseClicked
        if(evt.getClickCount() == 2)
        {
            //recuperar o ID da categoria selecionada
            int linha = tabAtualizarFuncionario.getSelectedRow();
            String id = tabAtualizarFuncionario.getValueAt(linha,0).toString();

            //abrir o formulário de cadastro
            FormCadastroUsuario f = new FormCadastroUsuario(id);
            Dimension d = this.getDesktopPane().getSize();
            this.getDesktopPane().add(f);
            f.setLocation( (d.width-f.getSize().width)/2, (d.height-f.getSize().height)/2);
            f.setVisible(true);
            
            //fechar o formulário de pesquisa
            this.dispose();
        }
    }//GEN-LAST:event_tabAtualizarFuncionarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListaFuncionario;
    private javax.swing.JTable tabAtualizarFuncionario;
    // End of variables declaration//GEN-END:variables
    
    
    private void configurarForm()
    {
        this.setTitle("Consulta de Usuários");
        this.setResizable(false);
        setClosable(true);
        configurarTabela();
        preencherTabela( new UsuarioDAO().listar());
    }
    
    private void configurarTabela()
    {
        DefaultTableModel m = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        m.addColumn("Id");
        m.addColumn("Nome");
        m.addColumn("Fg_ativo");
        
        tabAtualizarFuncionario.setModel(m);
    }
    
    //Função para preencher a tabela
    private void preencherTabela(List<Usuario> lista)
    {
        //Caso a lista não esteja vazia
        if(lista != null)
        {
            //Caso o tamanho da lista seja maior que zero
            if(lista.size() > 0)
            {
                configurarTabela();
                DefaultTableModel user = (DefaultTableModel)tabAtualizarFuncionario.getModel();
                
                //Laço de repetição para chegar até o último cadastro
                for(Usuario obj: lista)
                {
                    user.addRow(new Object[]
                    {
                        obj.getId(),
                        obj.getNome(),
                        obj.getFg_ativo(),
                    }
                               );
                }
                
                tabAtualizarFuncionario.setModel(user);
            }
            
            //Caso o tamanho da lista seja zero
            else
            {
                JOptionPane.showMessageDialog(null, 
                        "Não há usuários na tabela", "USUÁRIOS", 
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        //Caso a lista esteja vazia, indicar erro de contato com o banco
        else
        {
            JOptionPane.showMessageDialog(null, 
                        "Houve um erro ao buscar os dados", "USUÁRIOS", 
                        JOptionPane.ERROR_MESSAGE);
        }
    }
}
