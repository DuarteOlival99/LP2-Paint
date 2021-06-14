package pt.ulusofona.lp2.paint;

import pt.ulusofona.lp2.paint.provided.Screen;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class AppLauncher {

    static final int WIDTH = 800;  // altura da área pintável
    static final int HEIGHT = 600;  // largura da área pintável

    static java.util.List<Quadrado> quadrados = new ArrayList<>();
    static java.util.List<Rectangulo> rectangulosAltura = new ArrayList<>();
    static java.util.List<Rectangulo> rectangulosLargura = new ArrayList<>();
    static java.util.List<Triangulo> triangulosCima = new ArrayList<>();
    static java.util.List<Triangulo> triangulosDireita = new ArrayList<>();
    static java.util.List<Triangulo> triangulosBaixo = new ArrayList<>();
    static java.util.List<Triangulo> triangulosEsquerda = new ArrayList<>();


    static void createAndShowGUI() {

        // inicializa a janela do Paint
        JFrame frame = new JFrame("Paint (Episódio 3)");
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
        JButton criaRectanguloBtn = new JButton(getIcon("icon_rectangulo.png"));
        toolBar.add(criaRectanguloBtn);
        JButton moveEsquerdaBtn = new JButton(getIcon("icon_left.png"));
        toolBar.add(moveEsquerdaBtn);
        JButton moveDireitaBtn = new JButton(getIcon("icon_right.png"));
        toolBar.add(moveDireitaBtn);
        JButton moveBaixoBtn = new JButton(getIcon("icon_down.png"));
        toolBar.add(moveBaixoBtn);
        JButton moveCimaBtn = new JButton(getIcon("icon_up.png"));
        toolBar.add(moveCimaBtn);
        JButton criaQuadradoRandomBtn = new JButton(getIcon("icon_quadrado_random.png"));
        toolBar.add(criaQuadradoRandomBtn);
        JButton criaRectanguloRandomBtn = new JButton(getIcon("icon_rectangulo_random.png"));
        toolBar.add(criaRectanguloRandomBtn);
        JButton criarTrianguloRandomBtn = new JButton(getIcon("icon_triangle_random.png"));
        toolBar.add(criarTrianguloRandomBtn);
        JButton criarQRTRandomBtn = new JButton(getIcon("icon_random.png"));
        toolBar.add(criarQRTRandomBtn);
        JButton criarCascata4sizesBtn = new JButton(getIcon("Snowflake.png"));
        toolBar.add(criarCascata4sizesBtn);

        // mostra no écran o Paint
        frame.pack();
        frame.setVisible(true);

        //define o que acontece quando se carrega no botao"criarCascata4sizesBtn"
        criarCascata4sizesBtn.addActionListener(event -> {

            Botao.botaoCriarCascata4sizesBtn(screen);

        });

        //define o que acontece quando se carrega no botao"criarQRTRandomBtn"
        criarQRTRandomBtn.addActionListener(event -> {

            Botao.botaoCriarQRTRandomBtn(screen);

        });

        // define o que acontece quando se carrega no botão "criaQuadradoBtn"
        criaQuadradoBtn.addActionListener(event -> {

            Botao.botaoCriaQuadradoBtn(screen);

        });

        // define o que acontece quando se carrega no botão "criaRectanguloBtn"
        criaRectanguloBtn.addActionListener(event -> {

            Botao.botaoCriaRectanguloBtn(screen);

        });

        // define o que acontece quando se carrega no botão "criaQuadradoRandomBtn"
        criaQuadradoRandomBtn.addActionListener(event -> {

           Botao.botaoCriaQuadradoRandomBtn(screen);

        });

        // define o que acontece quando se carrega no botão "criaRectanguloRandomBtn"
        criaRectanguloRandomBtn.addActionListener(event -> {

            Botao.botaoCriaRectanguloRandomBtn(screen);

        });

        // define o que acontece quando se carrega no botão "criaTrianguloRandomBtn"
        criarTrianguloRandomBtn.addActionListener(event ->  {

            Botao.botaoCriaTrianguloRandomBtn(screen);

        });

        // define o que acontece quando se carrega no botão "moveEsquerdaBtn"
        moveEsquerdaBtn.addActionListener(event -> {

            Botao.botaoMoveEsquerda(screen);

        });

        // define o que acontece quando se carrega no botão "moveDireitaBtn"
        moveDireitaBtn.addActionListener(event -> {

            Botao.botaoMoveDireita(screen);

        });

        // define o que acontece quando se carrega no botão "moveBaixoBtn"
        moveBaixoBtn.addActionListener(event -> {

            Botao.botaoMoveBaixo(screen);

        });

        // define o1 que acontece quando se carrega no botão "moveCimaBtn"
        moveCimaBtn.addActionListener(event -> {

            Botao.botaoMoveCima(screen);

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
