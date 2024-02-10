package src;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Administrador admin = new Administrador();
        Bibliotecario bibl = new Bibliotecario();
        bibl.Buscar_libro_titulo("narnia");
        bibl.Buscar_libros_autor("nose");
    }
}

/* Libro"Numero".Prestamo(); Para el metodo prestar alguno de los articulos...se debe validar que existan ejemplares para prestar
* if (libro"numero".Prestamo){
* imprimir "Se ha prestado el libro"} else{
* imprimir "No hay ejemplares para prestar del libro requerido"}*/

/* Libro"Numero".Devolver(); Para el metodo Devuelve alguno de los articulos...se debe validar que existan ejemplares para devolver
 * if (libro"numero".Devolver){
 * imprimir "Se ha regresado el libro"} else{
 * imprimir "No hay ejemplares prestados en este momento"}*/

