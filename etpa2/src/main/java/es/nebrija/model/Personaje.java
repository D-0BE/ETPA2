package es.nebrija.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import es.nebrija.dao.DaoPersonaje;
import es.nebrija.dao.DbConnection;



public class Personaje {
    private int idPersonaje;
    private String nombre;
    private String apellidos;
    private String raza;
    private int edad;
    private int ataque;
    private int defensa;
    private int velocidad;
    
    public Personaje(int idPersonaje, String nombre, String apellidos, String raza, int edad, int ataque, int defensa, int velocidad) {
        this.idPersonaje = idPersonaje;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.raza = raza;
        this.edad = edad;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
    }
    public void setPersonajes()  throws SQLException{
        ArrayList<Personaje> personajes = new ArrayList<Personaje>();
        DaoPersonaje cargarPersonajes = new DaoPersonaje();
        personajes = cargarPersonajes.cargarPersonajes();
        while (Personaje personaje : personajes) {
            
        }
    }
    
    
}