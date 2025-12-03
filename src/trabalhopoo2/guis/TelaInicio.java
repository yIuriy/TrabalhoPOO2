package trabalhopoo2.guis;

import trabalhopoo2.components.JPanelComImagemDeFundo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import trabalhopoo2.components.BtnPadrao;
import trabalhopoo2.utils.Utilitarios;

public class TelaInicio extends javax.swing.JFrame {

    private final Font font8Bit;
    private final Utilitarios util;
    private final JPanelComImagemDeFundo panelComImagem;

    public TelaInicio() {
        util = new Utilitarios();
        font8Bit = util.configurarFonte8Bit();

        initComponents();
        panelComImagem = new JPanelComImagemDeFundo(new ImageIcon(getClass().getResource("/resources/imgs/game_image_menu.png")));

        configurarJPanelComImagem();

        BtnPadrao btnJogar = new BtnPadrao(24f, util.COR_FUNDO_BTN, "Jogar", new Dimension(250, 60));
        btnJogar.setBounds(275, 500, 250, 60); // Necessário para posicionar o botão, já que o layout do pai é null
        util.setarCursorMaozinha(btnJogar);

        util.setarFonte(lblTitulo, 50f, font8Bit);
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setOpaque(true);
        lblTitulo.setBackground(new Color(0, 0, 0, 150));
        panelComImagem.setLayout(null);
        panelComImagem.add(btnJogar);

        // Evento de iniciar jogo
        btnJogar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                TelaJogo tj = new TelaJogo();
                tj.setVisible(true);
                dispose();
            }
        }
        );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(255, 255, 255));
        setMaximumSize(new Dimension(800, 600));
        setResizable(false);

        lblTitulo.setBackground(new Color(0, 0, 0));
        lblTitulo.setFont(new Font("sansserif", 0, 48)); // NOI18N
        lblTitulo.setForeground(new Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setText("Corre Cabrito");
        lblTitulo.setInheritsPopupMenu(false);
        lblTitulo.setPreferredSize(new Dimension(500, 100));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(424, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaInicio().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables

    private void configurarJPanelComImagem() {
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panelComImagem, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
}
