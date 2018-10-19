package view.ui;

import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;

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

        JButton jButton = new JButton();
        jButton.setText("Emi");
        group.add(jButton);
        this.add(jButton);

        JButton jButton2 = new JButton();
        jButton2.setText("Neo");
        group.add(jButton2);
        this.add(jButton2);

        JButton jButton3 = new JButton();
        jButton3.setText("Flo");
        group.add(jButton3);
        this.add(jButton3);

        JButton jButton4 = new JButton();
        jButton4.setText("Oreo");
        group.add(jButton4);
        this.add(jButton4);
    }

}
