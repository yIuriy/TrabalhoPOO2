package trabalhopoo2.components;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.List;

public class PainelCentralizado extends JPanelComImagemDeFundo { // Panel que centraliza os itens no meio, utilizado para os menus, tanto de jogo quanto autoria

    public PainelCentralizado(List<Component> elementos, String caminhoDaImagem ){
        super(caminhoDaImagem);

        // Faz com que os itens fiquem um embaixo do outro ao serem adicionados
        this.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        gridBagConstraints.gridx = 0; 
        gridBagConstraints.insets = new Insets(20, 0, 10, 0);
        gridBagConstraints.ipady = 10;

        gridBagConstraints.fill = GridBagConstraints.NONE;

        // Posiciona os elementos
        int linha = 0;
        for (Component elemento : elementos) {
            gridBagConstraints.gridy = linha++;
            this.add(elemento, gridBagConstraints);
        }
    }
}
