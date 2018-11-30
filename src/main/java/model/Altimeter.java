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

    /**
     * Constructeur de l'altimetre et ses valeurs
     */
    public Altimeter() {
        data.setValue(150, "Altimeter", "1");
        data.setValue(250, "Altimeter", "2");
        data.setValue(350, "Altimeter", "3");
        data.setValue(450, "Altimeter", "4");
        data.setValue(550, "Altimeter", "5");
        data.setValue(650, "Altimeter", "6");
        data.setValue(750, "Altimeter", "7");
        data.setValue(850, "Altimeter", "8");
        data.setValue(950, "Altimeter", "9");
        data.setValue(1050, "Altimeter", "10");
        data.setValue(1150, "Altimeter", "11");
        data.setValue(1250, "Altimeter", "12");
        data.setValue(1350, "Altimeter", "13");
        data.setValue(1300, "Altimeter", "14");
        data.setValue(1250, "Altimeter", "15");
        data.setValue(1200, "Altimeter", "16");
        data.setValue(1150, "Altimeter", "17");
        data.setValue(1100, "Altimeter", "18");
        data.setValue(1080, "Altimeter", "19");
        data.setValue(1060, "Altimeter", "21");
        data.setValue(1040, "Altimeter", "22");
        data.setValue(1020, "Altimeter", "23");
        data.setValue(1000, "Altimeter", "24");
        data.setValue(980, "Altimeter", "25");
        data.setValue(960, "Altimeter", "26");
        data.setValue(940, "Altimeter", "27");
        data.setValue(920, "Altimeter", "28");
        data.setValue(900, "Altimeter", "29");
        data.setValue(880, "Altimeter", "30");

        altimeterGraph = ChartFactory.createLineChart("Altimeter",
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
