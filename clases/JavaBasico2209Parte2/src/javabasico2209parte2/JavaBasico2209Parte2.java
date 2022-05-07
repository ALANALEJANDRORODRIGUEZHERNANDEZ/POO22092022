/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209parte2;

import ico.fes.herencia.EstudianteDeportistaArtista;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alan
 */
public class JavaBasico2209Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nombre = new ArrayList<>();
        nombre.add("Alan");
        nombre.add("Karen");
         nombre.add("Alan");
        nombre.add("Karen");
         nombre.add("Alan");
        
        for(String i : nombre){
            System.out.println(i);
        }
        System.out.println("-*-*-*-");
        Scanner mete = new Scanner(System.in);
        int indice = 0;
        
        String elnombre = "";
        
         try {
             indice = mete.nextInt();
            elnombre = nombre.get(indice);
        }
         catch(InputMismatchException ie)
         {
             System.out.print("Debes de teclear valores numericos y no letras\n");
             elnombre = nombre.get(0);
             System.out.println("error generador:"+ie);
         }
         catch(IndexOutOfBoundsException ioe)
         {
             System.out.println("Error debe de ser entre 0 y 4");
             elnombre = nombre.get(0);
         }
         catch (Exception e) {
             
             System.out.println("error generico");
             elnombre = nombre.get(1);
             
        } finally {
             System.out.println(elnombre);
             elnombre = null;
             
        }
       // System.out.println( nombre.get(indice));
       System.out.println("Continua el programa ...");
       Aritmetica cal = new Aritmetica(2, 0);
        System.out.println(cal.getA()+"+"+cal.getB()+"="+cal.sumar());
        try {
            System.out.println(cal.getA()+"/"+cal.getB()+"="+cal.dividir());
        } catch (ArithmeticException e) {
            System.out.println("Error de arimetica");
        }
         
         System.out.println("Fin del programa");
        System.out.println(elnombre);
        System.out.println("-------------------------------------Interfaces-------------------------------------");
        
        Cuadrado cuad = new Cuadrado(5.0f);
        Circulo cir = new Circulo(4.5f);
        
        System.out.println("Esta es el área del cuadrado: " + cuad.calcularArea());
        System.out.println("Esta es el área del circulo: " + cir.calcularArea());
        
        System.out.println("---------------------------------------------------------------------------------------");
        
        EstudianteDeportistaArtista estu = new EstudianteDeportistaArtista("ing", "31921132", "Fubol", "Ajedrez");
        estu.setNombre("Juan");
        estu.setEdad(20);
        
        estu.comer();
        estu.ensayar();
        estu.presentar();
        estu.jugar();
        estu.entrenar();
        
        System.out.println(estu);
        
    }
    }
    

