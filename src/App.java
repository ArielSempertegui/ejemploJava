import java.util.ArrayList;
import java.util.Random;

public class App {

    // Lista de palabras estándar de Lorem Ipsum
    private static final String[] LOREM = {
        "Lorem", "Ipsum", "Dolor", "Sit", "Amet", "Consectetur", "Adipiscing", "Elit", 
        "Sed", "Do", "Eiusmod", "Tempor", "Incididunt", "Ut", "Labore", "Et", 
        "Dolore", "Magna", "Aliqua", "Enim", "Ad", "Minim", "Veniam"
    };


    public static String generarFrase(int min, int max, boolean puntoFinal) {
        Random random = new Random();
        
        // Determinar la longitud aleatoria entre min y max
        int longitud = random.nextInt((max - min) + 1) + min;
        
        StringBuilder frase = new StringBuilder();

        ArrayList<String> palabras = new ArrayList<>();
        for(String palabra : LOREM) {
            palabras.add(palabra.toLowerCase());
        }

        for (int i = 0; i < longitud; i++) {
            // Seleccionar una palabra aleatoria del arreglo
            // String palabra = palabras.get(random.nextInt(palabras.size()));
            String palabra = LOREM[random.nextInt(LOREM.length)];
            
            // Capitalizar la primera palabra de la frase
            if (i == 0) {
                palabra = palabra.substring(0, 1).toUpperCase() + palabra.substring(1);
            }

            frase.append(palabra);

            // Añadir espacio si no es la última palabra, o punto final si lo es
            if (i < longitud - 1) {
                frase.append(" ");
            } else if(puntoFinal){
                frase.append(".");
            }
        }

        return frase.toString();
    }

public static void main(String[] args) {
        // Ejemplo de uso: generar 5 sinopsis con longitud entre 5 y 25 palabras
        for (int i = 0; i < 5; i++) {
            System.out.println(generarFrase(1, 3, true));
        }
    }
}
