/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import java.util.ArrayList;
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
        treel.crecer(2.5f);
        
        int edad_3 = 15;
        String resultado = "";
        if (edad_3 < 18) {
            resultado = "Menor de edad";
        }
        else{
            resultado = "Mayor de edad";
        }
        
        System.out.println(resultado);
        
        //Con código terniario
        int edad_4 = 24;
        String res = "";
        res = edad_4 < 18? "Eres menor de edad" : "Eres mayor de edad";
        System.out.println(res);
        
        //Menor cantidad de lineas de código posible
        int edad_5 = 15;
        System.out.println(edad_5 < 18? "Escuicle" : "NO escuincle");
        
        System.out.println("-------------------------------------------------------");
        
        int val_1 = 12;
        int val_2 = 27;
        
        System.out.println(val_1 | val_2);
        
        int val_3 = 1;
        int val_4 = 0;
        val_4 = val_3 << 2;
        System.out.println(val_4);
        
        System.out.println("-------------------------Arreglos-------------------------------");
        int[] edades;
        edades = new int[5];
        System.out.println(edades);
        
        edades[0] = 10;
        System.out.println("La primer edad es: " + edades[0]);
        
        int estaturas[] = new int[5];
        System.out.println(estaturas);
        
        int pesos[] = {86,99,56,76,77};
        System.out.println(pesos[0]);
        System.out.println(pesos[1]);
        System.out.println(pesos[2]);
        System.out.println(pesos[3]);
        System.out.println(pesos[4]);
        
        //Imprimir lo anterior pero bien
        System.out.println("for");
        for (int i = 0; i < pesos.length; i++) {
            System.out.println(pesos[i]);
        }
        System.out.println("--------------------Inverso--------------------");
        for (int i = pesos.length-1; i >= 0; i--) {
            System.out.println(pesos[i]);
        }
        
        System.out.println("--------------------------------------------------------------");
        Alumno lista[] = new Alumno[5];
        lista[0] = new Alumno("45565212", 2, 9.0f);
        lista[1] = new Alumno("56123185", 2, 7.0f);
        lista[2] = new Alumno("74842315", 2, 6.7f);
        lista[3] = new Alumno("78231544", 2, 8.2f);
        lista[4] = new Alumno("32110584", 2, 10.0f);
        
        for(int i = 0; i < lista.length; i++) {
            Alumno alumno = lista[i];
            alumno.checkPerformance();
        }
        
        System.out.println("foreach");
        
        for (Alumno alumno : lista) {
            alumno.checkPerformance();
        }
        
        ArrayList<Alumno> grupo2209 = new ArrayList<Alumno>();
        grupo2209.add(new Alumno("319211320", 2, 9.6f));
        grupo2209.add(new Alumno("99999", 2, 8.6f));
        grupo2209.add(new Alumno("99999", 2, 7.6f));
        grupo2209.add(new Alumno("99999", 2, 6.6f));
        grupo2209.add(new Alumno("99999", 2, 5.6f));
        for(Alumno i : grupo2209)
        {System.out.println(i.toString());
        }
        
        System.out.println("add con indice");
         grupo2209.add(2,new Alumno("0", 2, 8.6f));
        for(Alumno i : grupo2209)
        {System.out.println(i.toString());
        }
        System.out.println("-*");
        System.out.println(grupo2209.get(2));
        System.out.println(grupo2209.remove(2));
        System.out.println(grupo2209.get(2));
        grupo2209.set(0, new Alumno("444", 3, 6.0f));
        System.out.println("-*-*-*");
        for(Alumno i : grupo2209)
        {System.out.println(i.toString());
        }
        System.out.println("*/");
        //Excepciones
        
        try {
            System.out.println(grupo2209.get(20));
        } catch (Exception e) {
            System.out.println("error.. revisa los indices");
        }
        System.out.println("fin del programa");
    }
    
}
