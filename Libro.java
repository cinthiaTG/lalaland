package edu.upvictoria.fpoo;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Libro {
    private String titulo;
    private String autor;
    private String disponibilidad;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }



    public void Agregar_libro(Libro libro)throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String nombre_arch ="libros.txt";

        try {
            FileWriter fileWriter = new FileWriter(nombre_arch, true);
            BufferedWriter br = new BufferedWriter(fileWriter);

            System.out.println("Ingresa el titulo:");
            String titulo = bufer.readLine();
            libro.setTitulo(titulo);

            System.out.println("Ingresa el autor:");
            String autor = bufer.readLine();
            libro.setAutor(autor);

            String linea = titulo + "\t" + autor+ "\t"+ "disponible";
            br.write(linea);
            libro.setDisponibilidad("disponible");
            System.out.println("Agregado!!!!");
            br.newLine();

            br.close();

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo.");
            e.printStackTrace();

        }
    }

    public static String Buscar_libro_titulo(String titulo) throws IOException {
        InputStream is = Bibliotecario.class.getClassLoader().getResourceAsStream("libros.txt");
        if (is == null) {
            throw new IOException("No se pudo encontrar el archivo 'libros.txt'.");
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

    public void Eliminar_libro(String titulo)throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String nombre_arch = "libros.txt";
        File archivo = new File(nombre_arch);
        File archivoTemp = new File("temp2.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(archivo));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemp))) {

            String linea;
            boolean encontrado = false;
            while ((linea = br.readLine()) != null) {
                String[] columnas = linea.split("\t");
                if (titulo.equals(columnas[0])) {
                    encontrado = true;
                    continue;
                }
                bw.write(linea);
                bw.newLine();
            }

            if (!encontrado) {
                System.out.println("Usuario no encontrado.");
            } else {
                archivo.delete();
                archivoTemp.renameTo(new File(nombre_arch));
                System.out.println("Usuario eliminado exitosamente.");
            }

        } catch (IOException e) {
            System.err.println("Error al eliminar el usuario del archivo.");
            e.printStackTrace();
        }

    }

    public void Prestar_libro(String titulo) throws IOException {
        String nombre_arch = "libros.txt";
        File archivo = new File(nombre_arch);
        File archivoTemp = new File("temp.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(archivo));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemp))) {

            String linea;
            boolean encontrado = false;
            while ((linea = br.readLine()) != null) {
                String[] columnas = linea.split("\t");
                if (columnas.length >= 3 && titulo.toLowerCase().equals(columnas[0].toLowerCase())) {
                    encontrado = true;
                    System.out.println("El libro " + titulo + " está: " + columnas[2]);
                    if ("disponible".equals(columnas[2])) {
                        System.out.println("Se agregó a sus préstamos.");
                        columnas[2] = "no disponible";
                    } else {
                        System.out.println("No se puede pedir prestado.");
                    }
                }
                bw.write(String.join("\t", columnas));
                bw.newLine();
            }

            if (!encontrado) {
                System.out.println("Libro no encontrado.");
            }

        } catch (IOException e) {
            System.err.println("Error al prestar el libro.");
            e.printStackTrace();
        }

        // Renombrar el archivo temporal al archivo original
        archivo.delete();
        archivoTemp.renameTo(new File(nombre_arch));
    }

}
