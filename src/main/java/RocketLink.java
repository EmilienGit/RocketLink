import view.ui.FrameRocketLink;

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
            FrameRocketLink.getInstance();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
