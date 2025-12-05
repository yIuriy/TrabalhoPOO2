package trabalhopoo2;

import java.util.List;
import trabalhopoo2.model.Animal;

public final class Posicao { // Representa uma posição do tabuleiro

    private final List<Integer> posicoesValidas; // Armazena as posições em que é permitido se mover a partir da posição

    private Animal animalNaPosicao = null; 

    public Posicao(List<Integer> posicoesValidas) {
        this.posicoesValidas = posicoesValidas;
    }

    public List<Integer> getPosicoesValidas() {
        return posicoesValidas;
    }

    public Animal getAnimal() {
        return animalNaPosicao;
    }

    public void setAnimal(Animal animal) {
        this.animalNaPosicao = animal;
    }

    public boolean verificarSeJogadaEValida(int posicaoDesejada) { // Verifica se uma jogada é válida
        for (Integer posicaoValida : posicoesValidas) {
            if (posicaoValida == posicaoDesejada) {
                return true;
            }
        }
        return false;
    }
}
