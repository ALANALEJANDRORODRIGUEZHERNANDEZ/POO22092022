/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealibro;

/**
 *
 * @author alan
 */
public class TareaLIBRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro(); // TODO code application logic here
        libro1.setAnio("15 de febrero del 2022");
        libro1.setAutor("Alan");
        libro1.setEditorial("Rodriguez");
        libro1.setTitulo("Tarea de POO ");
        libro1.setPaginas(5);
        libro1.leyendo();
        libro1.autor();
    }
    
}
