package trabalhopoo2.components;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import javax.swing.border.Border;

public class BordaCircular implements Border {
    
    private final Color cor;
    
    public BordaCircular(Color cor){
        this.cor = cor;
    }
    
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int diametro = Math.min(width, height) - 1;

        g2.setStroke(new BasicStroke(3f));
        g2.setColor(cor);
        g2.drawOval(x +2, y +2, diametro -3, diametro -3);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(5, 5, 5, 5);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}
