/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author cass465
 */
public class FrmAcercaDe extends javax.swing.JFrame {
    
    String callSeleccionado;

    /**
     * Creates new form NewJFrame
     */
    public FrmAcercaDe() {
        initComponents();

        //Icono del frame
        this.setIconImage(new ImageIcon("src/images/icons/Principal/MacPolloIcon.png").getImage());
        
        //Centrar ventana en pantalla
        setLocationRelativeTo(null);

        ImageIcon imagen = new ImageIcon("src/images/icons/Principal/MacPolloN1.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(iconMacL.getWidth(), iconMacL.getHeight(), Image.SCALE_DEFAULT));
        iconMacL.setIcon(icono);
        
        acercaDeL.setText("<html><body><center>Sistema Integrado Distribuidoras<br>Módulo Call Center<br>Propiedad Intelectual de Avidesa Mac Pollo S.A.<br>Derechos Reservados</center></body></html>");
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
        loginPanel = new javax.swing.JPanel();
        acercaDeL = new javax.swing.JLabel();
        iconMacL = new javax.swing.JLabel();
        aceptarBtn = new javax.swing.JButton();

        setTitle("Acerca De");
        setBackground(new java.awt.Color(245, 245, 245));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        loginPanel.setBackground(new java.awt.Color(245, 245, 245));
        loginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acerca De", 0, 0, new java.awt.Font("Arial", 2, 14))); // NOI18N

        acercaDeL.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        acercaDeL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acercaDeL.setText("Info");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(acercaDeL, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addComponent(acercaDeL, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        iconMacL.setBackground(new java.awt.Color(255, 255, 255));

        aceptarBtn.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        aceptarBtn.setText("Aceptar");
        aceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(aceptarBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(iconMacL, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconMacL, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(aceptarBtn)
                .addContainerGap())
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

    private void aceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBtnActionPerformed
        //Cierra el frame
        this.dispose();
    }//GEN-LAST:event_aceptarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBtn;
    private javax.swing.JLabel acercaDeL;
    private javax.swing.JLabel iconMacL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel loginPanel;
    // End of variables declaration//GEN-END:variables
}