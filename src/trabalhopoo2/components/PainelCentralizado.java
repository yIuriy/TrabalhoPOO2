/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2.components;

import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import trabalhopoo2.utils.Utilitarios;

/**
 *
 * @author Iuri
 */
public class PainelCentralizado extends JPanel {

    private final Utilitarios util;
    private final Font font8Bit;

    public PainelCentralizado(List<Component> components) {
        util = new Utilitarios();
        font8Bit = util.configurarFonte8Bit();

        this.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new Insets(10, 0, 10, 0);
        gridBagConstraints.ipady = 10;

        gridBagConstraints.fill = GridBagConstraints.NONE;

        int linha = 0;
        for (Component comp : components) {
            gridBagConstraints.gridy = linha++;
            this.add(comp, gridBagConstraints);
        }
    }
}
