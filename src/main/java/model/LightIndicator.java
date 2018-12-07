package model;

import jiconfont.icons.FontAwesome;
import jiconfont.swing.IconFontSwing;

import javax.swing.*;
import java.awt.*;

public class LightIndicator extends JLabel{
    private Color colorLabel;
    private JLabel jLabel;
    public Icon icon;
    private String name;

    public LightIndicator(String name) {
        IconFontSwing.register(FontAwesome.getIconFont());
        this.colorLabel = new Color(0,245,255);
        this.icon = IconFontSwing.buildIcon(FontAwesome.EERCAST, 40, colorLabel);
        this.name = name;
        this.jLabel = new JLabel(icon);
        this.jLabel.setName(this.getName());
    }

    public LightIndicator() {
        IconFontSwing.register(FontAwesome.getIconFont());
        this.colorLabel = new Color(0,0,0);
        this.icon = IconFontSwing.buildIcon(FontAwesome.EERCAST, 43, colorLabel);
        this.jLabel = new JLabel(icon);
        this.jLabel.setName(this.getName());
    }

    public JLabel getLabel(){
        return this.jLabel;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
        this.jLabel.setName(name);
    }

    public void setLightColor(Color color){
        this.colorLabel = color;
        this.jLabel.setIcon(IconFontSwing.buildIcon(FontAwesome.EERCAST, 40, colorLabel));
    }
}
