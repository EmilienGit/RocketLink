package model;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * @author Emilien
 */
public class Accelerometer extends AbstractSensor {

    private DefaultCategoryDataset data = new DefaultCategoryDataset();

    private JFreeChart accelerometerGraph;

    private ChartPanel panelAccelerometerGraph;

    private String name = "Accelerometer";

    /**
     * Constructeur de l'Accelerometer avec ses valeurs
     */
    public Accelerometer() {
        data.setValue(100, name, "5");
        data.setValue(90, name, "10");
        data.setValue(75, name, "15");
        data.setValue(50, name, "20");
        data.setValue(20, name, "25");
        data.setValue(2, name, "30");
        accelerometerGraph = ChartFactory.createLineChart(name,
                "Time (s)",
                "Accelerometer g (m.s-²)",
                data);
        panelAccelerometerGraph = new ChartPanel(accelerometerGraph);
        setVisibility(true);
    }

    /**
     * Getter
     * @return le graph de l'accelerometer
     */
    public JFreeChart getAccelerometerGraph() {
        return accelerometerGraph;
    }

    /**
     * Getter
     * @return le panneau de l'accelerometer
     */
    public ChartPanel getPanelAccelerometerGraph() {
        return panelAccelerometerGraph;
    }

}
