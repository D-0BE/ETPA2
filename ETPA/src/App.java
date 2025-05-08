import java.util.Scanner;
import java.util.Random;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        Random random = new Random();
        String clave;
        String personaje;
        String personajes[] = {"JORGE", "MARTA", "FERMiN"};
        int idPersonaje=0;
        String descripcionPersonaje[]={"Jorge, un joven de 20 años y 1.9 m de altura, tiene un aspecto típicamente alemán, con rasgos faciales fuertes y una postura erguida. Es un apasionado de las armas, lo que lo convierte en el tirador del equipo. Su mirada decidida y su destreza con rifles y pistolas lo hacen imprescindible en los enfrentamientos a larga distancia. Suele vestir ropa táctica ligera y lleva siempre consigo su equipo de tiro, preparado para proteger al grupo desde las sombras y con precisión letal.", 
        "Marta, una enfermera de 32 años, de estatura media y complexión atlética, se caracteriza por su cabello castaño oscuro recogido en una coleta alta. Sus ojos verdes intensos reflejan su atención al detalle y su capacidad para mantenerse firme en situaciones de emergencia. Aunque su rostro tiene rasgos suaves, las ojeras debajo de sus ojos muestran el cansancio de las largas noches de trabajo en urgencias.",
        "Fermín, de 38 años, es un hombre musculoso y robusto que mide 3 m de altura, con una cicatriz en la ceja y una barba espesa que reflejan su experiencia en combate. Viste ropa resistente, chaleco blindado y botas gruesas, y siempre lleva un mazo de guerra. Su naturaleza protectora lo convierte en el pilar del grupo, capaz de resistir grandes daños y enfrentarse a los zombies con una fuerza imparable, siendo el tanque del equipo en este mundo apocalíptico."};
        String personajesSecundarios[]={"VALERIA", "ANDRÉS", "CAMILA", "HÉCTOR", "ADRIANA", "GABRIEL", "PAOLA", "FELIPE", "DIANA", "SEBASTIÁN"};
        String amigo1 = personajesSecundarios[random.nextInt(personajesSecundarios.length-1)];
        String amigo2 = personajesSecundarios[random.nextInt(personajesSecundarios.length-1)];
        while (amigo1.equals(amigo2)) {
            amigo2 = personajesSecundarios[random.nextInt(personajesSecundarios.length-1)];
        }
        String amigo3 = personajesSecundarios[random.nextInt(personajesSecundarios.length-1)];
        while (amigo1.equals(amigo3)||amigo2.equals(amigo3)) {
            amigo3 = personajesSecundarios[random.nextInt(personajesSecundarios.length-1)];
        }

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("                                                                                          ");
        System.err.println("░▒▓███████▓▒░░▒▓███████▓▒░ ░▒▓██████▓▒░       ░▒▓█▓▒░▒▓████████▓▒░▒▓██████▓▒░▒▓████████▓▒░");
        System.err.println("░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░     ░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▒░");
        System.out.println("░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░     ░▒▓█▓▒░        ░▒▓█▓▒░");
        System.out.println("░▒▓███████▓▒░░▒▓███████▓▒░░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓██████▓▒░░▒▓█▓▒░        ░▒▓█▓▒░");
        System.out.println("░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░     ░▒▓█▓▒░        ░▒▓█▓▒░");
        System.out.println("░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░     ░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▒░");
        System.out.println("░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░░▒▓██████▓▒░ ░▒▓██████▓▒░░▒▓████████▓▒░▒▓██████▓▒░  ░▒▓█▓▒░");
        System.out.println("                                                                                             ");
        System.out.println("░▒▓████████▓▒░░▒▓██████▓▒░░▒▓██████████████▓▒░░▒▓███████▓▒░░▒▓█▓▒░▒▓████████▓▒░░▒▓███████▓▒░");
        System.out.println("       ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░");
        System.out.println("     ░▒▓██▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░");
        System.out.println("   ░▒▓██▓▒░  ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓███████▓▒░░▒▓█▓▒░▒▓██████▓▒░  ░▒▓██████▓▒░");
        System.out.println(" ░▒▓██▓▒░    ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░");
        System.out.println("░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░");
        System.out.println("░▒▓████████▓▒░░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓███████▓▒░░▒▓█▓▒░▒▓████████▓▒░▒▓███████▓▒░");
        System.out.println("                                                                                           ");
        System.out.println("-----------------------------------------------------------------------------------------");
        
        System.out.println("Una historia de una aventura en las 'zonas muertas' en un mundo multiversal");
        System.out.println("Desarrollado por Rui Qian, Victor Martinez y David Dobeson");
        System.out.println();
        System.out.println();
        System.out.println("Introduce el código para poder entrar al juego");
        clave = sc.nextLine();
        while(!clave.equals("jugones")){
            System.out.println("Codigo incorrecto, vuelva a intentarlo");
            System.out.println("Introduce el código correcto");
            clave = sc.nextLine();
        }
        System.out.println("Código correcto, bienvenido");
        System.out.println("Atención, ahora viene la elección de personajes.");
        System.out.println("Este juego no es uno cualquiera, la eleccion de personaje cambia POR COMPLETO la historia, teniando cada personaje una");
        System.out.println("Ha recomendación de los desarrolladores, jueguen todos los personajes ya que son 3 juegos totalmente distintos con distintas mecanicas");
        System.out.println("Elige uno de los personajes");
        for (int i = 0; i<personajes.length; i++){
            if (i<personajes.length-1){
                System.out.print((i+1) + "- "+ personajes[i]+ " / ");
            }
            else{
                System.out.println((i+1) + "- "+ personajes[i]);
            }
        }
        int eleccion = sc.nextInt();
        personaje = personajes[eleccion-1];
        System.out.println("Has elegido a: "+personaje);
        System.out.println(descripcionPersonaje[(eleccion-1)]);
        System.out.print("Presiona enter para empezar con la historia ");
        sc.nextLine();
        sc.nextLine();
        String intro[] = {
            "En un rincón perdido del multiverso, existe una ciudad llamada Yeria.",
            "Yeria no es una ciudad común. Es un nexo entre múltiples realidades, un lugar donde los universos convergen y se cruzan.",
            "Sin embargo, el equilibrio de Yeria ha sido alterado por su gobernante, quien, obsesionado con el poder, ha jugado con los hilos de los universos.",
            "Este gobernador, conocido solo como El Tejedor, manipuló los pasajes entre los mundos, causando alteraciones permanentes en la realidad.",
            "Los cambios que ocasionó no solo alteraron el flujo temporal, sino que trajeron consigo horrores de otras dimensiones.",
            "El más grave de estos horrores fueron los hongos que comenzaron a crecer por toda la ciudad.",
            "Estos hongos no son como cualquier otro: tienen la capacidad de sobrevivir y prosperar con el calor humano.",
            "Este fenómeno, aparentemente inofensivo al principio, llevó a la creación de los muertos vivientes.",
            "Los hongos infectan a los seres vivos, transformándolos en criaturas sin alma, conocidas como los 'muertos vivientes' o 'zombies'.",
            "Yeria ahora se enfrenta a una lucha constante por su supervivencia, mientras los ciudadanos intentan comprender las consecuencias de las acciones de El Tejedor.",
            "Las calles de Yeria, antaño llenas de vida y vibrantes de culturas multiversales, ahora están desiertas, salpicadas por los ecos de los pasos arrastrados de los muertos.",
            "¿Podrá Yeria algún día recuperar su equilibrio, o está condenada a ser un puente eterno entre mundos caídos?"
        };
        ReproductorDeMusica.reproducir("src\\resources\\IntroMusical.wav");
        
        for (int i = 0; i<intro.length; i++){
            System.out.println(intro[i]);
            Thread.sleep(4000);
            System.out.println();
        }
        
        
        

        

        //selección de personaje.abatieron
        switch (personaje){
            case "Jorge":
                personaje = "JORGE";
                idPersonaje=0;
                break;
            case  "Marta" :
                personaje = "MARTA";
                idPersonaje=1;
                break;
            case "Fermin" :
                personaje = "FERMIN";
                idPersonaje=2;

            
        }
        if(eleccion==1){
            Jorge(amigo1, amigo2, amigo3);
        }
        else if(eleccion==2){
            Marta(amigo1, amigo2, amigo3);
        }
        else if(eleccion==3){
            Fermin(amigo1, amigo2, amigo3);
        } else {
            System.out.println("error");
        }


    }
    //Función que se ejecuta para todas las batallas de la historia

