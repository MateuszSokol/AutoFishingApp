package org.example;

import org.example.gui_assets.ConfigPanel;
import org.example.gui_assets.MainPanel;
import org.example.gui_assets.ParentPanel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Class represents main app window
 */
public class GUI extends JFrame
{
    /**
     * Default values of Window size
     */
    private final static int WINDOW_WIDTH = 200;
    private final static int WINDOW_HEIGHT = 250;

    /**
     * Panels declaration
     */
    private ConfigPanel configPanel;
    private MainPanel mainPanel;

    /**
     * Construct initialize GUI with core components
     * Set window height and width to default values
     * Create panel and execute methods to add and create buttons
     */
    public GUI()
    {

        this.mainPanel = new MainPanel();
        configureWindowCoreProperties();
        this.setContentPane(mainPanel);
        this.pack();
    }

    /**
     * Set window size with default properties, centre the window and pass panel as content pane
     */
    public void configureWindowCoreProperties()
    {
        this.setPreferredSize(new Dimension(WINDOW_WIDTH,WINDOW_HEIGHT));
        this.setLocationRelativeTo(null);


        this.setVisible(true);
    }



}
