/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

import java.util.List;
import trabalhopoo2.model.Animal;

/**
 *
 * @author Iuri da Silva Fernandes
 * @author Dyoanthan
 */
public final class Posicao {

    private final List<Integer> posicoesValidas;

    private Animal animal = null;

    public Posicao(List<Integer> posicoesValidas) {
        this.posicoesValidas = posicoesValidas;
    }

    public List<Integer> getPosicoesValidas() {
        return posicoesValidas;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
