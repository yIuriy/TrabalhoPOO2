/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import trabalhopoo2.exceptions.JogadaInvalidaException;
import trabalhopoo2.model.Animal;
import trabalhopoo2.model.Cabrito;
import trabalhopoo2.model.Carcara;

/**
 *
 * @author
 */
public class Tabuleiro {

    private List<Posicao> posicoes = new ArrayList<>();
    private final Carcara carcara = new Carcara();
    private final Cabrito cabrito = new Cabrito();
    private boolean cabritoUsouSuperPulo = false;

    private int jogadas = 0;

    public Tabuleiro() {
        configurarPosicoes();
    }

    public Animal obterAnimalDaJogada() {
        if (jogadas % 2 == 0) {
            return cabrito;
        } else {
            return carcara;
        }
    }

    public int getJogadas() {
        return this.jogadas;
    }

    public void incrementarJogada() {
        jogadas++;
    }

    private void configurarPosicoes() {
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

    private void reposicionarAnimal(int posicaoDeDestino) {

    }

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
                return true;
            }
            posicoes.get(indexPosicaoDoAnimal).setAnimal(null);
            posicoes.get(posicaoDesejada).setAnimal(carcara);

        } else if (obterAnimalDaJogada() == cabrito && (posicoes.get(posicaoDesejada).getAnimal() == null) ) {
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
                } else {
                    throw new JogadaInvalidaException("Super Pulo cancelado");
                }

            } else {
                throw new JogadaInvalidaException("Cabrito ja usou o super pulo");
            }

            posicoes.get(indexPosicaoDoAnimal).setAnimal(null);
            posicoes.get(posicaoDesejada).setAnimal(cabrito);
        } else {
            throw new JogadaInvalidaException("Posição não alcançável ou inválida!");
        }

        return false;
    }

}
