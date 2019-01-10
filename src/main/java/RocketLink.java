import model.TemperatureMotor;
import view.ui.FrameRocketLink;
import view.ui.PanelGraph;

/**
 * JFreeChart : a free chart library for the Java(tm) platform.
 * This class is the main of the application.
 *
 * @author Emilien
 *
 * <p>13 decembre 2018 : Version 1 (Emilien)</p>
 */
public class RocketLink {


    /**
     * Constructeur checkStyle
     */
    public RocketLink() {
    }

    /**
     *
     * @param args my args
     */
    public static void main(String[] args) {
        try {
            FrameRocketLink.getInstance();
            for(int i = 0; i < PanelGraph.getListAbstractSensors().size(); i++)
            new Thread((Runnable) PanelGraph.getListAbstractSensors().get(i)).start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
