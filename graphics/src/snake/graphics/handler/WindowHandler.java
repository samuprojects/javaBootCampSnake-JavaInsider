package snake.graphics.handler;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
* para tratar os eventos de janela
*
* */

public class WindowHandler {

    private final JFrame owner;
    private WindowListener currentWindowListener;

    public WindowHandler(JFrame owner) {
        this.owner = owner;
    }

    public void defineWindowClosedHandler(Runnable windowClosedHandler) {
        owner.removeWindowListener(currentWindowListener);

        currentWindowListener = new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                windowClosedHandler.run();
            }
        };
        owner.addWindowListener(currentWindowListener);
    }
}
