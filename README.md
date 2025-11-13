# TrabalhoPOO2
Arquivos referentes ao 2º trabalho prático de Programação Orientada à Objetos.

# Corre Cabrito

Você deve criar um programa em Java referente a um jogo no qual um cabrito tenta fugir do ataquede um carcará: um pássaro malvado que tem o bico volteado que nem gavião .

O Corre Cabrito ocorre em uma área referente a um pentágono com alguns ajustes, sendo jogadoentre duas pessoas.

Um jogador controla o cabrito fujão (🐐) e outro controla o carcará caçador (🦅).

O objetivo do carcará é capturar o cabrito na menor quantidade de movimentos possível. A área e aconfiguração inicial do jogo são as seguintes:

<img width="257" height="220" alt="image" src="https://github.com/user-attachments/assets/90c93db1-366b-4b0a-a548-ac23e0f11b00" />

No exemplo acima, a imagem do pássaro representa o carcará e a imagem da cabra representa ocabrito, mas você pode usar letras para facilitar o trabalho como, por exemplo, (A) para o carcará e(C) para o cabrito. Como se pode observar, há um espaço central além dos quatro vértices dopentágono para serem ocupados no jogo. As linhas conectando esses espaços representam aspossibilidades de movimentação de qualquer uma das peças.

Todas as peças se movem um espaço adjacente por vez seguindo alguma das linhas que conecta doisespaços. É importante notar que o cabrito não pode em nenhum momento ocupar o mesmo espaço docarcará, senão é capturado e o jogo acaba. Os exemplos a seguir indicam os movimentos válidos(marcados em verde) para os jogadores dos espaços destacados em amarelo. Se ocorrer ummovimento para um espaço vermelho, o carcará captura o cabrito e o jogo termina.

<img width="756" height="229" alt="image" src="https://github.com/user-attachments/assets/163cdd7b-f91c-43db-8749-aea64fc5abb2" />

O esquema do jogo é o seguinte:
1. O jogo começa sempre com o jogador que controla o cabrito movendo ele para uma posiçãoque não cause sua captura.
2. O próximo movimento é do jogador que controla o carcará, movendo ele para uma posiçãoestratégica ou movendo ele diretamente para a captura do cabrito (se for possível).
3. O movimento seguinte é novamente do jogador que controla o cabrito.
4. O jogo segue dessa forma, alternando os turnos dos jogadores.
  
Um detalhe importante é que o jogador que controla o cabrito pode uma vez por partida usar um “super pulo” e se mover para qualquer espaço vazio na área de jogo, não importa a distância. Depois que o cabrito usa um super pulo, ele se cansa e não pode isso fazer novamente. 

O objetivo do jogo para o jogador do cabrito é fugir pela maior quantidade de tempo possível docarcará. 

O objetivo do jogo o jogador que controla o carcará é capturar o cabrito ocupando o mesmo espaçoque ele na área de jogo.
