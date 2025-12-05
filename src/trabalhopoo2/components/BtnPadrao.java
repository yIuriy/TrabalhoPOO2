package trabalhopoo2.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.UIManager;
import trabalhopoo2.utils.Utilitarios;

public class BtnPadrao extends JButton {

    private final Utilitarios util;
    private final Font font8Bit;

    public BtnPadrao(Float fontSize, Color backgroundColor, String text, Dimension size) {
        util = Utilitarios.getInstance();
        font8Bit = util.configurarFonte8Bit();

        this.setForeground(Color.WHITE);
        this.setPreferredSize(size);
        this.setBackground(backgroundColor);

        this.setText(text);

        // Manter visual quadrado, sem bordas arrendodadas
        UIManager.put("Button.arc", 0);
        UIManager.put("Component.arc", 0);

        // Adiciona efeitos de "hover"
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBorder(javax.swing.BorderFactory.createLineBorder(util.COR_HOVER_BTN, 2));
                setForeground(util.COR_HOVER_BTN);
                revalidate();
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE, 2));
                setForeground(Color.WHITE);
                revalidate();
                repaint();
            }
        });
        configurarBotao(fontSize);
    }

    // Impedir vazamento do this (NetBeans tava reclamando)
    private void configurarBotao(Float fontSize) {
        util.setarFonte(this, fontSize, font8Bit);
        util.configurarBotaoPadrao(this);
    }
}
