package Model;

import java.awt.*;

public class Triangulo implements IDrawable{
    @Override
    public void dibujar(Graphics g) {
        g.setColor(Color.ORANGE);
        int[] x = {125, 250, 375};
        int[] y = {300, 100, 300};
        g.fillPolygon(x, y, 3);
    }
}
