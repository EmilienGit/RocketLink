package view.ui;

import data.LoadData;
import model.LightIndicator;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class to show all sensors values and theirs states
 *
 * @author Quentin
 */
public class PanelRocket extends JPanel {
    private static final int DEFAULT_WIDTH = 1080;
    private static final int DEFAULT_HEIGHT = 620;
    private static final Color DEFAULT_BACKGROUND_COLOR = new Color(43,43,43);
    private static final int NOMBRE_CAPTOR = 6;
    private static final String TEMPMOTOR = "TempMotor";
    private static final String MAGNETIC = "Magnetic";
    private static final String PRESSURE = "Pressure";
    private static final String ALTIMETER = "Altimeter";
    private static final String ACCELEROMETER = "Accelerometer";
    private static final String TEMPOGIVE = "TempOgive";
    private static final List<String> INDICATORS_NAME = Arrays.asList(TEMPMOTOR, MAGNETIC,
            PRESSURE,  ALTIMETER, ACCELEROMETER, TEMPOGIVE);
    private static final List<Integer> INDICATORS_X_POSITION = Arrays.asList(243, 367, 545,
            598, 650, 763);
    private static final int INDICATORS_Y_POSITION = 211 / 2 / 2 + 48;
    private static final List<Integer> FIELD_X_POSITION = Arrays.asList(1080 / 4, (1080 / 4) * 2,
            (1080 / 4) * 3, 1080 / 4, (1080 / 4) * 2, (1080 / 4) * 3);
    private static final List<Integer> FIELD_Y_POSITION = Arrays.asList(350, 350, 350,
            450, 450, 450);

    private static List<LightIndicator> lightIndicatorList = new ArrayList();
    private static List<JTextField> jTextFieldList = new ArrayList();

    /**
     * Constructor
     */
    public PanelRocket() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setBackground(DEFAULT_BACKGROUND_COLOR);
        setLayout(null);
        init();
    }


    /**
     * Initialisation all labels and fields
     */
    private void init() {
        for (int i = 0; i < NOMBRE_CAPTOR; i++) {
            createLabelIndicator(INDICATORS_NAME.get(i),
                    INDICATORS_X_POSITION.get(i),
                    INDICATORS_Y_POSITION);
        }
        for (int i = 0; i < NOMBRE_CAPTOR; i++) {
            createFieldCaptor(INDICATORS_NAME.get(i),
                    FIELD_X_POSITION.get(i),
                    FIELD_Y_POSITION.get(i));
        }
    }

    /**
     * Create a label indicator
     * @param name : name of the label
     * @param x : postion x of the label
     * @param y : postion y of the label
     */
    private void createLabelIndicator(final String name, final int x, final int y) {
        LightIndicator lightIndicator = new LightIndicator(name);
        lightIndicator.getLabel().setBounds(x, y, 100,100);
        LightIndicator lightIndicator2 = new LightIndicator();
        lightIndicator2.getLabel().setBounds(x, y + 1, 100,100);
        this.add(lightIndicator.getLabel());
        this.add(lightIndicator2.getLabel());
        lightIndicatorList.add(lightIndicator);
    }

    /**
     * Create the panel
     * @param name : name of the field
     * @param x : postion x of the field
     * @param y : postion y of the field
     */
    private void createFieldCaptor(String name, int x, int y) {
        JLabel jLabel = new JLabel(name + " : ");
        jLabel.setBounds(x - 105,y,105,35);
        jLabel.setForeground(Color.white);
        JTextField jTextField = new JTextField("xxxx");
        jTextField.setName(name);
        jTextField.setBounds(x - 75,y + 40, 130, 35);
        jTextField.setEnabled(false);
        jTextField.setDisabledTextColor(Color.BLACK);
        jTextFieldList.add(jTextField);
        this.add(jLabel);
        this.add(jTextField);
    }

    /**
     * Update light indicators and values of fields
     *
     * @param name : name of the field
     * @param oldData : old value show on the field
     */
    public static void update(String name, String oldData) {
        String[] splited;
        switch (name) {
            case TEMPMOTOR:
                jTextFieldList.get(placement(name)).setText(LoadData.getTempMotor());
                splited = LoadData.getTempMotor().split("\\s+");
                updateLightIndicator(TEMPMOTOR, splited, oldData);
                break;
            case MAGNETIC:
                jTextFieldList.get(placement(name)).setText(LoadData.getMagnetic());
                splited = LoadData.getMagnetic().split("\\s+");
                updateLightIndicator(MAGNETIC, splited, oldData);
                break;
            case PRESSURE:
                jTextFieldList.get(placement(name)).setText(LoadData.getPressure());
                splited = LoadData.getPressure().split("\\s+");
                updateLightIndicator(PRESSURE, splited, oldData);
                break;
            case ALTIMETER:
                jTextFieldList.get(placement(name)).setText(LoadData.getAltimeter());
                splited = LoadData.getAltimeter().split("\\s+");
                updateLightIndicator(ALTIMETER, splited, oldData);
                break;
            case ACCELEROMETER:
                jTextFieldList.get(placement(name)).setText(LoadData.getAccelerometer());
                splited = LoadData.getAccelerometer().split("\\s+");
                updateLightIndicator(ACCELEROMETER, splited, oldData);
                break;
            case TEMPOGIVE:
                jTextFieldList.get(placement(name)).setText(LoadData.getTempOgive());
                splited = LoadData.getTempOgive().split("\\s+");
                updateLightIndicator(TEMPOGIVE, splited, oldData);
                break;
            default:
                break;
        }
    }

    /**
     * Location of a sensor in a list
     *
     * @param name : name of field searching
     *
     * @return placement
     */
    private static int placement(String name) {
        int placement = 0;
        for (int i = 0; i < jTextFieldList.size(); i++) {
            if (jTextFieldList.get(i).getName().equals(name)) {
                placement = i;
            }
        }
        return placement;
    }

    /**
     * Location of a sensor in a list
     *
     * @param name : name of indicator searching
     *
     * @return LightIndicator
     */
    private static LightIndicator findIndicator(String name) {
        LightIndicator lightIndicator = new LightIndicator();

        for (LightIndicator l : lightIndicatorList) {
            if (l.getName().equals(name)) {
                lightIndicator = l;
            }
        }
        return lightIndicator;
    }

    /**
     * Location of a sensor in a list
     *
     * @param name : name of indicator we want to set color
     * @param splited : new value of the sensor
     * @param oldData : old value of the sensor
     */
    private static void updateLightIndicator(String name, String[] splited, String oldData) {

        if (splited[0].equals("null")) {
            findIndicator(name).setLightColor(Color.RED);
        }

        if (oldData != null) {
            String[] splitedOldData = oldData.split("\\s+");
            if (splitedOldData[0].equals(splited[0])) {
                findIndicator(name).setLightColor(Color.ORANGE);
            } else {
                findIndicator(name).setLightColor(Color.GREEN);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon rocket = new ImageIcon("src/main/resources/Images/fusex.png");
        Image myRocket = rocket.getImage();
        g.drawImage(myRocket, (DEFAULT_WIDTH - 849) / 2, 50, this);
    }
}
