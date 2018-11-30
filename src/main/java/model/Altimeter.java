package model;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * @author Emilien
 */
public class Altimeter extends AbstractSensor {
    private DefaultCategoryDataset data = new DefaultCategoryDataset();

    private JFreeChart altimeterGraph;

    private ChartPanel panelAltimeterGraph;

    private String name = "Altimeter";

    /**
     * Constructeur de l'altimetre et ses valeurs
     */
    public Altimeter() {
        data.setValue(150, name, "1");
        data.setValue(250, name, "2");
        data.setValue(350, name, "3");
        data.setValue(450, name, "4");
        data.setValue(550, name, "5");
        data.setValue(650, name, "6");
        data.setValue(750, name, "7");
        data.setValue(850, name, "8");
        data.setValue(950, name, "9");
        data.setValue(1050, name, "10");
        data.setValue(1150, name, "11");
        data.setValue(1250, name, "12");
        data.setValue(1350, name, "13");
        data.setValue(1300, name, "14");
        data.setValue(1250, name, "15");
        data.setValue(1200, name, "16");
        data.setValue(1150, name, "17");
        data.setValue(1100, name, "18");
        data.setValue(1080, name, "19");
        data.setValue(1060, name, "21");
        data.setValue(1040, name, "22");
        data.setValue(1020, name, "23");
        data.setValue(1000, name, "24");
        data.setValue(980, name, "25");
        data.setValue(960, name, "26");
        data.setValue(940, name, "27");
        data.setValue(920, name, "28");
        data.setValue(900, name, "29");
        data.setValue(880, name, "30");

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
}
