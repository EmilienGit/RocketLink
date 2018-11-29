package view.ui;

import model.*;
import org.jfree.chart.ChartPanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Emilien
 */
public class PanelGraph extends JPanel {
    private static final int DEFAULT_WIDTH = 1020;
    private static final int DEFAULT_HEIGHT = 620;
    private static final Color DEFAULT_BACKGROUND_COLOR = new Color(43,43,43);

    private static List<Sensor> listSensors = new ArrayList<Sensor>();
    private static List<ChartPanel> listPanelSensors = new ArrayList<ChartPanel>();

    private GridLayout gl = new GridLayout(2,3);

    public PanelGraph() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT));
        setBackground(DEFAULT_BACKGROUND_COLOR);

        init();
    }

    public void init(){
        setLayout(gl);


        TemperatureOgive temperatureOgive = new TemperatureOgive();
        TemperatureMotor temperatureMotor = new TemperatureMotor();
        Pressure pressure = new Pressure();
        MagneticField magneticFieldSensor = new MagneticField();
        Altimeter altimeter = new Altimeter();
        Accelerometer accelerometer = new Accelerometer();

        ChartPanel panelTemperatureOgive = temperatureOgive.getPanelTeamperatureOgiveGraph();
        ChartPanel panelTemperatureMotor = temperatureMotor.getPanelTeamperatureMotorGraph();
        ChartPanel panelPressure = pressure.getPanelPressureGraph();
        ChartPanel panelMagneticField = magneticFieldSensor.getPanelMagneticFieldGraph();
        ChartPanel panelAltimeter = altimeter.getPanelAltimeterGraph();
        ChartPanel panelAccelerometer = accelerometer.getPanelAccelerometerGraph();

        /**
         * Add in the graph list
         */
        addGraphView(temperatureOgive);
        addGraphView(temperatureMotor);
        addGraphView(pressure);
        addGraphView(magneticFieldSensor);
        addGraphView(altimeter);
        addGraphView(accelerometer);

        /**
         * Add in the panel sensor list
         */
        addGraphPanel(panelTemperatureOgive);
        addGraphPanel(panelTemperatureMotor);
        addGraphPanel(panelPressure);
        addGraphPanel(panelMagneticField);
        addGraphPanel(panelAltimeter);
        addGraphPanel(panelAccelerometer);

        /**
         * Add in the panel
         */
        add(panelTemperatureOgive);
        add(panelTemperatureMotor);
        add(panelPressure);
        add(panelMagneticField);
        add(panelAltimeter);
        add(panelAccelerometer);

    }

    public void addGraphView(Sensor theGraph){
        listSensors.add(theGraph);
    }

    public void removeGraphView(Sensor theGraph){
        listSensors.remove(theGraph);
    }

    public void addGraphPanel(ChartPanel theGraph){
        listPanelSensors.add(theGraph);
    }

    public static void removeGraphPanel(ChartPanel theGraph){
        listPanelSensors.remove(theGraph);
    }

    public static List<ChartPanel> getListPanelSensors() {
        return listPanelSensors;
    }

    public static List<Sensor> getListSensors() {
        return listSensors;
    }
}
