/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import javax.swing.JOptionPane;



/**
 *
 * @author alan
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad = 20;
        System.out.println("Edad: "+edad);
        Integer edad2 = new Integer(16);
        System.out.println(edad2);// TODO code application logic here
        Double y = edad2.doubleValue();
        System.out.println(y);
        System.out.println(edad2.shortValue());
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*");
        //Convertir String A Entero
        String cadena = "99";
        int altura = Integer.parseInt(cadena);
        altura++;
        float altura1 = Float.parseFloat(cadena);
        altura1+=0.5;
        
        System.out.println("Altura= "+altura);
        System.out.println("Altura1= "+altura1);
        Arbol treel = new Arbol(2.4f, 15);
        Arbol tree2 = new Arbol(2.4f, 15);
        Arbol tree3 = new Arbol(2.4f, 15);
        Arbol tree4 = new Arbol(2.4f, 15);
        System.out.println(treel);
        System.out.println("Troncos de un arbol:"+treel.tronco);
        System.out.println("Troncos de un arbol:"+tree2.tronco);
        System.out.println("Troncos de un arbol:"+tree3.tronco);
        System.out.println("Troncos de un arbol:"+tree4.tronco);
        treel.generarOxigeno();
        JOptionPane.showMessageDialog(null, "Hola mundo","Aqui va el titulo", JOptionPane.ERROR_MESSAGE);
        String dato = JOptionPane.showInputDialog(null,"Dame tu edad","Introducir datos",JOptionPane.INFORMATION_MESSAGE);
        System.out.println(dato);
        
        
    }
    
}
