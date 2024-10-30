package softwarereservacionhotel;

import java.awt.BorderLayout;
import javax.swing.*;

public class PantallaHabitaciones extends javax.swing.JFrame {

    // Declaración de instancias de las habitaciones
    Habitaciones1 hab1 = new Habitaciones1();
    Habitaciones2 hab2 = new Habitaciones2();
    Habitaciones3 hab3 = new Habitaciones3();
    Habitaciones4 hab4 = new Habitaciones4();
    Habitaciones5 hab5 = new Habitaciones5();
    Habitaciones6 hab6 = new Habitaciones6();
    Habitaciones7 hab7 = new Habitaciones7();
    Habitaciones8 hab8 = new Habitaciones8();
    Habitaciones9 hab9 = new Habitaciones9();
    Habitaciones10 hab10 = new Habitaciones10();

    int IndiceHab = 1; // Variable para mantener el índice de la habitación mostrada

    public PantallaHabitaciones() {
        initComponents(); // Inicialización de componentes Swing
        this.setResizable(false); // Deshabilitar redimensionamiento de la ventana

        MostrarPanel(hab1); // Mostrar inicialmente la habitación hab1 al abrir la ventana
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        btnHabitaciones = new javax.swing.JButton();
        btnReserva = new javax.swing.JButton();
        btnNosotros = new javax.swing.JButton();
        IzquierdaBtn = new javax.swing.JButton();
        DerechaBtn = new javax.swing.JButton();
        CerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 1100, 610));

        btnHabitaciones.setText("Habitaciones");
        btnHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacionesActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 35, 250, 50));

        btnReserva.setText("Reserva");
        btnReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 180, 60));

        btnNosotros.setText("Nosotros");
        btnNosotros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNosotrosActionPerformed(evt);
            }
        });
        jPanel1.add(btnNosotros, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 30, 280, 60));

        IzquierdaBtn.setText("IZQ");
        IzquierdaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IzquierdaBtnActionPerformed(evt);
            }
        });
        jPanel1.add(IzquierdaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 70, 230));

        DerechaBtn.setText("DER");
        DerechaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DerechaBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DerechaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 280, 70, 230));

        CerrarSesion.setText("Cerrar Sesion");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PantallaHabitaciones.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacionesActionPerformed
        // No hace nada, ya estás en la pantalla
    }//GEN-LAST:event_btnHabitacionesActionPerformed

    private void btnReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaActionPerformed
        // Obtener el tipo de usuario desde la instancia singleton
        String tipoUsuario = UsuarioActual.getInstancia().getTipoUsuario().trim();
        System.out.println("Tipo de usuario: '" + tipoUsuario + "'"); // Imprimir para depuración

        // Realizar la comparación del tipo de usuario
        if ("Cliente".equalsIgnoreCase(tipoUsuario)) {
            PantallaReservarCliente prCliente = new PantallaReservarCliente();
            prCliente.setVisible(true);
        } else if ("Administrador".equalsIgnoreCase(tipoUsuario)) {
            PantallaReservarAdmin prAdmin = new PantallaReservarAdmin();
            prAdmin.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Tipo de usuario no reconocido");
        }
        dispose(); // Cerrar la ventana actual
    }//GEN-LAST:event_btnReservaActionPerformed

    private void btnNosotrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNosotrosActionPerformed
        // Crear una instancia de PantallaNosotros y mostrarla
        PantallaNosotros pn = new PantallaNosotros();
        pn.setVisible(true);
        // Cerrar la ventana actual
        dispose();
    }//GEN-LAST:event_btnNosotrosActionPerformed

    private void IzquierdaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IzquierdaBtnActionPerformed
        // Decrementar el índice de habitación si es mayor que 1 y menor que 11
        if (IndiceHab > 1 && IndiceHab < 11) {
            IndiceHab--;
            // Llamar al método para modificar el panel con el nuevo índice de habitación
            ModificarPanel(IndiceHab);
        }
    }//GEN-LAST:event_IzquierdaBtnActionPerformed

    private void DerechaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DerechaBtnActionPerformed
        // Incrementar el índice de habitación si es mayor que 0 y menor que 10
        if (IndiceHab > 0 && IndiceHab < 10) {
            IndiceHab++;
            // Llamar al método para modificar el panel con el nuevo índice de habitación
            ModificarPanel(IndiceHab);
        }
    }//GEN-LAST:event_DerechaBtnActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        // Obtener una instancia de la ventana de inicio de sesión (Interfaz) y mostrarla
        Interfaz loginWindow = Interfaz.getInstancia();
        loginWindow.setVisible(true);
        // Cerrar la ventana actual
        this.dispose();
    }//GEN-LAST:event_CerrarSesionActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaHabitaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton DerechaBtn;
    private javax.swing.JButton IzquierdaBtn;
    private javax.swing.JButton btnHabitaciones;
    private javax.swing.JButton btnNosotros;
    private javax.swing.JButton btnReserva;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void MostrarPanel(JPanel jp) {
        // Definir dimensiones de la ventana
        int Alto = 610;  // Altura deseada
        int Ancho = 1100;  // Ancho deseado

        // Establecer el tamaño y la ubicación del panel jp
        jp.setSize(Ancho, Alto);  // Establecer tamaño del panel
        jp.setLocation(0, 0);  // Establecer ubicación del panel en la ventana

        // Limpiar todo el contenido anterior del contenedor principal (content)
        content.removeAll();  // Eliminar todos los componentes del contenedor

        // Agregar el panel jp al centro del contenedor principal
        content.add(jp, BorderLayout.CENTER);  // Agregar el panel al centro del BorderLayout

        // Validar y repintar el contenedor para reflejar los cambios
        content.revalidate();  // Validar el contenedor
        content.repaint();  // Repintar el contenedor para actualizar la interfaz gráfica
    }

    private void ModificarPanel(int indice) {
        switch (indice) {
            case 1:
                MostrarPanel(hab1); // Mostrar el panel hab1
                break;
            case 2:
                MostrarPanel(hab2); // Mostrar el panel hab2
                break;
            case 3:
                MostrarPanel(hab3); // Mostrar el panel hab3
                break;
            case 4:
                MostrarPanel(hab4); // Mostrar el panel hab4
                break;
            case 5:
                MostrarPanel(hab5); // Mostrar el panel hab5
                break;
            case 6:
                MostrarPanel(hab6); // Mostrar el panel hab6
                break;
            case 7:
                MostrarPanel(hab7); // Mostrar el panel hab7
                break;
            case 8:
                MostrarPanel(hab8); // Mostrar el panel hab8
                break;
            case 9:
                MostrarPanel(hab9); // Mostrar el panel hab9
                break;
            case 10:
                MostrarPanel(hab10); // Mostrar el panel hab10
                break;
            default:
                MostrarPanel(hab1); // Mostrar el panel hab1 por defecto si el índice no está en el rango esperado
                IndiceHab = 1; // Reiniciar el índice a 1 si no se cumplen las condiciones anteriores
        }
    }

}
