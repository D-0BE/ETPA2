package es.nebrija.dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import es.nebrija.model.Personaje;

public class DaoPersonaje {
    
    private Connection conn = null;

    public DaoPersonaje () throws SQLException{
        conn = DbConnection.getConnection();
    }

    public void selectAll() throws SQLException {
        String selectedAllData = "SELECT * FROM Personaje";
        Statement statementSelect = conn.createStatement();
        ResultSet resultData = statementSelect.executeQuery(selectedAllData);

        int countData = 0;

        while (resultData.next()) {
            int idPersonaje = resultData.getInt("idPersonaje");
            String nombre = resultData.getString("nombre");
            String apellidos = resultData.getString("apellidos");
            String raza = resultData.getString("raza");
            int edad = resultData.getInt("edad");
            int ataque = resultData.getInt("ataque");
            int defensa = resultData.getInt("defensa");
            int velocidad = resultData.getInt("velocidad");
            int idMochila = resultData.getInt("idMochila");

            countData++;

            System.out.println("Datos del personaje " + countData + "\n" +
                    "ID: " + idPersonaje + "\n" +
                    "Nombre: " + nombre + "\n" +
                    "Apellidos: " + apellidos + "\n" +
                    "Raza: " + raza + "\n" +
                    "Edad: " + edad + "\n" +
                    "Ataque: " + ataque + "\n" +
                    "Defensa: " + defensa + "\n" +
                    "Velocidad: " + velocidad + "\n" +
                    "ID Mochila: " + idMochila + "\n" +
                    "----------------------------");
        }

        statementSelect.close();
    }
}
