package view.ui;

import model.LightIndicator;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

/**
 * @author Emilien
 */
public class PanelTabRocket extends JPanel {
    private static final int DEFAULT_WIDTH = 1000;

    private static final int DEFAULT_HEIGHT = 600;

    private static final Color DEFAULT_BACKGROUND_COLOR = new Color(63,63,63);

    private PanelRocket panelRocket;

    /**
     * Constructeur
     */
    public PanelTabRocket() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT));
        setBackground(DEFAULT_BACKGROUND_COLOR);
        this.panelRocket = new PanelRocket();;
        init();
        this.add(this.panelRocket,BorderLayout.CENTER);
    }

    /**
     * Initialisation des lumières
     */
    public void init() {
        LightIndicator lightIndicator = new LightIndicator();
        JLabel labelRed = lightIndicator.getLabelLightIndicator();
        this.panelRocket.add(labelRed);

    }
}
