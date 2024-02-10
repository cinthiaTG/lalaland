import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Bibliotecario {

    public static String Buscar_libro_titulo(String titulo) throws IOException {
        InputStream is = Bibliotecario.class.getClassLoader().getResourceAsStream("Libros.txt");
        if (is == null) {
            throw new IOException("No se pudo encontrar el archivo 'Libros.txt'.");
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] columnas = linea.split("\\s{2,}");
                if (columnas.length >= 2 && titulo.equalsIgnoreCase(columnas[0].trim())) {
                    String autor = columnas[1].trim();
                    System.out.println("El autor del libro es: " + autor);
                    return autor;
                }
            }
            System.out.println("El libro con el título '" + titulo + "' no fue encontrado.");
            return null;
        }
    }
    public static void Buscar_libros_autor(String autor) throws IOException {
        InputStream is = Bibliotecario.class.getClassLoader().getResourceAsStream("Libros.txt");
        if (is == null) {
            throw new IOException("No se pudo encontrar el archivo 'Libros.txt'.");
        }


        try (BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
            String linea;
            System.out.println("titulos del autor ");
            while ((linea = br.readLine()) != null) {
                String[] columnas = linea.split("\\s{2,}");
                if (columnas.length >= 2 && autor.equalsIgnoreCase(columnas[1].trim())) {
                    String titulo= columnas[0];

                    System.out.println( titulo);
                    continue;

                }
            }
            System.out.println("El libro con el autor '" + autor + "' no fue encontrado.");

        }
    }
}
