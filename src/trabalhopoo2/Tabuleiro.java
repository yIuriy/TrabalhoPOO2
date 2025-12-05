package trabalhopoo2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import trabalhopoo2.exceptions.JogadaInvalidaException;
import trabalhopoo2.model.Animal;
import trabalhopoo2.model.Cabrito;
import trabalhopoo2.model.Carcara;

public final class Tabuleiro { 

    private final List<Posicao> posicoes = new ArrayList<>();
    private final Carcara carcara = new Carcara();
    private final Cabrito cabrito = new Cabrito();
    private boolean cabritoUsouSuperPulo = cabrito.isJaUsouSuperPulo();
    private boolean fimDoJogo = false;
    private int jogadas = 0;

    public Tabuleiro() {
        configurarPosicoes();
    }

    public Animal obterAnimalDaJogada() { // Sempre o cabrito começa
        if (jogadas % 2 == 0) {
            return cabrito;
        } else {
            return carcara;
        }
    }

    public boolean getFimJogo() {
        return fimDoJogo;
    }

    public void finalizarJogo() {
        fimDoJogo = true;
    }

    public int getJogadas() {
        return this.jogadas;
    }

    public boolean isCabritoUsouSuperPulo() {
        return cabritoUsouSuperPulo;
    }

    public void incrementarJogada() {
        jogadas++;
    }

    private void configurarPosicoes() { // Configura quais posições são válidas para cada posição, depois, seta os animais em suas posições iniciais
        posicoes.add(new Posicao(List.of(1, 2, 3))); // 0
        posicoes.add(new Posicao(List.of(0, 4))); // 1
        posicoes.add(new Posicao(List.of(0, 4, 5))); // 2
        posicoes.add(new Posicao(List.of(0, 5))); // 3
        posicoes.add(new Posicao(List.of(1, 2, 5))); // 4
        posicoes.add(new Posicao(List.of(2, 3, 4))); // 5

        posicoes.get(0).setAnimal(cabrito);
        posicoes.get(1).setAnimal(carcara);
    }

    public Posicao obterPosicaoCabrito() { 
        for (Posicao posicao : posicoes) {
            if (posicao.getAnimal() instanceof Cabrito) {
                return posicao;
            }
        }
        return null;
    }

    public Posicao obterPosicaoCarcara() {
        for (Posicao posicao : posicoes) {
            if (posicao.getAnimal() instanceof Carcara) {
                return posicao;
            }
        }
        return null;
    }

    public List<Posicao> getPosicoes() {
        return posicoes;
    }
    
    // Tenta mover o animal, também contempla a mecânica de super pulo
    // Lança exceções de jogada inválida caso necessário
    // Returna true caso o carcara tenha capturado o cabrito
    // Returna false caso contrário, continuando o jogo normalmente
    public boolean tentarMoverAnimal(int posicaoDesejada) { 
        int indexPosicaoDoAnimal = -1;
        for (int i = 0; i <= 5; i++) {
            if (posicoes.get(i).getAnimal() == obterAnimalDaJogada()) {
                indexPosicaoDoAnimal = i;
                break;
            }
        }
        if (obterAnimalDaJogada() == carcara && posicoes.get(indexPosicaoDoAnimal).verificarSeJogadaEValida(posicaoDesejada)) {
            if (posicoes.get(posicaoDesejada).getAnimal() == cabrito) {
                finalizarJogo();
                return true;
            }
            posicoes.get(indexPosicaoDoAnimal).setAnimal(null);
            posicoes.get(posicaoDesejada).setAnimal(carcara);

        } else if (obterAnimalDaJogada() == cabrito && (posicoes.get(posicaoDesejada).getAnimal() == null)) {
            if (posicoes.get(indexPosicaoDoAnimal).verificarSeJogadaEValida(posicaoDesejada)) {

            } else if (!cabritoUsouSuperPulo) {

                int resposta = JOptionPane.showConfirmDialog(
                        null,
                        "Deseja usar o Super Pulo?",
                        "Confirmação",
                        JOptionPane.YES_NO_OPTION
                );

                if (resposta == JOptionPane.YES_OPTION) {
                    cabritoUsouSuperPulo = true;
                    cabrito.setJaUsouSuperPulo(cabritoUsouSuperPulo);
                } else {
                    // Não muito semântico, mas ia dar muito trabalho refatorar
                    throw new JogadaInvalidaException("Super Pulo cancelado!");
                }
            } else {
                throw new JogadaInvalidaException("Cabrito já usou o super pulo!");
            }

            posicoes.get(indexPosicaoDoAnimal).setAnimal(null);
            posicoes.get(posicaoDesejada).setAnimal(cabrito);
        } else {
            throw new JogadaInvalidaException("Posição não alcançável ou inválida!");
        }
        return false;
    }
}
