package src;

import src.Material;

public class Periodico extends Material {
    private String Autor;
    private int CantidadPeriodicos;
    private int PeriodicosPrestados;

    public Periodico(){

    }
    public Periodico (String Titulo, int Id, String Autor, int CantidadPeriodicos, int PeriodicosPrestados){
        this.Titulo=Titulo;
        this.Id=Id;
        this.Autor=Autor;
        this.CantidadPeriodicos=CantidadPeriodicos;
        this.PeriodicosPrestados=PeriodicosPrestados;
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
    public int getCantidadPeriodicos(){
        return CantidadPeriodicos;
    }
    public void  setCantidadPeriodicos(int CantidadPeriodicos){
        this.CantidadPeriodicos=CantidadPeriodicos;
    }
    public int getPeriodicosPrestados(){
        return PeriodicosPrestados;
    }
    public void  setPeriodicosPrestados(int PeriodicosPrestados){
        this.PeriodicosPrestados=PeriodicosPrestados;
    }

    public boolean Prestamo(){/*Esta funcion sirve para checar cuantos libros de un mismo tipo hay, si aun hay disponibles se prestan, si no, se mostarara un mensaje en pantalla donde no existen ejemplares disponible*/
        boolean prestado=true;
        if(PeriodicosPrestados<CantidadPeriodicos){
            PeriodicosPrestados ++;
        }else{
            prestado=false;
        }
        return prestado;
    }
    public boolean Devolver(){
        boolean devuelto=true;
        if(PeriodicosPrestados==0){
            devuelto=false;

        }else{
            PeriodicosPrestados--;
        }
        return devuelto;
    }
}

