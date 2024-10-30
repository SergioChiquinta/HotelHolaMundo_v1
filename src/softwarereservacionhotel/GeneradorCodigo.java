
package softwarereservacionhotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GeneradorCodigo {

    // Método para generar un código único de 8 caracteres
    public static String generarCodigoUnico() {
        String caracteres = "123456789ABCDEFGHI"; // Caracteres permitidos en el código
        StringBuilder codigo = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int index = (int) (Math.random() * caracteres.length()); // Generar un índice aleatorio
            codigo.append(caracteres.charAt(index)); // Añadir el carácter correspondiente al código
        }
        return codigo.toString(); // Devolver el código generado
    }

    // Método para verificar si un código es único en la base de datos
    public static boolean esCodigoUnico(String codigo) {
        boolean esUnico = false;
        try (Connection con = Conexion.getConexion()) {
            String query = "SELECT COUNT(*) FROM RESERVA WHERE COD_RES = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, codigo); // Asignar el código al parámetro de la consulta
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                esUnico = rs.getInt(1) == 0; // El código es único si el recuento es 0
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Imprimir cualquier excepción SQL que ocurra
        }
        return esUnico; // Devolver si el código es único o no
    }
    
    // Método para generar un código único y verificar su unicidad en la base de datos
    public static String generarCodigoUnicoYVerificar() {
        String codigo;
        do {
            codigo = generarCodigoUnico(); // Generar un código
        } while (!esCodigoUnico(codigo)); // Repetir mientras el código no sea único
        return codigo; // Devolver el código único verificado
    }
}