{


    }

    public static int Eleccion(){
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Quieres continuar?");
        System.out.println("1- Sí       2-No");
        int eleccion=sc.nextInt();
        while (eleccion!=1&&eleccion!=2) {
            System.out.println("Opción no valida, vuelva a intentar (rango numerico 1-2)");
            System.out.println("¿Quieres continuar?");
            System.out.println("1- Sí       2-No");
            eleccion=sc.nextInt();
        };
        return eleccion;

    }
    
    public static boolean Batalla(String prota, String contrincante, int saludProta, int saludVillano, int dañoProta, int dañoVillano) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int dados[][] = {
            {1, 2, 3, 4, 5, 6},
            {0, 2, 3, 5, 6, 2},
            {0, 0, 0, 0, 3, 10},
            {1, 1, 2, 3, 2, 9}
        };
    
        System.out.println("Antes de empezar el enfrentamiento, elige el tipo de dado:");
        System.out.println("1- 'Dado común' -->(1,2,3,4,5,6)");
        System.out.println("2- 'Dado raro' -->(0,2,3,5,6,2)");
        System.out.println("3- '1% probabilidades 99% de fe' -->(0,0,0,0,3,10)");
        System.out.println("4- 'Dado especial' -->(1,1,2,3,2,9)");
    
        int numDado = sc.nextInt();
        // Validar que el dado elegido sea correcto
        while (numDado < 1 || numDado > 4) {
            System.out.println("Por favor, elige un número válido (1-4):");
            numDado = sc.nextInt();
        }
    
        int aleatorio = 0;
        int eleccion = 0;
        int daño = 0;
        boolean victoria = false;
    
        System.out.println("Empieza el enfrentamiento entre " + prota + " vs " + contrincante);
        int enfrentamiento = 1;
    
        while (enfrentamiento == 1) {
            System.out.println("Vida de " + prota + ": " + saludProta);
            System.out.println("Vida de " + contrincante + ": " + saludVillano);
            System.out.println("Tipo de dado: " + numDado);
            System.out.println("1- Atacar");
            System.out.println("2- Cambiar dado");
            eleccion = sc.nextInt();
    
            switch (eleccion) {
                case 1:
                    aleatorio = dados[numDado - 1][random.nextInt(6)]; // Ajuste del índice
                    daño = (int) (dañoProta * (aleatorio / 10.0)); // División flotante
                    saludVillano -= daño;
                    System.out.println("Ha salido el: " + aleatorio);
    
                    if (saludVillano <= 0) {
                        System.out.println("¡Lo conseguiste! Has derrotado a " + contrincante + ". Ya puedes pasar.");
                        victoria = true;
                        enfrentamiento = 0;
                    } else {
                        System.out.println(prota + " ha infligido " + daño + " a " + contrincante + ", dejándolo con " + saludVillano + " puntos de vida.");
                        saludProta -= dañoVillano;
    
                        if (saludProta <= 0) {
                            System.out.println("Oh no, " + contrincante + " ha atacado a " + prota + " y lo ha matado.");
                            enfrentamiento = 0;
                        } else {
                            System.out.println("Cuidado!!! " + contrincante + " ha quitado a " + prota + " " + dañoVillano + " puntos de vida.");
                        }
                    }
                    break;
    
                case 2:
                    System.out.println("Elige el nuevo dado que quieras usar:");
                    System.out.println("1- 'Dado común' -->(1,2,3,4,5,6)");
                    System.out.println("2- 'Dado raro' -->(0,2,3,5,6,2)");
                    System.out.println("3- '1% probabilidades 99% de fe' -->(0,0,0,0,3,10)");
                    System.out.println("4- 'Dado especial' -->(1,1,2,3,2,9)");
                    numDado = sc.nextInt();
    
                    // Validar que el dado elegido sea correcto
                    while (numDado < 1 || numDado > 4) {
                        System.out.println("Por favor, elige un número válido (1-4):");
                        numDado = sc.nextInt();
                    }
                    break;
    
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    
        sc.close();
        return victoria;
    }
    

    //Tutorial de batallas
    public static void tutorial(String personaje, String villano, int ataquePersonaje){
        String tutorial[]={"Enhorabuena has llegado a tu primera batalla, aquí te va un pequeño tutorial:",
        "En primer lugar, el juego te pedira que elijas un tipo de dado,",
        "el cual determinara la cantidad de daño que harás a tu contrincante, en este caso"+villano,
        "Una vez decidido el dado, te saldrá un menú con 2 opciones",
        "la primera, sirve para atacar y lanzar el dado,",
        "El daño inflijido se determina de la siguiente manera, el numero que te toque (Ej: 3)",
        "se divide entre 10 y se multiplica por el daño maximo del personaje, (Ej: 0,3*"+ataquePersonaje+")",
        "Una mecanica que creemos que hace que sea el juego más entretenido",
        "tienes que elegir bien el dado, ya que ten en cuenta que el villano no solo recibe, despues de tu ataque le toca a el",
        "A diferencia de tí, el daño del villano es siempre fijo",
        "En segundo lugar tienes para cambiar de dado. No somos tan malos de dejarte con el mismo dado siempre",
        "Ahora sí disfruta de tu combate con "+personaje+" vs "+villano};
        for (int i = 0; i < tutorial.length; i++) {
            System.out.println(tutorial[i]);
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    System.err.println("La ejecución fue interrumpida: " + e.getMessage());
                }
                System.out.println();
        }
    
    }
    
    //historia de Jorge

    public static void Jorge(String amigo1, String amigo2, String amigo3) {
        String personaje = "Jorge";
        boolean batalla1=false;
        boolean batalla2=false;
        boolean batalla3=false;
        int vidaPersonaje=80;
        int ataquePersonaje=150;
        String intro[] = {
            "Jorge miró a su alrededor mientras el caos multiversal rugía como una tormenta imparable.",
            "Las calles de la ciudad multiversal se deformaban y fragmentaban; edificios flotaban, luces neón parpadeaban en patrones imposibles.",
            "\"Tenemos que hacer algo antes de que esto se desmorone completamente\", dijo Jorge mientras se giraba hacia sus tres amigos.",
            amigo1 + " frunció el ceño. \"¿Alguna idea, Jorge? Todo esto parece estar más allá de nuestra capacidad.\"",
            amigo2 + " cruzó los brazos y señaló un portal parpadeante. \"Ese portal lleva a una realidad donde todo opera bajo las reglas de un mundo de detectives.\"",
            "\"¿Detectives? ¿Qué tan útil podría ser eso?\", preguntó " + amigo3 + ", inclinando la cabeza con escepticismo.",
            "Jorge levantó una ceja. \"Es exactamente lo que necesitamos. Una realidad donde los misterios se resuelven podría darnos la clave para estabilizar el núcleo multiversal.\"",
            amigo1 + " suspiró y asintió. \"Supongo que vale la pena intentarlo.\"",
            "Con determinación, los cuatro amigos atravesaron el portal, sintiendo un escalofrío recorrer sus cuerpos mientras la realidad cambiaba a su alrededor.",
            "Al otro lado, se encontraron en un callejón oscuro, lleno de niebla, con farolas que parpadeaban débilmente.",
            "El ambiente olía a misterio, con periódicos volando por las calles vacías y un constante sonido de pasos lejanos.",
            "\"Esto es... increíble\", dijo " + amigo2 + " mientras observaba el paisaje. \"Es como estar en una novela de detectives.\"",
            "De repente, una figura emergió de las sombras, vestida con un abrigo largo y un sombrero de ala ancha.",
            "\"¡No puede ser!\", exclamó " + amigo3 + ", reconociendo al hombre de inmediato. \"Es Richard Castle, el famoso escritor.\"",
            "Castle sonrió con su característico encanto. \"Ah, veo que mi fama me precede incluso en esta realidad. ¿Qué los trae por aquí, forasteros?\"",
            "Jorge dio un paso adelante. \"Estamos buscando pistas para estabilizar nuestra ciudad multiversal. ¿Puede ayudarnos?\"",
            "Castle se rió. \"¿Un caso interdimensional? Esto suena mejor que cualquiera de mis libros. Estoy dentro.\"",
            amigo1 + " miró a Jorge con incredulidad. \"¿De verdad vamos a trabajar con un escritor?\"",
            "\"Confía en mí\", dijo Jorge con una sonrisa. \"Los escritores siempre tienen una perspectiva única.\"",
            "El grupo, ahora con Castle incluido, comenzó a recorrer las calles de esta realidad de detectives.",
            "Mientras avanzaban, encontraron un cartel con la imagen de un hombre excéntrico con gafas enormes. \"¡Doctor Nefario!\", exclamó " + amigo2 + ".",
            "Jorge apretó los puños. \"Parece que no importa la realidad, siempre hay alguien como él causando problemas.\"",
            "Castle inclinó la cabeza mientras observaba el cartel. \"Bueno, si este Nefario es nuestro villano, entonces creo que es hora de atrapar al pez gordo.\"",
            amigo3 + " señaló un edificio cercano con luces parpadeantes. \"Según ese cartel, tiene su guarida ahí dentro.\"",
            "Jorge asintió con determinación. \"Entonces vamos. Esta ciudad multiversal no se salvará sola.\""
        };
        String muerte1[] = {
            "El silencio llenó el aire mientras los escombros de la batalla se asentaban.",
            "Jorge estaba tendido en el suelo, inmóvil, con su cuerpo rodeado por los destellos de energía residual del multiverso.",
            amigo1 + " cayó de rodillas junto a él, su voz quebrándose. \"¡Jorge, no! ¡Teníamos un plan!\"",
            amigo2 + " apretó los dientes, con lágrimas corriendo por su rostro. \"No puede terminar así... No después de todo lo que hemos hecho juntos.\"",
            amigo3 + " miró al cielo fragmentado, donde los portales entre realidades colapsaban uno por uno. \"Él lo dio todo por nosotros... por el multiverso.\"",
            "El Doctor Nefario, con su risa sardónica, desapareció en un destello de luz, dejando al grupo sin respuestas, solo con una amarga derrota.",
            "Semanas después, el multiverso comenzaba a desmoronarse. Las fisuras entre las realidades se expandían rápidamente.",
            "\"¿De qué sirvió todo esto?\", dijo " + amigo1 + " mientras observaba cómo una torre entera era tragada por un portal inestable.",
            amigo2 + " respondió con voz apagada: \"Jorge creía en nosotros. Creía que podíamos encontrar una manera de arreglar esto, incluso sin él.\"",
            amigo3 + " golpeó el suelo con frustración. \"Pero no pudimos. Fallamos... y ahora todo lo que queda es esperar el final.\"",
            "Los colores del cielo se volvieron caóticos, y los sonidos del multiverso muriendo resonaron como un lamento infinito.",
            "Meses después, en el último rincón seguro del multiverso, los amigos se reunieron por última vez.",
            amigo1 + " susurró: \"Jorge no solo nos dejó su sacrificio, también nos dejó su esperanza. Pero... el tiempo se nos acabó.\"",
            amigo2 + " asintió lentamente. \"No importa lo que hagamos ahora, las fisuras son imparables. Todo se desmoronará pronto.\"",
            amigo3 + " miró al horizonte, donde las realidades chocaban entre sí. \"Tal vez Jorge sabía que esto era inevitable. Tal vez solo quería que nos despidiéramos con dignidad.\"",
            "El último momento llegó en un estallido de luz cegadora. Las fronteras entre las realidades se derrumbaron completamente.",
            "Los amigos, junto con el resto del multiverso, fueron arrastrados hacia el vacío, un final inevitable para todas las historias, todos los mundos.",
            "Y así, el multiverso dejó de existir, sus memorias dispersas como polvo en el infinito."
        };
        String[] dialogo1 = {
            "El sonido de la explosión resonó en la guarida del Doctor Nefario mientras Jorge daba el golpe final.",
            "El villano cayó al suelo, su risa malévola finalmente apagada. \"Esto no es el final...\", susurró antes de desvanecerse.",
            amigo1 + " se acercó a Jorge, respirando con dificultad. \"Lo hicimos. ¡Lo logramos!\"",
            amigo2 + " sonrió aliviado. \"Pensé que nunca lo conseguiríamos.\"",
            amigo3 + " añadió, limpiándose el sudor de la frente: \"Gracias a Jorge, el multiverso está a salvo.\"",
            "Jorge miró a su alrededor, viendo cómo las fisuras del multiverso comenzaban a cerrarse. \"Aún queda mucho por hacer, pero por ahora, hemos ganado esta batalla.\"",
            "Richard Castle, quien había estado luchando junto a ellos, se acercó con una sonrisa. \"Eres un héroe, Jorge. Esto superará cualquier historia que haya escrito.\"",
            "Jorge le estrechó la mano. \"Gracias, Castle. Fue un honor tenerte en nuestro equipo.\"",
            "Castle asintió. \"Buena suerte en tu próxima aventura. Quizás algún día escriba sobre ti.\"",
            "Jorge y sus amigos atravesaron un nuevo portal, dejando atrás la realidad de detectives.",
            "Al otro lado, el rugido de motores llenó el aire. Estaban en una pista de Fórmula 1, rodeados de coches de carreras y luces brillantes.",
            amigo2 + " exclamó emocionado: \"¡Es Fernando Alonso!\"",
            "Fernando Alonso se acercó, ajustándose el casco. \"Bienvenidos. Parece que llegaron justo a tiempo para una carrera épica.\"",
            amigo3 + " señaló otro coche que se acercaba. \"¿Es ese... Rayo McQueen?\"",
            "Rayo McQueen frenó junto a ellos, guiñándoles un faro. \"¡Ka-chow! Siempre es divertido tener nuevos competidores.\"",
            "Mientras intentaban adaptarse a esta nueva realidad, se dieron cuenta de un problema: el portal de salida no aparecía.",
            "Jorge frunció el ceño. \"Esto no está bien. Algo nos retiene aquí.\"",
            "De repente, un sonido estremecedor resonó en la distancia. Una figura masiva emergió entre los edificios cercanos: un megazombie, descomunal y con un aura oscura.",
            amigo1 + " murmuró, horrorizado: \"¿Qué demonios es eso?\"",
            "Fernando Alonso miró al megazombie con determinación. \"Sea lo que sea, si queremos salir de aquí, debemos derrotarlo.\"",
            "Rayo McQueen aceleró, su motor rugiendo. \"¡No hay problema demasiado grande para un campeón como yo!\"",
            "Jorge asintió, reuniendo a sus amigos. \"Está bien. Derrotemos a este monstruo y salgamos de aquí juntos.\"",
            "El equipo, ahora compuesto por Jorge, sus amigos, Fernando Alonso y Rayo McQueen, se preparó para enfrentar al megazombie en una batalla épica.",
            "\"¡Vamos a demostrar que no importa la realidad, siempre podemos ganar!\", gritó Jorge mientras se lanzaban a la acción."
        };
        String[] muerte2 = {
            "La última batalla contra el megazombie fue más intensa de lo que jamás imaginaron.",
            "Jorge, Fernando Alonso y Rayo McQueen luchaban con todo lo que tenían, pero el monstruo parecía invencible.",
            "El megazombie avanzaba implacable, su cuerpo monstruoso resistiendo los ataques y dejando un rastro de destrucción.",
            amigo1 + " gritó: \"¡Jorge, ten cuidado!\"",
            "Jorge, agotado pero decidido, lanzó el último ataque, pero el megazombie lo esquivó con facilidad y lo golpeó con una fuerza devastadora.",
            "Jorge cayó al suelo, su visión nublada mientras el sonido de la batalla se desvanecía.",
            "Fernando Alonso, intentando salvar a su amigo, se lanzó al ataque, pero fue rápidamente derribado por el monstruo.",
            "Rayo McQueen también intentó intervenir, pero el megazombie lo lanzó contra las paredes de la pista.",
            amigo2 + " se acercó, pero vio con horror cómo Jorge se desvanecía, derrotado por el monstruo.",
            amigo3 + " gritó, con lágrimas en los ojos: \"¡No! ¡No puede ser!\"",
            "El megazombie sonrió con su terrible mueca, y antes de desaparecer en un destello de oscuridad, lanzó una última maldición.",
            "Con un golpe final, Jorge y sus amigos fueron atrapados en la realidad de Fórmula 1, sin posibilidad de salir.",
            "El portal se cerró, y todos quedaron atrapados en un mundo donde las carreras dominaban cada rincón, pero sin salida.",
            "Meses pasaron, y la esperanza se desvaneció. Los amigos de Jorge intentaron de todo para encontrar una forma de escapar, pero era inútil.",
            amigo1 + " se sentó junto a la pista, mirando al horizonte vacío. \"¿Qué hacemos ahora? No hay forma de salir de aquí.\"",
            amigo2 + " se levantó, aún con la mirada fija en el vacío. \"Jorge nos dejó una lección... nunca rendirse. Pero parece que el tiempo se nos acaba.\"",
            "Rayo McQueen, que ahora era más un compañero que un rival, se acercó y dijo: \"Podemos seguir luchando, pero el multiverso está muriendo. Lo siento, chicos, pero creo que ya no hay solución.\"",
            "Fernando Alonso asintió con tristeza. \"La batalla ya está perdida. Esto no es solo un mal día de carreras... es el fin de todo.\"",
            "Las fisuras entre las realidades comenzaron a expandirse, y las primeras señales del colapso del multiverso fueron inevitables.",
            "El caos llegó finalmente, los portales se desintegraron, y las realidades colapsaron una tras otra. El fin del multiverso estaba al alcance.",
            amigo3 + " miró a sus compañeros, sabiendo que no había escapatoria. \"Nunca pensamos que esto terminaría así... pero hemos dado todo.\"",
            "Y en ese último momento, la oscuridad consumió la última chispa de esperanza, mientras el multiverso se desmoronaba por completo.",
            "Los amigos de Jorge, atrapados en la realidad de Fórmula 1, se desvanecieron con el resto del multiverso, mientras todo lo que conocían desaparecía.",
            "Y así terminó todo: un adiós definitivo a un mundo que ya no existía."
        };
        String[] dialogo2 = {
            "La batalla contra el MegaZombie había sido brutal, pero Jorge, con la ayuda de Fernando Alonso y Rayo McQueen, logró finalmente vencerlo.",
            "Con un último golpe certero, el monstruo colapsó, y su cuerpo se desintegró en un mar de polvo y oscuridad.",
            amigo1 + " respiró con alivio. \"¡Lo conseguimos! ¡Jorge, lo lograste!\"",
            amigo2 + " sonrió, visiblemente agotado. \"Nunca pensé que un día vería un zombie de esa magnitud... pero lo vencimos.\"",
            "Rayo McQueen frenó junto a ellos, dando una vuelta triunfal. \"¡Eso sí que fue una carrera! Pero, ¿y ahora qué?\"",
            "Jorge observó el portal que se abría ante ellos. \"Es hora de seguir adelante. Ya hemos hecho lo nuestro aquí.\"",
            "Se acercó a Alonso y McQueen, sonriendo con gratitud. \"Gracias por todo, chicos. No lo habría logrado sin ustedes.\"",
            "Fernando Alonso le dio una palmada en el hombro. \"Un placer, Jorge. Ahora, sigue adelante y salva lo que queda del multiverso.\"",
            "Rayo McQueen hizo un sonido de motor con su faro. \"¡Te voy a extrañar, amigo! Pero sigue siendo el campeón del multiverso.\"",
            "Con una última mirada a sus amigos, Jorge atravesó el portal, sintiendo cómo su cuerpo era arrastrado hacia una nueva realidad.",
            "Al llegar al otro lado, se encontró en un mundo desolado, donde la naturaleza había reclamado lo que alguna vez fue la civilización.",
            "A lo lejos, vio a dos figuras luchando contra un grupo de infectados. Uno de ellos era un hombre de cabello rizado y barba, el otro una chica joven con un rifle en la mano.",
            "Era Joel y Ellie, los héroes de *The Last of Us*.",
            amigo3 + " no podía creerlo. \"¡Es Joel y Ellie! ¿Estamos en su mundo?\"",
            "Jorge se acercó rápidamente, y Joel, con su típica actitud cautelosa, levantó su pistola. \"¿Quién eres tú?\"",
            "\"Soy Jorge, un viajero del multiverso. Vine a ayudar. Este mundo, este apocalipsis, está conectado con algo mucho más grande.\"",
            "Ellie bajó el rifle con una mirada curiosa. \"¿Un viajero del multiverso? Eso suena a locura, pero no es peor que todo esto.\"",
            "Jorge asintió. \"Tengo que encontrar y derrotar al Tejedor. Él es el que está detrás de todo esto. Manipuló el multiverso y causó el apocalipsis zombie.\"",
            "Joel frunció el ceño, pensativo. \"El Tejedor... nunca he oído hablar de él. Pero si está detrás de todo esto, entonces tenemos que detenerlo.\"",
            "Ellie agarró su mochila. \"Vamos. No podemos permitir que siga destruyendo más mundos.\"",
            "Juntos, Jorge, Joel y Ellie comenzaron a adentrarse en las ruinas de una ciudad devastada, buscando al Tejedor.",
            "El camino estaba lleno de infectados y peligros, pero con cada paso, el equipo se volvía más fuerte, más unido.",
            "Finalmente, llegaron a una vieja instalación científica, donde el Tejedor estaba esperando, rodeado por una energía oscura que parecía distorsionar la realidad misma.",
            "El Tejedor sonrió de forma siniestra. \"Pensé que nunca llegarían. He jugado con las ramas del multiverso durante mucho tiempo. Es hora de que todo se deshaga.\"",
            "Jorge, Joel y Ellie se prepararon para la batalla final. \"No lo permitiremos\", dijo Jorge, mientras los tres se lanzaban al ataque.",
            "La lucha fue feroz, la realidad misma parecía romperse a su alrededor mientras el Tejedor manipulaba las leyes de la física con sus poderes.",
            "Pero, unidos, con cada golpe, cada disparo, lograron desestabilizar al Tejedor, hasta que finalmente, con un esfuerzo combinado, lo derrotaron.",
            "El Tejedor cayó al suelo, y la energía oscura que rodeaba la instalación comenzó a desvanecerse.",
            "\"Lo logramos...\", dijo Ellie, mirando al cielo mientras las últimas distorsiones de la realidad desaparecían.",
            "Jorge miró a sus nuevos amigos con una sonrisa. \"El multiverso está a salvo... por ahora.\"",
            "Joel asintió, con una ligera sonrisa. \"Un trabajo bien hecho. Ahora, ¿qué sigue?\"",
            "Jorge miró el portal que se abría a su lado. \"No lo sé. Pero estoy listo para lo que venga.\"",
            "Con una última mirada a Joel y Ellie, Jorge atravesó el portal, dejando atrás el mundo de *The Last of Us*, mientras el futuro del multiverso seguía incierto, pero lleno de esperanza."
        };
        String[] muerte3 = {
            "La batalla contra El Tejedor había comenzado con esperanza, pero pronto se convirtió en una pesadilla.",
            "Jorge, Joel y Ellie se enfrentaban al villano con todas sus fuerzas, pero El Tejedor manipulaba la realidad con un poder inimaginable.",
            "Las distorsiones en el espacio y el tiempo eran constantes, y cada ataque parecía solo fortalecer al enemigo.",
            amigo1 + " intentó acercarse a El Tejedor con un golpe sorpresivo, pero fue desintegrado instantáneamente por una onda de energía oscura.",
            "Ellie gritó, mirando el lugar donde su compañero había desaparecido. \"¡No! ¡No puede ser!\"",
            "Joel, furioso, disparó a El Tejedor, pero sus balas atravesaron su figura como si fueran sombras, sin causar daño alguno.",
            "El Tejedor levantó la mano, y una distorsión de energía colapsó alrededor de ellos, arrancando a los tres de la realidad.",
            "Jorge cayó al suelo, incapaz de mover su cuerpo mientras veía cómo la realidad se desintegraba a su alrededor.",
            "Con un gesto de desprecio, El Tejedor alzó una nueva onda de poder, y el cielo se oscureció aún más, absorbiendo todas las estrellas.",
            amigo2 + " se desplomó, incapaz de resistir la fuerza del villano. \"No... no... podemos perder...\"",
            amigo3 + " cerró los ojos, abrazando la derrota mientras veía cómo el mundo entero comenzaba a desmoronarse. \"Lo intentamos...\"",
            "Con un último grito, El Tejedor lanzó una explosión de energía devastadora, arrasando con todo a su paso.",
            "Jorge, Joel y Ellie cayeron sin vida al suelo, sus cuerpos vacíos en medio de un paisaje fracturado y desolado.",
            "El Tejedor observó la escena con una sonrisa fría. \"El multiverso ha caído... y yo soy el que lo ha destruido.\"",
            "Mientras el Tejedor absorbía la energía de la destrucción, las realidades comenzaron a colapsar aún más rápidamente.",
            "El proceso de desintegración se aceleró a medida que las fisuras entre las realidades crecían, tragando mundos enteros en su vorágine.",
            amigo1 + " y los demás ya no estaban, pero sus recuerdos se desvanecieron con las últimas ondas de choque de la catástrofe.",
            "El Tejedor, observando el fin de todo, dejó escapar una risa malévola. \"Todo ha sido parte de mi plan. El multiverso ya no existe.\"",
            "Con un chasquido de sus dedos, la última chispa de la resistencia se extinguió, y la oscuridad final se apoderó de lo que quedaba.",
            "El multiverso desapareció, y con él, todo rastro de vida, de esperanza, de aventuras... dejando solo vacío.",
            "El fin fue definitivo. No hubo más héroes, ni más mundos que salvar. Todo se disolvió en la nada, tal como El Tejedor había planeado.",
            "Y así, el multiverso terminó: un ciclo eterno de existencia y destrucción, ahora consumido por la oscuridad definitiva."
        };
        String[] final1 = {
            "La batalla había sido ardua, pero al fin El Tejedor cayó. Su cuerpo se desintegró en un estallido de energía oscura, y por un momento, el multiverso pareció respirar aliviado.",
            "Jorge, Joel y Ellie se miraron entre ellos, sabiendo que la victoria estaba cerca. El Tejedor había sido derrotado... o eso pensaban.",
            "Sin embargo, antes de que pudieran celebrar, una grieta en el espacio-tiempo se abrió ante ellos, y una figura envuelta en oscuridad apareció.",
            "El portal multiversal se expandió aún más, y con un último susurro de poder, El Tejedor desapareció a través de él, dejando solo un vacío detrás.",
            "Jorge, sorprendido, miró el portal. \"¿Qué ha sido eso? Pensé que ya lo habíamos acabado...\"",
            "De repente, una voz profunda y resonante cortó el aire, como un trueno que retumbaba en sus mentes.",
            "\"El Tejedor no es el final. Es solo una variante, una pieza en un juego mucho más grande... y más peligroso.\"",
            "Ellie miró hacia todos lados, buscando al dueño de la voz, pero no veía a nadie. \"¿Quién... quién está ahí?\"",
            "A través del portal, apareció una figura, su rostro oculto en sombras, pero sus ojos brillaban con una intensidad que reflejaba el conocimiento de todos los universos.",
            "El ser se acercó y habló con una calma desconcertante: \"Soy quien controla todos los universos del multiverso. Cada realidad, cada línea de tiempo, está bajo mi dominio... pero hay algo que no puedo controlar. El Tejedor y sus variantes.\"",
            "Jorge, aún confundido, dio un paso adelante. \"¿Qué quieres de nosotros? Hemos derrotado al Tejedor, ¿no es suficiente?\"",
            "La figura se detuvo. \"El Tejedor no es solo uno. Existen innumerables versiones de él, y todas están comenzando a manifestarse. El caos que causará su resurgimiento será... incontenible. Necesito vuestra ayuda.\"",
            "Ellie frunció el ceño, todavía incrédula. \"¿Por qué necesitamos ayudarte? Si tú eres quien controla todo, ¿por qué no haces tú mismo el trabajo?\"",
            "La figura levantó la mano. \"Porque incluso yo, en todo mi poder, no puedo enfrentarlos solo. Las variantes del Tejedor son... insidiosas, astutas. Necesito aliados para detenerlas antes de que destruyan el multiverso por completo.\"",
            "Joel, con su instinto protector, miró a Jorge y luego a la figura. \"¿Y qué harás si nos ayudamos?\"",
            "La figura sonrió, un destello de luz brillante emergió de su rostro, revelando una expresión burlona. \"Simplemente salvaréis lo que queda del multiverso... o veréis cómo todo colapsa.\"",
            "Con un movimiento rápido, la figura se apartó de la oscuridad, y la luz comenzó a llenar el portal. El aire se volvió denso, tenso.",
            "La figura avanzó más, y de repente, su rostro fue revelado, mostrando una sonrisa astuta y enigmática.",
            "Se detuvo un momento, creando una atmósfera cargada de expectación.",
            "\"Yo...\"",
            "“soy...”",
            "“Loki.”",
            "La revelación cayó como un rayo, y Jorge y sus amigos se miraron, sorprendidos y desconcertados. Loki, el dios de las travesuras, el dios del caos, estaba allí frente a ellos, y la verdadera batalla por el destino del multiverso apenas comenzaba.",
            "Loki, con su habitual tono juguetón, añadió: \"Y ahora, el destino del multiverso está en vuestras manos. Si elegís ayudarme, podréis salvarlo... o condenarlo para siempre.\"",
            "La luz del portal se intensificó, y con un último susurro, Loki añadió: \"Venid conmigo, si queréis vivir...\"",
            "Así, con el futuro del multiverso en juego, Jorge, Joel y Ellie dieron un paso adelante, dispuestos a enfrentarse a las versiones del Tejedor y a todo lo que el caos les deparaba, mientras Loki, el dios de las travesuras, guiaba el camino hacia lo desconocido."
        };
        
        
        
        
        for (int i = 0; i < intro.length; i++) {
            System.out.println(intro[i]);
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    System.err.println("La ejecución fue interrumpida: " + e.getMessage());
                }
                System.out.println();
            };
        int eleccion = Eleccion();
        switch (eleccion) {
            case 1:
            System.out.println("*** Encuentro contra el Dr.Nefario ***");
            System.out.println("Esta es tu primera batalla, para ello te vamos a hacer un mini tutorial");
            String villano = "Dr. Nefario";
            int saludVillano = 300;
            int dañoVillano = 20;
            tutorial(personaje, villano, ataquePersonaje);
            batalla1 = Batalla(personaje, villano, vidaPersonaje, saludVillano, ataquePersonaje, dañoVillano);
                break;
        
            case 2:
            System.out.println("Jorge tras una larga decisión, se raja y se va. A los dias, su mundo acabó repleto de zombies");
            System.out.println("***** FIN *****");
            System.exit(0);
        }
        if (batalla1==false){
            for (int i = 0; i < muerte1.length; i++) {
                System.out.println(muerte1[i]);
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        System.err.println("La ejecución fue interrumpida: " + e.getMessage());
                    }
                    System.out.println();
            }
            System.out.println("***** ♦ FIN ♦ *****");
            System.exit(0);
        }
        for (int i = 0; i < dialogo1.length; i++) {
            System.out.println(dialogo1[i]);
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    System.err.println("La ejecución fue interrumpida: " + e.getMessage());
                }
                System.out.println();
        }
        eleccion = Eleccion();
        switch (eleccion) {
            case 1:
            System.out.println("*** Encuentro contra MegaZombie ***");
            String villano = "MegaZombie";
            int saludVillano = 500;
            int dañoVillano = 10;
            batalla2 = Batalla(personaje, villano, vidaPersonaje, saludVillano, ataquePersonaje, dañoVillano);
                break;
            
            case 2:
            System.out.println("Jorge tras una larga decisión, decide quedarse para siempre en esa realidad, dejando que el multiverso muera");
            System.out.println("***** FIN *****");
            System.exit(0);
        }
        if (batalla2==false){
            for (int i = 0; i < muerte2.length; i++) {
                System.out.println(muerte2[i]);
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        System.err.println("La ejecución fue interrumpida: " + e.getMessage());
                    }
                    System.out.println();
            }
            System.out.println("***** ♦♦ FIN ♦♦ *****");
            System.exit(0);
        }
        for (int i = 0; i < dialogo2.length; i++) {
            System.out.println(dialogo2[i]);
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    System.err.println("La ejecución fue interrumpida: " + e.getMessage());
                }
                System.out.println();
        }
        eleccion = Eleccion();
        switch (eleccion) {
            case 1:
            System.out.println("*** Encuentro contra EL TEJEDOR ***");
            String villano = "EL TEJEDOR";
            int saludVillano = 800;
            int dañoVillano = 60;
            batalla3 = Batalla(personaje, villano, vidaPersonaje, saludVillano, ataquePersonaje, dañoVillano);
                break;
            
            case 2:
            System.out.println("Jorge tras una larga decisión, decide no luchar, dejando que todo llegue a su fin");
            System.out.println("***** FIN *****");
            System.exit(0);
        }
        if (batalla3==false){
            for (int i = 0; i < muerte3.length; i++) {
                System.out.println(muerte3[i]);
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        System.err.println("La ejecución fue interrumpida: " + e.getMessage());
                    }
                    System.out.println();
            }
            System.out.println("***** ♦♦♦ FIN ♦♦♦ *****");
            System.exit(0);
        }
        ReproductorDeMusica.reproducir("src\\resources\\IntroMusical.wav");
        for (int i = 0; i < final1.length; i++) {
            System.out.println(final1[i]);
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    System.err.println("La ejecución fue interrumpida: " + e.getMessage());
                }
                System.out.println();
        }
        System.out.println("Parte 2 Proximamente");
        System.out.println("***** ♦♦♦♦♦♦ FIN ♦♦♦♦♦♦ *****");
    }

