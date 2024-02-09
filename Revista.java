package edu.upvictoria.fpoo;

public class Revista extends Material{
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

}
