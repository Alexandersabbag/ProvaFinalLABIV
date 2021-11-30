package View;

import javax.swing.table.DefaultTableModel;

public class FormConsultaEntrega extends javax.swing.JInternalFrame {

    public FormConsultaEntrega() {
        initComponents();
        configurarForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblNF = new javax.swing.JLabel();
        txtNf = new javax.swing.JTextField();
        lblListaEntrega = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabListaEntregas = new javax.swing.JTable();

        lblTitulo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        lblTitulo.setText("Consulta de Entregas");

        lblNF.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        lblNF.setText("Nota Fiscal");

        txtNf.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        lblListaEntrega.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        lblListaEntrega.setText("Lista de Entregas");

        tabListaEntregas.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        tabListaEntregas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabListaEntregas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNF)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNf, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(lblListaEntrega)))
                                .addGap(0, 317, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTitulo)
                        .addGap(298, 298, 298))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblNF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblListaEntrega))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListaEntrega;
    private javax.swing.JLabel lblNF;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tabListaEntregas;
    private javax.swing.JTextField txtNf;
    // End of variables declaration//GEN-END:variables
    
    private void configurarForm(){
        this.setTitle("Consulta de Entregas");
        this.setResizable(false);
        configurarTabela();
    }
    
    private void configurarTabela(){
        DefaultTableModel m = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        m.addColumn("Remetente");
        m.addColumn("Destinatário");
        m.addColumn("Placa"); 
        m.addColumn("Data de Postagem"); 
        m.addColumn("Data de Entrega"); 
        m.addColumn("Status"); 
        tabListaEntregas.setModel(m); 
    }
}
