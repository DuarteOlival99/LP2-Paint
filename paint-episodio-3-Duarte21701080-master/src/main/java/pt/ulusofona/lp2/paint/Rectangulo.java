package pt.ulusofona.lp2.paint;

import pt.ulusofona.lp2.paint.provided.Screen;

import java.awt.*;

public class Rectangulo {

    int x, y;   // coordenadas do canto superior esquerdo
    int altura, largura;
    Color cor;

    public Rectangulo(int x, int y, int altura,int largura, Color cor) {
        this.x=x;
        this.y=y;
        this.altura=altura;
        this.largura=largura;
        this.cor=cor;
    }

    public String toString() {
        return "Adicionei Rectangulo{ x="+ x +", y=" + y+", altura="+ altura+", largura="+ largura+", cor="+ cor +"}";}

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

    static void criarRectangulo(int x, int y, Screen screen) {

        //get altura entre 150 e 10
        // get largura entre 150 e 10
        // cria um resctangulo aleatorio entre 150 e 10 de altura e largura
        int altura;
        int largura;

        do {
            altura = (int) (Math.random() * (150 - 10)) + 10;
            largura = (int) (Math.random() * (150 - 10) + 10);
        }while (altura == largura);

        Rectangulo rectangulo = new Rectangulo(x, y, altura,largura, AppLauncher.getCorAleatoria());

        if(altura>largura){
            AppLauncher.rectangulosAltura.add(rectangulo);
            rectangulo.pintaCorAleatoriaVertical(screen);
        }else if(altura<largura){
            AppLauncher.rectangulosLargura.add(rectangulo);
            rectangulo.pintaCorAleatoriaHorizontal(screen);
        }

        System.out.println(rectangulo);

    }

    void pintaAleatorio(Screen screen){
        int escolha = (int) (Math.random() * (3 - 1)) + 1;
        switch (escolha){
            case 1:{
                pintaCorAleatoriaHorizontal(screen);
                break;
            }
            case 2:{
                pintaCorAleatoriaVertical(screen);
                break;
            }
        }
    }

    void pintaCorAleatoriaVertical(Screen screen){
        Color cor=AppLauncher.getCorAleatoria();
        for (int posX = x; posX < x + largura; posX++) {
            if(posX%3==0) {
                cor = AppLauncher.getCorAleatoria();
            }
            for (int posY = y; posY < y + altura; posY++) {
                screen.drawPixel(posX, posY, cor);
            }
        }
    }

    void pintaCorAleatoriaHorizontal(Screen screen){
        Color cor=AppLauncher.getCorAleatoria();
        for (int posY = y; posY < y + largura; posY++) {
            if(posY%5==0){
                cor = AppLauncher.getCorAleatoria();
            }
            for (int posX = x; posX < x + altura; posX++) {
                screen.drawPixel(posX, posY, cor);
            }
        }
    }

    void pinta(Screen screen) {

        for (int posX = x; posX < x + largura; posX++) {
            for (int posY = y; posY < y + altura; posY++) {
                screen.drawPixel(posX, posY, cor);
            }
        }
    }

}
