package snake.graphics.handler;

import snake.graphics.window.Key;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Optional;
import java.util.function.Consumer;

@SuppressWarnings("ALL")
public class KeyHandler {
    private final JFrame owner;
    private KeyListener currentKeyListener;

    public KeyHandler(JFrame owner) {
        this.owner = owner;
    }

    public void defineKeyPressedHandler(Consumer<Key> keyPressedHandler) {
        owner.removeKeyListener(currentKeyListener);

        currentKeyListener = new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                fromAwtKey(e.getKeyCode()).ifPresent(keyPressedHandler);
            }
        };
        owner.addKeyListener(currentKeyListener);
    }

    private Optional<Key> fromAwtKey(int key) {
        return switch (key) {
            case KeyEvent.VK_UP -> Optional.of(Key.UP);
            case KeyEvent.VK_DOWN -> Optional.of(Key.DOWN);
            case KeyEvent.VK_LEFT -> Optional.of(Key.LEFT);
            case KeyEvent.VK_RIGHT -> Optional.of(Key.RIGHT);
            case KeyEvent.VK_ESCAPE -> Optional.of(Key.ESC);
            default -> Optional.empty();
        };
    }
}
