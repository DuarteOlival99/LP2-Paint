package pt.ulusofona.lp2.paint;

import pt.ulusofona.lp2.paint.provided.Screen;

import java.awt.*;

public class Rectangulo extends FiguraGeometrica {

    Rectangulo(int x, int y, int altura, int largura, Color cor) {
        super(x, y, altura, largura, cor);

    }

    public void pinta(Screen screen) {

        for (int posX = x; posX < x + largura; posX++) {
            for (int posY = y; posY < y + altura; posY++) {
                screen.drawPixel(posX, posY, cor);
            }
        }
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "x=" + x +
                ", y=" + y +
                ", altura=" + altura +
                ", largura=" + largura +
                ", cor=" + cor +
                '}';
    }

}