// historia de Marta

public static void Marta(String amigo1, String amigo2, String amigo3) {
boolean batalla1 = false;
boolean batalla2 = false;
int vidaPersonaje = 95;
int ataquePersonaje = 60;
int eleccion1 = 0;
int eleccion2 = 0;
int eleccion3 = 0;
int eleccion4 = 0;
String cameo1 = "Joel";
String cameo2 = "Ellie";
Scanner sc = new Scanner(System.in);

String personaje = "Marta";
String villano = "";
String villana = "";

String dialogo1[] = { ("Marta: ¿Donde estamos?"),
    ("Marta se encontraba de repente en un lugar casi destruido, junto a " + amigo1 + ", " + amigo2 + " y "
            + amigo3
            + ". Junto a ellos había gente que no habían visto nunca. Pero estaban tan desubicados como ellos."),
    (amigo1 + ": ¿Estáis bien? Parece que no estamos en nuestro mundo."),
    (amigo2 + ": Es verdad, no parece nuestro mundo, ¿Quién nos habrá hecho esto?"),
    ("Marta: Ahora tendremos tiempo de resolver dudas. Por el momento, vayamos a este refugio provisional."),
    (""),
    ("Todos los allí presentes no dudaron, fueron a lo que parecía un búnker, pero en realidad era un almacén viejo militar."),
    ("Allí pasaron varias semanas con provisiones que encontraron, se crearon distintos grupos, médicos, distintos batallones, etc."),
    ("Marta, era parte del batallón de exploración 'Búhos' en el que tras varias discusiones decidieron ir a explorar el exterior."),
    ("Marta: ¿Qué hacemos ahora? Deberíamos salvar a quienes podamos pero es muy peligroso."),
    ("El batallón 'búho' disponía con distintas armas y provisiones, tenían chalecos viejos y poca munición pero no servirían de nada si morían de hambre en el búnker"),
    ("")
};

for (int i = 0; i < dialogo1.length; i++) {
System.out.println(dialogo1[i]);
try {
    Thread.sleep(4000);
} catch (InterruptedException e) {
    System.err.println("La ejecución fue interrumpida: " + e.getMessage());
}
System.out.println();
}

// bucle elección 1 o 2
System.out.println("¿Qué quieres hacer?");
System.out.println("1. Salir del búnker pese a los riesgos e intentar salvar a la gente.");
System.out.println("2. Quedarse en el búnker esperando a un milagro.");
System.out.println();

eleccion1 = sc.nextInt();

do {
System.out.println("Elige un número válido");
eleccion1 = sc.nextInt();
} while (eleccion1 != 1 && eleccion1 != 2);

String final1[] = {
    ("Marta eligió quedarse en el refugio, intentarán esperar a por ayuda pero eso no les servirá de nada"),
    ("Aguantaron unas semanas hasta que se quedaron finalmente sin recursos para todos y hubo conflictos agresivos"),
    ("Muchos murieron de hambre y muchos otros murieron a manos de los que una vez fueron sus amigos y compañeros")
};

if (eleccion1 == 2) {
for (int i = 0; i < final1.length; i++) {
    System.out.println(final1[i]);
    try {
        Thread.sleep(4000);
    } catch (InterruptedException e) {
        System.err.println("La ejecución fue interrumpida: " + e.getMessage());
    }
    System.out.println("***** ♦ FIN ♦ *****");
}
System.exit(0);
} else {
System.out.println(
        "Marta: Muy bien, vámonos antes de que anochezca, no sabemos a qué o quién nos enfrentaremos al traspasar esta puerta");
}

String escenario1[] = {
    ("Al salir del refugio, observan como todo ha quedado devastado, una raza de lobo ahora ha mutado gracias al hongo. Son mucho más grandes y violentos"),
    ("Van caminando por un camino cuando de pronto ven que el camino se divide en tres distintos. Cada uno dirige a lugares diferenes."),
    ("El primer camino conduce a lo que parecen hangáres enormes, piensan que allí puede haber provisiones suficientes para los que se quedaron en el refugio"),
    ("En el segundo camino, ven que hay un bosque no muy grande pero frondoso. En principio no les llama la atención pero luego ven destellos de luz y un sonido fuerte"),
    ("En el tercero, ven lo que podría ser un pueblo, pero parece que ha sido aplastado por tanques de guerra, está destrozado. Quieren ir a investigar para ver si ha habido supervivientes")
};

for (int i = 0; i < escenario1.length; i++) {
System.out.println(escenario1[i]);
try {
    Thread.sleep(4000);
} catch (InterruptedException e) {
    System.err.println("La ejecución fue interrumpida: " + e.getMessage());
}
System.out.println();
}

String eleccion_2[] = { ("¿Por qué camino deberían ir?"),
    ("1. Camino 1 - Hangáres con recursos"),
    ("2. Camino 2 - Bosque misterioso"),
    ("3. Camino 3 - Pueblo devastado")
};

for (int i = 0; i < eleccion_2.length; i++) {
System.out.println(eleccion_2[i]);
try {
    Thread.sleep(4000);
} catch (InterruptedException e) {
    System.err.println("La ejecución fue interrumpida: " + e.getMessage());
}
System.out.println();
}

eleccion2 = sc.nextInt();

do {
System.out.println("Elige un número válido");
eleccion2 = sc.nextInt();
} while (eleccion2 != 1 && eleccion2 != 2 && eleccion2 != 3);

// elecciones 1
String eleccion2_1[] = {
    ("El batallón fue a investigar los hangáres, parecían abandonados, pero no lo estaban..."),
    ("Allí encontraron comida, armas un tanto desgastadas."),
    ("Marta: ¿De quién serán estas armas? Parecen armas militares pero, son muy viejas, están llenas de polvo"),
    (amigo3 + "¡Mirad! Aquí hay restos de comida y una hoguera. Aún están calientes."),
    ("Acto seguido, se encontraron inundados por luces de linterna muuy potentes, eran exmilitares que custodiaban los 'hangáres olvidados', o así eran llamados por los de la zona. Parecían inútiles hasta que ocurrió el desastre de los lobos."),
    ("El que parecía el sargento, alzó la voz y dijo:"),
    ("Sargento Militar: ¡Quiénes sois y qué haceis aquí! ¡Ladrones!"),
    ("Junto a él, estaba " + cameo1 + " y " + cameo2),
    ("Marta y " + amigo2 + " los tranquilizaron explicando la situación en la que se encontraban."),
    ("El sargento preguntó a Marta -¿Qué queréis, necesitáis ayuda?"),
    (""),
    ("¿QUÉ DEBERÍA DECIR MARTA?")
};

String desenlace1[] = {
    ("Marta: Sí, necesitamos ayuda, y mucha. Tenemos provisiones para unas pocas semanas. Deberíamos empezar a tener plantaciones para poder subsistir a largo plazo."),
    ("Marta: También, necesitamos armas y un plan para derrotar las manadas de lobos mutantes, con vuestra ayuda puede ser tarea fácil"),
    ("Teniente: Derrotar a los lobos es tarea fácil. Primero vamos a trasladarnos a vuestro refugio para estar mas seguros. Este hangar está demasiado cerca de el nido de una manada."),
    (""),
    ("Los exmilitares se trasladaron al nuevo refugio, llevaron mantas para el frío, armas, plantas y comida para poder vivir durante largos años."),
    ("Más tarde trazaron un plan para derrotar a los lobos. Esto fue tarea fácil luego de descubrir el punto débil de los lobos. Detrás de la cabeza, el cráneo de los lobos era más blando debido a la mutación y un disparo podía ser certaro. Claro estaba que su ventaja estaba en la distancia."),
    ("Sargento Militar: También podemos utilizar la gasolina de los camiones y tanques para poder derrotarlos incendiando su nido."),
    (""),
    ("¿ATACAR AL NIDO?")
};

String final2[] = {
    ("Marta intentaba ir por detrás para colocar la carga incendiaria y pillar por sorpresa a la manada."),
    ("De pronto, un lobo se avalanzó sobre ella, mordiendola y rasgándole la ropa."),
    ("El Sargento y " + amigo2 + " abatieron al lobo que la atacó pero fue demasiado tarde."),
    ("El plan parecía que se iba al traste pero de pronto, Marte lo consiguió, colocó la carga incendiaria que acabaría con la manada."),
    ("Marta murió como la 'Liberadora de las Bestias', ese título yace junto a ella en su tumba."),
    (""),
    ("Tiempo después, la humanidad consiguió seguir adelante, con recursos nuevos de ese mundo consiguieron nuevos tipos de combustibles nunca antes vistos y nuevos materiales más resistentes"),
    (""),
    ("***** FIN *****")
};

String final1_2[] = {
    ("Marta: No, solo necesitabamos reponer fuerzas, gracias por todo. Volvemos ya al refugio."),
    ("Posteriormente, Marta contaría el plan que tenía en mente. Robarles tan pronto cayese la noche"),
    (amigo3 + " tenía miedo de lo que podía pasar pero siempre seguiría a Marta."),
    (""),
    ("Por la noche, los ex-militares bajaron la guardia, y tan pronto como pudieron, el batallón les atacó."),
    ("Debido a la experiencia de los ex-militares, se olían que unos completos desconocidos intentasen saquearles definitivamente. Asi que les esperaron con los brazos abiertos"),
    ("Abatieron a cada uno de los presentes. Tan solo un ex-militar fue herido"),
    ("Nuestra protagonista, Marta murió como una ladrona del montón"),
    (""),
    ("***** FIN *****")
};

String desenlace2[] = {
    ("El batallón se dirigió hacia el bosque, allí se encontraron a una cría de lobo mutante malherida y abandonada por la manada"),
    (amigo1 + ": ¿Y ahora que hacemos con este monstruo?"),
    ("Marta: Deberíamos estudiarlo para saber como es, así, podremos algún día derrotar a los lobos mutantes"),
    (amigo2 + ": Y si contagia a todos allí en el refugio"),
    (amigo3 + ": Sugiero que le llevemos sedado y le pongamos un bozal. Aparte claro de encerrarlo mientras le estudiamos"),
    (""),
    ("¿QUÉ DEBERÍA DECIR MARTA?")
};

String final3[] = {
    ("Decidieron llevar la cría al refugio. Después de un largo camino cargando a la cría en una carretilla improvisada llegaron al refugio."),
    ("Al entrar, todos los que se quedaron allí, se quedaron en shock. Unos se enfadaron con el batallón pero sobre todo con Marta."),
    ("Marta: Tranquilos, esto es por nuestro bien, necesitamos investigar acerca de esta extraña mutación."),
    ("Marta: Gracias al Hongo, estos lobos han mutado así, debemos actuar antes de convertirnos en zombies."),
    (""),
    ("Pasaron varios meses y no hubo respuesta. Hubo expediciones para conseguir alimentos. Consiguieron semillas que pudieron plantar y latas de un supermercado abandonado cercano."),
    ("Justo un año y dos meses después encontraron la cura, tan pronto la consiguieron se la aplicaron a la cría, que había doblado su tamaño respecto el primer día."),
    ("Curaron a todos los lobos y la humanidad pudo seguir adelante."),
    (""),
    ("***** FIN *****")
};

String final3_1[] = {
    ("Decidieron abandonar ese peligro inminente, al haberla analizado de cerca, se mancharon de sangre que tenía en la pata."),
    ("Gracias a la sangre, la manada de lobos los siguieron pensando que ellos habían atacado a la cría."),
    ("Los lobos llegaron al refugio y acabaron entrando tras varios días aullando y durmiendo en la puerta del refugio."),
    ("Todos los del refugio vivieron un auténtico infierno. No quedó ni un solo humano con vida. Se convirtieron todos en zombies "),
    (""),
    ("***** FIN *****")
};

// elecciones 3

String desenlace3[] = {
    ("El batallón decide ir hacia el pueblo abandonado, allí no se encuentran con un pueblo en el que había supervivientes. Todo lo contrario, los lobos mutantes habían destrozado todo"),
    ("En el camino, se encuentran a un lobo mutante moribundo, muy malherido a punto de morir."),
    (amigo3 + ": Debemos acabar con él es muy peligroso, puede atraer a más lobos y puede acabar con todos nosotros"),
    (""),
    ("¿QUÉ DECIDES HACER?")

};

String combate[] = {
    ("Hayas decidido matar al lobo o no, la manada estaba cerca y se acercaron para ayudar al lobo herido."),
    ("Con un golpe de mala suerte, allí también estaba la Dra. Zombie, quien complicaría las cosas")
};

String final4[] = { ("La Dra. Zombie era mucho más fuerte que lo esperado, os ha intoxicado a todos y ahora sois zombies"),
(""),
("***** FIN *****")
};

if (eleccion2 == 1) {
for (int i = 0; i < eleccion2_1.length; i++) {
    System.out.println(eleccion2_1[i]);
    try {
        Thread.sleep(4000);
    } catch (InterruptedException e) {
        System.err.println("La ejecución fue interrumpida: " + e.getMessage());
    }
    System.out.println();
}

// menú eleccion3
System.out.println("1. Pedirles ayuda: Armas y comida e intentar una alianza");
System.out.println("2. Robarles por la noche, ya que son inferiores en número");

eleccion3 = sc.nextInt();

do {
    System.out.println("Introduce una opción válida");
    eleccion3 = sc.nextInt();
} while (eleccion3 != 1 && eleccion3 != 2);

// lectura desenlace

if (eleccion3 == 1) {

    for (int i = 0; i < desenlace1.length; i++) {
        System.out.println(desenlace1[i]);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.err.println("La ejecución fue interrumpida: " + e.getMessage());
        }
        System.out.println();
    }

    int eleccion = Eleccion();
    switch (eleccion) {
        case 1:
            System.out.println("*** Batalla contra los lobos ***");
            System.out.println("Esta es tu primera batalla, para ello te vamos a hacer un mini tutorial");
            villano = "Manada de lobos";
            int saludVillano = 300;
            int dañoVillano = 20;
            tutorial(personaje, villano, ataquePersonaje);
            batalla1 = Batalla(personaje, villano, vidaPersonaje, saludVillano, ataquePersonaje,
                    dañoVillano);
            break;

        case 2:
            System.out.println(
                    "Marta tras pensarlo dos veces, se va. A los dias, su mundo acabó repleto de zombies");
            System.out.println("***** FIN *****");
            System.exit(0);
    }
    if (batalla1 == false) {
        for (int i = 0; i < final2.length; i++) {
            System.out.println(final2[i]);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                System.err.println("La ejecución fue interrumpida: " + e.getMessage());
            }
            System.out.println();
        }
        System.out.println("***** ♦ FIN ♦ *****");
        System.exit(0);
    }
}
if (eleccion3 == 2) {
    for (int i = 0; i < final1_2.length; i++) {
        System.out.println(final1_2[i]);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.err.println("La ejecución fue interrumpida: " + e.getMessage());
        }
        System.out.println();
    }
}

