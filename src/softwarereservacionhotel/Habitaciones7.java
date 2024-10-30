
package softwarereservacionhotel;

import javax.swing.JTextField;


public class Habitaciones7 extends javax.swing.JPanel {


    public Habitaciones7() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHabitacion206 = new javax.swing.JButton();
        btnHabitacion205 = new javax.swing.JButton();
        btnHabitacion204 = new javax.swing.JButton();
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
        jLabel3.setText("7");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 40, -1));

        btnHabitacion206.setText("Ver Disponibilidad");
        btnHabitacion206.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion206ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion206, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 500, 160, 40));

        btnHabitacion205.setText("Ver Disponibilidad");
        btnHabitacion205.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion205ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion205, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 160, 40));

        btnHabitacion204.setText("Ver Disponibilidad");
        btnHabitacion204.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion204ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion204, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imghabs/Habitaciones7.png"))); // NOI18N
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

    private void btnHabitacion206ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion206ActionPerformed
        // TODO add your handling code here:
        int numHab = 206;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion206ActionPerformed

    private void btnHabitacion205ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion205ActionPerformed
        // TODO add your handling code here:
        int numHab = 205;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion205ActionPerformed

    private void btnHabitacion204ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion204ActionPerformed
        // TODO add your handling code here:
        int numHab = 204;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion204ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHabitacion204;
    private javax.swing.JButton btnHabitacion205;
    private javax.swing.JButton btnHabitacion206;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
