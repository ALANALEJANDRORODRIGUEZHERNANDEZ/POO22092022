/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.swing;

import ico.fes.herencia.Persona;
import ico.fes.modelo.ModeloPersonaCombo;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author alan
 */
public class VentanaSwing extends JFrame {

    private JTextField cuadro;
    private JButton boton;
    private JLabel resultado;
    private JComboBox<Persona> lista;
    private ModeloPersonaCombo modelo;
    private JTextArea texto;
    

    public VentanaSwing() throws HeadlessException {
        ImageIcon icono = new ImageIcon(System.getProperty("user.dir") + "/src/ico/fes/swing/dinero.png");
        setTitle("Conversion ~C a ~F");
        setSize(400, 600);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        cuadro = new JTextField(12);
        boton = new JButton(icono);
        boton.setBackground(Color.RED);
        boton.setOpaque(true);
        boton.setToolTipText("Click para convertir a grados ~F");
        lista = new JComboBox();
        modelo = new ModeloPersonaCombo();
        modelo.base();
        lista.setModel(modelo);
        texto = new JTextArea(20, 20);
        
        
       /* lista.addItem("Ingeneria");
        lista.addItem("Periodismo");
        lista.addItem("Arquitectura");
            lista.addItem("Derecho");*/

        resultado = new JLabel("~F");

        this.getContentPane().add(cuadro);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        this.getContentPane().add(lista);
        this.getContentPane().add(texto);
        
        this.validate();
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                float gradosF = 0.0f;
                float celcius = 0.0f;

                try {
                    celcius = Float.parseFloat(cuadro.getText());
                    gradosF = (celcius * (9.0f / 5.0f)) + 32.0f;
                    resultado.setText("Resultado en ~F " + gradosF);
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                    JOptionPane.showMessageDialog(null, "Introduce un valor correcto", "error", JOptionPane.ERROR_MESSAGE);
                }
            }

        });

    }

}
