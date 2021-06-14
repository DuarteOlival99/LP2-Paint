# Paint (Episódio 3)

Aplicação de apoio à cadeira de Linguagens de Programação 2 da Universidade Lusófona.

## Requisitos do "cliente"

O nosso "cliente" imaginário acha que os pontos não são muito interessantes e quer começar a 
brincar com figuras geométricas, nomeadamente quadrados e rectângulos. 
Ele quer acrescentar dois botões à barra de ferramentas: um para criar um quadrado com altura 50 
numa posição aleatória do écran e outro para criar um rectângulo com altura 70 e largura 30 numa 
posição aleatória do écran.
Também quer que as cores das várias figuras sejam aleatórias.
E, já que estão lá os botões com as setas, quer que elas passem a mover todas as figuras do écran.

## Como começar?

Ver instruções no episódio 1 - https://github.com/ULHT-LP2-2018-19/paint-episodio-1

## E depois?

Infelizmente, como rapidamente se aperceberão, a aplicação não está completa. 
Aliás, ela nem compila. 
O objectivo é torná-la compilável e a fazer o que o "cliente" pretende.

## Sugestão de passos a seguir

1. Resolver os erros de compilação
1. Correr a aplicação. 
1. Irás verificar que apenas é apresentado o botão de criar quadrado e não está a fazer nada.
    1. Existem dois TODOs na implementação da acção do botão que dão pistas sobre aquilo que é necessário fazer.
1. Agora já deve funcionar bem, mas os quadrados são sempre vermelhos e o cliente quer que sejam de uma côr aleatória. 
Para resolveres isso, lembra-te do que fizeste para que a côr do Ponto fosse aleatória...
1. Se reparares na consola do Intellij, aparece uma linha `Adicionei pt.ulusofona.lp2.paint.Quadrado@xxxxxxx` de cada 
vez que carregas no botão do quadrado. Lembra-te das aulas teóricas para perceberes porque é que ele escreve o Quadrado 
dessa forma e não de uma forma que seja mais compreensível. Corrige/acrescenta o que fôr necessário para resolver esse problema.
Ou seja, para aparecer algo do género `Adicionei Quadrado{x=236, y=441, altura=50, cor=java.awt.Color[r=182,g=93,b=165]}`
1. Agora experimenta criar 3 ou 4 quadrados e movê-los usando os botões das setas. Alguns funcionarão, outros nem por isso, 
por isso altera o que fôr necessário para todos funcionarem (nesta altura já nem preciso lembrar aquela 
parte de sair fora do écran, pois não?). Dica: Verifica os TODOs que estão na classe Quadrado.    
1. Implementar o botão para criar rectângulos. Lembra-te que há 3 passos:
    1. Criar a classe Rectangulo e todas as variáveis e métodos necessários (podes basear-te no Quadrado)
    1. Criar o botão em si. Dica: Olha para a pasta resources para veres se está lá algum ícone de um rectângulo.
    1. Adicionar o botão à barra de ferramentas.
    1. Definir o que acontece quando se carrega nesse botão.
    1. A certa altura vais perceber que precisavas de uma lista de rectangulos, parecida com a lista já existente de quadrados. 
    Por agora, não cries essa lista.
1. Após o passo anterior, já deves conseguir criar quadrados e rectângulos de diversas cores mas quando usas as setas
apenas moves os quadrados. Porquê?
1. Cria agora uma variável `rectangulos`, parecida com a variável `quadrados`.
1. Percorre a classe AppLauncher e altera todas as partes que usam a variável `quadrados` para
passarem a usar também a variável `rectangulos`.
1. Se completaste o passo anterior, tiveste uma trabalheira mas agora as setas funcionam quer para quadrados 
quer para rectangulos. Em breve, perceberás como podias ter feito o mesmo sem ter essa trabalheira.
1. O nosso paint está a ficar bastante complexo. Testa todos os botões e garante que a aplicação nunca lança excepções.

## Tirar o coelho da cartola

É sempre uma boa ideia superar as expectativas do nosso cliente, surpreendendo-o com coisas giras que ele não pediu.

Algumas ideias:

1. Em vez das medidas das figuras serem fixas, torna-as aleatórias, para teres um écran mais diversificado 
(por exemplo, teres um quadrado com 23 pixeis de altura, outro com 45 pixeis de altura, 
e um rectangulo com 11x20 e outro com 30x70). Tem o cuidado de garantir que a figura é criado 
dentro dos limites do écran
2. Se te sentes corajoso, experimenta adicionar botões para criar outras figuras geométricas. Lembra-te
que o segredo está na função pinta(Screen screen)
3. Outras que te lembres... 
