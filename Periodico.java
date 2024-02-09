package edu.upvictoria.fpoo;

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
}
