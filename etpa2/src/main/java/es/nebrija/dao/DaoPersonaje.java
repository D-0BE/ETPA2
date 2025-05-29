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

    public ArrayList<Personaje> cargarPersonajes() throws SQLException{
        String seleccionarTodo = "SELECT * FROM Personaje";

        Statement statementSelect = conn.createStatement();

        ResultSet resultData = statementSelect.executeQuery(seleccionarTodo);

        ArrayList<Personaje> personajes = new ArrayList<Personaje>();

        while(resultData.next()){
            int idPersonaje = resultData.getInt("idPersonaje");
            String nombre = resultData.getString("nombre");
            String apellidos = resultData.getString("apellidos");
            String raza = resultData.getString("raza");
            int edad = resultData.getInt("edad");
            int ataque = resultData.getInt("ataque");
            int defensa = resultData.getInt("defensa");
            int velocidad = resultData.getInt("velocidad");
            Personaje cargado = new Personaje(idPersonaje, nombre, apellidos, raza, edad, ataque, defensa, velocidad);
            personajes.add(cargado);
        }
        return personajes;
    }


}
