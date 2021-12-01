package View;

import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;

public class FormConsultaUsuario extends javax.swing.JInternalFrame {

    public FormConsultaUsuario() {
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

    private void tabAtualizarFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAtualizarFuncionarioMouseClicked
        if(evt.getClickCount() == 2){
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
    
    
    private void configurarForm(){
        this.setTitle("Consulta de Usuários");
        this.setResizable(false);
        configurarTabela();
        setClosable(true);
    }
    private void configurarTabela(){
        DefaultTableModel m = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        m.addColumn("Id");
        m.addColumn("Nome");
        m.addColumn("Fg_ativo");
        //Adicionar uma coluna que expõe a senha do usuário para o admin ? 
        tabAtualizarFuncionario.setModel(m);
    }
}
