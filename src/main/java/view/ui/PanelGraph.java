package view.ui;

import model.TemperatureOgive;
import org.jfree.chart.ChartPanel;
import view.graphs.GraphView;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Emilien
 */
public class PanelGraph extends JPanel {
    private static final int DEFAULT_WIDTH = 1120;
    private static final int DEFAULT_HEIGHT = 720;
    private static final Color DEFAULT_BACKGROUND_COLOR = new Color(43,43,43);

    private List<GraphView> graphViews = new ArrayList<GraphView>();

    public ArrayList<GraphView> lastView;


    public PanelGraph() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT));
        setBackground(DEFAULT_BACKGROUND_COLOR);

        init();
    }

    public void init(){
        GridLayout gl = new GridLayout(2,3);
        setLayout(gl);
        TemperatureOgive to = new TemperatureOgive();
        ChartPanel panelTest = to.getPanelTeamperatureOgiveGraph();
        add(panelTest);
    }

    public void addGraphView(GraphView theGraph){
        graphViews.add(theGraph);
        repaint();
    }

    public void removeGraphView(GraphView theGraph){
        graphViews.remove(theGraph);
        repaint();
    }






}
