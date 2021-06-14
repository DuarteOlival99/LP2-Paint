package pt.ulusofona.lp2.paint;

import pt.ulusofona.lp2.paint.provided.Screen;

import java.awt.*;

public class Losango extends FiguraGeometrica {

    Losango(int x, int y, int altura, int largura, Color cor) {
        super(x, y, altura, largura, cor);

    }

    @Override
    public String toString(){
        return "Losango{" +
                "x=" + x +
                ", y=" + y +
                ", altura=" + altura +
                ", largura=" + largura +
                ", cor=" + cor +
                '}';
    }

    @Override
    public void pinta(Screen screen){
        int count = -1;
        int posXEsquerda, posXDireita;

        for (int posY = y; posY < y + altura/2; posY++) {
            count++;
            for (posXEsquerda = x - count, posXDireita = x + count; posXEsquerda > x - ((largura + 1) / 2) && posXEsquerda <= posXDireita; posXEsquerda++) {
                screen.drawPixel(posXEsquerda, posY, cor);
            }
            int count1 = -1;
            for (int posYY = y; posYY < y + altura/2; posYY++) {
                count1++;

                for (int posX = x + count1; posX < x + largura - count1; posX++) {
                    screen.drawPixel(posX, posYY, cor);
                }
            }
        }
    }
}
