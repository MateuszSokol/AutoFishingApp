package org.example.gui_assets;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends ParentPanel
{
    /**
     * Buttons to interact with user interface
     */
    public Button setMouseCoordinatesButton = new Button("Config");
    public Button launchButton = new Button("Launch");
    public Button settingsButton = new Button("Settings");

    public MainPanel()
    {
       this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        this.addComponentsToPanel(setMouseCoordinatesButton);
        this.add(Box.createVerticalGlue());
        this.addComponentsToPanel(launchButton);
        this.add(Box.createVerticalGlue());
        this.addComponentsToPanel(settingsButton);
        configureButtonProperties();
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
