/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicula.componentes;

/**
 *
 * @author alan
 */
public class Productora {
    private String nombre;
    private int capital;

    public Productora() {
    }

    public Productora(String nombre, int capital) {
        this.nombre = nombre;
        this.capital = capital;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", capital=" + capital + '}';
    }
    public void datos3(){
        System.out.println("Metodo datos 3\nEl nombre de la productora es "+this.nombre);
    }
}
