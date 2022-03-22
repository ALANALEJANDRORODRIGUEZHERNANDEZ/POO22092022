/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author alan
 */
public class Procesador {
    private String marca;
    private double frecuenciaEnGhz;

    public Procesador() {
    }

    public Procesador(String marca, double frecuenciaEnGhz) {
        this.marca = marca;
        this.frecuenciaEnGhz = frecuenciaEnGhz;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getFrecuenciaEnGhz() {
        return frecuenciaEnGhz;
    }

    public void setFrecuenciaEnGhz (double frecuenciaEnGhz) {
        this.frecuenciaEnGhz = frecuenciaEnGhz;
    }

    @Override
    public String toString() {
        return "Procesador{" + "marca=" + marca + ", frecuenciaEnGhz=" + frecuenciaEnGhz + '}';
    }
    

    
}
