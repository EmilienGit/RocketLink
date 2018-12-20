package model;

import data.LoadData;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.Random;

/**
 * JFreeChart : a free chart library for the Java(tm) platform.
 * This class manage the sensor Accelerometer.
 *
 * @author Emilien
 *
 * <p>13 decembre 2018 : Version 1 (Emilien)</p>
 */
public class Accelerometer extends AbstractSensor implements  Runnable {

    private DefaultCategoryDataset data = new DefaultCategoryDataset();

    private JFreeChart accelerometerGraph;

    private ChartPanel panelAccelerometerGraph;

    private String name = "Accelerometer";

    /**
     * Constructor of the sensor Accelerometer.
     * Create a graph of type LineChart.
     * Create a panel with the graph.
     */
    public Accelerometer() {
        accelerometerGraph = ChartFactory.createLineChart(name,
                "Time (s)",
                "Accelerometer g (m.s-²)",
                data);
        panelAccelerometerGraph = new ChartPanel(accelerometerGraph);
        setVisibility(true);
    }

    /**
     * Getter of the graph of the Accelerometer.
     * @return the graph Accelerometer (JFreeChart).
     */
    public JFreeChart getAccelerometerGraph() {
        return accelerometerGraph;
    }

    /**
     * Getter of the panel with the graph of the Accelerometer.
     * @return the panel of the Accelerometer (ChartPanel).
     */
    public ChartPanel getPanelAccelerometerGraph() {
        return panelAccelerometerGraph;
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
                Random randAccelerometerValue = new Random();
                int value = randAccelerometerValue.nextInt(100);
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
