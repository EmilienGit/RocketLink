package view.ui;


import javax.swing.*;
import java.awt.*;

/**
 * @Author Emilien
 */
public class RocketLinkFrame extends javax.swing.JFrame {
    private static final String DEFAULT_TITLE = "RocketIcon";

    private static RocketLinkFrame instance = new RocketLinkFrame();
    private PanelTabRocket panelTabRocket = new PanelTabRocket();
    private PanelTabGraph panelTabGraph = new PanelTabGraph();
    private JTabbedPane tabs = new JTabbedPane();

    /**
     * Settings of the frame
     */
    private RocketLinkFrame() {
        this.setTitle(DEFAULT_TITLE);
        this.setSize(new Dimension(1200,800));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        this.tabs.addTab("Rocket",this.panelTabRocket);
        this.tabs.addTab("Graphs",this.panelTabGraph);


        this.getContentPane().add(tabs);
        this.setVisible(true);
        this.setIconImage(Toolkit.getDefaultToolkit()
                .getImage("src\\main\\resources\\chocolatine.jpg"));

    }

    public static RocketLinkFrame getInstance(){
        return instance;
    }

}
