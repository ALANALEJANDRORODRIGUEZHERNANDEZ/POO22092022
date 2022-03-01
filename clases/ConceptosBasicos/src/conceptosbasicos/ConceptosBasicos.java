/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptosbasicos;

import ICO.fes.Silla;
import ICO.fes.Automovil;
import java.awt.Color;
/**
 *
 * @author alan
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola de nuevo");
        Silla s1 = new Silla();
        System.out.println(s1); //por defecto se invoca toString();
        System.out.println(s1.toString());
        
        Automovil miBocho = new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        System.out.println(miBocho);
        Automovil miMustang = new Automovil("Ford","Mustan",2010,Color.yellow);
        System.out.println(miMustang);
        Automovil miAKura = new Automovil("Akura","NSX",2013,Color.cyan);
        System.out.println(miAKura);
    }
    
}
