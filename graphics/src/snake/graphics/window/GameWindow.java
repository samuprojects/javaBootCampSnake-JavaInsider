package snake.graphics.window;

import snake.graphics.drawable.Drawable;
import snake.graphics.drawable.Rect;
import snake.graphics.handler.KeyHandler;
import snake.graphics.handler.WindowHandler;
import snake.graphics.window.internal.JFrameGameWindow;

import java.util.function.Consumer;

@SuppressWarnings("ALL")
public class GameWindow {

    private final JFrameGameWindow window;
    private final KeyHandler keyHandler;
    private final WindowHandler windowHandler;

    public GameWindow(String title, int width, int height) {
        this.window = new JFrameGameWindow(title, width, height);
        keyHandler = new KeyHandler(window, 20);
        windowHandler = new WindowHandler(window);
    }

    public void addDrawable(Drawable drawable) {
        window.getRenderer().add(drawable);
    }

    public void removeDrawable(Drawable drawable) {
        window.getRenderer().remove(drawable);
    }

    public Rect drawingArea() {
        return window.getDrawingArea();
    }

    public void update() {
        window.repaint();
    }

    public void onKeyPressed(Consumer<Key> keyPressedHandler) {
        keyHandler.defineKeyPressedHandler(keyPressedHandler);
    }

    public void onWindowClosed(Runnable windowClosedHandler) {
        windowHandler.defineWindowClosedHandler(windowClosedHandler);
    }
}
