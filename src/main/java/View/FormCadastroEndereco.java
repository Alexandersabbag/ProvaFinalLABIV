package View;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import Model.Endereco;

public class FormCadastroEndereco extends javax.swing.JInternalFrame {

    private String identificacao;
    
    public FormCadastroEndereco() {
        initComponents();
        configurarForm();
    }
    
    public FormCadastroEndereco(String identificacao)
    {
        this();
        this.identificacao = identificacao;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEndNome = new javax.swing.JLabel();
        lblEndCPFCNPJ = new javax.swing.JLabel();
        lblEndEnd = new javax.swing.JLabel();
        lblEndCidade = new javax.swing.JLabel();
        lblEndUf = new javax.swing.JLabel();
        lblEndCep = new javax.swing.JLabel();
        txtEndCEP = new javax.swing.JFormattedTextField();
        txtEndNome = new javax.swing.JTextField();
        txtEndCpfCnpj = new javax.swing.JTextField();
        txtEndEnd = new javax.swing.JTextField();
        cbxEndUF = new javax.swing.JComboBox<>();
        txtEndCidade = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JToggleButton();

        lblEndNome.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        lblEndNome.setText("Nome");

        lblEndCPFCNPJ.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        lblEndCPFCNPJ.setText("CPF/CNPJ");

        lblEndEnd.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        lblEndEnd.setText("Endereco");

        lblEndCidade.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        lblEndCidade.setText("Cidade");

        lblEndUf.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        lblEndUf.setText("UF");

        lblEndCep.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        lblEndCep.setText("CEP");

        try {
            txtEndCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtEndCEP.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N

        txtEndNome.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N

        txtEndCpfCnpj.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N

        txtEndEnd.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N

        cbxEndUF.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        cbxEndUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtEndCidade.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N

        btnSalvar.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.setToolTipText("");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setToolTipText("");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEndEnd)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEndNome)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblEndCidade)
                                                .addGap(219, 219, 219)
                                                .addComponent(lblEndUf))
                                            .addComponent(lblEndEnd)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtEndCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbxEndUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 8, Short.MAX_VALUE)))
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEndNome)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEndCPFCNPJ)
                            .addComponent(lblEndCep)
                            .addComponent(txtEndCpfCnpj)
                            .addComponent(txtEndCEP, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndNome)
                    .addComponent(lblEndCPFCNPJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblEndEnd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndCidade)
                    .addComponent(lblEndUf)
                    .addComponent(lblEndCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxEndUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        Endereco obj = new Endereco();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnSalvar;
    private javax.swing.JComboBox<String> cbxEndUF;
    private javax.swing.JLabel lblEndCPFCNPJ;
    private javax.swing.JLabel lblEndCep;
    private javax.swing.JLabel lblEndCidade;
    private javax.swing.JLabel lblEndEnd;
    private javax.swing.JLabel lblEndNome;
    private javax.swing.JLabel lblEndUf;
    private javax.swing.JFormattedTextField txtEndCEP;
    private javax.swing.JTextField txtEndCidade;
    private javax.swing.JTextField txtEndCpfCnpj;
    private javax.swing.JTextField txtEndEnd;
    private javax.swing.JTextField txtEndNome;
    // End of variables declaration//GEN-END:variables
    
    private void configurarForm(){
        this.setTitle("Cadastro de Entregas");
        configurarUF();
    }
    
    private void configurarUF(){ 
        //carregar as opções de status
        List<String> estado = new ArrayList<>(); //criando as opçÕes de de status
        estado.add("AC");
        estado.add("AL");
        estado.add("AM");
        estado.add("AP");
        estado.add("BA");
        estado.add("CE");
        estado.add("DF");
        estado.add("ES");
        estado.add("GO");
        estado.add("MA");
        estado.add("MG");
        estado.add("MT");
        estado.add("MS");
        estado.add("PA");
        estado.add("PB");
        estado.add("PE");
        estado.add("PI");
        estado.add("PR");
        estado.add("RJ");
        estado.add("RN");
        estado.add("RO"); 
        estado.add("RR");
        estado.add("RS");
        estado.add("SC");
        estado.add("SE");
        estado.add("SP");
        estado.add("TO");
        
        //inserindo as opções na cbxStatus
        DefaultComboBoxModel m2 = new DefaultComboBoxModel();
        for(String ef : estado){
            m2.addElement(ef);
        }
        cbxEndUF.setModel(m2);
    }

}
