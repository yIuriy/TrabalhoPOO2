package trabalhopoo2.components;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelComImagemDeFundo extends JPanel {

    private final Image imagemDeFundo;

    public JPanelComImagemDeFundo(ImageIcon img) {
        this.imagemDeFundo = img.getImage();
    }

    // Necessário para setar uma imagem de fundo em um JPanel
    @Override 
    protected void paintComponent(Graphics g
    ) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        g.drawImage(imagemDeFundo, 0, 0, getWidth(),
                getHeight(), this
        );
    }
}
