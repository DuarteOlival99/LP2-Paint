package pt.ulusofona.lp2.paint;


import pt.ulusofona.lp2.paint.provided.Screen;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.TimerTask;

public class AppLauncher {

    static final int WIDTH = 800;  // largura da área pintável
    static final int HEIGHT = 600;  // altura da área pintável

    static java.util.List<FiguraGeometrica> figuras = new ArrayList<>();

    static void createAndShowGUI() {

        // inicializa a janela do Paint
        JFrame frame = new JFrame("Paint (Episódio 5)");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.getContentPane().setLayout(new BorderLayout());

        // inicializa a área "pintável" do Paint
        Screen screen = new Screen(WIDTH, HEIGHT);
        screen.reset();
        frame.getContentPane().add(screen, BorderLayout.CENTER);

        // inicializa a barra de ferramentas
        JToolBar toolBar = criaBarraFerramentas(frame);

        // crio um botão para adicionar quadrados
        JButton criaQuadradoBtn = new JButton(getIcon("icon_quadrado.png"));
        toolBar.add(criaQuadradoBtn);

        // crio um botão para adicionar rectângulos
        JButton criaRectanguloBtn = new JButton(getIcon("icon_rectangulo.png"));
        toolBar.add(criaRectanguloBtn);

        // crio um botao para adicionar triangulos
        JButton criarTrianguloBtn = new JButton(getIcon("icon_triangle_random.png"));
        toolBar.add(criarTrianguloBtn);

        //crio um botao para adicionar losangos
        JButton criarLosangoBtn = new JButton(getIcon("icon_losango.png"));
        toolBar.add(criarLosangoBtn);

        JButton moveEsquerdaBtn = new JButton(getIcon("icon_left.png"));
        toolBar.add(moveEsquerdaBtn);
        JButton moveDireitaBtn = new JButton(getIcon("icon_right.png"));
        toolBar.add(moveDireitaBtn);
        JButton moveBaixoBtn = new JButton(getIcon("icon_down.png"));
        toolBar.add(moveBaixoBtn);
        JButton moveCimaBtn = new JButton(getIcon("icon_up.png"));
        toolBar.add(moveCimaBtn);
        JButton rodaDireita = new JButton(getIcon("icon_triangle_rodaDireita.png"));
        toolBar.add(rodaDireita);
        JButton apagaEcra = new JButton(getIcon("icon_apaga_ecra.png"));
        toolBar.add(apagaEcra);
        JButton tudoQuadrado = new JButton(getIcon("icon_tudo_quadrado.png"));
        toolBar.add(tudoQuadrado);
        JButton xuricanTriangulo = new JButton(getIcon("icon_triangle_xurican.png"));
        toolBar.add(xuricanTriangulo);


        // mostra no écran o Paint
        frame.pack();
        frame.setVisible(true);

        // define o que acontece quando se carrega no botão "criaQuadradoBtn"
        criaQuadradoBtn.addActionListener(event -> {

            // gera uma altura aleatória entre 30 e 80
            int altura = (int) (Math.random() * 50) + 30;

            // gera um par do coordenadas aleatórias
            int x = (int) (Math.random() * (WIDTH - altura));
            int y = (int) (Math.random() * (HEIGHT - altura));

            Quadrado quadrado = new Quadrado(x, y, altura,altura, getCorAleatoria());

            figuras.add(quadrado);

            quadrado.pinta(screen);

            System.out.println("Adicionei " + quadrado);
        });

        // define o que acontece quando se carrega no botão "criaRectanguloBtn"
        criaRectanguloBtn.addActionListener(event -> {

            // gera uma altura aleatória entre 30 e 80
            int altura = (int) (Math.random() * 50) + 30;

            // gera uma largura aleatória entre 30 e 80
            int largura = (int) (Math.random() * 50) + 30;

            // gera um par do coordenadas aleatórias
            int x = (int) (Math.random() * (WIDTH - altura));
            int y = (int) (Math.random() * (HEIGHT - largura));

            Rectangulo rectangulo = new Rectangulo(x, y, altura, largura, getCorAleatoria());

            figuras.add(rectangulo);

            rectangulo.pinta(screen);

            System.out.println("Adicionei " + rectangulo);
        });

        //define p que acontece quando se carrega no botao "criarTrianguloBtn"
        criarTrianguloBtn.addActionListener(event -> {

            // get largura entre 80 e 30
            // cria um triangulo aleatorio entre 80 e 30 de altura
            int largura;
            do {
                largura = (int) (Math.random() * (79 - 30)) + 30;
            } while (largura % 2 != 0);

            int altura = (largura + 1) / 2;

            // gera um par do coordenadas aleatórias
            int x = (int) (Math.random() * (WIDTH - altura));
            int y = (int) (Math.random() * (HEIGHT - largura));

            Triangulo triangulo = new Triangulo(x, y, altura, largura, getCorAleatoria());

            figuras.add(triangulo);

            triangulo.pinta(screen);

            System.out.println("Adicionei " + triangulo);
        });

        //define o que acontece qunado se carrega no botao "criarLosangoBtn"
        criarLosangoBtn.addActionListener(event -> {

            // gera uma altura aleatória entre 30 e 80
            int altura = (int) (Math.random() * 50) + 30;

            // gera uma largura aleatória entre 30 e 80
            int largura = (int) (Math.random() * 50) + 30;

            // gera um par do coordenadas aleatórias
            int x = (int) (Math.random() * (WIDTH - altura));
            int y = (int) (Math.random() * (HEIGHT - largura));

            Losango losango = new Losango(x, y, altura, largura, getCorAleatoria());

            figuras.add(losango);

            losango.pinta(screen);

            System.out.println("Adicionei " + losango);
        });

        // define o que acontece quando se carrega no botão "moveEsquerdaBtn"
        moveEsquerdaBtn.addActionListener(event -> {
            screen.reset();  // primeiro limpar o écran anterior
            for (FiguraGeometrica figura: figuras) {
                figura.moveEsquerda();
                figura.pinta(screen);
            }
        });

        // define o que acontece quando se carrega no botão "moveDireitaBtn"
        moveDireitaBtn.addActionListener(event -> {
            screen.reset();  // primeiro limpar o écran anterior
            for (FiguraGeometrica figura: figuras) {
                figura.moveDireita();
                figura.pinta(screen);
            }

        });

        // define o que acontece quando se carrega no botão "moveBaixoBtn"
        moveBaixoBtn.addActionListener(event -> {
            screen.reset();  // primeiro limpar o écran anterior
            for (FiguraGeometrica figura: figuras) {
                figura.moveBaixo();
                figura.pinta(screen);
            }

        });

        // define o que acontece quando se carrega no botão "moveCimaBtn"
        moveCimaBtn.addActionListener(event -> {
            screen.reset();  // primeiro limpar o écran anterior
            for (FiguraGeometrica figura: figuras) {
                figura.moveCima();
                figura.pinta(screen);
            }

        });

        // define o que acontece quando se carrega no botao "rodaDireita"
        rodaDireita.addActionListener(event -> {
            screen.reset();
            int posicao = FiguraGeometrica.getPosicao();
            for(FiguraGeometrica figura: figuras){
            figura.rodaDireita(posicao);
            figura.pinta(screen);
            }
        });

        //botao"apagaEcra"
        apagaEcra.addActionListener(event -> {

            screen.reset();
            figuras.clear();
            screen.repaint();

        });

        //botao mete todas as figuras a quadrados "tudoQuadrado"
        tudoQuadrado.addActionListener(event -> {

            screen.reset();
            for (FiguraGeometrica figura: figuras){
                figura.pintaTudoQuadrado(screen);
            }

        });

        //botao faz xurican "xuricanTriangulo"
        xuricanTriangulo.addActionListener(event -> {

            TimerTask timerTask = new TimerTask() {
                int count = 0;

                @Override
                public void run() {
                    int posicao = FiguraGeometrica.getPosicao();
                    screen.reset();
                    for (FiguraGeometrica figura: figuras){
                        figura.rodaDireita(posicao);
                        figura.pinta(screen);
                    }
                    // aquilo que queres repetir aqui
                    count++;
                    System.out.println("count = " + count);
                    if (count == 100) {  // repete até chegar a X
                        cancel();
                    }
                }
            };
            java.util.Timer timer = new java.util.Timer();
            timer.scheduleAtFixedRate(timerTask, 0, 30);  // initialDelay=0ms, runs every 1000 ms

        });

        
    }

    static JToolBar criaBarraFerramentas(JFrame frame) {
        JToolBar toolBar = new JToolBar();
        frame.getContentPane().add(toolBar, BorderLayout.WEST);
        toolBar.setLayout(new GridLayout(10, 1, 0, 5));
        toolBar.setFloatable(false);
        toolBar.setBorderPainted(true);
        toolBar.setMargin(new Insets(10, 5, 10, 5));
        return toolBar;
    }

    static ImageIcon getIcon(String iconName) {
        return new ImageIcon(AppLauncher.class.getResource("/" + iconName));
    }

    // esta função retorna uma côr aleatória
    static Color getCorAleatoria() {
        return new Color(new Random().nextInt(0xFFFFFF));
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

}
