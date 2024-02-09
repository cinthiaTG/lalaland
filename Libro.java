package edu.upvictoria.fpoo;

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


}
