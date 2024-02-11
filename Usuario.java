package edu.upvictoria.fpoo;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class Usuario {
    public String id,nombre,ocupacion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    //agregar ------id ---------nombre----------cargo
    public static void Crear_usuario() {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String nombre_arch ="usuarios.txt";

        try {
            FileWriter fileWriter = new FileWriter(nombre_arch, true);
            BufferedWriter br = new BufferedWriter(fileWriter);

            System.out.println("Ingresa el id:");
            int id = Integer.parseInt(bufer.readLine());
            System.out.println("Ingresa el nombre:");
            String nombre = bufer.readLine();
            System.out.println("Ingresa la ocupacion:\n1)Admin\n2)profesor\n3)biblioteccario\n4)alumno:");
            int ocup = Integer.parseInt(bufer.readLine());
            if (ocup==1){
                String linea = id + "\t" + nombre+ "\t"+ "Administrador";
                br.write(linea);
            } else if (ocup==2) {
                String linea = id + "\t" + nombre+ "\t"+ "profesor";
                br.write(linea);
            } else if (ocup==3) {
                String linea = id + "\t" + nombre+ "\t"+ "bibliotecario";
                br.write(linea);
            }else {
                String linea = id + "\t" + nombre+ "\t"+ "estudiante";
                br.write(linea);
            }
            System.out.println("Agregado!!!!");
            br.newLine();

            br.close();

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo.");
            e.printStackTrace();

        } catch (NumberFormatException e) {
            System.err.println("Debe ser un número entero.");
        }
    }
    //eliminar
    public static void Eliminar_usuario(String id) {
        String nombre_arch = "usuarios.txt";
        File archivo = new File(nombre_arch);
        File archivoTemp = new File("temp.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(archivo));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemp))) {

            String linea;
            boolean encontrado = false;
            while ((linea = br.readLine()) != null) {
                String[] columnas = linea.split("\t");
                if (id.equals(columnas[0])) {
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

    //buscar por id
    public static void Buscar_usuario_id(String id) {
        String nombre_arch = "usuarios.txt";
        File archivo = new File(nombre_arch);
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            boolean encontrado = false;
            while ((linea = br.readLine()) != null) {
                String[] columnas = linea.split("\t");
                if (id.equals(columnas[0])) {
                    encontrado = true;
                    System.out.println("id: " + columnas[0] + " nombre: " + columnas[1] + " ocupacion: " + columnas[2]);
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Usuario no encontrado.");
            }
        } catch (IOException e) {
            System.err.println("Error al buscar el usuario en el archivo.");
            e.printStackTrace();
        }
    }
    //buscar por nombre
    public static void Buscar_usuario_nombre(String nombre) {
        String nombre_arch = "usuarios.txt";
        File archivo = new File(nombre_arch);
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            boolean encontrado = false;
            while ((linea = br.readLine()) != null) {
                String[] columnas = linea.split("\t");
                if (columnas.length >= 2 && nombre.equals(columnas[1])) {
                    encontrado = true;
                    System.out.println("id: " + columnas[0] + " nombre: " + columnas[1] + " ocupacion: " + columnas[2]);
                }
            }
            if (!encontrado) {
                System.out.println("Usuario no encontrado.");
            }
        } catch (IOException e) {
            System.err.println("Error al buscar el usuario en el archivo.");
            e.printStackTrace();
        }
    }


}
