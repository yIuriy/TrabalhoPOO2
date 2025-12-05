package trabalhopoo2.components;

import java.awt.Font;
import javax.swing.JMenuItem;
import trabalhopoo2.utils.Utilitarios;

public class MenuItem extends JMenuItem { // Um MenuItem personalizado

    private final Font font8Bit;
    private final Utilitarios util;

    public MenuItem(String texto) {
        super(texto);
        util = Utilitarios.getInstance();
        font8Bit = util.configurarFonte8Bit();
        this.setVerticalAlignment(CENTER); // Seta o alinhado vertical no centro
        configurarMenuItem();
    }

    // Impedir vazamento do this (NetBeans tava reclamando)
    private void configurarMenuItem() {
        util.setarFonte(this, 12f, font8Bit);
    }
}
