/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.secundarios.almacenes;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Oficina
 */
public class FrmDiasNoVenta extends javax.swing.JDialog {

    /**
     * Creates new form VentanaDetPedido
     */
    public FrmDiasNoVenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        ajustarComponentes();
    }
    
    private void ajustarComponentes() {
        //Icono del dialog
        this.setIconImage(new ImageIcon("src/images/icons/Principal/MacPolloIcon.png").getImage());
        
        //Centrar ventana en pantalla
        setLocationRelativeTo(null);
        
        //Salir
        Icon salirIcon = new ImageIcon(new ImageIcon("src/images/icons/Menu/Procesos Especiales/Almacenes/Salir.png").getImage());
        salirBtn.setIcon(salirIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        salirBtn = new javax.swing.JButton();
        jPanel101 = new javax.swing.JPanel();
        jPanel103 = new javax.swing.JPanel();
        jRadioButton72 = new javax.swing.JRadioButton();
        jRadioButton73 = new javax.swing.JRadioButton();
        jLabel160 = new javax.swing.JLabel();
        jTextField139 = new javax.swing.JTextField();
        jButton110 = new javax.swing.JButton();
        jButton111 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jLabel159 = new javax.swing.JLabel();
        jTextField149 = new javax.swing.JTextField();
        jLabel165 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton112 = new javax.swing.JButton();
        jButton113 = new javax.swing.JButton();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("D??as de No Venta");
        setBackground(new java.awt.Color(245, 245, 245));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        salirBtn.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        salirBtn.setText("  Salir");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        jPanel101.setBackground(new java.awt.Color(245, 245, 245));
        jPanel101.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel103.setBackground(new java.awt.Color(245, 245, 245));
        jPanel103.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jRadioButton72.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton72.setText("Todos los Almacenes");

        jRadioButton73.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton73.setText("Por Almac??n");

        jLabel160.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel160.setText("Centro de Utilidad");

        jButton110.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton110.setText(">>");

        jButton111.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton111.setText("<<");

        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jTextArea8.setText("Lista Centros");
        jScrollPane10.setViewportView(jTextArea8);

        jLabel159.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel159.setText("Org Ventas");

        jLabel165.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel165.setText("Fecha");

        jButton16.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton16.setText("Consultar");

        javax.swing.GroupLayout jPanel103Layout = new javax.swing.GroupLayout(jPanel103);
        jPanel103.setLayout(jPanel103Layout);
        jPanel103Layout.setHorizontalGroup(
            jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel103Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel103Layout.createSequentialGroup()
                        .addComponent(jLabel160)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField139, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton110)
                            .addComponent(jButton111))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10))
                    .addComponent(jButton16)
                    .addGroup(jPanel103Layout.createSequentialGroup()
                        .addComponent(jLabel159)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField149, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel165)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jRadioButton72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton73)))
                .addGap(23, 23, 23))
        );
        jPanel103Layout.setVerticalGroup(
            jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel103Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel159)
                        .addComponent(jTextField149, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel165)
                        .addComponent(jRadioButton72)
                        .addComponent(jRadioButton73))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel103Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel103Layout.createSequentialGroup()
                                .addComponent(jButton110)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton111))
                            .addGroup(jPanel103Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel160)
                                    .addComponent(jTextField139, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton112.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton112.setText("Guardar");

        jButton113.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton113.setText("Borrar");

        jScrollPane18.setBackground(new java.awt.Color(245, 245, 245));
        jScrollPane18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Call Center D??as No Laborables", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane18.setViewportView(jTable12);

        javax.swing.GroupLayout jPanel101Layout = new javax.swing.GroupLayout(jPanel101);
        jPanel101.setLayout(jPanel101Layout);
        jPanel101Layout.setHorizontalGroup(
            jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel101Layout.createSequentialGroup()
                .addGroup(jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel101Layout.createSequentialGroup()
                            .addGap(473, 473, 473)
                            .addComponent(jButton112)
                            .addGap(18, 18, 18)
                            .addComponent(jButton113))
                        .addGroup(jPanel101Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel101Layout.setVerticalGroup(
            jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel101Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton113)
                    .addComponent(jButton112))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton110;
    private javax.swing.JButton jButton111;
    private javax.swing.JButton jButton112;
    private javax.swing.JButton jButton113;
    private javax.swing.JButton jButton16;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JRadioButton jRadioButton72;
    private javax.swing.JRadioButton jRadioButton73;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JTable jTable12;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextField jTextField139;
    private javax.swing.JTextField jTextField149;
    private javax.swing.JButton salirBtn;
    // End of variables declaration//GEN-END:variables
}
