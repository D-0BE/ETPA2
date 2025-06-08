package es.nebrija.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import es.nebrija.model.Usuario;

public class DaoUsuario {
    private Connection conn;

    public DaoUsuario() throws SQLException {
        conn = DbConnection.getConnection();
    }

    public void selectAll() throws SQLException {
        String sql = "SELECT * FROM Usuario";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        int countData = 0;

        while (rs.next()) {
            String idUsuario = rs.getString("idUsuario");
            String contrasena = rs.getString("contraseña");
            int puntuacion = rs.getInt("puntuación");
            int idPersonaje = rs.getInt("idPersonaje");

            countData++;

            System.out.println("Datos del usuario " + countData + "\n" +
                    "ID Usuario: " + idUsuario + "\n" +
                    "Contraseña: " + contrasena + "\n" +
                    "Puntuación: " + puntuacion + "\n" +
                    "ID Personaje: " + idPersonaje + "\n" +
                    "----------------------------");
        }

        stmt.close();
    }

    public Usuario getUsuario(String idUsuario, String contrasena) throws SQLException {
        String sql = "SELECT * FROM Usuario WHERE idUsuario = ? AND contraseña = ?";
        var pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, idUsuario);
        pstmt.setString(2, contrasena);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            Usuario usuario = new Usuario(
                rs.getInt("idUsuario"),
                rs.getString("idUsuario"), // Asumiendo que el nombre es el mismo que idUsuario
                "", // Email no está en la tabla, se deja vacío
                rs.getString("contraseña")
            );
            pstmt.close();
            return usuario;
        }

        pstmt.close();
        return null;
    }

    public boolean registrarUsuario(String idUsuario, String contrasena, int puntuacion, int idPersonaje) throws SQLException {
        String sql = "INSERT INTO Usuario (idUsuario, contraseña, puntuación, idPersonaje) VALUES (?, ?, ?, ?)";
        var pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, idUsuario);
        pstmt.setString(2, contrasena);
        pstmt.setInt(3, puntuacion);
        pstmt.setInt(4, idPersonaje);

        int rowsAffected = pstmt.executeUpdate();
        pstmt.close();
        return rowsAffected > 0;
    }
}
