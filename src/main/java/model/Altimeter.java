package model;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * @author Emilien
 */
public class Altimeter extends AbstractSensor {
    private DefaultCategoryDataset data = new DefaultCategoryDataset();

    private JFreeChart altimeterGraph;

    private ChartPanel panelAltimeterGraph;

    private String name = "Altimeter";

    /**
     * Constructeur de l'altimetre et ses valeurs
     */
    public Altimeter() {
        data.setValue(150, name, "1");
        data.setValue(550, name, "5");
        data.setValue(1050, name, "10");
        data.setValue(1250, name, "15");
        data.setValue(1060, name, "20");
        data.setValue(960, name, "25");
        data.setValue(880, name, "30");

        altimeterGraph = ChartFactory.createLineChart(name,
                "Time (s)",
                "Altimeter -> altitude (m)",
                data);
        setVisibility(true);
        panelAltimeterGraph = new ChartPanel(altimeterGraph);
    }

    /**
     * Getter
     * @return altimeterGraph
     */
    public JFreeChart getAltimeterGraph() {
        return altimeterGraph;
    }

    /**
     * Getter
     * @return panelAltimeterGraph
     */
    public ChartPanel getPanelAltimeterGraph() {
        return panelAltimeterGraph;
    }
}
