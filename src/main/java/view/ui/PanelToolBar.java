package view.ui;

import javafx.scene.layout.Pane;
import jiconfont.icons.FontAwesome;
import jiconfont.swing.IconFontSwing;
import model.JButtonToolBar;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * @author Emilien
 */
public class PanelToolBar extends JToolBar {
    public String graphName;
    public ButtonGroup group = new ButtonGroup();

    public PanelToolBar(){
        super();
        initComponents();
    }

    private void initComponents(){
        setPreferredSize(new Dimension(50,720));
        setLayout(new GridLayout(25,1));
        setOrientation(JToolBar.VERTICAL);
        setBackground(new Color(53,53,53));
        setFloatable(false);

        JButtonToolBar jButton1 = new JButtonToolBar("THERMOMETER_EMPTY");
        jButton1.setToolTipText("Ogive temperature");
        group.add(jButton1);
        this.add(jButton1);

        JButtonToolBar jButton2 = new JButtonToolBar("THERMOMETER_FULL");
        jButton2.setToolTipText("Motor temperature");
        group.add(jButton2);
        this.add(jButton2);

        JButtonToolBar jButton3 = new JButtonToolBar("TACHOMETER");
        jButton3.setToolTipText("Accelerometer");
        group.add(jButton3);
        this.add(jButton3);

        JButtonToolBar jButton4 = new JButtonToolBar("SPACE_SHUTTLE");
        jButton4.setToolTipText("Altimeter");
        group.add(jButton4);
        this.add(jButton4);

        JButtonToolBar jButton5 = new JButtonToolBar("SAFARI");
        jButton5.setToolTipText("Pressure");
        group.add(jButton5);
        this.add(jButton5);

        JButtonToolBar jButton6 = new JButtonToolBar("COMPASS");
        jButton6.setToolTipText("Magnetic Field");
        group.add(jButton6);
        this.add(jButton6);

    }

}
