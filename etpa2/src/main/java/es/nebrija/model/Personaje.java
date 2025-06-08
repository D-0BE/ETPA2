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
    
    public int getIdPersonaje() {
        return idPersonaje;
    }
    public void setIdPersonaje(int idPersonaje) {
        this.idPersonaje = idPersonaje;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getDefensa() {
        return defensa;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public void seleccionarTodosPersonajes () throws SQLException{
    DaoPersonaje daoPersonaje = new DaoPersonaje();
    daoPersonaje.selectAll();
    }
    
}

