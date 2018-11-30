import view.ui.FrameRocketLink;

/**
 * @author Emilien
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
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
