package es.nebrija.model;

import java.util.Random;

public class Batalla {

    public static void lanzar() {
        System.out.println("Elige la batalla a librar:");
        System.out.println("1: Valle de Hierro");
        System.out.println("2: Montaña de Fuego");
        int eleccion = Eleccion.elegido(1, 2);

        String clima = obtenerClimaAleatorio(eleccion);
        System.out.println("Clima actual: " + clima);
        aplicarEfectoClima(clima);
        for (String linea : LanzadorLore.historiaJorge(eleccion)) {
            System.out.println(linea);
        }
    }

    private static String obtenerClimaAleatorio(int eleccion) {
        String[] climas1 = { "Lluvia helada", "Niebla densa", "Tormenta eléctrica" };
        String[] climas2 = { "Calor abrasador", "Niebla venenosa", "Vendaval arenoso" };
        Random rnd = new Random();
        String[] pool = (eleccion == 1) ? climas1 : climas2;
        return pool[rnd.nextInt(pool.length)];
    }

    private static void aplicarEfectoClima(String clima) {
        switch (clima) {
            case "Lluvia helada":
                System.out.println("Efecto: tu velocidad disminuye.");
                break;
            case "Niebla densa":
                System.out.println("Efecto: tu precisión de ataque disminuye.");
                break;
            case "Tormenta eléctrica":
                System.out.println("Efecto: tu defensa se reduce.");
                break;
            case "Calor abrasador":
                System.out.println("Efecto: tu resistencia baja, velocidad reducida.");
                break;
            case "Niebla venenosa":
                System.out.println("Efecto: el personaje queda envenenado.");
                break;
            case "Vendaval arenoso":
                System.out.println("Efecto: tu poder de ataque disminuye.");
                break;
            default:
                System.out.println("Efecto: condiciones neutras.");
        }
    }

    public static void main(String[] args) {
        lanzar();
    }
}
