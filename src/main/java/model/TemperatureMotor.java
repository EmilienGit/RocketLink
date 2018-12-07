package model;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * @author Emilien
 */
public class TemperatureMotor extends AbstractSensor {
    private DefaultCategoryDataset data = new DefaultCategoryDataset();

    private JFreeChart temperatureMotorGraph;

    private ChartPanel panelTeamperatureMotorGraph;

    private String name = "Teamperature";

    /**
     * Constructor
     */
    public TemperatureMotor() {
        data.setValue(28, name, "5");
        data.setValue(27, name, "10");
        data.setValue(20, name, "15");
        data.setValue(15, name, "20");
        data.setValue(10, name, "25");
        data.setValue(5, name, "30");
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

}