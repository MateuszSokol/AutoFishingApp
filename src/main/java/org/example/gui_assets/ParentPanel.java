package org.example.gui_assets;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Class represents parent for all panels
 */
public class ParentPanel extends JPanel
{
    private final static int TOP_DEFAULT_BORDER = 5;
    private final static int LEFT_DEFAULT_BORDER = 5;
    private final static int BOTTOM_DEFAULT_BORDER = 5;
    private final static int RIGHT_DEFAULT_BORDER = 5;


    public ParentPanel()
    {
        //set default border
        this.setPanelBorder(TOP_DEFAULT_BORDER,LEFT_DEFAULT_BORDER,BOTTOM_DEFAULT_BORDER,RIGHT_DEFAULT_BORDER);
    }

    /**
     * Change border from default
     * @param top
     * @param left
     * @param button
     * @param right
     */
    public void setPanelBorder(int top, int left, int button, int right)
    {
           this.setBorder(new EmptyBorder(top,left,button,right));
    }

    protected void configureJPanelBorderProperties(JPanel panel)
    {

        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(10,10,10,10));

    }
    protected void addComponentsToPanel(Component component)
    {
        this.add(component);
    }

}
