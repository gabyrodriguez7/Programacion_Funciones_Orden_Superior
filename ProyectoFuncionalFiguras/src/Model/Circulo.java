package Model;

import java.awt.*;

public class Circulo implements IDrawable{
    @Override
    public void dibujar(Graphics g) {
        g.setColor(Color.magenta);
        g.fillOval(150, 100, 200, 200);
    }

}
