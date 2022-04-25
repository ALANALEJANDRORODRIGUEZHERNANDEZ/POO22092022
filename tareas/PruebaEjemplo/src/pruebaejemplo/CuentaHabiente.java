/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author alan
 */
public class CuentaHabiente {
private String idCliente;
private String nombre; 
private float balance;

    public CuentaHabiente(String idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Datos del millonario en cuestion\n" +"idCliente:" + idCliente + "\nNombre:" + nombre + "\nBalance:" + balance;
    }
    
    public void retirarDinero(float monto)
    {
        System.out.println("A ver tienes:"+this.balance+"\nVas a retirar:"+monto+"\n\tVas a quedar pobre millonario...\nTu dinero ahora es:"+(this.balance-monto));
    }
    public String evaluarNivelCliente()
    {
    String res = this.balance <= 50000f? "El/La millonario "+this.nombre+" es un Cliente regular":"El/La supermillonario "+this.nombre+" es un Cliente Premium";
    return res;
    }

    
    
}
