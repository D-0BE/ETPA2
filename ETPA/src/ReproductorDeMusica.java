import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class ReproductorDeMusica {

    private static Clip clip;  // Variable estática para almacenar el Clip

    // Método estático para reproducir música
    public static void reproducir(String rutaArchivo) {
        try {
            // Cargar el archivo de audio como un flujo de datos de audio
            File archivoAudio = new File(rutaArchivo);
            AudioInputStream flujoAudio = AudioSystem.getAudioInputStream(archivoAudio);

            // Obtener un clip para reproducir el audio
            clip = AudioSystem.getClip();
            clip.open(flujoAudio);

            // Reproducir el audio
            clip.start();
            System.out.println("Reproduciendo: " + rutaArchivo);

            // Esperar hasta que termine
            clip.drain();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    // Método estático para detener la música
    public static void detener() {
        if (clip != null && clip.isRunning()) {
            clip.stop();  // Detiene la reproducción
            System.out.println("Música detenida.");
        }
    }
}

