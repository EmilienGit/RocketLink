package model;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * @author Emilien
 */
public class TemperatureOgive extends AbstractSensor {

    private DefaultCategoryDataset data = new DefaultCategoryDataset();

    private JFreeChart temperatureOgiveGraph;

    private ChartPanel panelTeamperatureOgiveGraph;

    private String name = "Teamperature";

    /**
     * Constructeur
     */
    public TemperatureOgive() {
        data.setValue(28,name,"5");
        data.setValue(27,name,"10");
        data.setValue(25,name,"15");
        data.setValue(15,name,"20");
        data.setValue(14,name,"25");
        data.setValue(12,name,"30");
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

}
