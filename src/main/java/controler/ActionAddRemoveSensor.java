package controler;

import jiconfont.icons.FontAwesome;
import model.Sensor;
import org.jfree.chart.ChartPanel;
import view.ui.PanelGraph;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ActionAddRemoveSensor {

    public ActionAddRemoveSensor(){

    }

    public void addRemoveSensor(PanelGraph panelGraph, ChartPanel thePanel, Sensor sensor){
        if(sensor.isVisibile()){
            panelGraph.remove(thePanel);
            panelGraph.repaint();
            sensor.setVisibility(false);
        } else {
            panelGraph.add(thePanel);
            panelGraph.repaint();
            sensor.setVisibility(true);
        }
    }

    public void removeAllSensors(PanelGraph panelGraph, List<ChartPanel> panels, List<Sensor> sensors){
        for(int i = 0; i < sensors.size(); i ++){
            if(sensors.get(i).isVisibile()) {
                panelGraph.remove(panels.get(i));
                panelGraph.repaint();
                sensors.get(i).setVisibility(false);
            }
        }
    }

    public void addAllSensors(PanelGraph panelGraph, List<ChartPanel> panels, List<Sensor> sensors){
        for(int i = 0; i < sensors.size(); i ++){
            if(sensors.get(i).isVisibile() == false) {
                panelGraph.add(panels.get(i));
                panelGraph.repaint();
                sensors.get(i).setVisibility(true);
            }
        }
    }

}
