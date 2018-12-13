package model;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.Random;

/**
 * @author Emilien
 */
public class MagneticField extends AbstractSensor implements  Runnable {
    private DefaultCategoryDataset data = new DefaultCategoryDataset();

    private JFreeChart magneticFieldGraph;

    private ChartPanel panelMagneticFieldGraph;

    private String name = "Magnetic field";

    /**
     * Constructeur
     */
    public MagneticField() {
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

    @Override
    public void run() {
        long tempsDebut = System.currentTimeMillis();
        while (true) {
            try {

                Thread.sleep(3000);
                Random rand = new Random();
                int value = rand.nextInt(100);
                long tempsFin = System.currentTimeMillis();
                float secondsFloat = (tempsFin - tempsDebut) / 1000F;
                int seconds = Math.round(secondsFloat);
                data.setValue(value,name,Float.toString(seconds));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
