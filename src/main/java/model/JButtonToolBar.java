package model;

import jiconfont.icons.FontAwesome;
import jiconfont.swing.IconFontSwing;

import javax.swing.JButton;
import java.awt.Color;

/**
 * @author Emilien
 */
public class JButtonToolBar extends JButton {

    /**
     * Constructeur
     * @param myIcon l'icon du button
     */
    public JButtonToolBar(String myIcon) {
        super();
        setIcon(IconFontSwing.buildIcon(FontAwesome.valueOf(myIcon), 20, new Color(200,200,200)));
        setBorderPainted(false);
        setBackground(new Color(53,53,53));
        setFocusPainted(false);
    }
}
