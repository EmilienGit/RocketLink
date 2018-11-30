package model;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * @author Emilien
 */
public class MagneticField extends AbstractSensor {
    private DefaultCategoryDataset data = new DefaultCategoryDataset();

    private JFreeChart magneticFieldGraph;

    private ChartPanel panelMagneticFieldGraph;

    private String name = "Magnetic field";

    /**
     * Constructeur
     */
    public MagneticField() {
        data.setValue(-10, name, "5");
        data.setValue(5, name, "10");
        data.setValue(0, name, "15");
        data.setValue(-4, name, "20");
        data.setValue(8, name, "25");
        data.setValue(-10, name, "30");
        magneticFieldGraph = ChartFactory.createLineChart(name,
                "Time (s)",
                "Magnetic field B (G)",
                data);
        setVisibility(true);
        panelMagneticFieldGraph = new ChartPanel(magneticFieldGraph);
    }

    /**
     * Getter
     * @return magneticFieldGraph
     */
    public JFreeChart getMagneticFieldGraph() {
        return magneticFieldGraph;
    }

    /**
     * Getter
     * @return panelMagneticFieldGraph
     */
    public ChartPanel getPanelMagneticFieldGraph() {
        return panelMagneticFieldGraph;
    }
}
