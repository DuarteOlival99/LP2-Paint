package pt.ulusofona.lp2.paint;

import pt.ulusofona.lp2.paint.provided.Screen;

import java.awt.*;

public class Quadrado {

    int x, y;   // coordenadas do canto superior esquerdo
    int altura;
    Color cor;

    public Quadrado(int x, int y, int altura, Color cor) {
        this.x=x;
        this.y=y;
        this.altura=altura;
        this.cor=cor;
    }

    public String toString() {
        return "Adicionei Quadrado{ x="+ x +", y=" + y+", altura="+ altura+", cor="+ cor +"}";}

    void moveCima() {
        if (this.y > 0) {
            this.y--;
        }
    }

    void moveBaixo() {
        if (this.y < AppLauncher.HEIGHT - altura) {
            this.y++;
        }
    }

    void moveEsquerda() {
        if (this.x > 0) {
            this.x--;
        }
    }

    void moveDireita() {
        if (this.x < AppLauncher.WIDTH - altura) {
            this.x++;
        }
    }

    static void criarQuadrado(int x, int y, Screen screen){
        //get altura entre 150 e 10
        // cria um quadrado aleatorio entre 150 e 10 e altura
        int altura = (int) (Math.random() * (150 - 10)) + 10;

        Quadrado quadrado = new Quadrado(x, y, altura, AppLauncher.getCorAleatoria());

        AppLauncher.quadrados.add(quadrado);
        quadrado.pintaCorAleatoria(screen);

        System.out.println(quadrado);
    }

    void pintaCorAleatoria(Screen screen){
        for (int posX = x; posX < x + altura; posX++) {
            for (int posY = y; posY < y + altura; posY++) {
                screen.drawPixel(posX, posY, AppLauncher.getCorAleatoria());
            }
        }
    }

    void pinta(Screen screen) {

        for (int posX = x; posX < x + altura; posX++) {
            for (int posY = y; posY < y + altura; posY++) {
                screen.drawPixel(posX, posY, cor);
            }
        }
    }


}
