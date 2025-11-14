/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2.components;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Iuri
 */
public class JPanelComImagem extends JPanel {

    private Image imgFundo;

    public JPanelComImagem(ImageIcon img) {
        this.imgFundo = img.getImage();
    }

    @Override
    protected void paintComponent(Graphics g
    ) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        g.drawImage(imgFundo, 0, 0, getWidth(),
                getHeight(), this
        );
    }
}
