package model;

import data.LoadData;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.Random;

/**
 * @author Emilien
 */
public class Altimeter extends AbstractSensor implements  Runnable {
    private DefaultCategoryDataset data = new DefaultCategoryDataset();

    private JFreeChart altimeterGraph;

    private ChartPanel panelAltimeterGraph;

    private String name = "Altimeter";

    /**
     * Constructeur de l'altimetre et ses valeurs
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
     * Getter
     * @return altimeterGraph
     */
    public JFreeChart getAltimeterGraph() {
        return altimeterGraph;
    }

    /**
     * Getter
     * @return panelAltimeterGraph
     */
    public ChartPanel getPanelAltimeterGraph() {
        return panelAltimeterGraph;
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
                LoadData.setAltimeter(String.valueOf(value));
                LoadData.update();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
