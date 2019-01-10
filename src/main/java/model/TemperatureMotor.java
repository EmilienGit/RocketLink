package model;

import data.LoadData;
import data.ReadCsv;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.Random;
import java.util.Timer;

/**
 * @author Emilien
 */
public class TemperatureMotor extends AbstractSensor implements  Runnable {
    private DefaultCategoryDataset data = new DefaultCategoryDataset();

    private JFreeChart temperatureMotorGraph;

    private ChartPanel panelTeamperatureMotorGraph;

    private String name = "Teamperature";

    /**
     * Constructor
     */
    public TemperatureMotor() {
        temperatureMotorGraph = ChartFactory.createLineChart("Motor temperature",
                "Time (s)",
                "Temperature (°C)",
                data);
        setVisibility(true);
        panelTeamperatureMotorGraph = new ChartPanel(temperatureMotorGraph);
    }

    /**
     * Constructor bis
     * @param data the data
     */
    public TemperatureMotor(DefaultCategoryDataset data) {
        temperatureMotorGraph = ChartFactory.createLineChart("Motor temperature",
                "Time (s)",
                "Temperature (°C)",
                data);
        panelTeamperatureMotorGraph = new ChartPanel(temperatureMotorGraph);
    }

    /**
     * Getter
     * @return the graph
     */
    public ChartPanel getPanelTeamperatureMotorGraph() {
        return panelTeamperatureMotorGraph;
    }

    /**
     * Getter
     * @return the data
     */
    public DefaultCategoryDataset getData() {
        return data;
    }

    /**
     * Setter
     * @param data of the graph
     */
    public void setData(DefaultCategoryDataset data) {
        this.data = data;
    }

    /**
     * Getter
     * @return the graph
     */
    public JFreeChart getTemperatureMotorGraph() {
        return temperatureMotorGraph;
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
                ReadCsv readCsv = new ReadCsv();
                readCsv.findData();
                String oldData = LoadData.getTempMotor();
                LoadData.setTempMotor(String.valueOf(value));
                LoadData.update("TempMotor", oldData);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}