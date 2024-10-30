
package softwarereservacionhotel;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PantallaBtnAdmin extends javax.swing.JFrame {

    // Instancia del fondo personalizado
    FondoAdmin FondoAdmin = new PantallaBtnAdmin.FondoAdmin();

    // Constructor de la clase PantallaBtnAdmin
    public PantallaBtnAdmin() {
        this.setContentPane(FondoAdmin); // Establecer el fondo personalizado como el contenido principal de la ventana
        initComponents(); // Inicializar componentes de la interfaz gráfica
        this.setResizable(false); // Deshabilitar el redimensionamiento de la ventana
        // Actualizar la tabla de reservas después de inicializarla
        actualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoAdmin();
        btnHabitaciones = new javax.swing.JButton();
        btnReserva = new javax.swing.JButton();
        btnNosotros = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReservas = new javax.swing.JTable();
        btnActualizarEstado = new javax.swing.JButton();
        btnActualizarTabla = new javax.swing.JButton();
        btnEditarInfoCliente = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        txtFiltro = new javax.swing.JTextField();
        cmbFiltro = new javax.swing.JComboBox<>();
        CerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHabitaciones.setText("Habitaciones");
        btnHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacionesActionPerformed(evt);
            }
        });

        btnReserva.setText("Reserva");
        btnReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaActionPerformed(evt);
            }
        });

        btnNosotros.setText("Nosotros");
        btnNosotros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNosotrosActionPerformed(evt);
            }
        });

        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("GESTIONAR RESERVAS:");

        jLabel2.setText("_____________________________________________________________________________________________________________________________________________________________");

        tblReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código R.", "Fecha Inicio", "Fecha Fin", "Razón Social", "Nº Habitación", "Cliente", "DNI Cliente", "ID Estado", "Estado R.", "Método Pago", "Monto", "Fecha Pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReservas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblReservas);
        if (tblReservas.getColumnModel().getColumnCount() > 0) {
            tblReservas.getColumnModel().getColumn(0).setResizable(false);
            tblReservas.getColumnModel().getColumn(1).setResizable(false);
            tblReservas.getColumnModel().getColumn(2).setResizable(false);
            tblReservas.getColumnModel().getColumn(3).setResizable(false);
            tblReservas.getColumnModel().getColumn(4).setResizable(false);
            tblReservas.getColumnModel().getColumn(5).setResizable(false);
            tblReservas.getColumnModel().getColumn(6).setResizable(false);
            tblReservas.getColumnModel().getColumn(7).setResizable(false);
            tblReservas.getColumnModel().getColumn(8).setResizable(false);
            tblReservas.getColumnModel().getColumn(9).setResizable(false);
            tblReservas.getColumnModel().getColumn(10).setResizable(false);
            tblReservas.getColumnModel().getColumn(11).setResizable(false);
        }

        btnActualizarEstado.setText("Actualizar Estado");
        btnActualizarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEstadoActionPerformed(evt);
            }
        });

        btnActualizarTabla.setText("Actualizar Tabla");
        btnActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaActionPerformed(evt);
            }
        });

        btnEditarInfoCliente.setText("Editar Razón Social del Cliente");
        btnEditarInfoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarInfoClienteActionPerformed(evt);
            }
        });

        btnFiltrar.setText("FILTRAR");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        cmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código R.", "Fecha Inicio", "Fecha Fin", "Razón Social", "Nº Habitación", "Cliente", "DNI Cliente", "ID Estado", "Estado R.", "Método Pago", "Monto", "Fecha Pago" }));

        CerrarSesion.setText("Cerrar Sesion");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(btnEditarInfoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(btnActualizarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnFiltrar)
                .addGap(476, 476, 476))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CerrarSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNosotros, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addContainerGap(98, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNosotros, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CerrarSesion)
                        .addGap(36, 36, 36)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFiltrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarInfoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
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

    private void btnHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacionesActionPerformed
        // Crear una instancia de PantallaHabitaciones
        PantallaHabitaciones ph = new PantallaHabitaciones();
        // Hacer visible la pantalla de habitaciones
        ph.setVisible(true);
        // Cerrar la ventana actual desde la que se hizo clic en el botón
        dispose();
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
            System.out.println("Tipo de usuario no reconocido: '" + tipoUsuario + "'");
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

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaActionPerformed
        // TODO add your handling code here:
        actualizarTabla();
    }//GEN-LAST:event_btnActualizarTablaActionPerformed

    private void btnEditarInfoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarInfoClienteActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblReservas.getModel();
        int filaSeleccionada = tblReservas.getSelectedRow();

        // Verificar si se ha seleccionado una fila
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una reserva para editar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtener el código de reserva de la fila seleccionada
        String codReserva = (String) modelo.getValueAt(filaSeleccionada, 0);

        // Solicitar nueva razón social al usuario mediante un cuadro de diálogo
        String nuevaRazonSocial = (String) JOptionPane.showInputDialog(this, "Ingrese nueva razón social:", "Editar Razón Social", JOptionPane.PLAIN_MESSAGE);

        // Obtener la conexión a la base de datos
        Connection conexion = Conexion.getConexion();

        try {
            // Comenzar la transacción
            conexion.setAutoCommit(false);

            // Actualizar RAZ_RES en la tabla RESERVA
            PreparedStatement psReserva = conexion.prepareStatement("UPDATE RESERVA SET RAZ_RES = ? WHERE COD_RES = ?");
            psReserva.setString(1, nuevaRazonSocial);
            psReserva.setString(2, codReserva);
            psReserva.executeUpdate();

            // Confirmar la transacción
            conexion.commit();

            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(this, "Razón Social actualizada correctamente.", "Actualización Exitosa", JOptionPane.INFORMATION_MESSAGE);

            // Actualizar la tabla de reservas después de la edición
            actualizarTabla();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
            try {
                conexion.rollback(); // Revertir la transacción en caso de error
            } catch (SQLException ex) {
                System.err.println("Error al hacer rollback: " + ex.toString());
            }
            System.err.println("Error SQL: " + e.toString());

        } finally {
            try {
                conexion.setAutoCommit(true); // Restaurar el modo de auto-commit por defecto
                conexion.close(); // Cerrar la conexión
            } catch (SQLException ex) {
                System.err.println("Error al cerrar la conexión: " + ex.toString());
            }
        }
    }//GEN-LAST:event_btnEditarInfoClienteActionPerformed

    private void btnActualizarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEstadoActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblReservas.getModel();
        int filaSeleccionada = tblReservas.getSelectedRow();

        // Verificar si se ha seleccionado una fila
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una reserva para actualizar el estado.");
            return;
        }

        // Obtener el código de reserva de la fila seleccionada
        String codReserva = (String) modelo.getValueAt(filaSeleccionada, 0);

        // Crear el JComboBox con los posibles estados
        String[] estados = {"Confirmada", "Cancelada", "En Proceso", "Finalizada"};
        JComboBox<String> comboBox = new JComboBox<>(estados);

        // Mostrar el JOptionPane con el JComboBox para que el usuario seleccione el nuevo estado
        int result = JOptionPane.showConfirmDialog(this, comboBox, "Seleccione el nuevo estado", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        // Verificar si se seleccionó OK en el JOptionPane
        if (result == JOptionPane.OK_OPTION) {
            String nuevoEstado = (String) comboBox.getSelectedItem();

            // Mapeo de los nombres de estados a sus respectivos IDs
            String idEstado;
            switch (nuevoEstado) {
                case "Confirmada":
                    idEstado = "EST01";
                    break;
                case "Cancelada":
                    idEstado = "EST02";
                    break;
                case "En Proceso":
                    idEstado = "EST03";
                    break;
                case "Finalizada":
                    idEstado = "EST04";
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Estado no válido. Use EST01, EST02, EST03, o EST04.");
                    return;
            }

            // Obtener la conexión a la base de datos
            Connection conexion = Conexion.getConexion();

            try {
                // Actualizar ID_EST en la tabla RESERVA
                PreparedStatement psReserva = conexion.prepareStatement("UPDATE RESERVA SET ID_EST = ? WHERE COD_RES = ?");
                psReserva.setString(1, idEstado);
                psReserva.setString(2, codReserva);
                psReserva.executeUpdate();

                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(this, "Estado de reserva actualizado correctamente.");

                // Actualizar la tabla de reservas después de la edición
                actualizarTabla(); // Suponiendo que tienes un método para cargar nuevamente las reservas desde la base de datos

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al actualizar el estado de la reserva.");
                System.err.println("Error SQL: " + e.toString());

            } finally {
                try {
                    conexion.close(); // Cerrar la conexión a la base de datos
                } catch (SQLException ex) {
                    System.err.println("Error al cerrar la conexión: " + ex.toString());
                }
            }
        }
    }//GEN-LAST:event_btnActualizarEstadoActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        // TODO add your handling code here:
        filtrarReservas();
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        // Obtener una instancia de la ventana de inicio de sesión (Interfaz) y mostrarla
        Interfaz loginWindow = Interfaz.getInstancia();
        loginWindow.setVisible(true);
        // Cerrar la ventana actual
        this.dispose();
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void actualizarTabla() {
        DefaultTableModel model = (DefaultTableModel) tblReservas.getModel();

        try (Connection con = Conexion.getConexion()) {
            model.setRowCount(0); // Limpiar tabla antes de cargar nuevos datos

            // Consulta SQL para obtener todas las reservas con información relevante
            String query = "SELECT r.COD_RES, r.INI_RES, r.FIN_RES, r.RAZ_RES, r.NUM_HAB, u.NOM_USU, c.DNI_CLI, e.ID_EST, e.NOM_EST, tp.MET_PAG, tp.MON_PAG, tp.FEC_PAG " +
                           "FROM RESERVA r " +
                           "JOIN CLIENTE c ON r.DNI_CLI = c.DNI_CLI " +
                           "JOIN USUARIO u ON c.ID_USU = u.ID_USU " +
                           "JOIN ESTADO e ON r.ID_EST = e.ID_EST " +
                           "JOIN tipo_pagoCONreserva tpr ON r.COD_RES = tpr.COD_RES " +
                           "JOIN TIPO_PAGO tp ON tpr.ID_TPA = tp.ID_TPA";

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                // Obtener datos de cada reserva y agregarlos a la tabla
                Object[] row = new Object[12];
                row[0] = rs.getString("COD_RES");
                row[1] = rs.getDate("INI_RES");
                row[2] = rs.getDate("FIN_RES");
                row[3] = rs.getString("RAZ_RES");
                row[4] = rs.getString("NUM_HAB");
                row[5] = rs.getString("NOM_USU");
                row[6] = rs.getInt("DNI_CLI");
                row[7] = rs.getString("ID_EST");
                row[8] = rs.getString("NOM_EST");
                row[9] = rs.getString("MET_PAG");
                row[10] = rs.getInt("MON_PAG");
                row[11] = rs.getDate("FEC_PAG");

                model.addRow(row); // Agregar la fila al modelo de la tabla
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void filtrarReservas() {
        String filtro = txtFiltro.getText().trim();
        String campo = cmbFiltro.getSelectedItem().toString();

        // Mapear los campos del JComboBox a los nombres de columna en la base de datos
        String columna;
        switch (campo) {
            case "Código R.":
                columna = "r.COD_RES";
                break;
            case "Fecha Inicio":
                columna = "r.INI_RES";
                break;
            case "Fecha Fin":
                columna = "r.FIN_RES";
                break;
            case "Razón Social":
                columna = "r.RAZ_RES";
                break;
            case "Nº Habitación":
                columna = "r.NUM_HAB";
                break;
            case "Cliente":
                columna = "u.NOM_USU"; // Relacionado con la tabla usuario
                break;
            case "DNI Cliente":
                columna = "r.DNI_CLI";
                break;
            case "ID Estado":
                columna = "r.ID_EST";
                break;
            case "Estado R.":
                columna = "e.NOM_EST"; // Relacionado con la tabla estado
                break;
            case "Método Pago":
                columna = "tp.MET_PAG"; // Relacionado con la tabla tipo_pago
                break;
            case "Monto":
                columna = "tp.MON_PAG"; // Relacionado con la tabla tipo_pago
                break;
            case "Fecha Pago":
                columna = "tp.FEC_PAG"; // Relacionado con la tabla tipo_pago
                break;
            default:
                columna = "";
                break;
        }

        // Realizar la consulta de filtrado
        String query = "SELECT r.COD_RES, r.INI_RES, r.FIN_RES, r.RAZ_RES, r.NUM_HAB, r.DNI_CLI, r.ID_EST, " +
                       "e.NOM_EST, tp.MET_PAG, tp.MON_PAG, tp.FEC_PAG, u.NOM_USU " +
                       "FROM RESERVA r " +
                       "LEFT JOIN ESTADO e ON r.ID_EST = e.ID_EST " +
                       "LEFT JOIN tipo_pagoCONreserva tpr ON r.COD_RES = tpr.COD_RES " +
                       "LEFT JOIN TIPO_PAGO tp ON tpr.ID_TPA = tp.ID_TPA " +
                       "LEFT JOIN CLIENTE c ON r.DNI_CLI = c.DNI_CLI " +
                       "LEFT JOIN USUARIO u ON c.ID_USU = u.ID_USU " +
                       "WHERE " + columna + " LIKE ?";

        try (Connection con = Conexion.getConexion();
            PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, "%" + filtro + "%");
            ResultSet rs = pst.executeQuery();

            // Limpiar la tabla antes de cargar los datos filtrados
            DefaultTableModel model = (DefaultTableModel) tblReservas.getModel();
            model.setRowCount(0);

            // Cargar los datos filtrados en la tabla
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("COD_RES"),
                    rs.getDate("INI_RES"),
                    rs.getDate("FIN_RES"),
                    rs.getString("RAZ_RES"),
                    rs.getString("NUM_HAB"),
                    rs.getString("NOM_USU"),
                    rs.getString("DNI_CLI"),
                    rs.getString("ID_EST"),
                    rs.getString("NOM_EST"),
                    rs.getString("MET_PAG"),
                    rs.getInt("MON_PAG"),
                    rs.getDate("FEC_PAG")
                });
            }

            // Mostrar mensaje si no se encontró nada
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No se encontraron resultados.");
            }

            // Limpiar el campo de texto después de filtrar
            txtFiltro.setText("");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al filtrar las reservas: " + ex.getMessage());
        }
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
            java.util.logging.Logger.getLogger(PantallaBtnAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaBtnAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaBtnAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaBtnAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaBtnAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton btnActualizarEstado;
    private javax.swing.JButton btnActualizarTabla;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnEditarInfoCliente;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnHabitaciones;
    private javax.swing.JButton btnNosotros;
    private javax.swing.JButton btnReserva;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReservas;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
    
    class FondoAdmin extends JPanel {
    
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            // Cargar la imagen desde el recurso
            imagen = new ImageIcon(getClass().getResource("/img/PantallaBtnAdmin.png")).getImage();
        
            // Dibujar la imagen en el panel
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            // Hacer el panel transparente para mostrar la imagen de fondo
            setOpaque(false);
            
            super.paint(g); // Llamar al método paint de JPanel para asegurar que se pinten los componentes hijos
            
        }
    
    }

}