// eleccion 2 -- Bosque

} else if (eleccion2 == 2) {

for (int i = 0; i < desenlace2.length; i++) {
    System.out.println(desenlace2[i]);
    try {
        Thread.sleep(4000);
    } catch (InterruptedException e) {
        System.err.println("La ejecución fue interrumpida: " + e.getMessage());
    }
    System.out.println();
}

System.out.println("1. Llevar a la cria al refugio. Y estudiarla a fondo con cautela.");
System.out.println("2. Abandonar a la cría a su suerte.");

eleccion3 = sc.nextInt();

do {
    System.out.println("Introduce una opción válida");
    eleccion3 = sc.nextInt();
} while (eleccion3 != 1 && eleccion3 != 2);

if (eleccion3 == 1) {
    for (int i = 0; i < final3.length; i++) {
        System.out.println(final3[i]);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.err.println("La ejecución fue interrumpida: " + e.getMessage());
        }
        System.out.println();
    }
} else {
    for (int i = 0; i < final3_1.length; i++) {
        System.out.println(final3_1[i]);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.err.println("La ejecución fue interrumpida: " + e.getMessage());
        }
        System.out.println();
    }
}

}
// eleccion 3 -- pueblo
else {

for (int i = 0; i < desenlace3.length; i++) {
    System.out.println(desenlace3[i]);
    try {
        Thread.sleep(4000);
    } catch (InterruptedException e) {
        System.err.println("La ejecución fue interrumpida: " + e.getMessage());
    }
    System.out.println();
}

System.out.println("1. Acabar con él");
System.out.println("2. Dejarle y seguir buscando");

eleccion4 = sc.nextInt();

do {
    System.out.println("Introduce una opción válida");
    eleccion3 = sc.nextInt();
} while (eleccion4 != 1 && eleccion4 != 2);

if (eleccion4 == 1 || eleccion4 == 2) {

    for (int i = 0; i < combate.length; i++) {
        System.out.println(combate[i]);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.err.println("La ejecución fue interrumpida: " + e.getMessage());
        }
        System.out.println();
    }

    int eleccion = Eleccion();
    switch (eleccion) {
        case 1:
            System.out.println("*** Batalla contra la Dra. Zombie ***");
            System.out.println("Esta es tu primera batalla, para ello te vamos a hacer un mini tutorial");
            villana = "Dra. Zombie";
            int saludVillano = 150;
            int dañoVillano = 40;
            tutorial(personaje, villano, ataquePersonaje);
            batalla2 = Batalla(personaje, villano, vidaPersonaje, saludVillano, ataquePersonaje,
                    dañoVillano);
            break;

        case 2:
            System.out.println(
                    "Marta tras pensarlo dos veces, se va. A los dias, su mundo acabó repleto de zombies");
            System.out.println("***** FIN *****");
            System.exit(0);

    } if (batalla2 == false) {
        for (int i = 0; i < final4.length; i++) {
            System.out.println(final4[i]);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                System.err.println("La ejecución fue interrumpida: " + e.getMessage());
            }
            System.out.println();
        }
        System.out.println("***** ♦ FIN ♦ *****");
        System.exit(0);
    }

}
}

}
//Parte Fermin
    public static void Fermin(String amigo1, String amigo2, String amigo3) throws InterruptedException {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int vidaPersonaje = 300;
    int ataquePersonaje = 50;

    String cameos[] = {
        "Lucifer", "Ash de Pokémon", "Teemo y Jinx", "Castle y Carceles",
        "Rayo McQueen", "Spiderman", "Deadpool", "Joel Miller",
        "Poco y Piper", "Bananin", "Congreso musical",
        "Vinicius con balón de playa (no de oro)",
        "Mbappé con tortugas ninja", "Super Idol"
    };


    String[] introJuego = {
        "Te despiertas en un lugar desconocido...",
        "Aterrizas en una dimensión semi-destruida, cubierta por una densa niebla púrpura.",
        "El ambiente está lleno de ruinas antiguas y estructuras colapsadas.",
        "El aire está impregnado de una energía oscura y opresiva.",
        "Tu misión es descubrir cómo escapar de este lugar y restaurar el equilibrio del multiverso.",
        "Prepárate para enfrentar enemigos poderosos y tomar decisiones cruciales."
    };

    for (String line : introJuego) {
        System.out.println(line);
        Thread.sleep(1000);  // Pausa de 1 segundo entre líneas
    }

    String[] intro = {
        "CAPÍTULO 1: EL DESPERTAR",
        "Elige un camino:",
        "1. Refugio abandonado.",
        "2. Laboratorio de alta tecnología.",
        "3. Bosque oscuro."
    };

    for (String line : intro) {
        System.out.println(line);
        Thread.sleep(1000); // Pausa de 1 segundo entre líneas
    }

    int camino = sc.nextInt();
    String cameo = cameos[rand.nextInt(cameos.length)];
    boolean victoria;
    int vidaVillano, dañoVillano;

    switch (camino) {
        case 1:
            String[] case1Intro = {
                "Has elegido el Refugio abandonado.",
                "Mientras exploras, aparece " + cameo + ".",
                "Un lobo mutante emerge de las sombras."
            };
            for (String line : case1Intro) {
                System.out.println(line);
                Thread.sleep(1000);
            }

            vidaVillano = 100;
            dañoVillano = 30;
            tutorial("Fermin", "Lobo mutante", ataquePersonaje);
            victoria = Batalla("Fermín", "Lobo mutante", vidaPersonaje, vidaVillano, ataquePersonaje, dañoVillano);

            if (!victoria) {
                System.out.println("El lobo mutante te muerde gravemente. Tu historia termina aquí.");
                System.out.println("***** FIN *****");
                System.exit(0);
            }
            System.out.println("Derrotas al lobo mutante y encuentras una pista sobre los portales.");
            break;

        case 2:
            String[] case2Intro = {
                "Has elegido el Laboratorio de alta tecnología.",
                "En el laboratorio, aparece el Dr. Nefario.",
                "Activa trampas peligrosas para detenerte."
            };
            for (String line : case2Intro) {
                System.out.println(line);
                Thread.sleep(1000);
            }

            vidaVillano = 200;
            dañoVillano = 50;

            victoria = Batalla("Fermín", "Dr. Nefario", vidaPersonaje, vidaVillano, ataquePersonaje, dañoVillano);

            if (!victoria || vidaPersonaje <= 25) {
                System.out.println("Una trampa se activa y caes desde una altura mortal. Tu historia termina aquí.");
                System.out.println("***** FIN *****");
                System.exit(0);
            }
            System.out.println("Derrotas al Dr. Nefario y encuentras datos para estabilizar el portal.");
            break;

        case 3:
            String[] case3Intro = {
                "Has elegido el Bosque oscuro.",
                "En el bosque aparece " + cameo + " diciendo:",
                "'El bosque tiene voluntad propia.'"
            };
            for (String line : case3Intro) {
                System.out.println(line);
                Thread.sleep(1000);
            }

            if (rand.nextInt(100) < 50) {
                System.out.println("Te encuentras con Dra. Zombie y quedas atrapado en su hechizo.");
                System.out.println("***** FIN *****");
                System.exit(0);
            } else {
                vidaVillano = 150;
                dañoVillano = 40;
                victoria = Batalla("Fermín", "Bestia del bosque", vidaPersonaje, vidaVillano, ataquePersonaje, dañoVillano);

                if (!victoria) {
                    System.out.println("La bestia del bosque te derrota. La oscuridad consume tu historia.");
                    System.out.println("***** FIN *****");
                    System.exit(0);
                }
                System.out.println("Tras derrotar a la bestia, encuentras un artefacto antiguo.");
            }
            break;

        default:
            System.out.println("Opción no válida.");
            System.exit(0);
    }

    System.out.println("Tras tu victoria, descubres un portal que emite una energía inestable.");
}


    public static void FerminCapitulo2(String amigo1, String amigo2, String amigo3) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int vidaPersonaje = 300;
        int ataquePersonaje = 50;

        String[] intro = {
            "CAPÍTULO 2: EL PRIMER PORTAL",
            "El portal lleva a Fermín y su equipo a un universo lleno de edificios flotantes y luces de neón.",
            "Una energía inestable los rodea. Lanza el dado para ver si sobrevives al cruce..."
        };

        for (String line : intro) {
            System.out.println(line);
            Thread.sleep(1000);
        }

        if (rand.nextInt(100) < 50) {
            System.out.println("El portal colapsa y quedas perdido en el espacio infinito.");
            System.out.println("***** FIN *****");
            System.exit(0);
        }

        String[] geraltIntro = {
            "Superas el cruce y te encuentras en una ciudad retrofuturista.",
            amigo1 + " dice: '¿Dónde estamos? Esto no parece nuestro mundo.'",
            amigo2 + " añade: 'Algo me dice que no estamos solos aquí.'",
            amigo3 + " grita: '¡Miren eso! ¡Es Geralt de Rivia!'",
            "Geralt aparece desde las sombras, con su espada lista.",
            "'Esto no ha terminado, Fermín. Una fuerza oscura está detrás de estos portales.'"
        };

        for (String line : geraltIntro) {
            System.out.println(line);
            Thread.sleep(1000);
        }

        int vidaVillano = 200;
        int dañoVillano = 50;
        boolean victoria = Batalla("Fermín", "Dr. Nefario", vidaPersonaje, vidaVillano, ataquePersonaje, dañoVillano);

        if (!victoria) {
            System.out.println("El Dr. Nefario te captura y el portal desaparece contigo dentro.");
            System.out.println("***** FIN *****");
            System.exit(0);
        }

        System.out.println("Tras derrotar al Dr. Nefario, Geralt te guía hacia el siguiente portal.");
       
    }

