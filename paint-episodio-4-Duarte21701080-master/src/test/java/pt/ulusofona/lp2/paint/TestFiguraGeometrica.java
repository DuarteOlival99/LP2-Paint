package pt.ulusofona.lp2.paint;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class TestFiguraGeometrica {

    @Test
    public void testMoveEsquerdaRectangulo() {

        // cria objecto inicial
        FiguraGeometrica figura;

        figura = new Rectangulo(20, 20, 30, 40,Color.RED);

        // executa acção sobre o objecto
        figura.moveEsquerda();

        // valida que o estado final é igual ao esperado
        int xEsperado = 19;  // se x estava a 10 e andamos para a esquerda, o x deverá passar a 9
        assertEquals(xEsperado, figura.x);
    }

    @Test
    public void testMoveEsquerdaQuadrado() {

        // cria objecto inicial
        FiguraGeometrica figura;

        figura = new Quadrado(20, 20, 30, 30, Color.RED);

        // executa acção sobre o objecto
        figura.moveEsquerda();

        // valida que o estado final é igual ao esperado
        int xEsperado = 19;  // se x estava a 10 e andamos para a esquerda, o x deverá passar a 9
        assertEquals(xEsperado, figura.x);
    }


    // testa que não é possível mover uma figura que já está encostada à beira do écran
    @Test
    public void testMoveEsquerdaParaForaDoEcranRectangulo() {
        // TODO implementar
        FiguraGeometrica figura;

        figura = new Rectangulo(0,1,20,30,Color.BLUE);
        figura.moveEsquerda();
        int xEsperado = 0;
        assertEquals(xEsperado,figura.x);
    }

    @Test
    public void testMoveEsquerdaParaForaDoEcranQuadrado() {
        // TODO implementar
        FiguraGeometrica figura;

        figura = new Quadrado(0,1,20, 20, Color.BLUE);
        figura.moveEsquerda();
        int xEsperado = 0;
        assertEquals(xEsperado,figura.x);
    }

    //moveDireita

    @Test
    public void testMoveDireitaRectangulo() {
        // TODO implementar

        // cria objecto inicial
        FiguraGeometrica figura;

        figura = new Rectangulo(10, 20, 30, 40,Color.RED);

        // executa acção sobre o objecto
        figura.moveDireita();

        // valida que o estado final é igual ao esperado
        int xEsperado = 11;  // se x estava a 10 e andamos para a direita, o x deverá passar a 11
        assertEquals(xEsperado, figura.x);
    }

    @Test
    public void testMoveDireitaQuadrado() {
        // TODO implementar

        // cria objecto inicial
        FiguraGeometrica figura;

        figura = new Quadrado(10, 20, 30, 30, Color.RED);

        // executa acção sobre o objecto
        figura.moveDireita();

        // valida que o estado final é igual ao esperado
        int xEsperado = 11;  // se x estava a 10 e andamos para a direita, o x deverá passar a 11
        assertEquals(xEsperado, figura.x);
    }

    // testa que não é possível mover uma figura que já está encostada à beira do écran
    @Test
    public void testMoveDireitaParaForaDoEcranRectangulo() {
        // TODO implementar
        FiguraGeometrica figura;

        figura = new Rectangulo(800,4,20,30,Color.BLUE);
        figura.moveDireita();
        int xEsperado = 800;
        assertEquals(xEsperado,figura.x);
    }

    @Test
    public void testMoveDireitaParaForaDoEcranQuadrado() {
        // TODO implementar
        FiguraGeometrica figura;

        figura = new Quadrado(800,4,20, 20, Color.BLUE);
        figura.moveDireita();
        int xEsperado = 800;
        assertEquals(xEsperado,figura.x);
    }

    //MoveCima

    @Test
    public void testMoveCimaRectangulo() {
        // TODO implementar

        // cria objecto inicial
        FiguraGeometrica figura;

        figura = new Rectangulo(10, 10, 30, 40,Color.RED);

        // executa acção sobre o objecto
        figura.moveCima();

        // valida que o estado final é igual ao esperado
        int YEsperado = 9;  // se y estava a 10 e andamos para a direita, o y deverá passar a 9
        assertEquals(YEsperado, figura.y);
    }

    @Test
    public void testMoveCimaQuadrado() {
        // TODO implementar

        // cria objecto inicial
        FiguraGeometrica figura;

        figura = new Quadrado(10, 10, 30, 30, Color.RED);

        // executa acção sobre o objecto
        figura.moveCima();

        // valida que o estado final é igual ao esperado
        int YEsperado = 9;  // se y estava a 10 e andamos para a direita, o y deverá passar a 9
        assertEquals(YEsperado, figura.y);
    }

    // testa que não é possível mover uma figura que já está encostada à beira do écran
    @Test
    public void testMoveCimaParaForaDoEcranRectangulo() {
        // TODO implementar
        FiguraGeometrica figura;

        figura = new Rectangulo(4,0,20,30,Color.BLUE);
        figura.moveCima();
        int YEsperado = 0;
        assertEquals(YEsperado,figura.y);
    }

    @Test
    public void testMoveCimaParaForaDoEcranQuadrado() {
        // TODO implementar
        FiguraGeometrica figura;

        figura = new Quadrado(4,0,20, 20, Color.BLUE);
        figura.moveCima();
        int YEsperado = 0;
        assertEquals(YEsperado,figura.y);
    }

    //moveBaixo

    @Test
    public void testMoveBaixoRectangulo() {
        // TODO implementar

        // cria objecto inicial
        FiguraGeometrica figura;

        figura = new Rectangulo(10, 10, 30, 40,Color.RED);

        // executa acção sobre o objecto
        figura.moveBaixo();

        // valida que o estado final é igual ao esperado
        int YEsperado = 11;  // se y estava a 10 e andamos para a direita, o y deverá passar a 11
        assertEquals(YEsperado, figura.y);
    }

    @Test
    public void testMoveBaixoQuadrado() {
        // TODO implementar

        // cria objecto inicial
        FiguraGeometrica figura;

        figura = new Quadrado(10, 10, 30, 30, Color.RED);

        // executa acção sobre o objecto
        figura.moveBaixo();

        // valida que o estado final é igual ao esperado
        int YEsperado = 11;  // se y estava a 10 e andamos para a direita, o y deverá passar a 11
        assertEquals(YEsperado, figura.y);
    }

    // testa que não é possível mover uma figura que já está encostada à beira do écran
    @Test
    public void testMoveBaixoParaForaDoEcranRectangulo() {
        // TODO implementar
        FiguraGeometrica figura;

        figura = new Rectangulo(4,600,20,30,Color.BLUE);
        figura.moveBaixo();
        int YEsperado = 600;
        assertEquals(YEsperado,figura.y);
    }

    @Test
    public void testMoveBaixoParaForaDoEcranQuadrado() {
        // TODO implementar
        FiguraGeometrica figura;

        figura = new Quadrado(4,600,20, 20, Color.BLUE);
        figura.moveBaixo();
        int YEsperado = 600;
        assertEquals(YEsperado,figura.y);
    }



    // TODO fazer o mesmo para os outros "move", incluindo casos fronteira

}
