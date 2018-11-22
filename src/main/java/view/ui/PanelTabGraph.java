package view.ui;

import controler.ActionAddRemoveSensor;

import javax.swing.*;
import java.awt.*;

public class PanelTabGraph extends JPanel {
    private static final int DEFAULT_WIDTH = 1100;
    private static final int DEFAULT_HEIGHT = 700;
    private static final Color DEFAULT_BACKGROUND_COLOR = new Color(63,63,63);

    private static PanelGraph panelGraph;
    private PanelToolBar panelToolBar;


    public PanelTabGraph() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT));
        setBackground(DEFAULT_BACKGROUND_COLOR);

        init();

    }

    public void init(){
        this.panelGraph = new PanelGraph();
        this.panelToolBar = new PanelToolBar();

        this.add(this.panelToolBar,BorderLayout.WEST);
        this.add(this.panelGraph,BorderLayout.CENTER);
    }

    public static PanelGraph getPanelGraph() {
        return panelGraph;
    }
}