public static void FerminCapitulo3(String amigo1, String amigo2, String amigo3) throws InterruptedException {
     int vidaPersonaje = 300;
     int ataquePersonaje = 50;
    String[] intro = {
        "CAPÍTULO 3: EL MULTIVERSO COLAPSADO",
        "El portal se abre con un rugido ensordecedor y te lleva a un mundo cyberpunk iluminado por neones intermitentes.",
        "Torres gigantescas se alzan hasta los cielos rotos, y coches voladores surcan el aire mientras drones vigilan desde las alturas.",
        "En medio del caos, divisáis a John Wick enfrentándose a un grupo de androides armados con espadas láser.",
        amigo2 + " pregunta: '¿Ese es John Wick? ¿Y su perro está... vivo?'",
        amigo3 + " responde, incrédulo: '¡Ese perro es un zombie! ¿Qué está pasando aquí?'",
        "John Wick elimina al último androide con una precisión mortal, se gira hacia ti y dice: 'Te necesito, Fermín. Juntos podemos detener al Tejedor.'"
    };

    for (String line : intro) {
        System.out.println(line);
        Thread.sleep(1000);
    }

    String[] preparativos = {
        "Antes de seguir, John Wick os lleva a su refugio oculto en las entrañas de la ciudad.",
        "Allí, explica que el Tejedor es una entidad que controla el tejido del multiverso, y ha comenzado a desmoronarlo para recrearlo a su voluntad.",
        "'He perdido amigos, aliados... y ahora incluso el alma de mi perro', dice con voz quebrada mientras acaricia al perro zombie.",
        amigo1 + " pregunta: '¿Cómo podemos enfrentarnos a algo tan poderoso?'",
        "John Wick responde: 'Hay una forma, pero requiere coraje... y un poco de suerte.'",
        "Se os entrega un arsenal de armas avanzadas: rifles de plasma, granadas gravitatorias y un par de guantes energéticos."
    };

    for (String line : preparativos) {
        System.out.println(line);
        Thread.sleep(1000);
    }

    String[] asalto = {
        "Os acercáis al rascacielos donde el Tejedor tiene su base. Está protegido por drones y soldados cibernéticos.",
        "John lidera el ataque inicial, eliminando a los guardias con una precisión impecable.",
        amigo3 + " grita: '¡Cuidado a tu izquierda!' mientras derriba a un dron que se aproximaba a ti.",
        "Con esfuerzo y estrategia, lográis llegar a la sala principal, donde os espera el Tejedor.",
        "El Tejedor es una figura colosal hecha de fragmentos de portales brillantes, su voz reverbera como un trueno.",
        "'Insolentes mortales... Este universo será mi lienzo. Y vosotros seréis mis primeras víctimas.'"
    };

    for (String line : asalto) {
        System.out.println(line);
        Thread.sleep(1000);
    }

    int vidaVillano = 300;
    int dañoVillano = 60;

   
    boolean victoria = Batalla("Fermín", "El Tejedor", vidaPersonaje, vidaVillano, ataquePersonaje, dañoVillano);

    if (!victoria) {
        System.out.println("El Tejedor invoca un portal gigante que te absorbe junto con John Wick y el perro zombie.");
        System.out.println("Mientras desaparecéis, el multiverso sigue desmoronándose bajo su control.");
        System.out.println("***** FIN: EL MULTIVERSO ESTÁ PERDIDO *****");
        System.exit(0);
    }

    
    String[] desenlace = {
        "Tras una intensa y agotadora batalla, lográis derrotar al Tejedor.",
        "Sus fragmentos brillantes se dispersan en el aire y los portales comienzan a cerrarse lentamente.",
        "John Wick se acerca, visiblemente cansado, y dice: 'Lo hicimos. Pero esto no termina aquí. Los portales aún deben ser sellados.'",
        "Su perro zombie ladra suavemente, como si agradeciera vuestra ayuda.",
        amigo1 + " sugiere: 'El siguiente portal... podría ser el más peligroso. Pero no podemos rendirnos ahora.'",
        amigo2 + " añade con determinación: 'Estamos más cerca de salvar el multiverso que nunca.'",
        "John Wick os entrega una llave brillante, que parece contener un fragmento de energía del Tejedor.",
        "'Esto os guiará al último portal. Fermín, el destino del multiverso está en tus manos.'",
        "Con esa última palabra, John Wick se despide mientras él y su perro se desvanecen entre las sombras de la ciudad.",
        "Os dirigís al siguiente portal, sabiendo que el enfrentamiento final está a punto de comenzar."
    };

    for (String line : desenlace) {
        System.out.println(line);
        Thread.sleep(1000);
    }
    }
   


    public static void FerminCapituloFinal(String amigo1, String amigo2, String amigo3) throws InterruptedException {
         int vidaPersonaje = 300;
         int ataquePersonaje = 50;
        String[] intro = {
            "CAPÍTULO FINAL: EL TITÁN DE LOS PORTALES",
            "Has llegado al núcleo del colapso multiversal.",
            "El terreno tiembla y el cielo se parte en dos. De repente, el Titán de los Portales emerge.",
            amigo1 + " grita: '¡No podemos fallar ahora!'",
            amigo2 + " añade: 'Esta es nuestra última oportunidad.'",
            amigo3 + " motiva al equipo: 'Hagámoslo por todos los mundos que hemos conocido.'"
        };

        for (String line : intro) {
            System.out.println(line);
            Thread.sleep(1000);
        }

        int vidaVillano = 600;
        int dañoVillano = 70;
        boolean victoria = Batalla("Fermín", "Titán de los Portales", vidaPersonaje, vidaVillano, ataquePersonaje, dañoVillano);

        if (!victoria) {
            System.out.println("El Titán invoca un ataque final devastador y te aplasta.");
            System.out.println("***** FIN: MUERTE DEL PROTAGONISTA *****");
            System.exit(0);
        }

        System.out.println("Con una explosión de poder, derrotas al Titán de los Portales.");
        int eleccionFinal = new Random().nextInt(100);

        if (eleccionFinal < 50) {
            System.out.println("Has desbloqueado el **secreto desconocido**.");
            System.out.println("Te transportas a una dimensión oculta y descubres el verdadero origen del multiverso.");
        } else {
            System.out.println("Usas tu poder para cerrar el portal y restaurar el orden del multiverso.");
        }

        System.out.println("Tu nombre queda grabado en todas las historias como el salvador del multiverso.");
    }
}

    
