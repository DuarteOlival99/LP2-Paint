# Paint (Episódio 2)

Aplicação de apoio à cadeira de Linguagens de Programação 2 da Universidade Lusófona.

## Requisitos do "cliente"

O nosso "cliente" imaginário afinal não gosta de desenhar linhas no écran. 
Ele prefere ter 10 pontos que se movem no écran de forma sincronizada, clicando nos botões criados anteriormente.

## Como começar?

Ver instruções no episódio 1 - https://github.com/ULHT-LP2-2018-19/paint-episodio-1

## E depois?

Infelizmente, como rapidamente se aperceberão, a aplicação não está completa. 
Aliás, ela nem compila. 
O objectivo é torná-la compilável e a fazer o que o "cliente" pretende.

## Sugestão de passos a seguir

1. Resolver os erros de compilação
1. Correr a aplicação. Irás verificar que o único botão que funciona é a seta para cima.
1. Implementar os restantes botões. Em particular, verifica se a seta para baixo faz o que é suposto.
1. O que acontece quando carregas num desses botões tanto que a linha chega ao fim do écran? 
O programa começa a dar erros, conforme podes verificar na consola do Intellij.
1. Altera o programa de forma a que deixe de dar erros, verificando se a acção do botão fará com que 
algum dos pontos saia fora do écran. Nesse caso, o ponto deve ficar no sítio onde está mas os outros continuam a mover-se.
Dica: Lembra-te das constantes WIDTH e HEIGHT
1. Altera o programa de forma a que o Paint desenhe 15 pontos, em vez de 10. Quantas linhas tiveste que alterar? 
Se foram mais do que 2 linhas, fizeste alguma coisa mal...

## Tirar o coelho da cartola

É sempre uma boa ideia superar as expectativas do nosso cliente, surpreendendo-o com coisas giras que ele não pediu.

Algumas ideias:

1. Cada ponto podia ter uma côr diferente. 
    1. Começa por alterar o construtor do Ponto para receber também um côr.
    1. Altera a classe Ponto para guardar essa côr
    1. Altera o método `pinta()` para usar essa côr
    1. Finalmente, usa o método `getCorAleatoria()` do AppLaucher para criares côres aleatórias 
1. Para facilitar o diagnóstico de problemas, pode-se escrever para a consola (usando o `System.out.println`) os dados
de cada Ponto, de cada vez que se carrega num botão
    1. Gera a função `toString` para a classe Ponto
    1. No final de cada acção do botão, manda escrever para o écran o array de pontos. Dica: Usa a função `Arrays.toString()`.
