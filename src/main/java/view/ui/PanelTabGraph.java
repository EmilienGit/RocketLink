package view.ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

/**
 * JFreeChart : a free chart library for the Java(tm) platform.
 * This class manage the panel graph
 *
 * @author Emilien
 *
 * <p>13 decembre 2018 : Version 1 (Emilien)</p>
 */
public class PanelTabGraph extends JPanel {
    private static final int DEFAULT_WIDTH = 1000;

    private static final int DEFAULT_HEIGHT = 600;

    private static final Color DEFAULT_BACKGROUND_COLOR = new Color(63,63,63);

    private static PanelGraph panelGraph;

    private PanelToolBar panelToolBar;

    /**
     * Constructeur
     */
    public PanelTabGraph() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT));
        setBackground(DEFAULT_BACKGROUND_COLOR);
        init();
    }

    /**
     * Initialisation des panels
     */
    public void init() {
        panelGraph = new PanelGraph();
        this.panelToolBar = new PanelToolBar();
        this.add(this.panelToolBar,BorderLayout.WEST);
        this.add(this.panelGraph,BorderLayout.CENTER);
    }

    /**
     * Getter
     * @return panelGraph
     */
    public static PanelGraph getPanelGraph() {
        return panelGraph;
    }
}
