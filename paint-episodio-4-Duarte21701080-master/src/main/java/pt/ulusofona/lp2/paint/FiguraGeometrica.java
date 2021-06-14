package pt.ulusofona.lp2.paint;

import pt.ulusofona.lp2.paint.provided.Screen;

import java.awt.*;

public abstract class FiguraGeometrica {


    protected int x, y;// coordenadas do canto superior esquerdo
    protected int altura, largura;
    protected Color cor;
    private static int posicao= 0; //0->cima; 1->direita 2->baixo 3->Esquerda

    public FiguraGeometrica(int x, int y, int altura, int largura, Color cor) {
        this.x = x;
        this.y = y;
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
    }

    protected FiguraGeometrica() {
    }

    public static int getPosicao(){
        return posicao;
    }

    public static int alteraPosicao(int p1){
        return posicao=p1;
    }

    public void pintaTudoQuadrado(Screen screen){


        for (int posX = x; posX < x + altura; posX++) {
            for (int posY = y; posY < y + altura; posY++) {
                screen.drawPixel(posX, posY, cor);
            }
        }

    }

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
        if (this.x < AppLauncher.WIDTH - largura) {
            this.x++;
        }
    }

    public void rodaDireita(int p){
        alteraPosicao(p);
    }

    public abstract void pinta(Screen screen);

}
