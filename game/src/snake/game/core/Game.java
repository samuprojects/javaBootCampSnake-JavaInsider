package snake.game.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import snake.game.scene.Background;
import snake.game.scene.Food;
import snake.game.scene.Snake;
import snake.graphics.window.GameWindow;

import static snake.graphics.basic.Color.BLACK;

@SuppressWarnings("ALL")
public class Game {

    private static final Logger LOGGER = LoggerFactory.getLogger(Game.class);
    public static final int WINDOW_WIDTH = 400;
    public static final int WINDOW_HEIGHT = 400;
    private static final String WINDOW_TITLE = "Snake!";

    private GameWindow gameWindow;
    private Snake snake;

    public void start () {
        LOGGER.debug("Starting the game....");
        gameWindow = new GameWindow(WINDOW_TITLE, WINDOW_WIDTH, WINDOW_HEIGHT);

        addElementsToScreen();
        startGameLoop();
    }

    private void addElementsToScreen() {
        gameWindow.addDrawable(
                new Background(WINDOW_WIDTH, WINDOW_HEIGHT, BLACK)
        );

        snake = new Snake();
        gameWindow.addDrawable(snake );
        gameWindow.addDrawable(new Food(gameWindow.drawingArea()));

    }

    private void startGameLoop() {
        do {
            updateScene();
        } while (!isGameOver());
    }

    private void updateScene() {
        snake.move();
        gameWindow.update();
        sleep(50);
    }

    private boolean isGameOver() {
        return false;
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
