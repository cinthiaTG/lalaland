import java.io.*;

public class Administrador extends Usuario{
    public void Buscar_libro()throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        Libro libro = new Libro();
        System.out.println("elige como se quiere buscar el libro\n1)titulo\n2)autor");
        int opc=Integer.parseInt(bufer.readLine());
        if (opc==1){
            System.out.println("ingresa el titulo del libro");
            String titulo= bufer.readLine();
            libro.Buscar_libro_titulo(titulo);
        }else {
            System.out.println("ingresa el autor del libro");
            String autor= bufer.readLine();
            libro.Buscar_libros_autor(autor);
        }
    }
    public void elecc_eliminar_libro() throws  IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("dime el titulo del libro: ");
        String titulo= bufer.readLine();
        Libro libro = new Libro();
        libro.Eliminar_libro(titulo);
    }
}
