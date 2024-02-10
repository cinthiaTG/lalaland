import java.io.*;
import java.nio.charset.StandardCharsets;

public class Administrador {
    public static void Crear_usuario() {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String nombre_arch ="usuarios.txt";

        try {
            FileWriter fileWriter = new FileWriter(nombre_arch, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Ingresa el id:");
            int id = Integer.parseInt(bufer.readLine());
            System.out.println("Ingresa el nombre:");
            String nombre = bufer.readLine();

            String linea = id + "\t" + nombre + "\n";
            bufferedWriter.write(linea);
            bufferedWriter.close();

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo.");
            e.printStackTrace();

        } catch (NumberFormatException e) {
            System.err.println("Debe ser un número entero.");
        }
    }
    public static void Agregar_libro() {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String nombre_arch ="Libros.txt";

        try {
            FileWriter fileWriter = new FileWriter(nombre_arch, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Ingresa el nombre:");
            String nombre =bufer.readLine();
            System.out.println("Ingresa el autor:");
            String autor = bufer.readLine();

            String linea = nombre + "\t" + autor + "\n";
            bufferedWriter.write(linea);
            bufferedWriter.close();

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo.");
            e.printStackTrace();

        } catch (NumberFormatException e) {
            System.err.println("Debe ser un número entero.");
        }
    }

}
