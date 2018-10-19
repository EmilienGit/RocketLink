package view.ui;

import javax.swing.*;
import java.awt.*;

public class PanelTabGraph extends JPanel {
    private static final int DEFAULT_WIDTH = 1100;
    private static final int DEFAULT_HEIGHT = 700;
    private static final Color DEFAULT_BACKGROUND_COLOR = new Color(63,63,63);

    private PanelGraph panelGraph;
    private PanelToolBar panelToolBar;


    public PanelTabGraph() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT));
        setBackground(DEFAULT_BACKGROUND_COLOR);

        this.panelGraph = new PanelGraph();
        this.panelToolBar = new PanelToolBar();

        this.add(this.panelToolBar,BorderLayout.WEST);
        this.add(this.panelGraph,BorderLayout.CENTER);
    }
}
