package es.nebrija.model;

import java.util.Scanner;

public class Eleccion{
    public static int elegido(int num1, int num2){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero de elección entre "+num1+" y "+num2);
        int numElegido = sc.nextInt();
        while (numElegido<num1 || numElegido>num2){
            System.out.println("Error, recueda escribir valor entre "+num1+" y "+num2);
            numElegido = sc.nextInt();
        }
        return numElegido;
    }
};
