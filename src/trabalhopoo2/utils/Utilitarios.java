package trabalhopoo2.utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import javax.swing.JButton;

public final class Utilitarios {
private static Utilitarios utilitarios = null;
    
    public static Utilitarios getInstance(){
        if(utilitarios == null){
            utilitarios = new Utilitarios();
        }
        return utilitarios;
    }
    private Utilitarios(){   
    }
    
    public final Color COR_TEXTO = new Color(255, 255, 255);

    public final Color COR_TEXTO_HOVER = new Color(247, 178, 104);

    public final Color COR_FUNDO_BTN = new Color(34, 102, 45);

    public final Color COR_FUNDO_MENU_BAR = new Color(34, 102, 45);

    public final Color COR_HOVER_BTN = new Color(247, 178, 104); // (38, 210, 62) é outra opção

    public final Color COR_FUNDO = new Color(20, 150, 20);

    public final Color COR_BORDA_POSICAO_VALIDA = new Color(0, 100, 0);

    public final Color COR_BORDA_POSICAO_ATUAL = new Color(240, 240, 0);

    public final Color COR_BORDA_POSICAO_PERIGOSA = new Color(200, 0, 0);

    public final Color COR_FUNDO_MSG_ERRO = new Color(120, 20, 20, 200);

    public final Color COR_TEXTO_MSG_ERRO = new Color(255, 245, 235);

    public final Color COR_BORDA_MSG_ERRO = new Color(255, 245, 235);

    public Font configurarFonte8Bit() {
        try {
            Font font = Font.createFont(
                    Font.TRUETYPE_FONT,
                    getClass().getResourceAsStream("/resources/fonts/PressStart2P.ttf")
            ).deriveFont(24f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            return font;
        } catch (FontFormatException | IOException e) {
            System.err.println("Erro ao carregar a fonte!" + e.getMessage());
        }
        return null;
    }

    public void setarFonte(Component component, float size, Font font) {
        component.setFont(font.deriveFont(size));
    }

    public void configurarBotaoPadrao(JButton button) {
        button.setBorderPainted(true);
        button.setFocusPainted(false);
        button.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE, 2));
        button.revalidate();
        button.repaint();
    }

    public void setarCursorMaozinha(Component component) {
        component.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
}
