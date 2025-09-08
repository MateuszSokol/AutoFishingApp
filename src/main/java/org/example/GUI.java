package org.example;

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
     * Buttons to interact with user interface
     */
    public Button setMouseCoordinatesButton = new Button("Config");
    public Button launchButton = new Button("Launch");
    public Button settingsButton = new Button("Settings");

    /**
     * Construct initialize GUI with core components
     * Set window height and width to default values
     * Create panel and execute methods to add and create buttons
     */
    public GUI()
    {
        JPanel panel = new JPanel();
        configureButtonProperties();
        configureJPanelProperties(panel);

        configureWindowCoreProperties(panel);



        this.pack();
    }

    /**
     * Set window size with default properties, centre the window and pass panel as content pane
     * @param mainPanel
     */
    public void configureWindowCoreProperties(JPanel mainPanel)
    {
        this.setPreferredSize(new Dimension(WINDOW_WIDTH,WINDOW_HEIGHT));
        this.setLocationRelativeTo(null);
        this.setContentPane(mainPanel);

        this.setVisible(true);
    }


    /**
     * Configure passed panel with BoxLayout and execute function to add Buttons to Panel
     * @param panel
     */
    private void configureJPanelProperties(JPanel panel)
    {

        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        panel.setBorder(new EmptyBorder(10,10,10,10));
        addButtonsToPanel(panel);
    }

    /**
     * Add components to panel
     * @param panel
     */
    private void addButtonsToPanel(JPanel panel)
    {
        panel.add(launchButton);
        panel.add(Box.createVerticalGlue());
        panel.add(settingsButton);
        panel.add(Box.createVerticalGlue());
        panel.add(setMouseCoordinatesButton);

    }

    /**
     * Set minimum size of the buttons
     */
    private void configureButtonProperties()
    {
        this.launchButton.setMinimumSize(new Dimension(100,50));
        this.settingsButton.setMinimumSize(new Dimension(100,50));
        this.setMouseCoordinatesButton.setMinimumSize(new Dimension(100,50));
    }



}
