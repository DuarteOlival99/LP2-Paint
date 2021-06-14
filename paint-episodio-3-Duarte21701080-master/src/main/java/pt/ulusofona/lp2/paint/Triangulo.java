package pt.ulusofona.lp2.paint;

import pt.ulusofona.lp2.paint.provided.Screen;

import java.awt.*;

public class Triangulo {

    int x, y;   // coordenadas do canto superior esquerdo
    int largura, altura;
    Color cor;

    public Triangulo(int x, int y, int largura, int altura, Color cor) {
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
        this.cor = cor;
    }

    public String toString() {
        return "Adicionei Tringulo{ x=" + x + ", y=" + y + ", largura=" + largura + " , altura=" + altura + " , cor=" + cor + "}";
    }

    void moveCima() {
        if (this.y > altura) {
            this.y--;
        }
    }

    void moveBaixo() {
        if (this.y < AppLauncher.HEIGHT - altura) {
            this.y++;
        }
    }

    void moveEsquerda() {
        if (this.x > largura) {
            this.x--;
        }
    }

    void moveDireita() {
        if (this.x < AppLauncher.WIDTH - largura) {
            this.x++;
        }
    }

    static void criarTriangulo(int x, int y, Screen screen) {

        // get largura entre 150 e 10
        // cria um triangulo aleatorio entre 150 e 10 de altura
        int largura;
        do {
            largura = (int) (Math.random() * (149 - 10)) + 10;
        } while (largura % 2 != 0);

        int altura = (largura + 1) / 2;

        Triangulo triangulo = new Triangulo(x, y, altura, largura, AppLauncher.getCorAleatoria());

        int escolha = triangulo.pinta(screen);

        if(escolha==1){//cima
            AppLauncher.triangulosCima.add(triangulo);
        }else if(escolha==2){//direita
            AppLauncher.triangulosDireita.add(triangulo);
        }else if(escolha==3){//baixo
            AppLauncher.triangulosBaixo.add(triangulo);
        }else if(escolha==4){//esquerda
            AppLauncher.triangulosEsquerda.add(triangulo);
        }

        System.out.println(triangulo);

    }

    void pintaCima(Screen screen) {
        int count = -1;
        int posXEsquerda, posXDireita;
        Color cor=AppLauncher.getCorAleatoria();
        for (int posY = y; posY < y + altura; posY++) {
            count++;
            if(posY%20==0){
                cor = AppLauncher.getCorAleatoria();
            }
            for (posXEsquerda = x - count, posXDireita = x + count; posXEsquerda > x - ((largura + 1) / 2) && posXEsquerda <= posXDireita; posXEsquerda++) {
                screen.drawPixel(posXEsquerda, posY, cor);
            }
        }
    }

    void pintaEsquerda(Screen screen) {
        int count = -1;
        int posYEsquerda, posYDireita;
        for (int posX = x; posX < x + largura; posX++) {
            count++;
            Color cor=AppLauncher.getCorAleatoria();
            for (posYEsquerda = y - count, posYDireita = y + count; posYEsquerda > y - ((altura) / 2) && posYEsquerda <= posYDireita; posYEsquerda++) {
                screen.drawPixel(posX, posYEsquerda, cor);
            }
        }
    }

    void pintaDireita(Screen screen) {
        int count = -1;
        Color cor=AppLauncher.getCorAleatoria();
        for (int posX = x; posX < x + largura; posX++) {
            count++;
            if(posX%10==0){
                cor = AppLauncher.getCorAleatoria();
            }
            for (int posY = y + count; posY < y + altura - count; posY++) {
                screen.drawPixel(posX, posY, cor);
            }
        }
    }

    void pintaBaixo(Screen screen) {
        int count = -1;
        Color cor=AppLauncher.getCorAleatoria();
        for (int posY = y; posY < y + altura; posY++) {
            count++;
            if(posY==(y+altura)/2){
                cor = AppLauncher.getCorAleatoria();
            }
            for (int posX = x + count; posX < x + largura - count; posX++) {
                screen.drawPixel(posX, posY, cor);
            }
        }
    }

    int pinta(Screen screen) {

        int opcao = (int) (Math.random() * (5 - 1)) + 1;
        switch (opcao) {
            case 1: {//desenha triangulo com bico para cima-> feito
                pintaCima(screen);
                return opcao;
            }
            case 2: {//desenha triangulo com bico para a direita->feito
                pintaDireita(screen);
                return opcao;
            }
            case 3: {//desenha triangulo com bico para baixo->feito
                pintaBaixo(screen);
                return opcao;
            }
            case 4: {//desenha triangulo com bico para a esquerda
                pintaEsquerda(screen);
                return opcao;
            }
        }
        return 0;
    }
}
