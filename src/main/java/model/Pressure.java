package model;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class Pressure extends Sensor {
    private DefaultCategoryDataset data = new DefaultCategoryDataset();
    private JFreeChart pressureGraph;
    private ChartPanel panelPressureGraph;

    public Pressure() {
        data.setValue(1013, "Pressure", "5");
        data.setValue(1000, "Pressure", "10");
        data.setValue(950, "Pressure", "15");
        data.setValue(900, "Pressure", "20");
        data.setValue(850, "Pressure", "25");
        data.setValue(800, "Pressure", "30");
        pressureGraph = ChartFactory.createLineChart("Pressure",
                "Time (s)",
                "Pressure (Pa)",
                data);
        panelPressureGraph = new ChartPanel(pressureGraph);
    }

    public Pressure(DefaultCategoryDataset data) {
        pressureGraph = ChartFactory.createLineChart("Temperature ogive",
                "Time (s)",
                "Temperature (°C)",
                data);
        setVisibility(true);
        panelPressureGraph = new ChartPanel(pressureGraph);
    }

    public ChartPanel getPanelPressureGraph() {
        return panelPressureGraph;
    }

    public DefaultCategoryDataset getData() {
        return data;
    }

    public void setData(DefaultCategoryDataset data) {
        this.data = data;
    }

    public JFreeChart getPressureGraph() {
        return pressureGraph;
    }

}
