package model;

import data.LoadData;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.Random;

/**
 * JFreeChart : a free chart library for the Java(tm) platform.
 * This class manage the sensor Altimeter.
 *
 * @author Emilien
 *
 * <p>13 decembre 2018 : Version 1 (Emilien)</p>
 */
public class Altimeter extends AbstractSensor implements  Runnable {
    private DefaultCategoryDataset data = new DefaultCategoryDataset();

    private JFreeChart altimeterGraph;

    private ChartPanel panelAltimeterGraph;

    private String name = "Altimeter";

    /**
     * Constructor of the sensor Altimeter.
     * Create a graph of type LineChart.
     * Create a panel with the graph.
     */
    public Altimeter() {
        altimeterGraph = ChartFactory.createLineChart(name,
                "Time (s)",
                "Altimeter -> altitude (m)",
                data);
        setVisibility(true);
        panelAltimeterGraph = new ChartPanel(altimeterGraph);
    }

    /**
     * Getter of the graph of the Altimeter.
     * @return the graph Altimeter (JFreeChart).
     */
    public JFreeChart getAltimeterGraph() {
        return altimeterGraph;
    }

    /**
     * Getter of the panel with the graph of the Altimeter.
     * @return the panel of the Altimeter (ChartPanel).
     */
    public ChartPanel getPanelAltimeterGraph() {
        return panelAltimeterGraph;
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
                String oldData = LoadData.getAltimeter();
                LoadData.setAltimeter(String.valueOf(value));
                LoadData.update("Altimeter", oldData);
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
