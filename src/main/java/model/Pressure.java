package model;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.Random;

/**
 * JFreeChart : a free chart library for the Java(tm) platform.
 * This class manage the sensor MagneticField.
 *
 * @author Emilien
 *
 * <p>13 decembre 2018 : Version 1 (Emilien)</p>
 */
public class Pressure extends AbstractSensor implements  Runnable {
    private DefaultCategoryDataset data = new DefaultCategoryDataset();

    private JFreeChart pressureGraph;

    private ChartPanel panelPressureGraph;

    private String name = "Pressure";

    /**
     * Constructor of the sensor MagneticField.
     * Create a graph of type LineChart.
     * Create a panel with the graph.
     */
    public Pressure() {
        pressureGraph = ChartFactory.createLineChart(name,
                "Time (s)",
                "Pressure (Pa)",
                data);
        panelPressureGraph = new ChartPanel(pressureGraph);
    }

    /**
     * Getter of the graph of the MagneticField.
     * @return the graph MagneticField (JFreeChart).
     */
    public ChartPanel getPanelPressureGraph() {
        return panelPressureGraph;
    }

    /**
     * Getter of the panel with the graph of the MagneticField.
     * @return the panel of the MagneticField (ChartPanel).
     */
    public JFreeChart getPressureGraph() {
        return pressureGraph;
    }

    @Override
    /**
     * Method run override, the class implements Runnable.
     * Thread for set the data of the graph every 10 seconds.
     * Data are set to a random value between 0 and 99.
     */
    public void run() {
        long tempsDebut = System.currentTimeMillis();
        while (true) {
            try {
                Random rand = new Random();
                int value = rand.nextInt(100);
                long tempsFin = System.currentTimeMillis();
                float secondsFloat = (tempsFin - tempsDebut) / 1000F;
                int seconds = Math.round(secondsFloat);
                data.setValue(value,name,Float.toString(seconds));
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
