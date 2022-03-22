/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.Servidor;
import ico.fes.herencia.polimorfismo.Animal;
import ico.fes.herencia.polimorfismo.Perro;
import javax.swing.JFrame;

/**
 *
 * @author alan
 */
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String nombre = new String("José José"); // TODO code application logic here
        System.out.println( nombre ); 
        System.out.println(nombre.charAt(3)); 
        System.out.println(nombre.toUpperCase());
       /* JFrame ventana = new JFrame("Mi primer ventana Java");
        ventana.setSize(600, 400);
        ventana.setVisible(true);*/
       
        Computadora miCompu = new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel",2.1f));
        System.out.println(miCompu);
        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);
        miCompu.setRaton(new Mouse("Logitech", "Optico"));
        System.out.println(miCompu);
        Computadora compu2 = new Computadora("Apple","MacBook Pro",
                new Monitor("Toshiba",14.3f), 
                new Mouse("Acteck","Optico"),
                new Teclado("Teclado", 101), 
                new Procesador("M1", 3.4f));
        System.out.println(compu2);
        compu2.setRaton(new Mouse("Apple","Touch"));
        System.out.println(compu2);
        System.out.println("-----------------");
        Alumno alu1 = new Alumno();
        alu1.setNombre("Jose");
        System.out.println(alu1);
        Alumno alu2 = new Alumno("319211320","ICO", "Alan rodriguez", 18);
        System.out.println( alu2.toString());
        alu1.setCarrera("329450");
        System.out.println(alu1);     
        System.out.println("+++++++++++++++++++++++++++++++++++");
        Servidor server = new Servidor();
        System.out.println(server);
        server.setNumeroTarjetasRed(2);
        System.out.println(server);
        server.setMarca("HP");
        System.out.println(server);
        server.setRaton(new Mouse("LG", "Optico"));
         System.out.println(server);
         server.getRaton().setMarca("Logitech");
         System.out.println(server);
         System.out.println("------EJEMPLO POLIMORFISMO-------");
         Perro dog = new Perro("Boxer","5estrella", 5);
         dog.emitirSonido();
         Animal animal1 = new Animal(4);
         animal1.emitirSonido();
         
         
        
    }   
    
}
