import java.util.Random;

public class App {

    // Lista de palabras estándar de Lorem Ipsum
    private static final String[] LOREM = {
        "lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit", 
        "sed", "do", "eiusmod", "tempor", "incididunt", "ut", "labore", "et", 
        "dolore", "magna", "aliqua", "enim", "ad", "minim", "veniam"
    };

    // private static final String[] LOREM = {
    //     "Lorem", "Ipsum", "Dolor", "Sit", "Amet", "Consectetur", "Adipiscing", "Elit", 
    //     "Sed", "Do", "Eiusmod", "Tempor", "Incididunt", "Ut", "Labore", "Et", 
    //     "Dolore", "Magna", "Aliqua", "Enim", "Ad", "Minim", "Veniam"
    // };

    public static String generarFrase(int min, int max, boolean esTitulo) {

        Random random = new Random();
        // Determinar la longitud aleatoria entre min y max
        int longitud = random.nextInt((max - min) + 1) + min;
        
        StringBuilder frase = new StringBuilder();

        // ArrayList<String> palabras = new ArrayList<>();
        // for(String palabra : LOREM) {
        //     palabras.add(palabra.toLowerCase());
        // }

        for (int i = 0; i < longitud; i++) {
            // Seleccionar una palabra aleatoria del arreglo
            // String palabra = palabras.get(random.nextInt(palabras.size()));
            String palabra = LOREM[random.nextInt(LOREM.length)];
            
            // Capitalizar la primera palabra de la frase
            if(esTitulo) {
                palabra = palabra.substring(0, 1).toUpperCase() + palabra.substring(1);
            } else if (i == 0) {
                palabra = palabra.substring(0, 1).toUpperCase() + palabra.substring(1);
            }
            // if (i == 0) {
            //     palabra = palabra.substring(0, 1).toUpperCase() + palabra.substring(1);
            // }
            // if(esTitulo) {
            //     palabra = palabra.substring(0, 1).toUpperCase() + palabra.substring(1);
            // }

            frase.append(palabra);

            // Añadir espacio si no es la última palabra, o punto final si lo es
            if (i < longitud - 1) {
                frase.append(" ");
            } else if(!esTitulo){
                frase.append(".");
            }
        }

        return frase.toString();
    }

public static void main(String[] args) {
        // Ejemplo de uso: generar 5 sinopsis con longitud entre 5 y 25 palabras
        for (int i = 0; i < 5; i++) {
            System.out.println(generarFrase(1, 4, true));
        }
    }
}

    // Object[][] peliculasSimuladas = {
    //     {"La Naranja Mecánica", "Ciencia Ficción, Sátira, Drama", "Stanley Kubrick", 87, 1971},
    //     {"Pulp Fiction", "Crimen, Comedia negra, Suspense", "Quentin Tarantino", 92, 1994},
    //     {"The Matrix", "Ciencia Ficción, Acción", "Larry y Andy Wachowski", 88, 1999},
    //     {"The Dark Knight", "Acción, Crimen, Drama", "Christopher Nolan", 94, 2008},
    //     {"Inception", "Ciencia Ficción, Acción", "Christopher Nolan", 87, 2010},
    //     {"Interstellar", "Ciencia Ficción, Aventura, Drama", "Christopher Nolan", 73, 2014},
    //     {"Parasite", "Drama, Suspense", "Bong Joon-ho", 99, 2019},
    //     {"Oppenheimer", "Biografía, Drama", "Christopher Nolan", 93, 2023},
    //     {"Barbie", "Comedia Fantástica", "Greta Gerwing", 88, 2023},
    //     {"Dune: Part Two", "Ciencia Ficción, Aventura", "Denis Villeneuve", 93, 2024}
    // };