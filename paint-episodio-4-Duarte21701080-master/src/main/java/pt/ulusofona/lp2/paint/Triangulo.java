package pt.ulusofona.lp2.paint;


import pt.ulusofona.lp2.paint.FiguraGeometrica;
import pt.ulusofona.lp2.paint.provided.Screen;

import java.awt.*;

public class Triangulo extends FiguraGeometrica {


    public Triangulo(int x, int y, int altura, int largura, Color cor){
        super(x,y,altura,altura,cor);
    }


    @Override
    public String toString() {
        return "Triangulo{" +
                "x=" + x +
                ", y=" + y +
                ", altura=" + altura +
                ", cor=" + cor +
                '}';
    }

    @Override
    public void rodaDireita(int posicao){
        if(posicao == 0){
            posicao++;
        }else if(posicao == 1){
            posicao++;
        }else if(posicao == 2){
            posicao++;
        }else if(posicao == 3){
            posicao = 0;
        }
        FiguraGeometrica.alteraPosicao(posicao);

    }

    private void pintaCima(Screen screen) {
        int count = -1;
        int posXEsquerda, posXDireita;

        for (int posY = y; posY < y + altura; posY++) {
            count++;

            for (posXEsquerda = x - count, posXDireita = x + count; posXEsquerda > x - ((largura + 1) / 2) && posXEsquerda <= posXDireita; posXEsquerda++) {
                screen.drawPixel(posXEsquerda, posY, cor);
            }
        }
    }

    private void pintaEsquerda(Screen screen) {
        int count = -1;
        int posYEsquerda, posYDireita;
        for (int posX = x; posX < x + largura; posX++) {
            count++;

            for (posYEsquerda = y - count, posYDireita = y + count; posYEsquerda > y - ((altura) / 2) && posYEsquerda <= posYDireita; posYEsquerda++) {
                screen.drawPixel(posX, posYEsquerda, cor);
            }
        }
    }

    private void pintaDireita(Screen screen) {
        int count = -1;

        for (int posX = x; posX < x + largura; posX++) {
            count++;

            for (int posY = y + count; posY < y + altura - count; posY++) {
                screen.drawPixel(posX, posY, cor);
            }
        }
    }

    private void pintaBaixo(Screen screen) {
        int count = -1;

        for (int posY = y; posY < y + altura; posY++) {
            count++;

            for (int posX = x + count; posX < x + largura - count; posX++) {
                screen.drawPixel(posX, posY, cor);
            }
        }
    }

    @Override
    public void pinta(Screen screen) {

        switch (FiguraGeometrica.getPosicao()){
            case 0:{
                pintaCima(screen);
                break;
            }
            case 1:{
                pintaDireita(screen);
                break;
            }
            case 2:{
                pintaBaixo(screen);
                break;
            }
            case 3:{
                pintaEsquerda(screen);
                break;
            }
        }
    }

}
