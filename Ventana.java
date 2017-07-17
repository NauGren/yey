
package planarity;

import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana extends JPanel{

    JFrame F;
    Figuras Fig;
    //JButton boton;
    
    public Ventana(){
    
            super();
            F = new JFrame();
            F.setSize(500, 500);
            F.setDefaultCloseOperation(EXIT_ON_CLOSE);
            F.setLocationRelativeTo(null);
            F.setResizable(false);
            setSize(500, 500);
            setVisible(true);
            F.setBackground(Color.white);
            F.setVisible(true);
            F.add(this);
            Fig = new Figuras(120,50,50,120,30);
            Raton Ra = new Raton();
            addMouseMotionListener(Ra);
            /*boton = new JButton("Verificar");
            boton.setSize(90, 70);
            boton.setLocation(380, 250);
            boton.setVisible(true);
            add(boton);
            F.add(boton);
            leBoton();*/
    
    }
    
    public void paint(Graphics g){
        
        Fig.dibujaLinea(g);
        Fig.dibujaCirculo(g);
        repaint();
    }
    
    /*public void leBoton(){
    
        boton.addMouseListener(new MouseAdapter(){
        
            public void mouseEntered(MouseEvent e){
                F.setBackground(Color.yellow);
            }
            
        });
    }*/
    
    public static void main(String[] args) {
       
        Ventana ventana = new Ventana();
        
    }
    
}
