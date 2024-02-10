import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Administrador admin = new Administrador();
        Bibliotecario bibl = new Bibliotecario();
        bibl.Buscar_libro_titulo("narnia");
        bibl.Buscar_libros_autor("nose");
    }
}
