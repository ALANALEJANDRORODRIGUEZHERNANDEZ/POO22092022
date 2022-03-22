/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicula.componentes;

/**
 *
 * @author alan
 */
public class Directora {
    private String nombre;
    private int edad;

    public Directora() {
    }

    public Directora(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Directora{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    public void datos(){
        System.out.println("Metodo datos \nLa edad de la directora es "+this.edad);
    }
}
