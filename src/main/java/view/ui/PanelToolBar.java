package view.ui;

import controler.ActionAddRemoveSensor;
import model.JButtonToolBar;
import model.AbstractSensor;
import org.jfree.chart.ChartPanel;

import javax.swing.ButtonGroup;
import javax.swing.JToolBar;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Emilien
 */
public class PanelToolBar extends JToolBar {
    public static final ButtonGroup group = new ButtonGroup();

    /**
     * Constructeur
     */
    public PanelToolBar() {
        super();
        initComponents();
    }

    /**
     * Initialisation des compsants
     */
    private void initComponents() {
        setPreferredSize(new Dimension(50,620));
        setLayout(new GridLayout(25,1));
        setOrientation(JToolBar.VERTICAL);
        setBackground(new Color(53,53,53));
        setFloatable(false);

        final String[] iconButtonList = {"THERMOMETER_EMPTY","THERMOMETER_FULL","SAFARI","COMPASS","SPACE_SHUTTLE","TACHOMETER",};

        String[] resumeButtonList = {"Ogive temperature","Motor temperature","Pressure","Magnetic Field","Altimeter","Accelerometer"};

        for (int i = 0; i < iconButtonList.length; i++) {
            final AbstractSensor abstractSensor = PanelGraph.getListAbstractSensors().get(i);
            final ChartPanel chartPanel = PanelGraph.getListPanelSensors().get(i);
            final JButtonToolBar jButton = new JButtonToolBar(iconButtonList[i]);
            jButton.setToolTipText(resumeButtonList[i]);
            jButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    ActionAddRemoveSensor actionAddRemoveSensor = new ActionAddRemoveSensor();
                    actionAddRemoveSensor.addRemoveSensor(PanelTabGraph.getPanelGraph(),
                            chartPanel,
                            abstractSensor);
                }
            });
            group.add(jButton);
            this.add(jButton);
        }

        final JButtonToolBar jButton3 = new JButtonToolBar("PLUS_CIRCLE");
        jButton3.setToolTipText("Add every sensors");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ActionAddRemoveSensor actionAddRemoveSensor = new ActionAddRemoveSensor();
                actionAddRemoveSensor.addAllSensors(PanelTabGraph.getPanelGraph(),
                        PanelGraph.getListPanelSensors(),
                        PanelGraph.getListAbstractSensors());
            }
        });
        group.add(jButton3);
        this.add(jButton3);

        final JButtonToolBar jButton2 = new JButtonToolBar("MINUS_CIRCLE");
        jButton2.setToolTipText("Remove every sensors");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ActionAddRemoveSensor actionAddRemoveSensor = new ActionAddRemoveSensor();
                actionAddRemoveSensor.removeAllSensors(PanelTabGraph.getPanelGraph(),
                        PanelGraph.getListPanelSensors(),
                        PanelGraph.getListAbstractSensors());
            }
        });
        group.add(jButton2);
        this.add(jButton2);


    }

    /**
     * Getter
     * @return group des Button
     */
    public ButtonGroup getGroup() {
        return group;
    }

}
