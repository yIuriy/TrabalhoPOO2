package trabalhopoo2.components;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import trabalhopoo2.utils.Utilitarios;

public class JPanelComImagemDeFundo extends JPanel { // JPanel personalizado que permite imagem de fundo

    private Image imagemDeFundo;

    public JPanelComImagemDeFundo(String caminhoDaImagem) {
        try { // Garante que o jogo vai rodar, mesmo não achando a imagem
            this.imagemDeFundo = new ImageIcon(getClass().getResource(caminhoDaImagem)).getImage();
        } catch (NullPointerException e) {
            System.err.println("Imagem não encontrada!");
            this.setBackground(Utilitarios.getInstance().COR_FUNDO);
        }
    }

    // Necessário para setar uma imagem de fundo em um JPanel
    @Override
    protected void paintComponent(Graphics g
    ) {
        super.paintComponent(g);
        g.drawImage(imagemDeFundo, 0, 0, getWidth(),
                getHeight(), this
        );
    }
}
