package trabalhopoo2.components;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 *
 * @author Iuri da Silva Fernandes
 * @author Dyonathan Bento Laner
 */
public class Linha extends JComponent {

    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;

    public Linha(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        setOpaque(false);
        // Faz com que as linhas se encontrem dentro do tabuleiro que estão os labels, feito na base do teste, até achar a melhor posição
        this.setBounds(-35, 50, 900, 500); 
    }

    @Override
    public void paintComponent(Graphics g) { // Cria a linha em si, utilizando G2
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g; // Faz o cast do g para g2
        g2.setStroke(new BasicStroke(4.0f)); // Seta a grossura da linha
        g2.setColor(Color.black);
        g2.drawLine(x1, y1, x2, y2);
    }
}
