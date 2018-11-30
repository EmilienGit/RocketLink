package model;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class TemperatureMotor extends AbstractSensor {
    private DefaultCategoryDataset data = new DefaultCategoryDataset();
    private JFreeChart temperatureMotorGraph;
    private ChartPanel panelTeamperatureMotorGraph;

    public TemperatureMotor() {
        data.setValue(28, "Teamperature", "5");
        data.setValue(27, "Teamperature", "10");
        data.setValue(20, "Teamperature", "15");
        data.setValue(15, "Teamperature", "20");
        data.setValue(10, "Teamperature", "25");
        data.setValue(5, "Teamperature", "30");
        temperatureMotorGraph = ChartFactory.createLineChart("Motor temperature",
                "Time (s)",
                "Temperature (°C)",
                data);
        setVisibility(true);
        panelTeamperatureMotorGraph = new ChartPanel(temperatureMotorGraph);
    }

    public TemperatureMotor(DefaultCategoryDataset data) {
        temperatureMotorGraph = ChartFactory.createLineChart("Motor temperature",
                "Time (s)",
                "Temperature (°C)",
                data);
        panelTeamperatureMotorGraph = new ChartPanel(temperatureMotorGraph);
    }

    public ChartPanel getPanelTeamperatureMotorGraph() {
        return panelTeamperatureMotorGraph;
    }

    public DefaultCategoryDataset getData() {
        return data;
    }

    public void setData(DefaultCategoryDataset data) {
        this.data = data;
    }

    public JFreeChart getTemperatureMotorGraph() {
        return temperatureMotorGraph;
    }

}