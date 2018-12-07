package model;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * @author Emilien
 */
public class Pressure extends AbstractSensor {
    private DefaultCategoryDataset data = new DefaultCategoryDataset();

    private JFreeChart pressureGraph;

    private ChartPanel panelPressureGraph;

    private String name = "Pressure";

    /**
     * Constructeur
     */
    public Pressure() {
        data.setValue(1013, name, "5");
        data.setValue(1000, name, "10");
        data.setValue(950, name, "15");
        data.setValue(900, name, "20");
        data.setValue(850, name, "25");
        data.setValue(800, name, "30");
        pressureGraph = ChartFactory.createLineChart(name,
                "Time (s)",
                "Pressure (Pa)",
                data);
        panelPressureGraph = new ChartPanel(pressureGraph);
    }

    /**
     * Constructeur
     * @param data type de date
     */
    public Pressure(DefaultCategoryDataset data) {
        pressureGraph = ChartFactory.createLineChart("Temperature ogive",
                "Time (s)",
                "Temperature (°C)",
                data);
        setVisibility(true);
        panelPressureGraph = new ChartPanel(pressureGraph);
    }

    /**
     * Getter
     * @return panelPressureGraph
     */
    public ChartPanel getPanelPressureGraph() {
        return panelPressureGraph;
    }

    /**
     * Getter
     * @return data
     */
    public DefaultCategoryDataset getData() {
        return data;
    }

    /**
     * Setter
     * @param data la data
     */
    public void setData(DefaultCategoryDataset data) {
        this.data = data;
    }

    /**
     * Getter
     * @return pressureGraph
     */
    public JFreeChart getPressureGraph() {
        return pressureGraph;
    }

}
