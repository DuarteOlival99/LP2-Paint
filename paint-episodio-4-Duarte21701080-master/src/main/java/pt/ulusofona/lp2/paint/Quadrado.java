package pt.ulusofona.lp2.paint;

import pt.ulusofona.lp2.paint.provided.Screen;

import java.awt.*;

public class Quadrado extends Rectangulo {

    Quadrado(int x, int y, int altura, int largura, Color cor){super(x,y,altura,altura,cor); }

    @Override
    public String toString() {
        return "Quadrado{" +
                "x=" + x +
                ", y=" + y +
                ", altura=" + altura +
                ", cor=" + cor +
                '}';
    }

    public void pinta(Screen screen) {

            for (int posX = x; posX < x + altura; posX++) {
                for (int posY = y; posY < y + altura; posY++) {
                    screen.drawPixel(posX, posY, cor);
                }
            }

    }

}
