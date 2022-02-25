package tarealibro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alan
 */
public class Libro {
    private String titulo;
    private String autor;
    private String anio;
    private String editorial;
    private int paginas;

    public Libro() {
    }

    public Libro(String titulo, String autor, String anio, String editorial, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
   public void leyendo(){
       System.out.println("Leyendo el libro "+this.titulo+"de la editorial "+this.editorial+" de solo "+this.paginas+" paginas");
   }
   public void autor(){
       System.out.println("El autor "+this.autor+", es un gran escritor y saco este libro en la fecha "+this.anio);
   }
}
