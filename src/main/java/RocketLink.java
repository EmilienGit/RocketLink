import view.ui.RocketLinkFrame;

/**
 * @Author Emilien
 */
public class RocketLink {
    /**
     *
     * @param args my args
     */
    public static void main(String[] args) {
        try {
            RocketLinkFrame.getInstance();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
