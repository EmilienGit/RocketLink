package view.graphs;

import org.jfree.chart.JFreeChart;

import java.awt.Graphics2D;

/**
 * @author Emilien
 */
public abstract class AbstractGraphView {

    protected final JFreeChart graph;

    /**
     * Constructeur
     * @param graph le graph
     */
    public AbstractGraphView(JFreeChart graph) {
        this.graph = graph;
    }

    /**
     *
     * @return le graph
     */
    public JFreeChart getGraph() {
        return this.graph;
    }

    /**
     *
     * @param g2d pain
     */
    public abstract void display(Graphics2D g2d);
}
