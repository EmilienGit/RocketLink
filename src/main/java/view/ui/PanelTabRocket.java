package view.ui;

import jiconfont.icons.FontAwesome;
import jiconfont.swing.IconFontSwing;
import model.LightIndicator;

import javax.swing.*;
import java.awt.*;

public class PanelTabRocket extends JPanel {
    private static final int DEFAULT_WIDTH = 1000;
    private static final int DEFAULT_HEIGHT = 600;
    private static final Color DEFAULT_BACKGROUND_COLOR = new Color(63,63,63);

    private PanelRocket panelRocket;


    public PanelTabRocket() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT));
        setBackground(DEFAULT_BACKGROUND_COLOR);
        this.panelRocket = new PanelRocket();;
        this.add(this.panelRocket,BorderLayout.CENTER);
    }
}
