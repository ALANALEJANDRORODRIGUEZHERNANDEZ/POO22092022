 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.componentes;

/**
 *
 * @author alan
 */
public class Editorial {
    private String nombre;
    private String ciudad;
    
    public Editorial() {
    }

    public Editorial(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", ciudad=" + ciudad + '}';
    }
    public void nomCiudad(){
        System.out.println("El nombre de la ciudad donde se escribio es:"+this.ciudad+"\npor la editorial:"+this.nombre);
    }
}
