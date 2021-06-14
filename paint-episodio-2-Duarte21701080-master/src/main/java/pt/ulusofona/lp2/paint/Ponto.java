package pt.ulusofona.lp2.paint;

import pt.ulusofona.lp2.paint.provided.Screen;

import java.awt.*;
import java.util.Arrays;

public class Ponto {

    int x;
    int y;
    private Color cor;

    Ponto(int x, int y, Color cor) {
        this.x = x;
        this.y = y;
        this.cor = cor;
    }

    public String toString(){
        return "X: " + x + "|| Y: " + y + " || COR: " + cor ;
    }

    void moveCima() {
        this.y--;
    }

    void moveBaixo() {
        this.y++;
    }

    void moveDireita(){this.x++;}

    void moveEsquerda(){this.x--;}

    void moveEsquerdaCima(){ this.x--; this.y--;}

    void moveEsquerdaBaixo(){ this.x--; this.y++;}

    void moveDireitaCima(){ this.x++; this.y--;}

    void moveDireitaBaixo(){ this.x++; this.y++;}

    void novasCoordenadas(Ponto ponto){//escreve no ecra as coordenadas do ponto e a cor
        System.out.println(Arrays.toString(new Ponto[]{ponto}));
    }

    void pinta(Screen screen) {
        // desenha 5 pontos em forma de estrela para se ver melhor
        screen.drawPixel(x, y, cor);
        screen.drawPixel(x+1, y, cor);
        screen.drawPixel(x-1, y, cor);
        screen.drawPixel(x, y+1, cor);
        screen.drawPixel(x, y-1, cor);
    }
}
