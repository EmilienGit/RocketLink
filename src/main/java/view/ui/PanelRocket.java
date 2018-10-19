package view.ui;

import javafx.scene.control.RadioButton;
import javafx.scene.layout.Background;
import javafx.scene.shape.Circle;
import view.graphs.GraphView;

import javax.swing.*;
import java.awt.*;


public class PanelRocket extends JPanel {
    private static final int DEFAULT_WIDTH = 1180;
    private static final int DEFAULT_HEIGHT = 720;
    private static final Color DEFAULT_BACKGROUND_COLOR = new Color(43,43,43);

    public PanelRocket() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT));
        setBackground(DEFAULT_BACKGROUND_COLOR);
    }
}
