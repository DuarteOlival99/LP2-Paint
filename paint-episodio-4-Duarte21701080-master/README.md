# Paint (Episódio 4)

Aplicação de apoio à cadeira de Linguagens de Programação 2 da Universidade Lusófona.

## Requisitos do "cliente"

Esta semana, o cliente não nos pediu nada mas estamos com receio daquilo que ele possa vir a pedir.
Por isso, vamos melhorar a nossa aplicação para ser mais adaptável a futuros requisitos e ao mesmo tempo mais robusta.

Para começar, vamos eliminar a maior fonte de comichão, que ficou do episódio anterior no AppLauncher:

```java
static List<Quadrado> quadrados = new ArrayList<>();
static List<Rectangulo> rectangulos = new ArrayList<>();
```

Estas duas linhas estão mesmo a pedir sarilhos, se o cliente nos pedir outras figuras geométricas (triângulos, círculos, etc.)
O ideal seria ter uma lista única de figuras geométricas. Agora que aprendemos nas aulas a usar herança, esta parte
deverá ser fácil. Vamos também utilizar o mecanismo de classes abstractas e introduzir os modificadores de visibilidade.

Outra fonte de comichão é garantir que, se fizermos alterações no código, o que estava antes a funcionar continuará a funcionar. 
Por exemplo, queremos estar à vontade para acrescentar novas figuras geométricas sem ter medo que o 
"mover esquerda", "mover baixo", etc. deixem de funcionar. Para isto, vamos escrever alguns testes unitários.

## Como começar?

Ver instruções no episódio 1 - https://github.com/ULHT-LP2-2018-19/paint-episodio-1

## E depois?

Infelizmente, como rapidamente se aperceberão, a aplicação não está completa. 
Aliás, ela nem compila. 
O objectivo é torná-la compilável e a fazer o que o "cliente" pretende.

## Sugestão de passos a seguir

1. Resolver os erros de compilação. Vários erros de compilação têm a ver com o facto da classe Quadrado passar 
a herdar de Rectangulo. Mas a herança não foi implementada como deve ser...
1. Outra coisa que parece não ter ficado bem feita foi quando se adicionou modificadores de visibilidade 
nas variáveis e métodos da classe FiguraGeometrica. Será que estão correctos?
1. Surgiram também erros de compilação porque tornámos abstracto o método pinta() da FiguraGeometrica.
Será que ficou bem feito? Que implicações é que essa mudança teve no resto do código 
(nomeadamente no AppLauncher e nos testes)?
1. Agora que tudo compila, acaba de acrescentar os modificadores de visibilidade que achares necessários para 
garantir o princípio do encapsulamento.
1. Agora que já tudo funciona correctamente, vamos criar testes unitários para aumentar a robustez do nosso programa.
Alguém começou a fazer esse trabalho na classe TestFiguraGeometrica (está em /test/java/pt/lusofona/lp2/paint) 
mas o teste nem compila neste momento. Corrige os erros de compilação e corre os testes 
clicando com o botão direito nessa classe e escolhendo a opção 'Run TestFiguraGeometrica'. Poderás verificar que foram
corridos 3 testes mas na realidade, apenas um está correcto. Os outros 2 precisam de ser completados.
1. Após correres os 3 testes com sucesso, deverás acrescentar todos os outros testes. Em particular, é importante
garantir os casos "fronteira".  

## Tirar o coelho da cartola

É sempre uma boa ideia superar as expectativas do nosso cliente, surpreendendo-o com coisas giras que ele não pediu.

1. Agora que é fácil acrescentar novas figuras geométricas, tenta criar a classe Triangulo e todas as alterações 
necessárias para se poderem criar triângulos.
1. Pensa noutras figuras que fosse interessante acrescentar. Lembra-te que a dificuldade principal é
conseguir transpor a figura para um array 2D de pixeis.
1. Pode ser interessante acrescentar um atributo "filled: boolean" na FiguraGeometrica, que indica se a 
figura está toda pintada ou apenas o bordo da figura...
1. Outras ideias que aches interessantes...
