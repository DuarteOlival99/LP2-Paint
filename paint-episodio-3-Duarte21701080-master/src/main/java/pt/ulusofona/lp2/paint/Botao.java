package pt.ulusofona.lp2.paint;

import pt.ulusofona.lp2.paint.provided.Screen;

import javax.swing.*;

public class Botao {

    static void botaoMoveCima(Screen screen){
        screen.reset();  // primeiro limpar o écran anterior
        for (Quadrado quadrado : AppLauncher.quadrados) {
            quadrado.moveCima();
            quadrado.pintaCorAleatoria(screen);
        }
        for (Rectangulo rectangulo : AppLauncher.rectangulosAltura) {
            rectangulo.moveCima();
            rectangulo.pintaCorAleatoriaVertical(screen);
        }
        for (Rectangulo rectangulo : AppLauncher.rectangulosLargura) {
            rectangulo.moveCima();
            rectangulo.pintaCorAleatoriaHorizontal(screen);
        }
        //mover triangulos conforme o bico
        for (Triangulo triangulo : AppLauncher.triangulosCima) {
            triangulo.moveCima();
            triangulo.pintaCima(screen);
        }
        for (Triangulo triangulo : AppLauncher.triangulosBaixo) {
            triangulo.moveCima();
            triangulo.pintaBaixo(screen);
        }
        for (Triangulo triangulo : AppLauncher.triangulosDireita) {
            triangulo.moveCima();
            triangulo.pintaDireita(screen);
        }
        for (Triangulo triangulo : AppLauncher.triangulosEsquerda) {
            triangulo.moveCima();
            triangulo.pintaEsquerda(screen);
        }
    }
    static void botaoMoveBaixo(Screen screen){
        screen.reset();  // primeiro limpar o écran anterior
        for (Quadrado quadrado: AppLauncher.quadrados) {
            quadrado.moveBaixo();
            quadrado.pintaCorAleatoria(screen);
        }
        for(Rectangulo rectangulo: AppLauncher.rectangulosAltura){
            rectangulo.moveBaixo();
            rectangulo.pintaCorAleatoriaVertical(screen);
        }
        for(Rectangulo rectangulo: AppLauncher.rectangulosLargura){
            rectangulo.moveBaixo();
            rectangulo.pintaCorAleatoriaHorizontal(screen);
        }
        //mover triangulos conforme o bico
        for(Triangulo triangulo: AppLauncher.triangulosCima){
            triangulo.moveBaixo();
            triangulo.pintaCima(screen);
        }
        for(Triangulo triangulo: AppLauncher.triangulosBaixo){
            triangulo.moveBaixo();
            triangulo.pintaBaixo(screen);
        }for(Triangulo triangulo: AppLauncher.triangulosDireita){
            triangulo.moveBaixo();
            triangulo.pintaDireita(screen);
        }
        for(Triangulo triangulo: AppLauncher.triangulosEsquerda){
            triangulo.moveBaixo();
            triangulo.pintaEsquerda(screen);
        }
    }
    static void botaoMoveDireita(Screen screen){
        screen.reset();  // primeiro limpar o écran anterior
        for (Quadrado quadrado: AppLauncher.quadrados) {
            quadrado.moveDireita();
            quadrado.pintaCorAleatoria(screen);
        }
        for(Rectangulo rectangulo: AppLauncher.rectangulosAltura){
            rectangulo.moveDireita();
            rectangulo.pintaCorAleatoriaVertical(screen);
        }
        for(Rectangulo rectangulo: AppLauncher.rectangulosLargura){
            rectangulo.moveDireita();
            rectangulo.pintaCorAleatoriaHorizontal(screen);
        }
        //mover triangulos conforme o bico
        for(Triangulo triangulo: AppLauncher.triangulosCima){
            triangulo.moveDireita();
            triangulo.pintaCima(screen);
        }
        for(Triangulo triangulo: AppLauncher.triangulosBaixo){
            triangulo.moveDireita();
            triangulo.pintaBaixo(screen);
        }for(Triangulo triangulo: AppLauncher.triangulosDireita){
            triangulo.moveDireita();
            triangulo.pintaDireita(screen);
        }
        for(Triangulo triangulo: AppLauncher.triangulosEsquerda){
            triangulo.moveDireita();
            triangulo.pintaEsquerda(screen);
        }
    }
    static void botaoMoveEsquerda(Screen screen){
        screen.reset();  // primeiro limpar o écran anterior
        for (Quadrado quadrado: AppLauncher.quadrados) {
            quadrado.moveEsquerda();
            quadrado.pintaCorAleatoria(screen);
        }
        for(Rectangulo rectangulo: AppLauncher.rectangulosAltura){
            rectangulo.moveEsquerda();
            rectangulo.pintaCorAleatoriaVertical(screen);
        }
        for(Rectangulo rectangulo: AppLauncher.rectangulosLargura){
            rectangulo.moveEsquerda();
            rectangulo.pintaCorAleatoriaHorizontal(screen);
        }
        //mover triangulos conforme o bico
        for(Triangulo triangulo: AppLauncher.triangulosCima){
            triangulo.moveEsquerda();
            triangulo.pintaCima(screen);
        }
        for(Triangulo triangulo: AppLauncher.triangulosBaixo){
            triangulo.moveEsquerda();
            triangulo.pintaBaixo(screen);
        }for(Triangulo triangulo: AppLauncher.triangulosDireita){
            triangulo.moveEsquerda();
            triangulo.pintaDireita(screen);
        }
        for(Triangulo triangulo: AppLauncher.triangulosEsquerda){
            triangulo.moveEsquerda();
            triangulo.pintaEsquerda(screen);
        }
    }
    static void botaoCriaTrianguloRandomBtn(Screen screen){
        // gera um par do coordenadas aleatórias
        int x = (int) (Math.random() * (AppLauncher.WIDTH - 150));
        int y = (int) (Math.random() * (AppLauncher.HEIGHT - 150));

        Triangulo.criarTriangulo(x,y,screen);
    }
    static void botaoCriaRectanguloRandomBtn(Screen screen){
        // gera um par do coordenadas aleatórias
        int x = (int) (Math.random() * (AppLauncher.WIDTH - 150));
        int y = (int) (Math.random() * (AppLauncher.HEIGHT - 150));

        Rectangulo.criarRectangulo(x,y,screen);
    }
    static void botaoCriaQuadradoRandomBtn(Screen screen){
        // gera um par do coordenadas aleatórias
        int x = (int) (Math.random() * (AppLauncher.WIDTH - 150));
        int y = (int) (Math.random() * (AppLauncher.HEIGHT - 150));

        Quadrado.criarQuadrado(x,y,screen);
    }
    static void botaoCriaRectanguloBtn(Screen screen){
        // gera um par do coordenadas aleatórias
        int x = (int) (Math.random() * (AppLauncher.WIDTH - 50));
        int y = (int) (Math.random() * (AppLauncher.HEIGHT - 50));

        Rectangulo rectangulo = new Rectangulo(x, y, 30,50, AppLauncher.getCorAleatoria());

        // TODO: Adiciona este quadrado à lista de quadrados (variável 'rectangulos')
        AppLauncher.rectangulosLargura.add(rectangulo);

        // TODO: pinta o quadrado no écran
        rectangulo.pinta(screen);

        System.out.println("Adicionei " + rectangulo);
    }
    static void botaoCriaQuadradoBtn(Screen screen){
        // gera um par do coordenadas aleatórias
        int x = (int) (Math.random() * (AppLauncher.WIDTH - 50));
        int y = (int) (Math.random() * (AppLauncher.HEIGHT - 50));

        Quadrado quadrado = new Quadrado(x, y, 50, AppLauncher.getCorAleatoria());

        // TODO: Adiciona este quadrado à lista de quadrados (variável 'quadrados')
        AppLauncher.quadrados.add(quadrado);

        // TODO: pinta o quadrado no écran
        quadrado.pinta(screen);

        System.out.println("Adicionei " + quadrado);
    }
    static void botaoCriarQRTRandomBtn(Screen screen){
        int opcao = (int) (Math.random() * (4 - 1)) + 1;
        switch (opcao) {
            case 1:{//quadrado

                int random = (int) (Math.random() * (4 - 1)) + 1;
                for(int i=0;i<random;i++) {
                    // gera um par do coordenadas aleatórias
                    int x = (int) (Math.random() * (AppLauncher.WIDTH - 150));
                    int y = (int) (Math.random() * (AppLauncher.HEIGHT - 150));
                    Quadrado.criarQuadrado(x, y, screen);
                }
                break;

            }
            case 2:{//rectangulo

                int random = (int) (Math.random() * (4 - 1)) + 1;
                for(int i=0;i<random;i++) {
                    // gera um par do coordenadas aleatórias
                    int x = (int) (Math.random() * (AppLauncher.WIDTH - 150));
                    int y = (int) (Math.random() * (AppLauncher.HEIGHT - 150));
                    Rectangulo.criarRectangulo(x, y, screen);
                }
                break;

            }
            case 3:{//triangulo

                int random = (int) (Math.random() * (4 - 1)) + 1;
                for(int i=0;i<random;i++) {
                    // gera um par do coordenadas aleatórias
                    int x = (int) (Math.random() * (AppLauncher.WIDTH - 150));
                    int y = (int) (Math.random() * (AppLauncher.HEIGHT - 150));
                    Triangulo.criarTriangulo(x, y, screen);
                }
                break;

            }

        }
    }
    static void botaoCriarCascata4sizesBtn(Screen screen){
       int opcao = (int) (Math.random() * (5 - 1)) + 1;
       switch (opcao) {
           case 1:{//move tudo para cima
               new Timer(100, event1 -> {  // corre este bloco de código a cada 100 ms
                   Botao.botaoMoveCima(screen);
               }).start();
               break;
           }
           case 2:{//move tudo para baixo
               new Timer(100, event1 -> {  // corre este bloco de código a cada 100 ms
                   Botao.botaoMoveBaixo(screen);
               }).start();
               break;
           }
           case 3:{//move tudo para direita
               new Timer(100, event1 -> {  // corre este bloco de código a cada 100 ms
                   Botao.botaoMoveDireita(screen);
               }).start();
               break;
           }
           case 4:{//move tudo para esquerda
               new Timer(100, event1 -> {  // corre este bloco de código a cada 100 ms
                   Botao.botaoMoveEsquerda(screen);
               }).start();
               break;
           }

       }
   }


}