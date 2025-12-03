package trabalhopoo2.guis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import trabalhopoo2.Posicao;
import trabalhopoo2.Tabuleiro;
import trabalhopoo2.components.BordaCircular;
import trabalhopoo2.components.BtnPadrao;
import trabalhopoo2.components.JPanelComImagemDeFundo;
import trabalhopoo2.components.PainelCentralizado;
import trabalhopoo2.exceptions.JogadaInvalidaException;
import trabalhopoo2.model.Animal;
import trabalhopoo2.model.Cabrito;
import trabalhopoo2.utils.Utilitarios;

public final class TelaJogo extends javax.swing.JFrame {

    private final Tabuleiro tabuleiro;
    private final List<JLabel> labelsPosicoes = new ArrayList<>();
    private final Font font8Bit;
    private final Utilitarios util;
    private final Container containerInicial;
    private final JPanelComImagemDeFundo panelComImagem;
    private final JLabel labelAnimalDaJogada;
    private JPanel panelContainerMensagem;
    private Timer timerMensagemDeAlerta;
    private final JLabel labelJogadas;
    private boolean comandosAtivados;

    public TelaJogo() {
        util = new Utilitarios();
        tabuleiro = new Tabuleiro();

        initComponents();
        containerInicial = getContentPane();
        font8Bit = util.configurarFonte8Bit();

        labelsPosicoes.addAll(
                List.of(posicao0,
                        posicao1,
                        posicao2,
                        posicao3,
                        posicao4,
                        posicao5)
        );

        panelComImagem = new JPanelComImagemDeFundo(new ImageIcon(getClass().getResource("/resources/imgs/montanha_com_linhas.png")));
        configurarJPanelComImagem();
        panelComImagem.setLayout(null);

        configurarMenuBar();
        reposicionarAnimais();
        configurarFontes();

        labelAnimalDaJogada = new JLabel();
        configurarLabelAnimalDaJogada();
        setarTextoConformeAnimalDaJogada();

        labelJogadas = new JLabel("", SwingConstants.CENTER);
        configurarLabelJogadas();
        setarTextoConformeJogada();

        panelTabuleiro.setBorder(new EmptyBorder(5, 5, 5, 5));
        panelTabuleiro.setOpaque(false);

        setarCorNasBordasConformePosicoesValidasEInvalidas(tabuleiro.obterAnimalDaJogada());

        // Neccessário para possibilitar jogar pelas teclas
        setFocusable(true);
        requestFocusInWindow();
        comandosAtivados = true;
        configurarTeclas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        panelTabuleiro = new javax.swing.JPanel();
        posicao0 = new javax.swing.JLabel();
        posicao1 = new javax.swing.JLabel();
        posicao2 = new javax.swing.JLabel();
        posicao4 = new javax.swing.JLabel();
        posicao3 = new javax.swing.JLabel();
        posicao5 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        btnJogo = new javax.swing.JMenu();
        btnAutoria = new javax.swing.JMenu();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(61, 110, 92));
        setResizable(false);

        panelTabuleiro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTabuleiro.setMaximumSize(new java.awt.Dimension(800, 600));

