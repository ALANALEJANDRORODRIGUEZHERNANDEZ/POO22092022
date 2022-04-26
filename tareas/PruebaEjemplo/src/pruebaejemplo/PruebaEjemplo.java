/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author alan
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // TODO code application logic here
       CuentaHabiente[] millonario = new CuentaHabiente[5];
       millonario[0] = new CuentaHabiente("0","Dulce",100000f);
        millonario[1] = new CuentaHabiente("31+9211320","Karen",50000f);
          millonario[2] = new CuentaHabiente("31+9211320","Alfredo",500000f);
            millonario[3] = new CuentaHabiente("0","Noemi",50000f);
              millonario[4] = new CuentaHabiente("31+9211320","Alan",100000f);
       /* System.out.println(millonario[0]);
        millonario[0].retirarDinero(5000);
            System.out.println(millonario[1]);
            millonario[1].retirarDinero(5000);
                System.out.println(millonario[2]);
                millonario[2].retirarDinero(5000);
                    System.out.println(millonario[3]);
                    millonario[3].retirarDinero(5000);
                        System.out.println(millonario[4]);
                        millonario[4].retirarDinero(5000);
         System.out.println("Lista para ver si eres un millonario premium o un millonario regular");     */   
         for(CuentaHabiente i : millonario)
         {
             System.out.println(i.toString());
             i.retirarDinero(5000f);
             System.out.println(i.evaluarNivelCliente());
             
         }                   
                          

    }
    
}
