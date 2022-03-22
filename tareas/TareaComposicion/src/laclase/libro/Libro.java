/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laclase.libro;

import libro.componentes.Autor;
import libro.componentes.Editorial;

/**
 *
 * @author alan
 */
public class Libro {
    private String tipoDePasta;
    private String numDeFirmas;
    private Autor nombreAutor;
    private Editorial nombreEditorial;

    public Libro() {
    }

    public Libro(String tipoDePasta, String numDeFirmas, Autor nombreAutor, Editorial nombreEditorial) {
        this.tipoDePasta = tipoDePasta;
        this.numDeFirmas = numDeFirmas;
        this.nombreAutor = nombreAutor;
        this.nombreEditorial = nombreEditorial;
    }

    public Editorial getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(Editorial nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public String getTipoDePasta() {
        return tipoDePasta;
    }

    public void setTipoDePasta(String tipoDePasta) {
        this.tipoDePasta = tipoDePasta;
    }

    public String getNumDeFirmas() {
        return numDeFirmas;
    }

    public void setNumDeFirmas(String numDeFirmas) {
        this.numDeFirmas = numDeFirmas;
    }

    public Autor getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(Autor nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    @Override
    public String toString() {
        return "Libro{" + "tipoDePasta=" + tipoDePasta + ", numDeFirmas=" + numDeFirmas + ", nombreAutor=" + nombreAutor + ", nombreEditorial=" + nombreEditorial + '}';
    }
    public void metodoMain(){
        System.out.println("Es un metodo main del Cuento 1");
    }
    
}
