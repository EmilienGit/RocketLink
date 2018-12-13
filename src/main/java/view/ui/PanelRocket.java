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
 * @author Quentin
 */
public class PanelRocket extends JPanel {
    private static final int DEFAULT_WIDTH = 1080;

    private static final int DEFAULT_HEIGHT = 620;

    private static final Color DEFAULT_BACKGROUND_COLOR = new Color(43,43,43);

    private static final int NOMBRE_CAPTOR = 6;

    private static final List<String> INDICATORS_NAME = Arrays.asList("TempMotor", "Magnetic", "Pressure",
            "Altimeter", "Accelerometer", "TempOgive");

    private static final List<Integer> INDICATORS_X_POSITION = Arrays.asList(243, 367, 545, 598, 650, 763);

    private static final int INDICATORS_Y_POSITION = 211/2/2+48;

    private static final List<Integer> FIELD_X_POSITION = Arrays.asList(1080/4, (1080/4)*2, (1080/4)*3, 1080/4, (1080/4)*2, (1080/4)*3);

    private static final List<Integer> FIELD_Y_POSITION = Arrays.asList(350, 350, 350, 450, 450, 450);

    private List<LightIndicator> lightIndicatorList = new ArrayList();

    private static List<JTextField> jTextFieldList = new ArrayList();

    private static LoadData loadData;

    /**
     * Constructor
     */
    public PanelRocket() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT));
        setBackground(DEFAULT_BACKGROUND_COLOR);
        setLayout(null);
        this.loadData = new LoadData();
        init();
        update();
    }


    /**
     * Initialisation
     */
    public void init() {
        for (int i = 0; i < NOMBRE_CAPTOR; i++) {
            createLabelIndicator(INDICATORS_NAME.get(i), INDICATORS_X_POSITION.get(i), INDICATORS_Y_POSITION);
        }
        for (int i = 0; i < NOMBRE_CAPTOR; i++) {
            createFieldCaptor(INDICATORS_NAME.get(i), FIELD_X_POSITION.get(i), FIELD_Y_POSITION.get(i));
        }
    }

    /**
     * Create the panel
     * @param name
     * @param x
     * @param y
     */
    private void createLabelIndicator(String name, int x, int y) {
        LightIndicator lightIndicator = new LightIndicator(name);
        lightIndicator.getLabel().setBounds(x, y, 100,100);
        LightIndicator lightIndicator2 = new LightIndicator();
        lightIndicator2.getLabel().setBounds(x, y+1, 100,100);
        this.add(lightIndicator.getLabel());
        this.add(lightIndicator2.getLabel());
        this.lightIndicatorList.add(lightIndicator);
    }

    /**
     *
     * @param name
     * @param x
     * @param y
     */
    private void createFieldCaptor(String name, int x, int y) {
        JLabel jLabel = new JLabel(name + " : ");
        jLabel.setBounds(x-105,y,105,35);
        jLabel.setForeground(Color.white);
        JTextField jTextField = new JTextField("xxxx");
        jTextField.setName(name);
        jTextField.setBounds(x-75,y+40, 130, 35);
        jTextField.setEnabled(false);
        jTextField.setDisabledTextColor(Color.BLACK);
        jTextFieldList.add(jTextField);
        this.add(jLabel);
        this.add(jTextField);
    }

    /**
     * Update
     */
    public static void update() {
        for (JTextField jTextField : jTextFieldList) {
            switch (jTextField.getName())
            {
                case "TempMotor":
                    jTextField.setText(loadData.getTempMotor());
                    break;
                case "Magnetic":
                    jTextField.setText(loadData.getMagnetic());
                    break;
                case "Pressure":
                    jTextField.setText(loadData.getPressure());
                    break;
                case "Altimeter":
                    jTextField.setText(loadData.getAltimeter());
                    break;
                case "Accelerometer":
                    jTextField.setText(loadData.getAccelerometer());
                    break;
                case "TempOgive":
                    jTextField.setText(loadData.getTempOgive());
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon rocket = new ImageIcon("src/main/resources/Images/fusex.png");
        Image myRocket = rocket.getImage();
        g.drawImage(myRocket, (DEFAULT_WIDTH-849)/2, 50, this);
    }
}
