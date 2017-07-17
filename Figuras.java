package planarity;

import java.awt.*;
import javax.swing.*;

public class Figuras extends JFrame {
    
    int posX1=0;
    int posY1=0;
    
    int posX2=0;
    int posY2=0;
    
    int diametro=0;
    
    public Figuras(int posX1, int posY1, int posX2, int posY2, int diametro){
    
        this.posX1 = posX1;
        this.posY1 = posY1;
        this.posX2 = posX2;
        this.posY2 = posY2;
        this.diametro = diametro;
        
    }
    
    public void dibujaCirculo(Graphics g){
    
        g.setColor(new Color(250,0,0)); //se dio un color (rojo) a lo siguiente que se dibuje
        g.fillOval(posX1, posY1, diametro, diametro); //se dibuja un circulo relleno
        
        g.setColor(new Color(0,0,0)); //se dio un color (negro) a lo siguiente que se dibuje
        g.drawOval(posX1, posY1, diametro, diametro); //se dibuja el contorno de un circulo
    
    }
    
     public void dibujaLinea(Graphics g){
        
        g.setColor(new Color(0,0,0)); //se escoje el color negro
        g.drawLine(posX1+15, posY1+15, posX2, posY2); //se dibuja una linea del color escojido
        
    }
    
    
}
