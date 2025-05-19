package es.nebrija.model;

import java.util.ArrayList;

public class LanzadorLore {
    public static void lanzador(ArrayList<String> historia){
        try{
            for (String trozo : historia){
                System.out.println(trozo);
                Thread.sleep(2000);
            }
        }
        catch(Exception e){
            String error = "Error en la impresión \n Detalles del error: "+e;
            System.out.println(error);
        }
    }
}
