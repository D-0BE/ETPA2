package es.nebrija.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Personaje {

    private static final String URL = "";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private String nombre;
    private String genero;
    private String clase;
    private int nivel;
    private String raza;
    private int vida;
    private int ataque;
    private int defensa;
    private int velocidad;
    public void crearPersonaje(String nombre, String genero,String raza,String clase) throws SQLException {
        String sql = "INSERT INTO personajes (nombre, clase, nivel) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            stmt.setString(2, genero);
            stmt.setString(3, raza);
            stmt.setString(4, clase);
            stmt.executeUpdate();
        } catch (SQLException e) {
                e.printStackTrace();
            }
    }
    public void setPersonaje(String nombre, String genero,String raza,String clase,int nivel,int vida,int ataque,int defensa,int velocidad) {
        this.nombre = nombre;
        this.genero = genero;
        this.raza = raza;
        this.clase = clase;
        this.nivel = nivel;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
    }
}