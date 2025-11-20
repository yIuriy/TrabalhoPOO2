/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2.components;

import java.awt.Event;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import trabalhopoo2.utils.Utilitarios;

/**
 *
 * @author Iuri
 */
public class MenuItem extends JMenuItem {

    private final Font font8Bit;
    private final Utilitarios util;
    private final JPopupMenu popUpMenu;

    public MenuItem(String text, JPopupMenu popUpMenu) {
        super(text);
        util = new Utilitarios();
        font8Bit = util.configurarFonte8Bit();
        util.setarFont(this, 12f, font8Bit);
        this.setVerticalAlignment(CENTER);
        this.popUpMenu = popUpMenu;
    }
}
