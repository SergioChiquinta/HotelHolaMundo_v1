
package softwarereservacionhotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class GeneradorIdTipoPago {

    // Conjunto de caracteres permitidos en el ID
    private static final String CARACTERES = "123456789ABCDEFGHI";
    // Longitud del ID a generar
    private static final int LONGITUD_ID = 5;

    // Método para generar un ID aleatorio para Tipo Pago
    public static String generarIdTipoPago() {
        Random random = new Random(); // Generador de números aleatorios
        StringBuilder id = new StringBuilder(LONGITUD_ID); // Constructor de cadenas con longitud inicial

        // Generar ID de longitud LONGITUD_ID
        for (int i = 0; i < LONGITUD_ID; i++) {
            int index = random.nextInt(CARACTERES.length()); // Obtener índice aleatorio
            id.append(CARACTERES.charAt(index)); // Añadir el carácter correspondiente al ID
        }

        return id.toString(); // Devolver el ID generado
    }

    // Método para verificar si un ID es único en la base de datos
    public static boolean verificarIdUnico(String id) {
        try (Connection con = Conexion.getConexion()) {
            // Consulta SQL para contar cuántas veces aparece el ID en la tabla TIPO_PAGO
            String query = "SELECT COUNT(*) FROM TIPO_PAGO WHERE ID_TPA = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, id); // Asignar el ID al parámetro de la consulta
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // El ID es único si el recuento es 0
                return rs.getInt(1) == 0;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Imprimir cualquier excepción SQL que ocurra
        }
        return false; // Devolver false si ocurre una excepción o el ID no es único
    }

    // Método para generar un ID único, verificando su unicidad en la base de datos
    public static String generarIdUnico() {
        String id;
        do {
            id = generarIdTipoPago(); // Generar un ID
        } while (!verificarIdUnico(id)); // Repetir mientras el ID no sea único
        return id; // Devolver el ID único verificado
    }
}


