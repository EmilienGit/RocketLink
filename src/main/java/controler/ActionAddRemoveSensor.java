package controler;

import model.AbstractSensor;
import org.jfree.chart.ChartPanel;
import view.ui.PanelGraph;

import java.util.List;

/**
 * JFreeChart : a free chart library for the Java(tm) platform
 *
 * <p>This class manage the action of each button on the tab Graph (where every graphs are).
 * Three actions are possible :
 * The first one is to add or remove a single sensor.
 * The second is to remove every sensors visible in the tab Graph.
 * The third is to add every sensors not visible int the tab Graph.
 *
 * @author Emilien
 *
 * <p> 13 Decembre 2018 : Version 1</p>
 *
 */

public class ActionAddRemoveSensor {

    /**
     * Constructor of the action to add or remove a sensor. Nothing set.
     */
    public ActionAddRemoveSensor() {
        super();
    }

    /**
     * Add a sensor if it is not visible and remove it if it is visible.
     * @param panelGraph the panel where every sensor graph are.
     * @param thePanel the panel of the sensor.
     * @param abstractSensor the sensor.
     */
    public void addRemoveSensor(PanelGraph panelGraph, ChartPanel thePanel,
                                AbstractSensor abstractSensor) {
        if (abstractSensor.isVisibile()) {
            panelGraph.remove(thePanel);
            panelGraph.repaint();
            abstractSensor.setVisibility(false);
        } else {
            panelGraph.add(thePanel);
            panelGraph.repaint();
            abstractSensor.setVisibility(true);
        }
    }

    /**
     * Remove a sensor if it is visible (for each sensor of the list abstractSensors).
     * @param panelGraph the panel where every sensor graph are.
     * @param panels the List of each panels for each sensors.
     * @param abstractSensors the List of each sensors.
     */
    public void removeAllSensors(PanelGraph panelGraph, List<ChartPanel> panels,
                                 List<AbstractSensor> abstractSensors) {
        for (int i = 0; i < abstractSensors.size(); i++) {
            if (abstractSensors.get(i).isVisibile()) {
                panelGraph.remove(panels.get(i));
                panelGraph.repaint();
                abstractSensors.get(i).setVisibility(false);
            }
        }
    }

    /**
     * Add a sensor if it is not visible (for each sensor of the list abstractSensors).
     * @param panelGraph the panel where every sensor graph are.
     * @param panels the List of each panels for each sensors.
     * @param abstractSensors the List of each sensors.
     */
    public void addAllSensors(PanelGraph panelGraph, List<ChartPanel> panels,
                              List<AbstractSensor> abstractSensors) {
        for (int i = 0; i < abstractSensors.size(); i++) {
            if (!abstractSensors.get(i).isVisibile()) {
                panelGraph.add(panels.get(i));
                panelGraph.repaint();
                abstractSensors.get(i).setVisibility(true);
            }
        }
    }

}
