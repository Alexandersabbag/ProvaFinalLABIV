package View;

import Controller.VeiculoDAO;
import Model.Veiculo;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormConsultaVeiculo extends javax.swing.JInternalFrame {

    public FormConsultaVeiculo() {
        initComponents();
        configurarForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblListaVeiculos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabListaVeiculos = new javax.swing.JTable();

        lblTitulo.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        lblTitulo.setText("Consulta de Veículos");

        lblPlaca.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblPlaca.setText("Placa");

        txtPlaca.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlacaKeyReleased(evt);
            }
        });

        lblListaVeiculos.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblListaVeiculos.setText("Lista de Veículos");

        tabListaVeiculos.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        tabListaVeiculos.setModel(new javax.swing.table.DefaultTableModel(
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
        tabListaVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabListaVeiculosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabListaVeiculos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlaca)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addComponent(lblListaVeiculos)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(271, 271, 271))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblPlaca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblListaVeiculos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyReleased
        // TODO add your handling code here:
        
        //Placa utilizada na pesquisa, procurar na base
        String placa = txtPlaca.getText();
        
        //Caso o nome esteja vazio, mostrar toda a tabela
        if(placa.isEmpty())
        {
            preencherTabela( new VeiculoDAO().listar());
        }
        
        //Caso tenha algo escrito, pesquisar
        else
        {
            preencherTabela( new VeiculoDAO().pesquisarPorPlacaConsulta(placa));
        }
    }//GEN-LAST:event_txtPlacaKeyReleased

    private void tabListaVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabListaVeiculosMouseClicked
        // TODO add your handling code here:
        
        //Caso o usuário clicou 2x
        if(evt.getClickCount() == 2)
        {
            //Buscar o id da empresa para mostrar no formulário
            int linha = tabListaVeiculos.getSelectedRow();
            String id = tabListaVeiculos.getValueAt(linha, 0).toString();
            
            //Abrir o formulário de cadastro no centro da tela
            FormCadastroVeiculo veic = new FormCadastroVeiculo(id);
            
            //Dimensionando no centro
            Dimension d = this.getDesktopPane().getSize();
            this.getDesktopPane().add(veic);
            veic.setLocation((d.width-veic.getSize().width)/2, (d.height-veic.getSize().height)/2);
            veic.setVisible(true);
            
            //Fechando o formulário
            this.dispose();
        }
    }//GEN-LAST:event_tabListaVeiculosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListaVeiculos;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tabListaVeiculos;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
    
    private void configurarForm()
    {
        this.setTitle("Consulta de Veículos");
        this.setResizable(false);
        setClosable(true);
        configurarTabela();
        preencherTabela( new VeiculoDAO().listar());
    }
    
    private void configurarTabela()
    {
        DefaultTableModel m = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        m.addColumn("Motorista");
        m.addColumn("Placa");
        m.addColumn("Cor"); 
        m.addColumn("Modelo"); 
        m.addColumn("Marca");
        m.addColumn("Status");  //Fg_ativo
        tabListaVeiculos.setModel(m);
    }
    
    //Função para preencher a tabela
    private void preencherTabela(List<Veiculo> lista)
    {
        //Caso a lista não esteja vazia
        if(lista != null)
        {
            //Caso o tamanho da lista seja maior que zero
            if(lista.size() > 0)
            {
                configurarTabela();
                DefaultTableModel veic = (DefaultTableModel)tabListaVeiculos.getModel();
                
                //Laço de repetição para chegar até o último cadastro
                for(Veiculo obj: lista)
                {
                    veic.addRow(new Object[]
                    {
                        obj.getMotorista(),
                        obj.getPlaca(),
                        obj.getCor(),
                        obj.getModelo(),
                        obj.getMarca(),
                        obj.getFg_ativo(),
                    }
                               );
                }
                
                tabListaVeiculos.setModel(veic);
            }
            
            //Caso o tamanho da lista seja zero
            else
            {
                JOptionPane.showMessageDialog(null, 
                        "Não há veículo(s) na tabela", "VEÍCULOS", 
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        //Caso a lista esteja vazia, indicar erro de contato com o banco
        else
        {
            JOptionPane.showMessageDialog(null, 
                        "Houve um erro ao buscar os dados", "VEÍCULOS", 
                        JOptionPane.ERROR_MESSAGE);
        }
    }
}
