package trabalhopoo2.components;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.List;
import javax.swing.ImageIcon;

public class PainelCentralizado extends JPanelComImagemDeFundo {

    public PainelCentralizado(List<Component> components, ImageIcon imagemDeFundo) {
        super(imagemDeFundo);

        // Faz com que os itens fiquem um embaixo do outro ao serem adicionados
        this.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new Insets(20, 0, 10, 0);
        gridBagConstraints.ipady = 10;

        gridBagConstraints.fill = GridBagConstraints.NONE;

        // Posiciona os elementos
        int linha = 0;
        for (Component comp : components) {
            gridBagConstraints.gridy = linha++;
            this.add(comp, gridBagConstraints);
        }
    }
}
