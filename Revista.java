package src;

import src.Material;

public class Revista extends Material {
    private String Autor;
    private int CantidadRevistas;
    private int RevistasPrestadas;

    public Revista(){

    }
    public Revista (String Titulo, int Id, String Autor, int CantidadRevistas, int RevistasPrestadas) {
        this.Titulo = Titulo;
        this.Id = Id;
        this.Autor = Autor;
        this.CantidadRevistas = CantidadRevistas;
        this.RevistasPrestadas = RevistasPrestadas;
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
    public int getCantidadRevistas(){
        return CantidadRevistas;
    }
    public void  setCantidadRevistas(int CantidadRevistas){
        this.CantidadRevistas=CantidadRevistas;
    }
    public int getRevistasPrestadas(){
        return RevistasPrestadas;
    }
    public void  setRevistasPrestadas(int RevistasPrestadas){
        this.RevistasPrestadas=RevistasPrestadas;
    }

    public boolean Prestamo(){/*Esta funcion sirve para checar cuantos libros de un mismo tipo hay, si aun hay disponibles se prestan, si no, se mostarara un mensaje en pantalla donde no existen ejemplares disponible*/
        boolean prestado=true;
        if(RevistasPrestadas<CantidadRevistas){
            RevistasPrestadas ++;
        }else{
            prestado=false;
        }
        return prestado;
    }
    public boolean Devolver(){
        boolean devuelto=true;
        if(RevistasPrestadas==0){
            devuelto=false;

        }else{
            RevistasPrestadas--;
        }
        return devuelto;
    }

}
