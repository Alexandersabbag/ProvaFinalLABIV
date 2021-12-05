package View;

//Bilbiotecas
import javax.swing.table.DefaultTableModel;
import Controller.EnderecoDAO;
import Model.Endereco;
import java.util.List;
import javax.swing.JOptionPane;

public class FormConsultaEndereco extends javax.swing.JInternalFrame {

    public FormConsultaEndereco() {
        initComponents();
        configurarForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblConsultaEnderecos = new javax.swing.JLabel();
        lblCPFCNPJ = new javax.swing.JLabel();
        txtCpfCnpj = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabEndereco = new javax.swing.JTable();
        lblListaEnderecos = new javax.swing.JLabel();

        lblConsultaEnderecos.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        lblConsultaEnderecos.setText("Consulta de Endereços");

        lblCPFCNPJ.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblCPFCNPJ.setText("CPF/CNPJ");

        txtCpfCnpj.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        tabEndereco.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        tabEndereco.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabEndereco);

        lblListaEnderecos.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblListaEnderecos.setText("Lista de Endereços");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(lblListaEnderecos))
                            .addComponent(lblCPFCNPJ))
                        .addGap(0, 380, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(lblConsultaEnderecos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblConsultaEnderecos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCPFCNPJ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblListaEnderecos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPFCNPJ;
    private javax.swing.JLabel lblConsultaEnderecos;
    private javax.swing.JLabel lblListaEnderecos;
    private javax.swing.JTable tabEndereco;
    private javax.swing.JTextField txtCpfCnpj;
    // End of variables declaration//GEN-END:variables
    
    private void configurarForm()
    {
        this.setTitle("Consulta de Endereços");
        this.setResizable(false);
        setClosable(true);
        configurarTabela();
        preencherTabela( new EnderecoDAO().listar());
    }
    
    private void configurarTabela(){
        DefaultTableModel m = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        m.addColumn("CPF/CNPJ");
        m.addColumn("Nome do Cliente/Empresa");
        m.addColumn("Endereço"); 
        m.addColumn("Cidade"); 
        m.addColumn("UF"); 
        m.addColumn("CEP"); 
        tabEndereco.setModel(m); 
    }
    
    //Função para preencher a tabela
    private void preencherTabela(List<Endereco> lista)
    {
        //Caso a lista não esteja vazia
        if(lista != null)
        {
            //Caso o tamanho da lista seja maior que zero
            if(lista.size() > 0)
            {
                configurarTabela();
                DefaultTableModel emp = (DefaultTableModel)tabEndereco.getModel();
                
                //Laço de repetição para chegar até o último cadastro
                for(Endereco obj: lista)
                {
                    emp.addRow(new Object[]
                    {
                        obj.getIdentificacao(),
                        obj.getNome(),
                        obj.getEndereco(),
                        obj.getCidade(),
                        obj.getUf(),
                        obj.getCep(),
                    }
                               );
                }
                
                tabEndereco.setModel(emp);
            }
            
            //Caso o tamanho da lista seja zero
            else
            {
                JOptionPane.showMessageDialog(null, 
                        "Não há endereço(s) na tabela", "ENDEREÇOS", 
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        //Caso a lista esteja vazia, indicar erro de contato com o banco
        else
        {
            JOptionPane.showMessageDialog(null, 
                        "Houve um erro ao buscar os dados", "ENDEREÇOS", 
                        JOptionPane.ERROR_MESSAGE);
        }
    }
}
