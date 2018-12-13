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
public class Pressure extends AbstractSensor implements  Runnable {
    private DefaultCategoryDataset data = new DefaultCategoryDataset();

    private JFreeChart pressureGraph;

    private ChartPanel panelPressureGraph;

    private String name = "Pressure";

    /**
     * Constructeur
     */
    public Pressure() {
        pressureGraph = ChartFactory.createLineChart(name,
                "Time (s)",
                "Pressure (Pa)",
                data);
        panelPressureGraph = new ChartPanel(pressureGraph);
    }

    /**
     * Constructeur
     * @param data type de date
     */
    public Pressure(DefaultCategoryDataset data) {
        pressureGraph = ChartFactory.createLineChart("Temperature ogive",
                "Time (s)",
                "Temperature (°C)",
                data);
        setVisibility(true);
        panelPressureGraph = new ChartPanel(pressureGraph);
    }

    /**
     * Getter
     * @return panelPressureGraph
     */
    public ChartPanel getPanelPressureGraph() {
        return panelPressureGraph;
    }

    /**
     * Getter
     * @return data
     */
    public DefaultCategoryDataset getData() {
        return data;
    }

    /**
     * Setter
     * @param data la data
     */
    public void setData(DefaultCategoryDataset data) {
        this.data = data;
    }

    /**
     * Getter
     * @return pressureGraph
     */
    public JFreeChart getPressureGraph() {
        return pressureGraph;
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
                String oldData = LoadData.getPressure();
                LoadData.setPressure(String.valueOf(value));
                LoadData.update("Pressure", oldData);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
