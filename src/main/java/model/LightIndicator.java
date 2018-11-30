package model;

import jiconfont.icons.FontAwesome;
import jiconfont.swing.IconFontSwing;

import javax.swing.Icon;
import javax.swing.JLabel;
import java.awt.Color;

/**
 * @author Emilien
 */
public class LightIndicator {
    private LightIndicator lightIndicator;

    private Color DEFAULT_COLOR = new Color(255,0,0);

    /**
     * Constructeur
     */
    public LightIndicator() {
        super();
    }

    /**
     * Getter
     * @return LightIndicator
     */
    public JLabel getLabelLightIndicator() {
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(FontAwesome.EERCAST, 20, DEFAULT_COLOR);
        return new JLabel(icon);
    }

    /**
     * Setter
     * @param color set la couleur de l'indicateur lumineux
     */
    public void setLightColor(Color color) {
        this.DEFAULT_COLOR = color;
    }
}
