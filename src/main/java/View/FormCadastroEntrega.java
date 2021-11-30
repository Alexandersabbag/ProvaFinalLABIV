package View;

import Controller.EntregaDAO;
import Model.Entrega;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class FormCadastroEntrega extends javax.swing.JInternalFrame {

    public FormCadastroEntrega() {
        initComponents();
        configurarForm();
    }

    private String nf;
    
    public FormCadastroEntrega(String nf)
    {
        this();
        this.nf = nf;
        
        //Exibir os dados da entrega selecionada(com 2 cliques)
        Entrega ent = new EntregaDAO().pesquisarPorNf(nf);
        
        //Caso existir a empresa, mostrar
        if(ent != null)
        {
            //Dados da entrega
           txtNF.setText(ent.getNf());
           txtPlaca.setText(ent.getPlaca());
           txtRemetente.setText(ent.getId_remetente());
           txtDestinatario.setText(ent.getId_destinatario());
           DefaultComboBoxModel m = (DefaultComboBoxModel)cbxStatus.getModel();
           txtDtaSaida.setText(ent.getDta_saida());
           txtDtaEntrega.setText(ent.getDta_entrega());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblControleEntregas = new javax.swing.JLabel();
        lblNF = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblRemetente = new javax.swing.JLabel();
        lblDestinatario = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblDtaSaida = new javax.swing.JLabel();
        lblDtaEntrega = new javax.swing.JLabel();
        cbxStatus = new javax.swing.JComboBox<>();
        txtNF = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtRemetente = new javax.swing.JTextField();
        txtDestinatario = new javax.swing.JTextField();
        txtDtaSaida = new javax.swing.JFormattedTextField();
        txtDtaEntrega = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        lblControleEntregas.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 24)); // NOI18N
        lblControleEntregas.setText("Cadastro de Entregas");

        lblNF.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblNF.setText("Nota Fiscal");

        lblPlaca.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblPlaca.setText("Placa do Veículo");

        lblRemetente.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblRemetente.setText("ID Remetente");

        lblDestinatario.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblDestinatario.setText("ID Destinatário");

        lblStatus.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblStatus.setText("Status");

        lblDtaSaida.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblDtaSaida.setText("Data de Saída");

        lblDtaEntrega.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblDtaEntrega.setText("Data de Entrega");

        cbxStatus.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        cbxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtNF.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        txtPlaca.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        txtRemetente.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        txtDestinatario.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        try {
            txtDtaSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtaSaida.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        try {
            txtDtaEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtaEntrega.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        btnSalvar.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlaca)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRemetente)
                                .addGap(0, 79, Short.MAX_VALUE))
                            .addComponent(txtRemetente))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDestinatario)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblStatus)
                                .addGap(78, 78, 78))
                            .addComponent(cbxStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNF)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDtaSaida)
                                    .addComponent(txtDtaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDtaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDtaEntrega))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(lblControleEntregas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblControleEntregas)
                .addGap(18, 18, 18)
                .addComponent(lblNF)
                .addGap(3, 3, 3)
                .addComponent(txtNF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(lblRemetente)
                    .addComponent(lblDestinatario)
                    .addComponent(lblStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRemetente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDtaSaida)
                    .addComponent(lblDtaEntrega))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDtaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDtaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        
        //Novos dados da entrega
        Entrega obj = new Entrega();
  
        obj.setNf(txtNF.getText());
        obj.setPlaca(txtPlaca.getText());
        obj.setId_remetente(txtRemetente.getText());
        obj.setId_destinatario(txtDestinatario.getText()); 
        obj.setStatus_entrega((String) cbxStatus.getSelectedItem());
        obj.setDta_saida(txtDtaSaida.getText());
        obj.setDta_entrega(txtDtaEntrega.getText());
        
        //Executando
        EntregaDAO end = new EntregaDAO();
        int resultado;
        
        //Cadastro
        resultado = end.inserir(obj);
        
        //Caso tenha sucesso na execução
         if (resultado >= 1)
         {
            JOptionPane.showMessageDialog(
                null,
                "Operação realizada com sucesso!", 
                "ENTREGAS",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
        //Caso ocorra um erro
        else{
            JOptionPane.showMessageDialog(
                null,
                "Ocorreu um erro.",
                "ENTREGAS",
                JOptionPane.ERROR_MESSAGE
            );
        }
        
        this.dispose(); 
        
    }//GEN-LAST:event_btnSalvarActionPerformed
                           
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxStatus;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblControleEntregas;
    private javax.swing.JLabel lblDestinatario;
    private javax.swing.JLabel lblDtaEntrega;
    private javax.swing.JLabel lblDtaSaida;
    private javax.swing.JLabel lblNF;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblRemetente;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtDestinatario;
    private javax.swing.JFormattedTextField txtDtaEntrega;
    private javax.swing.JFormattedTextField txtDtaSaida;
    private javax.swing.JTextField txtNF;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtRemetente;
    // End of variables declaration//GEN-END:variables

    private void configurarForm(){
        this.setTitle("Cadastro de Entregas");
        configurarStatus();
    }

    private void configurarStatus(){
        List<String> status = new ArrayList<>();
        status.add("Encaminhando");
        status.add("Transportando");
        status.add("Entregue");
        DefaultComboBoxModel m2 = new DefaultComboBoxModel();
        for(String stat : status){
            m2.addElement(stat);
        }
        cbxStatus.setModel(m2);
    }
}
