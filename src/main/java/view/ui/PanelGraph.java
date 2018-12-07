package view.ui;

import model.AbstractSensor;
import model.Accelerometer;
import model.Altimeter;
import model.MagneticField;
import model.Pressure;
import model.TemperatureMotor;
import model.TemperatureOgive;
import org.jfree.chart.ChartPanel;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Emilien
 */
public class PanelGraph extends JPanel {
    private static final int DEFAULT_WIDTH = 1015;

    private static final int DEFAULT_HEIGHT = 615;

    private static final Color DEFAULT_BACKGROUND_COLOR = new Color(43,43,43);

    private static List<AbstractSensor> listSensors = new ArrayList<AbstractSensor>();

    private static List<ChartPanel> listPanelSensors = new ArrayList<ChartPanel>();

    private GridLayout gl = new GridLayout(2,3);

    /**
     * Constructor
     */
    public PanelGraph() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT));
        setBackground(DEFAULT_BACKGROUND_COLOR);

        init();
    }

    /**
     * Initialisation
     */
    public void init() {
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

    /**
     * Add a {@link AbstractSensor}
     * @param theGraph the sensor
     */
    public void addGraphView(AbstractSensor theGraph) {
        listSensors.add(theGraph);
    }

    /**
     * Remove {@link AbstractSensor}
     * @param theGraph the sensor
     */
    public void removeGraphView(AbstractSensor theGraph) {
        listSensors.remove(theGraph);
    }

    /**
     * Add a {@link ChartPanel}
     * @param theGraph the graph Chart Panel
     */
    public void addGraphPanel(ChartPanel theGraph) {
        listPanelSensors.add(theGraph);
    }

    /**
     * Remove a {@link ChartPanel}
     * @param theGraph the graph Chart Panel
     */
    public static void removeGraphPanel(ChartPanel theGraph) {
        listPanelSensors.remove(theGraph);
    }

    /**
     * Getter
     * @return list of Chart Panel
     */
    public static List<ChartPanel> getListPanelSensors() {
        return listPanelSensors;
    }

    /**
     * Getter
     * @return listSensors
     */
    public static List<AbstractSensor> getListAbstractSensors() {
        return listSensors;
    }
}
