package view.ui;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

/**
 * @author Emilien
 */
public class PanelRocket extends JPanel {
    private static final int DEFAULT_WIDTH = 1080;

    private static final int DEFAULT_HEIGHT = 620;

    private static final Color DEFAULT_BACKGROUND_COLOR = new Color(43,43,43);

    /**
     * Le constructeur
     */
    public PanelRocket() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT));
        setBackground(DEFAULT_BACKGROUND_COLOR);
    }

    /**
     * Image la fusée
     * @param g composant graphic
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon rocket = new ImageIcon("src/main/resources/Images/Fusex.png");
        Image myRocket = rocket.getImage();
        g.drawImage(myRocket, 0, 0, this);
    }
}
