package es.nebrija.controller;
import es.nebrija.dao.*;
import es.nebrija.model.*;


public class Main {
    public static void main(String[] args) {
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
        
    }
}