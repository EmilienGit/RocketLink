package model;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class MagneticField extends Sensor {
    private DefaultCategoryDataset data = new DefaultCategoryDataset();
    private JFreeChart magneticFieldGraph;
    private ChartPanel panelMagneticFieldGraph;

    public MagneticField() {
        data.setValue(-10, "Magnetic field", "5");
        data.setValue(5, "Magnetic field", "10");
        data.setValue(0, "Magnetic field", "15");
        data.setValue(-4, "Magnetic field", "20");
        data.setValue(8, "Magnetic field", "25");
        data.setValue(-10, "Magnetic field", "30");
        magneticFieldGraph = ChartFactory.createLineChart("Magnetic field",
                "Time (s)",
                "Magnetic field B (G)",
                data);
        setVisibility(true);
        panelMagneticFieldGraph = new ChartPanel(magneticFieldGraph);
    }

    public JFreeChart getMagneticFieldGraph() {
        return magneticFieldGraph;
    }

    public ChartPanel getPanelMagneticFieldGraph() {
        return panelMagneticFieldGraph;
    }
}
