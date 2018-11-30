package model;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYDataset;

public class TemperatureOgive extends AbstractSensor {
    private DefaultCategoryDataset data = new DefaultCategoryDataset();
    private JFreeChart temperatureOgiveGraph;
    private ChartPanel panelTeamperatureOgiveGraph;
    private XYDataset xyDataset;

    public TemperatureOgive(){
/*        xyDataset.addChangeListener(new DatasetChangeListener() {
            public void datasetChanged(DatasetChangeEvent datasetChangeEvent) {
                // listener for the data check with C++
            }
        });*/
        data.setValue(28,"Temperature","5");
        data.setValue(27,"Temperature","10");
        data.setValue(25,"Temperature","15");
        data.setValue(15,"Temperature","20");
        data.setValue(14,"Temperature","25");
        data.setValue(12,"Temperature","30");
        temperatureOgiveGraph = ChartFactory.createLineChart("Ogive temperature",
                "Time (s)",
                "Temperature (°C)",
                data);
        panelTeamperatureOgiveGraph = new ChartPanel(temperatureOgiveGraph);
    }

    public TemperatureOgive(DefaultCategoryDataset data){
        temperatureOgiveGraph = ChartFactory.createLineChart("Ogive temperature",
                "Time (s)",
                "Temperature (°C)",
                data);
        setVisibility(true);
        panelTeamperatureOgiveGraph = new ChartPanel(temperatureOgiveGraph);
    }

    public ChartPanel getPanelTeamperatureOgiveGraph() {
        return panelTeamperatureOgiveGraph;
    }

    public DefaultCategoryDataset getData() {
        return data;
    }

    public void setData(DefaultCategoryDataset data) {
        this.data = data;
    }

    public JFreeChart getTemperatureOgiveGraph() {
        return temperatureOgiveGraph;
    }

}
