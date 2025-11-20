/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2.utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.JButton;

/**
 *
 * @author Iuri
 */
public final class Utilitarios {

    public final Color COR_1 = new Color(247, 178, 104);

    public final Color COR_FUNDO_BTN = new Color(34, 102, 45);
    
    public final Color COR_FUNDO_MENU_BAR = new Color(34, 102, 45);

    public final Color COR_HOVER_BTN = new Color(247, 178, 104); // (38, 210, 62) é outra opção

    public final Color COR_FUNDO = new Color(20, 150, 20);

    public Font configurarFonte8Bit() {
        try {
            Font font = Font.createFont(
                    Font.TRUETYPE_FONT,
                    getClass().getResourceAsStream("/resources/fonts/PressStart2P.ttf")
            ).deriveFont(24f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            return font;
        } catch (Exception e) {
            System.out.println("ALGO DEU RUIM");
        }
        return null;
    }

    public void setarFont(Component component, float size, Font font) {
        component.setFont(font.deriveFont(size));
    }

    public void configurarBotao(JButton button) {
        button.setBorderPainted(true);
        button.setFocusPainted(false);
        button.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE, 2));
        button.revalidate();
        button.repaint();
    }

}
