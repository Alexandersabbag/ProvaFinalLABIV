package View;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class FormCadastroEndereco extends javax.swing.JInternalFrame {

    
    public FormCadastroEndereco() {
        initComponents();
        configurarForm();
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
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEndNome)
                                .addGap(342, 342, 342)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEndCPFCNPJ)
                            .addComponent(lblEndCep)
                            .addComponent(txtEndCpfCnpj)
                            .addComponent(txtEndCEP, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
        estado.add("RO");
        estado.add("AC");
        estado.add("AM");
        estado.add("RR");
        estado.add("PA");
        estado.add("AP");
        estado.add("TO");
        estado.add("MA");
        estado.add("PI");
        estado.add("CE");
        estado.add("RN");
        estado.add("PB");
        estado.add("PE");
        estado.add("AL");
        estado.add("SE");
        estado.add("BA");
        estado.add("MG");
        estado.add("ES");
        estado.add("RJ");
        estado.add("SP");
        estado.add("PR");
        estado.add("SC");
        estado.add("RS");
        estado.add("MS");
        estado.add("MT");
        estado.add("GO");
        estado.add("DF");
        //inserindo as opções na cbxStatus
        DefaultComboBoxModel m2 = new DefaultComboBoxModel();
        for(String ef : estado){
            m2.addElement(ef);
        }
        cbxEndUF.setModel(m2);
    }

}
