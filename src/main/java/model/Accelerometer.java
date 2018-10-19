package model;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class Accelerometer extends Sensor {
    private DefaultCategoryDataset data = new DefaultCategoryDataset();
    private JFreeChart accelerometerGraph;
    private ChartPanel panelAccelerometerGraph;

    public Accelerometer() {
        data.setValue(10, "Accelerometer", "5");
        data.setValue(5, "Accelerometer", "10");
        data.setValue(0, "Accelerometer", "15");
        data.setValue(-4, "Accelerometer", "20");
        data.setValue(8, "Accelerometer", "25");
        data.setValue(-10, "Accelerometer", "30");
        accelerometerGraph = ChartFactory.createLineChart("Accelerometer",
                "Time (s)",
                "Accelerometer g (m.s-²)",
                data);
        panelAccelerometerGraph = new ChartPanel(accelerometerGraph);
    }

    public JFreeChart getAccelerometerGraph() {
        return accelerometerGraph;
    }

    public ChartPanel getPanelAccelerometerGraph() {
        return panelAccelerometerGraph;
    }
}