        posicao0.setBackground(new java.awt.Color(255, 255, 255));
        posicao0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posicao0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        posicao0.setMaximumSize(new java.awt.Dimension(50, 50));
        posicao0.setMinimumSize(new java.awt.Dimension(50, 50));
        posicao0.setPreferredSize(new java.awt.Dimension(50, 50));
        posicao0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                posicao0MouseClicked(evt);
            }
        });

        posicao1.setBackground(new java.awt.Color(255, 255, 255));
        posicao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posicao1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        posicao1.setMaximumSize(new java.awt.Dimension(50, 50));
        posicao1.setMinimumSize(new java.awt.Dimension(50, 50));
        posicao1.setPreferredSize(new java.awt.Dimension(50, 50));
        posicao1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                posicao1MouseClicked(evt);
            }
        });

        posicao2.setBackground(new java.awt.Color(255, 255, 255));
        posicao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posicao2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        posicao2.setMaximumSize(new java.awt.Dimension(50, 50));
        posicao2.setMinimumSize(new java.awt.Dimension(50, 50));
        posicao2.setPreferredSize(new java.awt.Dimension(50, 50));
        posicao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                posicao2MouseClicked(evt);
            }
        });

        posicao4.setBackground(new java.awt.Color(255, 255, 255));
        posicao4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posicao4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        posicao4.setMaximumSize(new java.awt.Dimension(50, 50));
        posicao4.setMinimumSize(new java.awt.Dimension(50, 50));
        posicao4.setPreferredSize(new java.awt.Dimension(50, 50));
        posicao4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                posicao4MouseClicked(evt);
            }
        });

        posicao3.setBackground(new java.awt.Color(255, 255, 255));
        posicao3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posicao3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        posicao3.setMaximumSize(new java.awt.Dimension(50, 50));
        posicao3.setMinimumSize(new java.awt.Dimension(50, 50));
        posicao3.setPreferredSize(new java.awt.Dimension(50, 50));
        posicao3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                posicao3MouseClicked(evt);
            }
        });

        posicao5.setBackground(new java.awt.Color(0, 0, 0));
        posicao5.setForeground(new java.awt.Color(255, 255, 255));
        posicao5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posicao5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        posicao5.setMaximumSize(new java.awt.Dimension(50, 50));
        posicao5.setMinimumSize(new java.awt.Dimension(50, 50));
        posicao5.setPreferredSize(new java.awt.Dimension(50, 50));
        posicao5.setRequestFocusEnabled(false);
        posicao5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                posicao5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelTabuleiroLayout = new javax.swing.GroupLayout(panelTabuleiro);
        panelTabuleiro.setLayout(panelTabuleiroLayout);
        panelTabuleiroLayout.setHorizontalGroup(
            panelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabuleiroLayout.createSequentialGroup()
                .addComponent(posicao1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addGroup(panelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(posicao0, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(posicao2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(posicao3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelTabuleiroLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(posicao4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(posicao5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        panelTabuleiroLayout.setVerticalGroup(
            panelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelTabuleiroLayout.createSequentialGroup()
                .addGroup(panelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTabuleiroLayout.createSequentialGroup()
                        .addComponent(posicao0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(posicao2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTabuleiroLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(panelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(posicao3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(posicao1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(117, 117, Short.MAX_VALUE))
            .addGroup(panelTabuleiroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(posicao5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posicao4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnJogo.setText("Jogo");
        btnJogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnJogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnJogoMouseExited(evt);
            }
        });
        menuBar.add(btnJogo);

        btnAutoria.setText("Autoria");
        btnAutoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAutoriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAutoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAutoriaMouseExited(evt);
            }
        });
        menuBar.add(btnAutoria);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(panelTabuleiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(panelTabuleiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJogoMouseClicked
        if (!tabuleiro.getFimJogo()) {
            configurarBotoesMenuJogo();
        }
    }//GEN-LAST:event_btnJogoMouseClicked

    private void btnAutoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAutoriaMouseClicked
        if (!tabuleiro.getFimJogo()) {
            configurarNomes();
        }
    }//GEN-LAST:event_btnAutoriaMouseClicked

    private void btnJogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJogoMouseEntered
        if (!tabuleiro.getFimJogo()) {
            btnMenuEntered(btnJogo);
        }
    }//GEN-LAST:event_btnJogoMouseEntered

    private void btnJogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJogoMouseExited
        btnMenuExited(btnJogo);
    }//GEN-LAST:event_btnJogoMouseExited

    private void btnAutoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAutoriaMouseEntered
        if (!tabuleiro.getFimJogo()) {
            btnMenuEntered(btnAutoria);
        }
    }//GEN-LAST:event_btnAutoriaMouseEntered

    private void btnAutoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAutoriaMouseExited
        btnMenuExited(btnAutoria);
    }//GEN-LAST:event_btnAutoriaMouseExited

    private void posicao5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posicao5MouseClicked
        controlarJogo(5);
    }//GEN-LAST:event_posicao5MouseClicked

    private void posicao3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posicao3MouseClicked
        controlarJogo(3);
    }//GEN-LAST:event_posicao3MouseClicked

    private void posicao4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posicao4MouseClicked
        controlarJogo(4);
    }//GEN-LAST:event_posicao4MouseClicked

    private void posicao2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posicao2MouseClicked
        controlarJogo(2);
    }//GEN-LAST:event_posicao2MouseClicked

    private void posicao1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posicao1MouseClicked
        controlarJogo(1);
    }//GEN-LAST:event_posicao1MouseClicked

    private void posicao0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posicao0MouseClicked
        controlarJogo(0);
    }//GEN-LAST:event_posicao0MouseClicked

    private void btnMenuEntered(JMenu btn) {
        btn.setForeground(new Color(247, 178, 104));
    }

    private void btnMenuExited(JMenu btn) {
        btn.setForeground(Color.white);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaJogo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnAutoria;
    private javax.swing.JMenu btnJogo;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel panelTabuleiro;
    private javax.swing.JLabel posicao0;
    private javax.swing.JLabel posicao1;
    private javax.swing.JLabel posicao2;
    private javax.swing.JLabel posicao3;
    private javax.swing.JLabel posicao4;
    private javax.swing.JLabel posicao5;
    // End of variables declaration//GEN-END:variables

    // Funções Utilitárias
    private JButton criarBotaoPadraoParaMenuJogo(String texto, Dimension tamanho) {
        return new BtnPadrao(24f, util.COR_FUNDO_BTN, texto, tamanho);
    }

    private void abrirUrl(String url) {
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(new URI(url));
        } catch (IOException | URISyntaxException ex) {
            System.getLogger(TelaJogo.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    private void limparImagemDosLabels() {
        labelsPosicoes.forEach(l -> l.setIcon(null));
    }

    private void setarImagemCabrito(int posicao) {
        JLabel label = labelsPosicoes.get(posicao);
        label.setText("");
        limparImagemDosLabels();
        Image icon = new ImageIcon(getClass().getResource("/resources/imgs/cabra.png")).
                getImage().
                getScaledInstance(40, 40, Image.SCALE_SMOOTH);

        label.setIcon(new ImageIcon(icon));
    }

    private void setarImagemCarcara(int posicao) {
        JLabel label = labelsPosicoes.get(posicao);
        label.setText("");
        label.setIcon(null);
        Image icon = new ImageIcon(getClass().getResource("/resources/imgs/carcara.png")).
                getImage().
                getScaledInstance(40, 40, Image.SCALE_SMOOTH);

        label.setIcon(new ImageIcon(icon));
    }

    private void setarTextoConformeJogada() {
        Integer jogadaAtual = tabuleiro.getJogadas();
        labelJogadas.setText(jogadaAtual.toString());
    }

    private void setarTextoConformeAnimalDaJogada() {
        String textoBase = "Vez do ";
        Animal animalDaJogada = tabuleiro.obterAnimalDaJogada();
        String nomeDeExibicao = animalDaJogada.getNomeDeExibicao();
        labelAnimalDaJogada.setText(textoBase + nomeDeExibicao);
    }

    private void setarCorNasBordasConformePosicoesValidasEInvalidas(Animal animalDaJogada) {
        Posicao posicaoAtual = animalDaJogada instanceof Cabrito
                ? tabuleiro.obterPosicaoCabrito()
                : tabuleiro.obterPosicaoCarcara();

        List<Integer> posicoesValidasNaJogada = posicaoAtual.getPosicoesValidas();

        Posicao posCabrito = tabuleiro.obterPosicaoCabrito();
        Integer indexDoCabrito = tabuleiro.getPosicoes().indexOf(posCabrito);

        Posicao posCarcara = tabuleiro.obterPosicaoCarcara();
        Integer indexDoCarcara = tabuleiro.getPosicoes().indexOf(posCarcara);

        if (animalDaJogada instanceof Cabrito && !tabuleiro.isCabritoUsouSuperPulo()) {

            for (int j = 0; j < 6; j++) {
                if (j != indexDoCabrito && j != indexDoCarcara) {
                    configurarLabel(labelsPosicoes.get(j), util.COR_BORDA_POSICAO_VALIDA);
                }
            }
            configurarLabel(labelsPosicoes.get(indexDoCabrito), util.COR_BORDA_POSICAO_ATUAL);
            configurarLabel(labelsPosicoes.get(indexDoCarcara), util.COR_BORDA_POSICAO_PERIGOSA);

            return;
        }

        for (int i = 0; i < 6; i++) {
            if (posicoesValidasNaJogada.contains(i)) {
                configurarLabel(labelsPosicoes.get(i), util.COR_BORDA_POSICAO_VALIDA);
                if (animalDaJogada instanceof Cabrito) {
                    if (indexDoCarcara == i) {
                        configurarLabel(labelsPosicoes.get(i), util.COR_BORDA_POSICAO_PERIGOSA);
                    }
                } else {
                    if (indexDoCabrito == i) {
                        configurarLabel(labelsPosicoes.get(i), util.COR_BORDA_POSICAO_PERIGOSA);
                    }
                }
            } else if (i == tabuleiro.getPosicoes().indexOf(posicaoAtual)) {
                configurarLabel(labelsPosicoes.get(i), util.COR_BORDA_POSICAO_ATUAL);
            } else {
                configurarLabel(labelsPosicoes.get(i), Color.BLACK);
            }
        }
    }

    // Lógica do Jogo -->
    public void reposicionarAnimais() {
        posicao0.setText("W");
        posicao1.setText("A");
        posicao2.setText("S");
        posicao3.setText("D");
        posicao4.setText("Z");
        posicao5.setText("X");

        int posicaoCarcara = tabuleiro.getPosicoes().indexOf(tabuleiro.obterPosicaoCarcara());
        int posicaoCabrito = tabuleiro.getPosicoes().indexOf(tabuleiro.obterPosicaoCabrito());

        setarImagemCabrito(posicaoCabrito);
        setarImagemCarcara(posicaoCarcara);
        revalidate();
        repaint();
    }

    private void controlarJogo(int posicaoDesejada) {
        try {
            if (tabuleiro.tentarMoverAnimal(posicaoDesejada)) {
                tabuleiro.incrementarJogada();
                configurarTelaFinalDoJogo();
            } else {
                tabuleiro.incrementarJogada();
            }
            reposicionarAnimais();
            setarTextoConformeAnimalDaJogada();
            setarCorNasBordasConformePosicoesValidasEInvalidas(tabuleiro.obterAnimalDaJogada());
            setarTextoConformeJogada();
        } catch (JogadaInvalidaException e) {
            criarPopupJogadaInvalida(e.getMessage());
        }
    }

    private void configurarTeclas() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (comandosAtivados) {
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_W ->
                            controlarJogo(0);
                        case KeyEvent.VK_A ->
                            controlarJogo(1);
                        case KeyEvent.VK_S ->
                            controlarJogo(2);
                        case KeyEvent.VK_D ->
                            controlarJogo(3);
                        case KeyEvent.VK_Z ->
                            controlarJogo(4);
                        case KeyEvent.VK_X ->
                            controlarJogo(5);
                    }
                }
            }
        });
    }

    // Configurações de Elementos -->
    private void configurarBotoesMenuJogo() {
        JButton btnVoltar = criarBotaoPadraoParaMenuJogo("Voltar", new Dimension(300, 70));
        util.setarCursorMaozinha(btnVoltar);
        JButton btnReiniciar = criarBotaoPadraoParaMenuJogo("Reiniciar", new Dimension(300, 70));
        util.setarCursorMaozinha(btnReiniciar);
        JButton btnSair = criarBotaoPadraoParaMenuJogo("Sair", new Dimension(300, 70));
        util.setarCursorMaozinha(btnSair);

        PainelCentralizado panel = new PainelCentralizado(List.of(
                btnVoltar, btnReiniciar, btnSair
        ), new ImageIcon(getClass().getResource("/resources/imgs/fundo_menu_botoes.png")));

        this.setContentPane(panel);
        this.revalidate();
        this.repaint();

        btnVoltar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setContentPane(containerInicial);
                revalidate();
                repaint();
            }
        }
        );

        btnReiniciar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                TelaJogo TJ = new TelaJogo();
                TJ.setVisible(true);
                dispose();
            }
        }
        );

        btnSair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        }
        );
    }

    private void configurarMenuBar() {
        FlowLayout fl = new FlowLayout(FlowLayout.RIGHT);
        fl.setVgap(18);
        fl.setHgap(20);
        menuBar.setLayout(fl);
        menuBar.setBackground(util.COR_FUNDO_MENU_BAR);

        menuBar.setBorder(new MatteBorder(0, 0, 2, 0, util.COR_TEXTO_HOVER));
        menuBar.setPreferredSize(new Dimension(menuBar.getWidth(), 50));

        btnJogo.setForeground(Color.WHITE);
        btnJogo.setBorder(new EmptyBorder(0, 0, 0, 0));
        util.setarCursorMaozinha(btnJogo);

        btnAutoria.setForeground(Color.WHITE);
        btnAutoria.setBorder(new EmptyBorder(0, 0, 0, 0));
        util.setarCursorMaozinha(btnAutoria);
    }

    private void configurarFontes() {
        util.setarFonte(btnJogo, 14f, font8Bit);
        util.setarFonte(btnAutoria, 14f, font8Bit);
        labelsPosicoes.forEach(lbl -> {
            util.setarFonte(lbl, 24f, font8Bit);
        });
    }

    private void configurarLabelJogadas() {
        util.setarFonte(labelJogadas, 24f, font8Bit);
        labelJogadas.setForeground(util.COR_TEXTO);
        labelJogadas.setBounds(getWidth() - 120, 0, 120, 60);
        panelComImagem.add(labelJogadas);
    }

    private void configurarJPanelComImagem() {
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panelComImagem, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    private void configurarLabel(JLabel label, Color cor) {
        label.setPreferredSize(new Dimension(50, 50));
        label.setForeground(Color.blue);
        util.setarCursorMaozinha(label);
        label.setBorder(new BordaCircular(cor));
        //label.setOpaque(true);
        label.setBackground(Color.white);
    }

    private void configurarLabelAnimalDaJogada() {
        util.setarFonte(labelAnimalDaJogada, 24f, font8Bit);
        labelAnimalDaJogada.setBounds(225, 0, 450, 60);
        labelAnimalDaJogada.setForeground(util.COR_TEXTO);
        panelComImagem.add(labelAnimalDaJogada);
    }

    private void criarPopupJogadaInvalida(String mensagem) {
        // Componente que fica acima de todos 
        JPanel glass = (JPanel) getGlassPane();
        glass.setLayout(new BorderLayout());

        // Garante que uma mensagem não fique em cima da outra
        if (panelContainerMensagem != null) {
            glass.remove(panelContainerMensagem);
        }

        panelContainerMensagem = new JPanel(new BorderLayout());
        panelContainerMensagem.setBackground(util.COR_FUNDO_MSG_ERRO);
        panelContainerMensagem.setOpaque(true);
        panelContainerMensagem.setPreferredSize(new Dimension(getWidth(), 60));
        panelContainerMensagem.setBorder(BorderFactory.createLineBorder(util.COR_BORDA_MSG_ERRO, 2));

        JLabel labelJogadaInvalida = new JLabel("", SwingConstants.CENTER);
        labelJogadaInvalida.setText(mensagem);
        labelJogadaInvalida.setForeground(util.COR_TEXTO_MSG_ERRO);
        util.setarFonte(labelJogadaInvalida, 20f, font8Bit);

        panelContainerMensagem.add(labelJogadaInvalida);
        glass.add(panelContainerMensagem, BorderLayout.NORTH);
        glass.setVisible(true);

        glass.repaint();
        glass.revalidate();

        // Garante que não sejam criados múltiplos timers
        if (timerMensagemDeAlerta != null && timerMensagemDeAlerta.isRunning()) {
            timerMensagemDeAlerta.stop();
        }

        timerMensagemDeAlerta = new javax.swing.Timer(3000, e -> {
            panelContainerMensagem.remove(labelJogadaInvalida);
            getContentPane().remove(panelContainerMensagem);
            glass.setVisible(false);
            revalidate();
            repaint();
        });
        timerMensagemDeAlerta.setRepeats(false);
        timerMensagemDeAlerta.start();
    }

    private void configurarNomes() {
        JButton btnVoltar = criarBotaoPadraoParaMenuJogo("Voltar", new Dimension(250, 50));

        JLabel labelNomeDyonathan = new JLabel("Dyonathan Bento Laner");
        util.setarFonte(labelNomeDyonathan, 24f, font8Bit);
        util.setarCursorMaozinha(labelNomeDyonathan);
        labelNomeDyonathan.setForeground(Color.white);

        JLabel labelNomeIuri = new JLabel("Iuri da Silva Fernandes");
        util.setarFonte(labelNomeIuri, 24f, font8Bit);
        labelNomeIuri.setForeground(Color.white);
        util.setarCursorMaozinha(labelNomeIuri);

        PainelCentralizado panel = new PainelCentralizado(List.of(
                labelNomeDyonathan, labelNomeIuri, btnVoltar
        ), new ImageIcon(getClass().getResource("/resources/imgs/fundo_menu_botoes.png")));

        panel.setBackground(util.COR_FUNDO);
        this.setContentPane(panel);
        this.revalidate();
        this.repaint();

        btnVoltar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setContentPane(containerInicial);
                revalidate();
                repaint();
            }
        }
        );

        labelNomeDyonathan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirUrl("https://github.com/dyonathan-laner");
            }
        }
        );

        labelNomeIuri.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirUrl("https://github.com/yIuriy");
            }
        }
        );
    }

    private void configurarTelaFinalDoJogo() {
        comandosAtivados = false;
        JButton btnReiniciar = criarBotaoPadraoParaMenuJogo("Reiniciar", new Dimension(300, 70));
        util.setarCursorMaozinha(btnReiniciar);
        JButton btnSair = criarBotaoPadraoParaMenuJogo("Sair", new Dimension(300, 70));
        util.setarCursorMaozinha(btnSair);

        JLabel labelNomeVencedor = new JLabel("Carcara venceu!");
        JLabel labelTotalDeJogadas = new JLabel("Total de jogadas: " + tabuleiro.getJogadas());

        PainelCentralizado panelTelaFinal = new PainelCentralizado(List.of(
                labelNomeVencedor, labelTotalDeJogadas, btnReiniciar, btnSair), new ImageIcon(getClass().getResource("/resources/imgs/fundo_menu_botoes.png")));

        util.setarFonte(labelNomeVencedor, 24f, font8Bit);
        util.setarFonte(labelTotalDeJogadas, 24f, font8Bit);

        labelNomeVencedor.setForeground(Color.white);
        labelTotalDeJogadas.setForeground(Color.white);
        this.setContentPane(panelTelaFinal);
        this.revalidate();
        this.repaint();

        btnReiniciar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                TelaJogo TJ = new TelaJogo();
                TJ.setVisible(true);
                dispose();
            }
        }
        );

        btnSair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        }
        );
    }
}
