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
public class Accelerometer extends AbstractSensor implements  Runnable {

    private DefaultCategoryDataset data = new DefaultCategoryDataset();

    private JFreeChart accelerometerGraph;

    private ChartPanel panelAccelerometerGraph;

    private String name = "Accelerometer";

    /**
     * Constructeur de l'Accelerometer avec ses valeurs
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
                String oldData = LoadData.getAccelerometer();
                LoadData.setAccelerometer(String.valueOf(value));
                LoadData.update("Accelerometer", oldData);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
