package view.graphs;

import org.jfree.chart.JFreeChart;

import java.awt.*;

public abstract class GraphView {
    protected final JFreeChart graph;

    public GraphView(JFreeChart graph){
        this.graph = graph;
    }

    public JFreeChart getGraph(){
        return this.graph;
    }

    public abstract void display(Graphics2D g2d);
}
