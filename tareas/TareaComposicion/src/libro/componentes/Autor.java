/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.componentes;

/**
 *
 * @author alan
 */
public class Autor {
    private String nombre;
    private String pais;

    public Autor() {
    }

    public Autor(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", pais=" + pais + '}';
    }
    
    public void leyendoDatos(){
        System.out.println("Este libro fue escrito por: "+this.nombre+"\nen: "+this.pais);
    }

}
