package model;

import jiconfont.icons.FontAwesome;
import jiconfont.swing.IconFontSwing;

import javax.swing.*;
import java.awt.*;

public class LightIndicator {
    private LightIndicator lightIndicator;
    private Color DEFAULT_COLOR = new Color(255,0,0);

    public JLabel getLabelLightIndicator(){
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(FontAwesome.EERCAST, 20, DEFAULT_COLOR);
        JLabel label = new JLabel(icon);
        return label;
    }

    public void setLightColor(Color color){
        this.DEFAULT_COLOR = color;
    }
}
