
package softwarereservacionhotel;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;
import java.sql.*;

public class Registro extends JFrame {
    
    // Declaración e inicialización del panel personalizado FondoRegistro
    FondoRegistro fondoRegistro = new FondoRegistro();

    // Constructor de la clase Registro
    public Registro() {
        // Establece fondoRegistro como el panel principal (ContentPane) del JFrame actual
        this.setContentPane(fondoRegistro);
        // Inicializa los componentes de la interfaz gráfica generados automáticamente
        initComponents();
        // Deshabilita la capacidad de redimensionamiento del JFrame
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoRegistro();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        btnRegistrarse = new javax.swing.JButton();
        btnVolverLogin = new javax.swing.JButton();
        cmbTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudadActionPerformed(evt);
            }
        });

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        txtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisActionPerformed(evt);
            }
        });

        btnRegistrarse.setText("REGISTRARSE");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        btnVolverLogin.setText("Volver al Login");
        btnVolverLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverLoginActionPerformed(evt);
            }
        });

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(btnVolverLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCiudad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(296, 296, 296))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(btnVolverLogin)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        // Obtener y recortar los valores de los campos de texto
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String dni = txtDni.getText().trim();
        String telefono = txtTelefono.getText().trim();
        String pais = txtPais.getText().trim();
        String ciudad = txtCiudad.getText().trim();
        String correo = txtCorreo.getText().trim();
        String contraseña = txtContraseña.getText().trim();
        String tipo = cmbTipo.getSelectedItem().toString(); // Obtener el valor seleccionado del combo box

        // Verificar si algún campo está vacío
        if (nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() || telefono.isEmpty() ||
            pais.isEmpty() || ciudad.isEmpty() || correo.isEmpty() || contraseña.isEmpty()) {
            // Mostrar un mensaje si algún campo está vacío
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
        } else {
            try {
                // Intentar registrar el usuario con los datos proporcionados
                registrar(nombre, apellido, dni, telefono, pais, ciudad, correo, contraseña, tipo);
            } catch (SQLException ex) {
                // Manejar cualquier excepción SQL que ocurra durante el registro
                ex.printStackTrace();
                // Mostrar un mensaje si ocurre un error al registrar el usuario
                JOptionPane.showMessageDialog(this, "Error al registrar el usuario");
            }
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnVolverLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverLoginActionPerformed
        // Obtener la instancia de la ventana de inicio de sesión
        Interfaz loginWindow = Interfaz.getInstancia();
        // Hacer visible la ventana de inicio de sesión
        loginWindow.setVisible(true);
        // Cerrar la ventana actual (la ventana de registro)
        this.dispose();
    }//GEN-LAST:event_btnVolverLoginActionPerformed

    private boolean validarDNI(String dni) {
        // Utiliza una expresión regular para validar que el DNI sea un número de 8 dígitos
        return dni.matches("\\d{8}");
    }

    private boolean validarTelefono(String telefono) {
        // Utiliza una expresión regular para validar que el número de teléfono sea un número de 9 dígitos
        return telefono.matches("\\d{9}");
    }

    private boolean validarCorreo(String correo) {
        // Utiliza una expresión regular para validar que el correo electrónico tenga un formato válido
        return correo.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

    private void registrar(String nombre, String apellido, String dni, String telefono,
                            String pais, String ciudad, String correo, String contraseña, String tipo) throws SQLException {
        try (Connection con = Conexion.getConexion()) {
            // Validar el formato del DNI
            if (!validarDNI(dni)) {
                JOptionPane.showMessageDialog(this, "El DNI debe contener 8 dígitos numéricos");
                return;
            }

            // Validar el formato del número de teléfono
            if (!validarTelefono(telefono)) {
                JOptionPane.showMessageDialog(this, "El teléfono debe contener 9 dígitos numéricos");
                return;
            }

            // Validar el formato del correo electrónico
            if (!validarCorreo(correo)) {
                JOptionPane.showMessageDialog(this, "El formato del correo electrónico no es válido");
                return;
            }

            // Verificar si el DNI ya existe en la base de datos
            if (dniExiste(con, dni)) {
                JOptionPane.showMessageDialog(this, "El DNI ya está asociado a una cuenta existente");
                return;
            }

            // Generar un ID único para el nuevo usuario
            int idUsuario = generarIDUsuario(con);

            // Consulta para insertar el nuevo usuario en la tabla 'usuario'
            String query = "INSERT INTO usuario (ID_USU, NOM_USU, APE_USU, TIP_USU, TEL_USU, EMA_USU, CON_USU, PAI_USU, CIU_USU) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement ps = con.prepareStatement(query)) {
                ps.setInt(1, idUsuario);
                ps.setString(2, nombre);
                ps.setString(3, apellido);
                ps.setString(4, tipo);
                ps.setString(5, telefono);
                ps.setString(6, correo);
                ps.setString(7, contraseña);
                ps.setString(8, pais);
                ps.setString(9, ciudad);

                int rowsAffected = ps.executeUpdate();

                if (rowsAffected == 1) {
                    // Dependiendo del tipo de usuario (Cliente o Administrador), se inserta en la tabla correspondiente
                    if ("Cliente".equals(tipo)) {
                        query = "INSERT INTO CLIENTE (DNI_CLI, ID_USU) VALUES (?, ?)";
                    } else {
                        query = "INSERT INTO ADMINISTRADOR (DNI_ADM, ID_USU) VALUES (?, ?)";
                    }

                    try (PreparedStatement ps2 = con.prepareStatement(query)) {
                        ps2.setString(1, dni);
                        ps2.setInt(2, idUsuario);
                        ps2.executeUpdate();

                        JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente");
                        LimpiarCampos();
                        new Interfaz().setVisible(true); // Mostrar la ventana de inicio de sesión
                        dispose(); // Cerrar la ventana actual (de registro)
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Error al registrar el usuario");
                }
            }
        }
    }

    private boolean dniExiste(Connection con, String dni) throws SQLException {
        // Consulta para verificar si el DNI existe en las tablas CLIENTE o ADMINISTRADOR
        String query = "SELECT COUNT(*) AS total FROM CLIENTE WHERE DNI_CLI = ? UNION ALL SELECT COUNT(*) FROM ADMINISTRADOR WHERE DNI_ADM = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, Integer.parseInt(dni)); // Convertir dni a entero si es necesario
            ps.setInt(2, Integer.parseInt(dni)); // Convertir dni a entero si es necesario
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int total = rs.getInt("total");
                    return total > 0; // Devuelve true si el DNI existe en alguna de las tablas
                }
            }
        }
        return false; // Devuelve false si el DNI no existe en ninguna tabla
    }

    private int generarIDUsuario(Connection con) throws SQLException {
        // Obtener el último ID_USU de la tabla usuario y generar el siguiente ID único
        String query = "SELECT MAX(ID_USU) AS UltimoID FROM usuario";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        int ultimoID = 0;
        if (rs.next()) {
            ultimoID = rs.getInt("UltimoID");
        }
        return ultimoID + 1; // Devuelve el siguiente ID único para un nuevo usuario
    }

    private void LimpiarCampos() {
        // Limpiar los campos del formulario de registro
        txtNombre.setText("");
        txtApellido.setText("");
        txtPais.setText("");
        txtTelefono.setText("");
        txtCiudad.setText("");
        txtDni.setText("");
        txtCorreo.setText("");
        txtContraseña.setText("");
    }
    
    public static void main(String[] args) {
        new Registro().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnVolverLogin;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    class FondoRegistro extends JPanel {
    
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            // Cargar la imagen desde el recurso
            imagen = new ImageIcon(getClass().getResource("/img/PantallaRegistro.png")).getImage();
            
            // Dibujar la imagen en el panel
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            // Hacer el panel transparente para mostrar la imagen de fondo
            setOpaque(false);
            
            super.paint(g); // Llamar al método paint de JPanel para asegurar que se pinten los componentes hijos
            
        }
    
    }

}
