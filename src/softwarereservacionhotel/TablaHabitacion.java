
package softwarereservacionhotel;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class TablaHabitacion extends javax.swing.JFrame {

    // Establecer el fondo personalizado para la tabla de habitaciones
    FondoTablaHabitacion FondoTablaHabitacion = new TablaHabitacion.FondoTablaHabitacion();
    // Añadir la variable numHab como campo de clase
    private int numHab;
    
    //Constructor por defecto
    public TablaHabitacion() {
        initComponents();
    }

    //Constructor con parámetro que inicializa la ventana con el número de habitación especificado
    public TablaHabitacion(int numHab) {
        this.setContentPane(FondoTablaHabitacion);  // Establecer el panel de fondo personalizado
        this.numHab = numHab;  // Inicializar el campo numHab con el valor proporcionado
        initComponents();  // Inicializar los componentes gráficos
        setHabitacion(numHab);  // Establecer la habitación y cargar las reservas asociadas
        this.setResizable(false);  // Deshabilitar redimensionamiento de la ventana
        txtHabitacion.setEnabled(false);  // Deshabilitar la edición del campo de número de habitación
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoTablaHabitacion();
        lblTitulo = new javax.swing.JLabel();
        txtHabitacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnFiltrarEntreFechas = new javax.swing.JButton();
        txtFechaInicio = new javax.swing.JTextField();
        lblFiltrarEntreFechas = new javax.swing.JLabel();
        txtFechaFin = new javax.swing.JTextField();
        lblFiltrarEntreFechas1 = new javax.swing.JLabel();
        btnActualizarTabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblTitulo.setText("Tabla de Reservas - Habitación ");

        txtHabitacion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtHabitacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Reserva", "Fecha Inicio", "Fecha Fin", "ID Estado", "Estado Reserva"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        btnFiltrarEntreFechas.setText("Filtrar");
        btnFiltrarEntreFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarEntreFechasActionPerformed(evt);
            }
        });

        lblFiltrarEntreFechas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFiltrarEntreFechas.setText("a");

        lblFiltrarEntreFechas1.setText("FILTRAR ENTRE FECHAS:");

        btnActualizarTabla.setText("Actualizar");
        btnActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(4, 4, 4)
                        .addComponent(txtHabitacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblFiltrarEntreFechas1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFiltrarEntreFechas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFiltrarEntreFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrarEntreFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFiltrarEntreFechas1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFiltrarEntreFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarEntreFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarEntreFechasActionPerformed
        // Obtener el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        // Obtener las fechas ingresadas por el usuario
        String fechaInicioStr = txtFechaInicio.getText().trim();
        String fechaFinStr = txtFechaFin.getText().trim();

        // Validar las fechas ingresadas
        if (!validarFechas(fechaInicioStr, fechaFinStr)) {
            return; // Salir del método si las fechas no son válidas
        }

        // Formato de fecha esperado en la base de datos
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try (Connection conn = Conexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement("SELECT r.COD_RES, r.INI_RES, r.FIN_RES, r.ID_EST, e.NOM_EST " +
                                                             "FROM reserva r " +
                                                             "JOIN estado e ON r.ID_EST = e.ID_EST " +
                                                             "WHERE r.INI_RES BETWEEN ? AND ?")) {

            // Convertir fechas de inicio y fin al formato adecuado para SQL Date
            stmt.setDate(1, new java.sql.Date(sdf.parse(fechaInicioStr).getTime()));
            stmt.setDate(2, new java.sql.Date(sdf.parse(fechaFinStr).getTime()));

            // Ejecutar la consulta SQL
            ResultSet rs = stmt.executeQuery();

            // Limpiar el modelo de la tabla antes de cargar nuevas filas
            modelo.setRowCount(0);

            // Procesar los resultados de la consulta y agregar filas al modelo de la tabla
            while (rs.next()) {
                Object[] fila = new Object[5];
                fila[0] = rs.getString("COD_RES");
                fila[1] = rs.getDate("INI_RES");
                fila[2] = rs.getDate("FIN_RES");
                fila[3] = rs.getString("ID_EST");
                fila[4] = rs.getString("NOM_EST");
                modelo.addRow(fila);
            }
        } catch (SQLException | ParseException e) {
            e.printStackTrace(); // Imprimir detalles del error en la consola
        }
    }//GEN-LAST:event_btnFiltrarEntreFechasActionPerformed

    private void btnActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaActionPerformed
        // Limpiar campos de fechas
        txtFechaInicio.setText("");
        txtFechaFin.setText("");
        // Cargar las reservas actualizadas
        cargarReservas();
    }//GEN-LAST:event_btnActualizarTablaActionPerformed

    public void cargarReservas() {
        // Obtener el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        // Limpiar el modelo actual de la tabla
        modelo.setRowCount(0); // Limpiar tabla

        // Consulta SQL para seleccionar las reservas de la habitación actual
        String sql = "SELECT r.COD_RES, r.INI_RES, r.FIN_RES, r.ID_EST, e.NOM_EST " +
                     "FROM reserva r " +
                     "JOIN estado e ON r.ID_EST = e.ID_EST " +
                     "WHERE r.NUM_HAB = ?";

        try (Connection conn = Conexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Establecer el número de habitación como parámetro en la consulta
            stmt.setInt(1, numHab);

            // Ejecutar la consulta SQL
            ResultSet rs = stmt.executeQuery();

            // Procesar los resultados y agregar filas al modelo de la tabla
            while (rs.next()) {
                Object[] fila = new Object[5];
                fila[0] = rs.getString("COD_RES");
                fila[1] = rs.getDate("INI_RES");
                fila[2] = rs.getDate("FIN_RES");
                fila[3] = rs.getString("ID_EST");
                fila[4] = rs.getString("NOM_EST");
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Imprimir detalles del error en la consola
        }
    }

    public void setHabitacion(int numHab) {
        if (txtHabitacion != null) {
            // Establecer el número de habitación en el campo de texto txtHabitacion
            txtHabitacion.setText(String.valueOf(numHab));
            // Cargar las reservas correspondientes a la habitación establecida
            cargarReservas();
        } else {
            // Si el campo de texto es nulo, imprimir un mensaje de error en la consola
            System.err.println("txtHabitacion es nulo en setHabitacion");
        }
    }
    
    private boolean validarFechas(String fechaInicioStr, String fechaFinStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            // Parsear las fechas de inicio y fin desde las cadenas proporcionadas
            Date fechaInicio = sdf.parse(fechaInicioStr);
            Date fechaFin = sdf.parse(fechaFinStr);

            // Verificar que la fecha de inicio sea anterior a la fecha de fin
            if (fechaInicio.after(fechaFin)) {
                // Mostrar un mensaje de error si la fecha de inicio no es anterior a la fecha de fin
                JOptionPane.showMessageDialog(this, "La fecha de inicio debe ser anterior a la fecha de fin.", "Error de Fecha", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (ParseException e) {
            // Capturar la excepción de formato incorrecto de fecha y mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "Formato de fecha incorrecto. Utilice yyyy-MM-dd.", "Error de Fecha", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        // Si las fechas son válidas y la fecha de inicio es anterior a la fecha de fin, retornar true
        return true;
    }
    
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
            java.util.logging.Logger.getLogger(TablaHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaHabitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTabla;
    private javax.swing.JButton btnFiltrarEntreFechas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFiltrarEntreFechas;
    private javax.swing.JLabel lblFiltrarEntreFechas1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtHabitacion;
    // End of variables declaration//GEN-END:variables

class FondoTablaHabitacion extends JPanel {
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            // Cargar la imagen desde el recurso
            imagen = new ImageIcon(getClass().getResource("/img/PantallaTablaHabitacion.png")).getImage();
        
            // Dibujar la imagen en el panel
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            // Hacer el panel transparente para mostrar la imagen de fondo
            setOpaque(false);
            
            super.paint(g); // Llamar al método paint de JPanel para asegurar que se pinten los componentes hijos
            
        }
    
    }

}
