package org.example.assets;
import java.awt.*;

/**
 * Class represents Mouse
 * Mask for MouseClicks are:
 * 1024 - Left mouse click
 * 2048 - Middle mouse click
 * 4096 - Right mouse click
 */
public class MouseHandler
{

    private int XMousePointerPosition;
    private int YMousePointerPosition;
    private boolean isMouseButtonPressed;

    public MouseHandler()
    {
        this.XMousePointerPosition = 0;
        this.YMousePointerPosition = 0;
    }


    /**
     * Perform mouse movement on screen
     * @param keyboardMouseController
     * @param mouseXPosition
     * @param mouseYPosition
     */
    public void performMouseMove(InputController keyboardMouseController,
                                 int mouseXPosition, int mouseYPosition)
    {
        keyboardMouseController.getRobot().mouseMove(mouseXPosition,mouseYPosition);
    }

    /**
     * Capture mouse Position and return its coordinates as Point
     * @return
     */
    public Point captureMousePointerPositon()
    {
        return MouseInfo.getPointerInfo().getLocation();
    }

    /**
     * Perform mouse press, uses mask to determine what button to press
     * Set property isMousePressed to true
     * @param keyboardMouseController
     * @param mask
     */
    public void performMousePress(InputController keyboardMouseController, int mask)
    {

        keyboardMouseController.getRobot().mousePress(mask);
        isMouseButtonPressed = true;
    }

    /**
     * Perform mouse release, takes mask as parameter to know what key is to release
     * @param keyboardMouseController
     * @param mask
     */
    public void performMouseRelease(InputController keyboardMouseController, int mask)
    {
        keyboardMouseController.getRobot().mouseRelease(mask);
        isMouseButtonPressed = false;
    }

    public int getXMousePointerPosition() {
        return XMousePointerPosition;
    }

    public int getYMousePointerPosition() {
        return YMousePointerPosition;
    }


    public void setXMousePointerPosition(int XMousePointerPosition) {
        this.XMousePointerPosition = XMousePointerPosition;
    }


    public void setYMousePointerPosition(int YMousePointerPosition) {
        this.YMousePointerPosition = YMousePointerPosition;
    }
}
