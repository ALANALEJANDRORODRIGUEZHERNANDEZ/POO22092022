/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asus.com;

import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
/**
 *
 * @author alan
 */
public class Computadora {
    private String marca;
    private String modelo;
    private Monitor Pantalla;
    private Mouse raton;
    private Teclado teclado;
    private Procesador cpu;

    public Computadora() {
        Pantalla = new Monitor();
        raton = new Mouse();
        teclado = new Teclado();
        cpu = new Procesador();
        
    }

    public Computadora(String marca, String modelo, Monitor Pantalla, Mouse raton, Teclado teclado, Procesador cpu) {
        this.marca = marca;
        this.modelo = modelo;
        this.Pantalla = Pantalla;
        this.raton = raton;
        this.teclado = teclado;
        this.cpu = cpu;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Monitor getPantalla() {
        return Pantalla;
    }

    public void setPantalla(Monitor Pantalla) {
        this.Pantalla = Pantalla;
    }

    public Mouse getRaton() {
        return raton;
    }

    public void setRaton(Mouse raton) {
        this.raton = raton;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Procesador getCpu() {
        return cpu;
    }

    public void setCpu(Procesador cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", Pantalla=" + Pantalla + ", raton=" + raton + ", teclado=" + teclado + ", cpu=" + cpu + '}';
        /*String estado = "Marca:" +this.marca+ "\n";
        estado = estado +"Modelo:"+this.modelo+"\n";
        estado = estado + "Raton: Marca"+this.raton.getMarca()+", Tipo:"+this.getRaton().getTipo()+"\n";
        return estado;*/
    }
    
    
    
}
