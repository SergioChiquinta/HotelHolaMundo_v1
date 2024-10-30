
package softwarereservacionhotel;

import javax.swing.JTextField;


public class Habitaciones1 extends javax.swing.JPanel {


    public Habitaciones1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHabitacion103 = new javax.swing.JButton();
        btnHabitacion102 = new javax.swing.JButton();
        btnHabitacion101 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText(" 10");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 40, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 40, -1));

        btnHabitacion103.setText("Ver Disponibilidad");
        btnHabitacion103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion103ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion103, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 500, 160, 40));

        btnHabitacion102.setText("Ver Disponibilidad");
        btnHabitacion102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion102ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion102, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 160, 40));

        btnHabitacion101.setText("Ver Disponibilidad");
        btnHabitacion101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion101ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion101, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imghabs/Habitaciones1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHabitacion101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion101ActionPerformed
        // TODO add your handling code here:
        int numHab = 101;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);        
    }//GEN-LAST:event_btnHabitacion101ActionPerformed

    private void btnHabitacion102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion102ActionPerformed
        // TODO add your handling code here:
        int numHab = 102;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true); 
    }//GEN-LAST:event_btnHabitacion102ActionPerformed

    private void btnHabitacion103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion103ActionPerformed
        // TODO add your handling code here:
        int numHab = 103;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true); 
    }//GEN-LAST:event_btnHabitacion103ActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHabitacion101;
    private javax.swing.JButton btnHabitacion102;
    private javax.swing.JButton btnHabitacion103;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
