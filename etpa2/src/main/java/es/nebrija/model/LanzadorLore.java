package es.nebrija.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LanzadorLore {
    public static void lanzador(List<String> historia){
        try{
            Iterator<String> it = historia.iterator();
            while(it.hasNext()){
                String trozo = it.next();
                System.out.println(trozo);
                Thread.sleep(2000);
                it.remove();  
            }
        }
        catch(Exception e){
            String error = "Error en la impresión \n Detalles del error: "+e;
            System.out.println(error);
        }
    }

    public static ArrayList<String> generarIntroduccionComun(String personaje1, String personaje2, String personaje3) {
        ArrayList<String> introduccion = new ArrayList<>();
        introduccion.add("En un rincón perdido del multiverso, existe una ciudad llamada Yeria.");
        introduccion.add("Yeria no es una ciudad común: es un nexo entre múltiples realidades, un lugar donde los universos convergen y se cruzan.");
        introduccion.add("Nuestro héroe " + personaje1 + ", junto a " + personaje2 + " y " + personaje3 +
                          ", emprendieron una misión para restaurar el equilibrio roto.");
        introduccion.add("Los hilos de la realidad se han vuelto inestables tras las manipulaciones de El Tejedor.");
        introduccion.add("Ahora, deben unir fuerzas y descubrir la clave que salve a Yeria y al multiverso.");
        return introduccion;
    }

    
    public static ArrayList<String> historiaJorge() {
        ArrayList<String> historia = generarIntroduccionComun("Jorge", "Amigo1", "Amigo2");
        historia.add("");
        historia.add("JORGE:");
        historia.add("");
        historia.add("Intro:");
        historia.add("Jorge miró a su alrededor mientras el caos multiversal rugía como una tormenta imparable.");
        historia.add("Las calles de la ciudad multiversal se deformaban y fragmentaban; edificios flotaban, luces neón parpadeaban en patrones imposibles.");
        historia.add("-Tenemos que hacer algo antes de que esto se desmorone completamente-, dijo Jorge mientras se giraba hacia sus tres amigos.");
        historia.add("(Amigo1) frunció el ceño. -¿Alguna idea, Jorge? Todo esto parece estar más allá de nuestra capacidad.-");
        historia.add("(Amigo2) cruzó los brazos y señaló un portal parpadeante. -Ese portal lleva a una realidad donde todo opera bajo las reglas de un mundo de detectives.-");
        historia.add("-¿Detectives? ¿Qué tan útil podría ser eso?-, preguntó (Amigo3), inclinando la cabeza con escepticismo.");
        historia.add("Jorge levantó una ceja. -Es exactamente lo que necesitamos. Una realidad donde los misterios se resuelven podría darnos la clave para estabilizar el núcleo multiversal.-");
        historia.add("(Amigo1) suspiró y asintió. -Supongo que vale la pena intentarlo.-");
        historia.add("Con determinación, los cuatro amigos atravesaron el portal, sintiendo un escalofrío recorrer sus cuerpos mientras la realidad cambiaba a su alrededor.");
        historia.add("Al otro lado, se encontraron en un callejón oscuro, lleno de niebla, con farolas que parpadeaban débilmente.");
        historia.add("El ambiente olía a misterio, con periódicos volando por las calles vacías y un constante sonido de pasos lejanos.");
        historia.add("-Esto es... increíble-, dijo (Amigo2) mientras observaba el paisaje. -Es como estar en una novela de detectives.-");
        historia.add("De repente, una figura emergió de las sombras, vestida con un abrigo largo y un sombrero de ala ancha.");
        historia.add("-¡No puede ser!- exclamó (Amigo3) reconociendo al hombre de inmediato. Es Richard Castle, el famoso escritor.");
        historia.add("Castle sonrió con su característico encanto. -Ah, veo que mi fama me precede incluso en esta realidad. ¿Qué los trae por aquí, forasteros?-");
        historia.add("Jorge dio un paso adelante. -Estamos buscando pistas para estabilizar nuestra ciudad multiversal. ¿Puede ayudarnos?-");
        historia.add("Castle se rió. -¿Un caso interdimensional? Esto suena mejor que cualquiera de mis libros. Estoy dentro.-");
        historia.add("(Amigo1) miró a Jorge con incredulidad. -¿De verdad vamos a trabajar con un escritor?-");
        historia.add("-Confía en mí-, dijo Jorge con una sonrisa. -Los escritores siempre tienen una perspectiva única.-");
        historia.add("El grupo, ahora con Castle incluido, comenzó a recorrer las calles de esta realidad de detectives.");
        historia.add("Mientras avanzaban, encontraron un cartel con la imagen de un hombre excéntrico con gafas enormes. -¡Doctor Nefario!- exclamó (Amigo2).");
        historia.add("Jorge apretó los puños. -Parece que no importa la realidad, siempre hay alguien como él causando problemas.-");
        historia.add("Castle inclinó la cabeza mientras observaba el cartel. -Bueno, si este Nefario es nuestro villano, entonces creo que es hora de atrapar al pez gordo.-");
        historia.add("(Amigo3) señaló un edificio cercano con luces parpadeantes. -Según ese cartel, tiene su guarida ahí dentro.-");
        historia.add("Jorge asintió con determinación. -Entonces vamos. Esta ciudad multiversal no se salvará sola.-");
        historia.add("");
        historia.add("Muerte 1:");
        historia.add("El silencio llenó el aire mientras los escombros de la batalla se asentaban.");
        historia.add("Jorge estaba tendido en el suelo, inmóvil, con su cuerpo rodeado por los destellos de energía residual del multiverso.");
        historia.add("(Amigo1) cayó de rodillas junto a él, su voz quebrándose. -¡Jorge, no! ¡Teníamos un plan!-");
        historia.add("(Amigo2) apretó los dientes, con lágrimas corriendo por su rostro. -No puede terminar así... No después de todo lo que hemos hecho juntos.-");
        historia.add("(Amigo3) miró al cielo fragmentado, donde los portales entre realidades colapsaban uno por uno. -Él lo dio todo por nosotros... por el multiverso.-");
        historia.add("El Doctor Nefario, con su risa sardónica, desapareció en un destello de luz, dejando al grupo sin respuestas, solo con una amarga derrota.");
        historia.add("Semanas después, el multiverso comenzaba a desmoronarse. Las fisuras entre las realidades se expandían rápidamente.");
        historia.add("-¿De qué sirvió todo esto?- dijo (Amigo1) mientras observaba cómo una torre entera era tragada por un portal inestable.");
        historia.add("(Amigo2) respondió con voz apagada: -Jorge creía en nosotros. Creía que podíamos encontrar una manera de arreglar esto, incluso sin él.-");
        historia.add("(Amigo3) golpeó el suelo con frustración. -Pero no pudimos. Fallamos... y ahora todo lo que queda es esperar el final.-");
        historia.add("Los colores del cielo se volvieron caóticos, y los sonidos del multiverso muriendo resonaron como un lamento infinito.");
        historia.add("Meses después, en el último rincón seguro del multiverso, los amigos se reunieron por última vez.");
        historia.add("");
        historia.add("El Fin del Multiverso");
        historia.add("Susurró (Amigo1): -Jorge no solo nos dejó su sacrificio, también nos dejó su esperanza. Pero... el tiempo se nos acabó-.");
        historia.add("El Amigo2 asintió lentamente. -No importa lo que hagamos ahora, las fisuras son imparables. Todo se desmoronará pronto-.");
        historia.add("El Amigo3 miró al horizonte, donde las realidades chocaban entre sí. -Tal vez Jorge sabía que esto era inevitable. Tal vez solo quería que nos despidiéramos con dignidad-.");
        historia.add("El último momento llegó en un estallido de luz cegadora. Las fronteras entre las realidades se derrumbaron completamente.");
        historia.add("Los amigos, junto con el resto del multiverso, fueron arrastrados hacia el vacío, un final inevitable para todas las historias, todos los mundos.");
        historia.add("Y así, el multiverso dejó de existir, sus memorias dispersas como polvo en el infinito.");
        historia.add("");
        historia.add("La Victoria Transitoria de Jorge");
        historia.add("El sonido de la explosión resonó en la guarida del Doctor Nefario mientras Jorge daba el golpe final.");
        historia.add("El villano cayó al suelo, su risa malévola finalmente apagada. -Esto no es el final...-, susurró antes de desvanecerse.");
        historia.add("El Amigo1 se acercó a Jorge, respirando con dificultad. -Lo hicimos. ¡Lo logramos!-");
        historia.add("El Amigo2 sonrió aliviado. -Pensé que nunca lo conseguiríamos-.");
        historia.add("El Amigo3 añadió, limpiándose el sudor de la frente: -Gracias a Jorge, el multiverso está a salvo-.");
        historia.add("Jorge miró a su alrededor, viendo cómo las fisuras del multiverso comenzaban a cerrarse.");
        historia.add("-Aún queda mucho por hacer, pero por ahora, hemos ganado esta batalla-.");
        historia.add("Richard Castle, quien había estado luchando junto a ellos, se acercó con una sonrisa. -Eres un héroe, Jorge. Esto superará cualquier historia que haya escrito-.");
        historia.add("Jorge le estrechó la mano. -Gracias, Castle. Fue un honor tenerte en nuestro equipo-.");
        historia.add("Castle asintió. -Buena suerte en tu próxima aventura. Quizás algún día escriba sobre ti-.");
        historia.add("");
        historia.add("La Derrota Inevitable");
        historia.add("La última batalla contra el megazombie fue más intensa de lo que jamás imaginaron.");
        historia.add("Jorge, Fernando Alonso y Rayo McQueen luchaban con todo lo que tenían, pero el monstruo parecía invencible.");
        historia.add("El megazombie avanzaba implacable, su cuerpo monstruoso resistiendo los ataques y dejando un rastro de destrucción.");
        historia.add("El Amigo1 gritó: -¡Jorge, ten cuidado!-");
        historia.add("Jorge, agotado pero decidido, lanzó el último ataque, pero el megazombie lo esquivó con facilidad y lo golpeó con una fuerza devastadora.");
        historia.add("Jorge cayó al suelo, su visión nublada mientras el sonido de la batalla se desvanecía.");
        historia.add("Fernando Alonso, intentando salvar a su amigo, se lanzó al ataque, pero fue rápidamente derribado por el monstruo.");
        historia.add("Rayo McQueen también intentó intervenir, pero el megazombie lo lanzó contra las paredes de la pista.");
        historia.add("El Amigo2 se acercó, pero vio con horror cómo Jorge se desvanecía, derrotado por el monstruo.");
        historia.add("El Amigo3 gritó, con lágrimas en los ojos: -¡No! ¡No puede ser!-");
        historia.add("El megazombie sonrió con su terrible mueca, y antes de desaparecer en un destello de oscuridad, lanzó una última maldición.");
        historia.add("Con un golpe final, Jorge y sus amigos fueron atrapados en la realidad de Fórmula 1, sin posibilidad de salir.");
        historia.add("El portal se cerró, y todos quedaron atrapados en un mundo donde las carreras dominaban cada rincón, pero sin salida.");
        historia.add("");
        historia.add("La Nueva Realidad: Un Apocalipsis Diferente");
        historia.add("La batalla contra el MegaZombie había sido brutal, pero Jorge, con la ayuda de Fernando Alonso y Rayo McQueen, logró finalmente vencerlo.");
        historia.add("Con un último golpe certero, el monstruo colapsó, y su cuerpo se desintegró en un mar de polvo y oscuridad.");
        historia.add("El Amigo1 respiró con alivio. -¡Lo conseguimos! ¡Jorge, lo lograste!-");
        historia.add("El Amigo2 sonrió, visiblemente agotado. -Nunca pensé que un día vería un zombie de esa magnitud... pero lo vencimos-.");
        historia.add("Rayo McQueen frenó junto a ellos, dando una vuelta triunfal. -¡Eso sí que fue una carrera! Pero, ¿y ahora qué?-");
        historia.add("Jorge observó el portal que se abría ante ellos. -Es hora de seguir adelante. Ya hemos hecho lo nuestro aquí-.");
        historia.add("Se acercó a Alonso y McQueen, sonriendo con gratitud. -Gracias por todo, chicos. No lo habría logrado sin ustedes-.");
        historia.add("Fernando Alonso le dio una palmada en el hombro. -Un placer, Jorge. Ahora, sigue adelante y salva lo que queda del multiverso-.");
        historia.add("Rayo McQueen hizo un sonido de motor con su faro. -¡Te voy a extrañar, amigo! Pero sigue siendo el campeón del multiverso-.");
        historia.add("");
        historia.add("El Cataclismo Final y Loki");
        historia.add("La batalla contra El Tejedor había comenzado con esperanza, pero pronto se convirtió en una pesadilla.");
        historia.add("Jorge y sus amigos se encontraron en el corazón de la tormenta multiversal, donde las realidades chocaban con furia.");
        historia.add("El Tejedor, con su manto de hilos de realidad, sonreía mientras observaba el caos que había creado.");
        historia.add("-Bienvenidos, héroes. ¿Disfrutando del espectáculo?- preguntó con una voz que resonaba como mil ecos.");
        historia.add("Jorge, con el rostro ensombrecido por la determinación, respondió: -¡Esto termina aquí, Tejedor! No dejaremos que destruyas más realidades.-");
        historia.add("El Tejedor rió, una risa que helaba la sangre. -¿Termina? Querido Jorge, esto es solo el comienzo. ¡Loki, adelante!-");
        historia.add("De las sombras, Loki apareció, con su característico brillo travieso en los ojos.");
        historia.add("-Hola, Jorge. He estado esperando este momento. ¿Listo para perder otra vez?- dijo Loki, lanzando un hechizo que envolvió a Jorge en sombras.");
        historia.add("Jorge luchó contra las sombras, recordando las palabras de sus amigos, la fe que tenían en él.");
        historia.add("-No puedo rendirme. No ahora... no nunca-, murmuró Jorge, rompiendo las sombras con un estallido de luz.");
        historia.add("Loki retrocedió, sorprendido. -Imposible... ¡Eso no debería ser posible!-");
        historia.add("Jorge aprovechó la oportunidad y contraatacó, lanzando un rayo de energía pura hacia Loki.");
        historia.add("El rayo impactó de lleno, y Loki gritó, desvaneciéndose en una nube de humo y espejos.");
        historia.add("-Uno menos-, dijo Jorge, recuperando el aliento.");
        historia.add("Pero el Tejedor no se detuvo. Con un movimiento de su mano, reconfiguró la realidad, creando monstruos y trampas por doquier.");
        historia.add("-¿Creías que eso sería suficiente? Esto es solo un juego para mí. ¡Diviértanse, mis criaturas!- gritó el Tejedor.");
        historia.add("Jorge y sus amigos lucharon con todas sus fuerzas, pero las criaturas eran infinitas, y el terreno cambiaba constantemente.");
        historia.add("En un momento, estaban en una selva espesa; al siguiente, en el vacío del espacio, flotando hacia la nada.");
        historia.add("La risa del Tejedor resonaba en todas partes, un recordatorio constante de su poder y locura.");
        historia.add("-Esto es un sueño... esto tiene que ser un sueño-, repetía Jorge, tratando de aferrarse a la realidad.");
        historia.add("Pero no era un sueño. Era una pesadilla hecha realidad, y el Tejedor era el maestro de ceremonias.");
        historia.add("Finalmente, después de lo que pareció una eternidad, Jorge y sus amigos se encontraron de nuevo cara a cara con el Tejedor.");
        historia.add("Estaban en una arena, rodeados por las realidades colapsadas, con el Tejedor en el centro, riendo.");
        historia.add("-Bienvenidos de nuevo. ¿Listos para el acto final?- preguntó el Tejedor, haciendo una profunda reverencia.");
        historia.add("Jorge, con el rostro sucio pero decidido, respondió: -Esto termina ahora. ¡Por todas las realidades que has destruido, pagarás!-");
        historia.add("El Tejedor sonrió, una sonrisa que no prometía nada bueno. -Oh, estoy contando con eso. ¡Loki, la segunda ronda!-");
        historia.add("Loki reapareció, esta vez con una mirada más seria. -No subestimes el poder de un dios, Jorge.-");
        historia.add("Jorge sintió un escalofrío recorrer su espalda. Sabía que esta batalla sería diferente, mucho más peligrosa.");
        historia.add("El cielo se oscureció, y un rayo cayó, marcando el comienzo del enfrentamiento final.");
        historia.add("Jorge y Loki se lanzaron el uno contra el otro, chocando en una explosión de energía y magia.");
        historia.add("Las ondas de choque destruyeron todo a su alrededor, mientras las realidades cercanas temblaban y crujían.");
        historia.add("El Tejedor observaba con deleite, como un niño en una tienda de dulces.");
        historia.add("-Esto es arte... esto es verdadero arte-, decía el Tejedor, extasiado.");
        historia.add("La batalla entre Jorge y Loki era titánica, con cada uno de ellos empujando al otro al límite.");
        historia.add("Jorge recordó todas las veces que había luchado por sus amigos, por el multiverso, y sintió una nueva oleada de poder.");
        historia.add("-No puedo rendirme. No cuando hay tanto en juego-, gritó Jorge, lanzando un ataque devastador.");
        historia.add("Loki, sorprendido por la fuerza del ataque, fue empujado hacia atrás, chocando contra el Tejedor.");
        historia.add("El Tejedor, enfurecido, gritó: -¡Esto no es un juego, Loki! ¡Concéntrate!-");
        historia.add("Loki asintió, recuperando la compostura. -Tienes razón. Es hora de acabar con esto.-");
        historia.add("Juntos, Jorge y Loki desataron su poder, creando una explosión de luz y oscuridad que iluminó todo el multiverso.");
        historia.add("El Tejedor, atrapado en su propia trampa, gritó mientras era consumido por la energía combinada.");
        historia.add("-Esto es... imposible...- fueron sus últimas palabras antes de desaparecer.");
        historia.add("Con la derrota del Tejedor, las realidades comenzaron a estabilizarse, y el multiverso respiró aliviado.");
        historia.add("Jorge, exhausto pero triunfante, miró a su alrededor, viendo cómo todo volvía a la normalidad.");
        historia.add("-Lo logramos... lo hicimos...- murmuró Jorge, dejando escapar un suspiro de alivio.");
        historia.add("Loki, recuperándose, sonrió. -No fue fácil, pero lo logramos. Quizás no seas tan inútil después de todo, Jorge.-");
        historia.add("Jorge sonrió débilmente. -Gracias, Loki. No podría haberlo hecho sin tu ayuda.-");
        historia.add("Con el Tejedor derrotado y el multiverso a salvo, Jorge y sus amigos se despidieron de Loki.");
        historia.add("Loki, con una sonrisa traviesa, dijo: -Hasta la próxima, Jorge. Que tus aventuras sean siempre emocionantes.-");
        historia.add("Jorge asintió, sintiendo que había aprendido una valiosa lección sobre la confianza y la amistad.");
        historia.add("Con un último vistazo, Jorge y sus amigos regresaron a casa, listos para enfrentar cualquier desafío que el multiverso les presentara.");
        historia.add("Y así, el ciclo continúa, con nuevos héroes y nuevas historias surgiendo de las cenizas de las antiguas.");
        historia.add("Pero eso es un cuento para otro momento, otro lugar. Por ahora, todo estaba bien en el multiverso.");
        historia.add("");
        historia.add("El Último Susurro del Multiverso");
        historia.add("En el vasto y silencioso vacío que quedaba del multiverso, una última chispa de esperanza parpadeaba.");
        historia.add("Era un pequeño rincón donde las realidades aún susurraban entre sí, recordando los tiempos pasados.");
        historia.add("Allí, en ese rincón olvidado, una nueva historia comenzaba a gestarse.");
        historia.add("Un joven, con el cabello al viento y una mirada decidida, observaba el horizonte.");
        historia.add("-El multiverso puede haber caído, pero yo seguiré luchando. Por cada realidad, por cada vida... seguiré adelante.-");
        historia.add("Y así, con el último susurro del multiverso, una nueva leyenda estaba a punto de nacer.");
        historia.add("Fin.");
        return historia;
    }

    public static List<String> historiaJorge(int eleccion) {
        ArrayList<String> result = new ArrayList<>();
        if (eleccion == 1) {
            result.add("Comienza la gran batalla del Valle de Hierro...");
            result.add("Los guerreros alzan sus espadas mientras el sol se oculta.");
            result.add("El choque de metales se escucha en todo el valle.");
        } else {
            result.add("Se inicia la batalla de la Montaña de Fuego...");
            result.add("Las flechas incendian el cielo al caer sobre las llamas.");
            result.add("El estruendo de los magos sacude las rocas ardientes.");
        }
        result.addAll(historiaJorge());
        return result;
    }
}

