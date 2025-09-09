package org.example.assets;

import java.awt.*;

public final class InputController
{

    private static InputController INSTANCE;
    private Robot robot;

    public static InputController getInstance() throws AWTException {
        if(INSTANCE==null)
        {
            INSTANCE = new InputController();
        }
        return INSTANCE;
    }
    private InputController() throws AWTException {
        this.robot = new Robot();
    }

    public Robot getRobot() {
        return robot;
    }
}
