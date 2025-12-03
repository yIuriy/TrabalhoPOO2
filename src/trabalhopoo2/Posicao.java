package trabalhopoo2;

import java.util.List;
import trabalhopoo2.model.Animal;

public final class Posicao {

    private final List<Integer> posicoesValidas;

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

    public boolean verificarSeJogadaEValida(int posicaoDesejada) {
        for (Integer posicaoValida : posicoesValidas) {
            if (posicaoValida == posicaoDesejada) {
                return true;
            }
        }
        return false;
    }
}
