package View;

import Controller.EnderecoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import Model.Endereco;
import javax.swing.JOptionPane;

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
        
        //Exibir os dados da empresa selecionada(com 2 cliques)
        Endereco end = new EnderecoDAO().pesquisarPorId(identificacao);
        
        //Caso existir a empresa, mostrar
        if(end != null)
        {
            //Nome, CPF/CNPJ, Endereco e Cidade
           txtEndNome.setText(end.getNome());
           txtEndCpfCnpj.setText(end.getIdentificacao());
           txtEndEnd.setText(end.getEndereco());
           txtEndCidade.setText(end.getEndereco());
           //UF
           DefaultComboBoxModel m = (DefaultComboBoxModel)cbxEndUF.getModel();
           
           //CEP
           txtEndCEP.setText(end.getCep());
        }
        
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
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        lblEndNome.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblEndNome.setText("Nome");

        lblEndCPFCNPJ.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblEndCPFCNPJ.setText("CPF/CNPJ");

        lblEndEnd.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblEndEnd.setText("Endereco");

        lblEndCidade.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblEndCidade.setText("Cidade");

        lblEndUf.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblEndUf.setText("UF");

        lblEndCep.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblEndCep.setText("CEP");

        try {
            txtEndCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtEndCEP.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N

        txtEndNome.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        txtEndCpfCnpj.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        txtEndEnd.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        cbxEndUF.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        cbxEndUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtEndCidade.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

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

        lblTitulo.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        lblTitulo.setText("Cadastro de Endereço");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addComponent(txtEndEnd)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEndNome)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblEndEnd)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtEndCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(lblEndCidade))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(lblEndUf)
                                                            .addComponent(cbxEndUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(0, 17, Short.MAX_VALUE)))
                                        .addGap(26, 26, 26))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEndNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEndCPFCNPJ)
                                    .addComponent(lblEndCep)
                                    .addComponent(txtEndCpfCnpj)
                                    .addComponent(txtEndCEP, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(lblTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
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
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        Endereco obj = new Endereco();
        obj.setNome(txtEndNome.getText());
        obj.setIdentificacao(txtEndCpfCnpj.getText());
        obj.setEndereco(txtEndEnd.getText());
        obj.setCidade(txtEndCidade.getText()); 
        obj.setUf((String) cbxEndUF.getSelectedItem());
        obj.setCep(txtEndCEP.getText());
        
        //Executando
        EnderecoDAO end = new EnderecoDAO();
        int resultado;
        
        //Caso o tipo=0, cadastrar
        if(obj.getIdentificacao().isEmpty())
        {
            //CADASTRAR ENDEREÇO
            resultado = end.inserir(obj);
        }
        
        //Caso esteja tipo=1
        else
        {
            resultado = end.atualizarDados(obj);   
        }
        
            
        
        //Caso tenha sucesso na execução
         if (resultado >= 1)
         {
            JOptionPane.showMessageDialog(
                null,
                "Operação realizada com sucesso!", 
                "ENDEREÇOS",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
        //Caso ocorra um erro
        else{
            JOptionPane.showMessageDialog(
                null,
                "Ocorreu um erro.",
                "ENDEREÇOS",
                JOptionPane.ERROR_MESSAGE
            );
        }
        
        this.dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnSalvar;
    private javax.swing.JComboBox<String> cbxEndUF;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEndCPFCNPJ;
    private javax.swing.JLabel lblEndCep;
    private javax.swing.JLabel lblEndCidade;
    private javax.swing.JLabel lblEndEnd;
    private javax.swing.JLabel lblEndNome;
    private javax.swing.JLabel lblEndUf;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JFormattedTextField txtEndCEP;
    private javax.swing.JTextField txtEndCidade;
    private javax.swing.JTextField txtEndCpfCnpj;
    private javax.swing.JTextField txtEndEnd;
    private javax.swing.JTextField txtEndNome;
    // End of variables declaration//GEN-END:variables
    
    private void configurarForm(){
        this.setTitle("Cadastro de Endereço");
        configurarUF();
        setResizable(false);
        setClosable(true);
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
