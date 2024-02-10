package src;

import src.Material;

public class Tesis extends Material {
    private String Autor;
    private int CantidadTesis;
    private int TesisPrestadas;

    public Tesis(){

    }
    public Tesis (String Titulo, int Id, String Autor, int CantidadTesis, int TesisPrestadas){
        this.Titulo=Titulo;
        this.Id=Id;
        this.Autor=Autor;
        this.CantidadTesis=CantidadTesis;
        this.TesisPrestadas=TesisPrestadas;
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
    public int getCantidadTesis(){
        return CantidadTesis;
    }
    public void  setCantidadTesis(int CantidadTesis){
        this.CantidadTesis=CantidadTesis;
    }
    public int getTesisPrestadas(){
        return TesisPrestadas;
    }
    public void  setTesisPrestadas(int TesisPrestadas){
        this.TesisPrestadas=TesisPrestadas;
    }
    public boolean Prestamo(){/*Esta funcion sirve para checar cuantos libros de un mismo tipo hay, si aun hay disponibles se prestan, si no, se mostarara un mensaje en pantalla donde no existen ejemplares disponible*/
        boolean prestado=true;
        if(TesisPrestadas<CantidadTesis){
            TesisPrestadas ++;
        }else{
            prestado=false;
        }
        return prestado;
    }
    public boolean Devolver(){
        boolean devuelto=true;
        if(TesisPrestadas==0){
            devuelto=false;

        }else{
            TesisPrestadas--;
        }
        return devuelto;
    }
}
