/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2.components;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComponent;

/**
 *
 * @author Iuri
 */
public class Linha extends JComponent {

    private int xInicio;
    private int yInicio;
    private int xFim;
    private int yFim;

    private int espessura = 5;

    public Linha(int xInicio, int yInicio, int xFim, int yFim) {
        this.xInicio = xInicio;
        this.yInicio = yInicio;
        this.xFim = xFim;
        this.yFim = yFim;

        setPreferredSize(new Dimension(Math.max(xInicio, yInicio) + 5, Math.max(xFim, xFim) + 5));
    }

    public void setEspessura(int espessura) {
        this.espessura = espessura;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setStroke(new BasicStroke(espessura));

        g2.setColor(Color.black);

        g2.drawLine(xInicio, yInicio, xFim, yFim);
    }
}
