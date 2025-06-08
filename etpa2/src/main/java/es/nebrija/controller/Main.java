package es.nebrija.controller;
import es.nebrija.dao.*;
import es.nebrija.model.*;
import es.nebrija.model.LanzadorLore;
import java.util.List;
import java.sql.SQLException;
import es.nebrija.model.Eleccion;
import es.nebrija.model.Personaje;
import es.nebrija.dao.DaoPersonaje;


public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Bienvenido a ETPA 2");
        System.out.println("Primero inicie sesión");
        System.out.println("1. Iniciar sesión");
        System.out.println("2. Registrarse");
        if (Eleccion.elegido(1, 2)==1) {
            Sesion.inicioSesion();
        }
        else{
            Sesion.registroUsuario();
        }

        System.out.println("Selecciona tu personaje:");
        DaoPersonaje dao = new DaoPersonaje();
        List<Personaje> personajes = dao.selectAll();
        for (Personaje p : personajes) {
            System.out.println(p.getIdPersonaje() + ". " + p.getNombre());
        }
        int idEleccion = Eleccion.elegido(1, personajes.size());
        Personaje seleccionado = dao.selectById(idEleccion);
        System.out.println("Has seleccionado: " + seleccionado.getNombre());
        
       
        LanzadorLore.lanzador(LanzadorLore.(idEleccion));
     
    }
}