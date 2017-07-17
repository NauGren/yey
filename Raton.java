package planarity;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Raton implements MouseMotionListener{

    
    Figuras Fig = new Figuras(120,50,50,120,30);
    
    @Override
    public void mouseDragged(MouseEvent e) {
        //System.out.println("hola");
        if(e.getX()==Fig.posX1 && e.getY()==Fig.posY1 && e.getX()==(Fig.posX1+30) && e.getY()==(Fig.posY1+30)){
            Fig.posX1 = e.getX();
            Fig.posY1 = e.getY();
            
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("(" + e.getX() + "," + e.getY() + ")");
    }
    
}
