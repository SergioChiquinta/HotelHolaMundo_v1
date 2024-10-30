
package softwarereservacionhotel;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;
import java.sql.*;

public class Interfaz extends JFrame {

    private static Interfaz instancia;
    FondoLogin FondoLogin = new FondoLogin();
    
    public Interfaz() {
        this.setContentPane(FondoLogin);
        initComponents();
        this.setResizable(false);  // Línea para deshabilitar el redimensionamiento
        checkbox1.addItemListener(new java.awt.event.ItemListener() { //Funcionalidad para el checkbox contraseña se actualice
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkboxMostrarContraseña(evt);
            }
        });
        txtContraseña.setEchoChar('•'); // Ocultar texto con "•"
    }
    
    public static Interfaz getInstancia() {
        // Verificar si la instancia de la clase Interfaz es nula
        if (instancia == null) {
            // Si es nula, crear una nueva instancia de la clase Interfaz
            instancia = new Interfaz();
        }
        // Devolver la instancia única de la clase Interfaz
        return instancia;
    }

    private void login() {
        // Obtener el texto ingresado en los campos de correo/nombre de usuario y contraseña
        String correoOusuario = txtCorreo.getText();
        String contraseña = new String(txtContraseña.getPassword());

        try (Connection con = Conexion.getConexion()) {
            // Consulta SQL para seleccionar el usuario según el correo/nombre de usuario y la contraseña
            String query = "SELECT * FROM usuario WHERE (EMA_USU = ? OR NOM_USU = ?) AND CON_USU = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, correoOusuario); // Asignar correo/nombre de usuario al primer parámetro
            ps.setString(2, correoOusuario); // Asignar correo/nombre de usuario al segundo parámetro
            ps.setString(3, contraseña); // Asignar la contraseña al tercer parámetro
            ResultSet rs = ps.executeQuery();

            // Verificar si se encontró un usuario que coincida con los criterios
            if (rs.next()) {
                // Obtener los datos del usuario desde el resultado de la consulta
                String nombreUsuario = rs.getString("NOM_USU");
                String correoUsuario = rs.getString("EMA_USU");
                String tipoUsuario = rs.getString("TIP_USU");
                String idUsuario = rs.getString("ID_USU");

                // Obtener la instancia actual del usuario y establecer sus atributos dentro de UsuarioActual
                UsuarioActual usuarioActual = UsuarioActual.getInstancia();
                usuarioActual.setNombreUsuario(nombreUsuario); // Asignar el nombre obtenido
                usuarioActual.setCorreoUsuario(correoUsuario); // Asignar el correo obtenido
                usuarioActual.setTipoUsuario(tipoUsuario); // Asignar el tipo de usuario obtenido
                usuarioActual.setIdUsuario(idUsuario); // Asignar el ID de usuario obtenido

                // Consulta SQL para obtener el DNI del usuario según su tipo (Cliente o Administrador)
                String dniQuery = "SELECT DNI_CLI FROM CLIENTE WHERE ID_USU = ?";
                PreparedStatement dniPs = con.prepareStatement(dniQuery);
                dniPs.setString(1, idUsuario); // Asignar el ID de usuario al primer parámetro
                ResultSet dniRs = dniPs.executeQuery();

                // Verificar si se encontró un DNI para el usuario
                if (dniRs.next()) {
                    String dni = dniRs.getString(1); // El DNI está en la primera columna de la tabla
                    usuarioActual.setDni(dni);
                }

                // Mensajes de depuración y bienvenida
                JOptionPane.showMessageDialog(this, "Tipo Usuario: " + tipoUsuario); // Mostrar el tipo de usuario
                JOptionPane.showMessageDialog(this, "¡Bienvenido, " + nombreUsuario + "!"); // Mostrar mensaje de bienvenida
                LimpiarCampos(); // Limpiar los campos del formulario de login
                PantallaHabitaciones ph = new PantallaHabitaciones(); // Crear la pantalla de habitaciones
                ph.setVisible(true); // Hacer visible la pantalla de habitaciones
                dispose(); // Cerrar la pantalla de login
            } else {
                // Mostrar mensaje de error si el correo/nombre de usuario o contraseña son incorrectos
                JOptionPane.showMessageDialog(this, "Correo, nombre de usuario o contraseña incorrectos");
            }
        } catch (SQLException ex) {
            // Manejar errores de conexión con la base de datos
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos");
        }
    }

    private void LimpiarCampos() {
        // Limpiar el campo de texto del correo/nombre de usuario
        txtCorreo.setText("");
        // Limpiar el campo de texto de la contraseña
        txtContraseña.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoLogin();
        btnLogin = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        btnRegistro = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        checkbox1 = new java.awt.Checkbox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRegistro.setText("Registrese aquí");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        txtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        checkbox1.setLabel("(•)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(555, 555, 555)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(652, 652, 652)
                        .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(446, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(txtCorreo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Funcionalidad del botón mediante el llamado al método login
        login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        // Crear una nueva instancia de la ventana de registro
        Registro registro = new Registro();
        // Hacer visible la ventana de registro
        registro.setVisible(true);
        // Cerrar la ventana actual (presumiblemente la ventana de login)
        this.dispose();
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void checkboxMostrarContraseña(java.awt.event.ItemEvent evt) {                                          
        // Verificar si el checkbox está seleccionado
        if (checkbox1.getState()) {
            // Si está seleccionado, mostrar la contraseña en texto claro
            txtContraseña.setEchoChar((char) 0);
        } else {
            // Si no está seleccionado, ocultar la contraseña usando un carácter de asterisco
            txtContraseña.setEchoChar('•');
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Interfaz().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistro;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables

    
    class FondoLogin extends JPanel {
    
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            // Cargar la imagen desde el recurso
            imagen = new ImageIcon(getClass().getResource("/img/PantallaLogin.png")).getImage();
        
            // Dibujar la imagen en el panel
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            // Hacer el panel transparente para mostrar la imagen de fondo
            setOpaque(false);
            
            super.paint(g); // Llamar al método paint de JPanel para asegurar que se pinten los componentes hijos
            
        }
    
    }

}
