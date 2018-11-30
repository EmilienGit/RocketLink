package controler;

import model.AbstractSensor;
import org.jfree.chart.ChartPanel;
import view.ui.PanelGraph;

import java.util.List;

/**
 * @author Emilien
 */
public class ActionAddRemoveSensor {

    /**
     * Constructeur
     */
    public ActionAddRemoveSensor() {

    }

    /**
     *
     * @param panelGraph représente le panneau où sont sera positionner les graph
     * @param thePanel réprésente le Graph
     * @param abstractSensor représente le Capteur
     */
    public void addRemoveSensor(PanelGraph panelGraph, ChartPanel thePanel, AbstractSensor abstractSensor) {
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
     *
     * @param panelGraph représente le panneau où sont sera positionner les graph
     * @param panels réprésente les Graphs
     * @param abstractSensors représente les Capteurs
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
     *
     * @param panelGraph représente le panneau où sont sera positionner les graph
     * @param panels réprésente les Graphs
     * @param abstractSensors représente les Capteurs
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
