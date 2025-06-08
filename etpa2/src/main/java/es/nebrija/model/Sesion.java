package es.nebrija.model;

import java.util.Scanner;

import es.nebrija.dao.DaoUsuario;
import es.nebrija.model.Usuario;

public class Sesion {
    public static void inicioSesion() {
        Scanner sc = new Scanner(System.in);
        DaoUsuario daoUsuario;

        try {
            daoUsuario = new DaoUsuario();
        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos.");
            return;
        }

        Usuario usuario = null;

        while (usuario == null) {
            System.out.println("Escriba el nombre de usuario: ");
            String user = sc.nextLine();
            System.out.println("Escriba la contraseña: ");
            String password = sc.nextLine();

            try {
                usuario = daoUsuario.getUsuario(user, password);
                if (usuario != null) {
                    System.out.println("Inicio de sesión exitoso.");
                    System.out.println("Bienvenido, " + usuario.getNombre());
                } else {
                    System.out.println("Usuario o contraseña incorrectos. Intente nuevamente.");
                }
            } catch (Exception e) {
                System.out.println("Error al verificar el usuario.");
            }
        }
    }

    public static void registroUsuario() {
        Scanner sc = new Scanner(System.in);
        DaoUsuario daoUsuario;

        try {
            daoUsuario = new DaoUsuario();
        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos.");
            return;
        }

        System.out.println("Ingrese la clave de registro: ");
        String claveRegistro = sc.nextLine();

        if (!"JuegosReunidos123".equals(claveRegistro)) {
            System.out.println("Clave de registro incorrecta. No se puede registrar el usuario.");
            return;
        }

        System.out.println("Escriba el nombre de usuario: ");
        String user = sc.nextLine();
        System.out.println("Escriba la contraseña: ");
        String password = sc.nextLine();
        System.out.println("Ingrese la puntuación inicial: ");
        int puntuacion = sc.nextInt();
        System.out.println("Ingrese el ID del personaje: ");
        int idPersonaje = sc.nextInt();

        try {
            boolean registrado = daoUsuario.registrarUsuario(user, password, puntuacion, idPersonaje);
            if (registrado) {
                System.out.println("Usuario registrado exitosamente.");
            } else {
                System.out.println("Error al registrar el usuario.");
            }
        } catch (Exception e) {
            System.out.println("Error al registrar el usuario.");
        }
    }
}
