package Model;

import java.awt.*;

public class Cuadrado implements IDrawable {
    @Override
    public void dibujar(Graphics g) {
        g.setColor(Color.pink);
        g.fillRect(150, 100, 200, 200);
    }

}
