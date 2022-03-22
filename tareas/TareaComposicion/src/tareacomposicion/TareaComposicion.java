/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacomposicion;

import laclase.libro.Libro;
import laclase.pelicula.Pelicula;
import libro.componentes.Autor;
import libro.componentes.Editorial;
import pelicula.componentes.Directora;
import pelicula.componentes.Productora;
import pelicula.componentes.Actor;

/**
 *
 * @author alan
 */
public class TareaComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Clase TareaComposicion como clase main donde se ejecutaran todas las pruebas de la tarea*/
        /*LIBRO*/
        Libro cuento1 = new Libro();    //Se crea el libro
        //Se asignan valores 
        Autor nombreAutor = new Autor("Alan Rodriguez","Mexico");
        Editorial nombreEditorial = new Editorial("AK","San Rafael");
        cuento1.setNumDeFirmas("Este libro alcanzo 100 firmas");
        cuento1.setTipoDePasta("Gruesa");
        
        cuento1.setNombreAutor(nombreAutor);
        cuento1.setNombreEditorial(nombreEditorial);
        System.out.println(cuento1);
        //Se acceden a metodos y se muestran metodos creados en otras clases
        cuento1.metodoMain();
        cuento1.getNombreAutor().leyendoDatos();
        cuento1.getNombreEditorial().nomCiudad();
        
        /*PELICULA*/
        Pelicula peli1 = new Pelicula();
        Actor nomA = new Actor("Ian", 18);
        Productora nomP = new Productora("AK",100000);
        Directora nomD = new Directora("Mama", 18);
        
        peli1.setAnio(2022);
        peli1.setNombre("Batman");
        
        peli1.setNomA(nomA);
        peli1.setNomP(nomP);
        peli1.setNomD(nomD);
        System.out.println(peli1);
        
         //Se acceden a metodos y se muestran metodos creados en otras clases
         peli1.metodoMain2();
         peli1.getNomD().datos();
         peli1.getNomA().datos2();
         peli1.getNomP().datos3();
        
        
        
        
       
    }
    
}
