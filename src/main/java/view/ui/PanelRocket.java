package view.ui;

import model.LightIndicator;

import javax.swing.*;
import java.awt.*;

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
        this.setLayout(null);
        LightIndicator lightIndicator = new LightIndicator();
        JLabel labelRed = lightIndicator.getLabelLightIndicator();
        labelRed.setBounds(200,200,50,50);
        this.add(labelRed);
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
