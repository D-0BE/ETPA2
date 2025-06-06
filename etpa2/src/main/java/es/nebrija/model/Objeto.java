package es.nebrija.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import es.nebrija.dao.DaoObjeto;
import es.nebrija.dao.DbConnection;

public class Objeto {
    private int idObjeto;
    private String nombre;
    private String descripcion;
    private int valor;
    private int peso;

    public Objeto(int idObjeto, String nombre, String descripcion, int valor, int peso) {
        this.idObjeto = idObjeto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
        this.peso = peso;
    }
    public void mostrarObjetos() throws SQLException {
        ArrayList<Objeto> objetos = new ArrayList<Objeto>();
        DaoObjeto cargarObjetos = new DaoObjeto();
        objetos = cargarObjetos.cargarObjetos();
        for (Objeto objeto : objetos) {
            System.out.println("ID: " + objeto.idObjeto + ", Nombre: " + objeto.nombre + 
                               ", Descripción: " + objeto.descripcion + 
                               ", Valor: " + objeto.valor + 
                               ", Capacidad Ocupada: " + objeto.peso);
        }
    }
    public int getIdObjeto() {
        return idObjeto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getValor() {
        return valor;
    }

    public int getPeso() {
        return peso;
    }
}
