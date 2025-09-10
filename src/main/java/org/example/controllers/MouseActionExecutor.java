package org.example.controllers;

import java.awt.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MouseActionExecutor
{
    /**
     * Create and initialize scheduler for thread management
     */
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    /**
     * Perform mouse move and mouse click in desired location, use scheduler to prevent blocking main thread
     * @param keyboardMouseController
     * @param desiredLocation
     * @param mask
     * @param mouseHandler
     * @throws InterruptedException
     */
    public  static void performMouseShortClickAction(InputController keyboardMouseController, Point desiredLocation, int mask, MouseHandler mouseHandler) throws InterruptedException {

        //default values for Point are x = 1000 and y = 420
        int x = desiredLocation.x;
        int y = desiredLocation.y;
        mouseHandler.performMouseMove(keyboardMouseController,x,y);

        //use scheduler to create thread to prevent app freezing
        scheduler.schedule(() -> {
            mouseHandler.performMousePress(keyboardMouseController, mask);
            mouseHandler.performMouseRelease(keyboardMouseController, mask);

            // update mouse pointer position
            mouseHandler.setXMousePointerPosition(x);
            mouseHandler.setYMousePointerPosition(y);
        }, 500, TimeUnit.MILLISECONDS);
    }
}
