package es.nebrija.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class DaoAliado {
    private Connection conn;

    public DaoAliado() throws SQLException {
        conn = DbConnection.getConnection();
    }

    public void selectAll() throws SQLException {
        String sql = "SELECT * FROM Aliado";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        int countData = 0;

        while (rs.next()) {
            int idAliado = rs.getInt("idAliado");
            String nombre = rs.getString("nombre");
            String apellidos = rs.getString("apellidos");
            String raza = rs.getString("raza");
            int edad = rs.getInt("edad");
            int ataque = rs.getInt("ataque");
            int defensa = rs.getInt("defensa");
            int velocidad = rs.getInt("velocidad");

            countData++;

            System.out.println("Datos del aliado " + countData + "\n" +
                    "ID Aliado: " + idAliado + "\n" +
                    "Nombre: " + nombre + "\n" +
                    "Apellidos: " + apellidos + "\n" +
                    "Raza: " + raza + "\n" +
                    "Edad: " + edad + "\n" +
                    "Ataque: " + ataque + "\n" +
                    "Defensa: " + defensa + "\n" +
                    "Velocidad: " + velocidad + "\n" +
                    "----------------------------");
        }

        stmt.close();
    }
}
