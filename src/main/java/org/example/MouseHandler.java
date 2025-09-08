package org.example;

import java.awt.*;
import java.awt.event.InputEvent;

public class MouseHandler
{
    public static void performAction(Keyboard_Mouse_Controller keyboardMouseController, int x, int y) throws AWTException, InterruptedException {

        //default values for Point are x = 1000 and y = 420
        Point point = new Point(x, y);
        keyboardMouseController.getRobot().mouseMove(point.x, point.y);
        keyboardMouseController.getRobot().mousePress(InputEvent.BUTTON3_DOWN_MASK);
        Thread.sleep(500);
        keyboardMouseController.getRobot().mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }
}
