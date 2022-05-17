/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaCesar.Swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author alan
 */
public class ventanaCesar extends JFrame {
    private JTextField texto,numeros,n;
    private JButton push,push_2;
    private JLabel resultado;
   
        public ventanaCesar() throws HeadlessException
        {
            setTitle("Cifra una oracion-palabra o un numero\n");
            setSize(800,800);
            n = new JTextField(3);
            
                    /*La caja de los caracteres*/
                    setLayout(new FlowLayout(FlowLayout.LEFT));
                    texto = new JTextField(12);
                    push = new JButton();
                    push.setBackground(Color.blue);
                    push.setOpaque(true);
                    
              
                                 /*La caja de los numeros*/
                                setLayout(new FlowLayout(FlowLayout.RIGHT));
                                numeros = new JTextField(12);
                                push_2 = new JButton();
                                push_2.setBackground(Color.green);
                                push.setOpaque(true);
              
              
              
              this.getContentPane().add(n);
              resultado = new JLabel("Cifra tu palabra o numero\t   Primera caja y boton azul= Palabras   Segunda caja y boton verde=Numeros");
              this.getContentPane().add(texto);
              this.getContentPane().add(numeros);
               this.getContentPane().add(push);
               this.getContentPane().add(push_2);
                this.getContentPane().add(resultado);
                
                
                
                this.validate();
                    this.setVisible(true);
                    
                    
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
          System.exit(0);
            }
        });
        this.push.addMouseListener(new MouseAdapter()  
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                 
                 String abc = "abcdefghijklmnñopqrstuvwxyz";
                 String res = "";
                 
                 String tex = "";
                 int ene = Integer.parseInt(n.getText());
                 char letra;
                
                try     
                {
                    tex = texto.getText();
                    for(int i =0;i < tex.length();i++)
                    {   
                        letra = tex.charAt(i);
                        int pos = abc.indexOf(letra); // 0 1 2 3
                            if(pos == -1)
                            {
                                    res+=letra;
                            }else
                            {
                                    res += abc.charAt( (pos+ene) % abc.length());
                            }       
                    }
                    resultado.setText("Palabra cifrada:  "+res);
                } 
                catch (Exception i) 
                {
                    
                }
            }
        });  
        this.push_2.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                 String abc = "0123456789";
                 String res = "";
                 
                 String tex = "";
                 int ene = Integer.parseInt(n.getText());
                 char num;
                
                try     
                {
                    tex = numeros.getText();
                    for(int i =0;i < tex.length();i++)
                    {   
                        num = tex.charAt(i);
                        int pos = abc.indexOf(num); // 0 1 2 3
                            if(pos == -1)
                            {
                                    res+=num;
                            }else
                            {
                                    res += abc.charAt( (pos+ene) % abc.length());
                            }       
                    }
                    resultado.setText("Numero cifrado:  "+res);
                } 
                catch (Exception i) 
                {
                    
                }
            }
        });
        }
    
}
