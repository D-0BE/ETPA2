package es.nebrija.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.nebrija.dao.DaoMochila;
import es.nebrija.dao.DaoObjeto;

public class Mochila {
    private int idMochila;
    private String nombre;
    private String descripcion;
    private int capacidad;
    private int valor;

    public Mochila(int idMochila, String nombre, String descripcion, int capacidad, int valor) {
        this.idMochila = idMochila;
        this.nombre= nombre;
        this.descripcion = descripcion;
        this.capacidad= capacidad;
        this.valor= valor;
    }

    public void mostrarMochilas() throws SQLException {
        ArrayList<Mochila> mochilas = new ArrayList<Mochila>();
        DaoMochila cargarMochilas = new DaoMochila();
        mochilas = cargarMochilas.cargarMochilas();
        for (Mochila mochila : mochilas) {
            System.out.println("ID: " + mochila.getIdMochila() +
                ", Nombre: " + mochila.getNombre() +
                ", Descripción: " + mochila.getDescripcion() +
                ", Valor: " + mochila.getValor() +
                ", Capacidad: " + mochila.getCapacidad());
        }
    }
    public int getIdMochila(){
        return idMochila; 
    }
    public String getNombre(){ 
        return nombre; 
    }
    public String getDescripcion(){ 
        return descripcion; 
    }
    public int getCapacidad(){ 
        return capacidad; 
    }
    public int getValor(){ 
        return valor; 
    }
}