package view.ui;


import javax.swing.*;
import java.awt.*;

/**
 * @Author Emilien
 */
public class FrameRocketLink extends javax.swing.JFrame {
    private static final String DEFAULT_TITLE = "RocketLink";

    private static FrameRocketLink instance = new FrameRocketLink();
    private PanelTabRocket panelTabRocket = new PanelTabRocket();
    private PanelTabGraph panelTabGraph = new PanelTabGraph();
    private JTabbedPane tabs = new JTabbedPane();

    /**
     * Settings of the frame
     */
    private FrameRocketLink() {
        this.setTitle(DEFAULT_TITLE);
        this.setSize(new Dimension(1100,700));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        this.tabs.addTab("Rocket",this.panelTabRocket);
        this.tabs.addTab("Graphs",this.panelTabGraph);


        this.getContentPane().add(tabs);
        this.setVisible(true);
        this.setIconImage(Toolkit.getDefaultToolkit()
                .getImage("src/main/resources/Images/Logo_transparent.png"));

    }

    public static FrameRocketLink getInstance(){
        return instance;
    }

}
