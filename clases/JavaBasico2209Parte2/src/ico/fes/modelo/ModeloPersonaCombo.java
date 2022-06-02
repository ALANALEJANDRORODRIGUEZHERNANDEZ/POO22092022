/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.modelo;

import ico.fes.herencia.Persona;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author alan
 */
public class ModeloPersonaCombo implements ComboBoxModel<Persona>{
    private  ArrayList<Persona> datos;
    private Persona selected;

    public ModeloPersonaCombo() {
    }

    public ModeloPersonaCombo(ArrayList datos, Persona selected) {
        this.datos = datos;
        this.selected = selected;
    }

    public ArrayList getDatos() {
        return datos;
    }

    public void setDatos(ArrayList datos) {
        this.datos = datos;
    }

    @Override
    public void setSelectedItem(Object o) {
        this.selected = (Persona)o;
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
       // regresara el numero de elementos a mostrar
        return datos.size();
        
    }

    @Override
    public Persona getElementAt(int i) {
        return datos.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener ll) {
       
    }

    @Override
    public void removeListDataListener(ListDataListener ll) {
         
    }
    public void base(){
    datos = new ArrayList<Persona>();
    datos.add(new Persona("Jesus", 21));
    datos.add(new Persona("Jose", 20));
    datos.add(new Persona("Maria", 22));
       datos.add(new Persona("Alan", 19));
    
    }
    
    
}
