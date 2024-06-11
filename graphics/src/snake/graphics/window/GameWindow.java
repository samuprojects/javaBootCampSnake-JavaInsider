package snake.graphics.window;

import snake.graphics.drawable.Drawable;
import snake.graphics.window.internal.JFrameGameWindow;

@SuppressWarnings("ALL")
public class GameWindow {

    private final JFrameGameWindow window;

    public GameWindow(String title, int width, int height) {
        this.window = new JFrameGameWindow(title, width, height);
    }

    public void addDrawable(Drawable drawable) {
        window.getRenderer().add(drawable);
    }

    public void removeDrawable(Drawable drawable) {
        window.getRenderer().remove(drawable);
    }
}
