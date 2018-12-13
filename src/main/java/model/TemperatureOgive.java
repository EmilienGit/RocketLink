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
public class TemperatureOgive extends AbstractSensor implements Runnable{

    private DefaultCategoryDataset data = new DefaultCategoryDataset();

    private JFreeChart temperatureOgiveGraph;

    private ChartPanel panelTeamperatureOgiveGraph;

    private String name = "Teamperature";

    /**
     * Constructeur
     */
    public TemperatureOgive() {
        temperatureOgiveGraph = ChartFactory.createLineChart("Ogive temperature",
                "Time (s)",
                "Temperature (°C)",
                data);
        panelTeamperatureOgiveGraph = new ChartPanel(temperatureOgiveGraph);
    }

    /**
     * Constructeur 2
     * @param data data
     * */
    public TemperatureOgive(DefaultCategoryDataset data) {
        temperatureOgiveGraph = ChartFactory.createLineChart("Ogive temperature",
                "Time (s)",
                "Temperature (°C)",
                data);
        setVisibility(true);
        panelTeamperatureOgiveGraph = new ChartPanel(temperatureOgiveGraph);
    }

    /**
     * Getter
     * @return panelTeamperatureOgiveGraph
     */
    public ChartPanel getPanelTeamperatureOgiveGraph() {
        return panelTeamperatureOgiveGraph;
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
     * @param data data
     */
    public void setData(DefaultCategoryDataset data) {
        this.data = data;
    }

    /**
     * Getter
     * @return temperatureOgiveGraph
     */
    public JFreeChart getTemperatureOgiveGraph() {
        return temperatureOgiveGraph;
    }

    @Override
    public void run() {
        long tempsDebut = System.currentTimeMillis();
        while (true) {
            try {
                Thread.sleep(5000);
                Random rand = new Random();
                int value = rand.nextInt(100);
                long tempsFin = System.currentTimeMillis();
                float secondsFloat = (tempsFin - tempsDebut) / 1000F;
                int seconds = Math.round(secondsFloat);
                data.setValue(value,name,Float.toString(seconds));
                String oldData = LoadData.getTempOgive();
                LoadData.setTempOgive(String.valueOf(value));
                LoadData.update("TempOgive", oldData);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
