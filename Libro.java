package src;

public class Libro extends Material{
    private String Autor;
    private int CantidadLibros;
    private int LibrosPrestados;

    public Libro(){

    }
    public Libro(String Titulo, int Id, String Autor, int CantidadLibros, int LibrosPrestados){
        this.Titulo=Titulo;
        this.Id=Id;
        this.Autor=Autor;
        this.CantidadLibros=CantidadLibros;
        this.LibrosPrestados=LibrosPrestados;

    }
    public String getTitulo(){
        return Titulo;
    }
    public void  setTitulo(String Titulo){
    this.Titulo=Titulo;
    }
    public int getId(){
        return Id;
    }
    public void  setId(int Id){
        this.Id=Id;
    }
    public String getAutor(){
        return Autor;
    }
    public void  setAutor(String Autor){
        this.Autor=Autor;
    }
    public int getCantidadLibros(){
        return CantidadLibros;
    }
    public void  setCantidadLibros(int CantidadLibros){
        this.CantidadLibros=CantidadLibros;
    }
    public int getLibrosPrestados(){
        return LibrosPrestados;
    }
    public void  setLibrosPrestados(int LibrosPrestados){
        this.LibrosPrestados=LibrosPrestados;
    }

    public boolean Prestamo(){/*Esta funcion sirve para checar cuantos libros de un mismo tipo hay, si aun hay disponibles se prestan, si no, se mostarara un mensaje en pantalla donde no existen ejemplares disponible*/
        boolean prestado=true;
        if(LibrosPrestados<CantidadLibros){
            LibrosPrestados ++;
        }else{
            prestado=false;
        }
        return prestado;
    }
    public boolean Devolver(){
        boolean devuelto=true;
        if(LibrosPrestados==0){
            devuelto=false;

        }else{
            LibrosPrestados--;
        }
        return devuelto;
    }
}
