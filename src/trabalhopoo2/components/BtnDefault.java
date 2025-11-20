/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.UIManager;
import trabalhopoo2.utils.Utilitarios;

/**
 *
 * @author Iuri
 */
public class BtnDefault extends JButton {

    private final Utilitarios util;
    private final Font font8Bit;

    public BtnDefault(Float fontSize, Color backgroundColor, String text, Dimension size) {
        util = new Utilitarios();
        font8Bit = util.configurarFonte8Bit();

        util.setarFont(this, fontSize, font8Bit);
        util.configurarBotao(this);

        this.setForeground(Color.WHITE);
        this.setPreferredSize(size);
        this.setBackground(backgroundColor);

        this.setText(text);

        UIManager.put("Button.arc", 0);
        UIManager.put("Component.arc", 0);

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
    }
}
