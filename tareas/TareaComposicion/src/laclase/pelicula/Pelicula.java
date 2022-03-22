/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laclase.pelicula;

import pelicula.componentes.Actor;
import pelicula.componentes.Directora;
import pelicula.componentes.Productora;

/**
 *
 * @author alan
 */
public class Pelicula {
  private int anio;
  private String nombre;
  private Productora nomP;
  private Actor nomA;
  private Directora nomD;

    public Pelicula() {
    }

    public Pelicula(int anio, String nombre, Productora nomP, Actor nomA, Directora nomD) {
        this.anio = anio;
        this.nombre = nombre;
        this.nomP = nomP;
        this.nomA = nomA;
        this.nomD = nomD;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Productora getNomP() {
        return nomP;
    }

    public void setNomP(Productora nomP) {
        this.nomP = nomP;
    }

    public Actor getNomA() {
        return nomA;
    }

    public void setNomA(Actor nomA) {
        this.nomA = nomA;
    }

    public Directora getNomD() {
        return nomD;
    }

    public void setNomD(Directora nomD) {
        this.nomD = nomD;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "anio=" + anio + ", nombre=" + nombre + ", nomP=" + nomP + ", nomA=" + nomA + ", nomD=" + nomD + '}';
    }
    
          
    public void metodoMain2(){
        System.out.println("Es un metodo main de la peli1");
    }
}
