/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

import java.util.ArrayList;
import java.util.List;
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

    private int jogadas = 0;

    public Tabuleiro() {
        configurarPosicoes();
    }

    public Animal obterAnimalDaJogada() {
        if (jogadas % 2 == 0) {
            System.out.println("CABRITO");
            return cabrito;
        } else {
            System.out.println("CARCARA");
            return carcara;
        }
    }

    public void incrementarJogada() {
        jogadas++;
    }

    public boolean podeMover(Animal animal, int posicaoDesejada) {
        return false;
    }

    private void configurarPosicoes() {
        posicoes.add(new Posicao(List.of(1, 2, 3)));
        posicoes.add(new Posicao(List.of(0, 4)));
        posicoes.add(new Posicao(List.of(0, 4, 5)));
        posicoes.add(new Posicao(List.of(0, 5)));
        posicoes.add(new Posicao(List.of(1, 2, 5)));
        posicoes.add(new Posicao(List.of(2, 3, 4)));

        posicoes.getFirst().setAnimal(cabrito);
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

    public boolean tentarMoverAnimal() {
            
    }

}
