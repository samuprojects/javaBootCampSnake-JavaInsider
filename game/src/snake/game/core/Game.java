package snake.game.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import snake.game.scene.Background;
import snake.game.scene.Food;
import snake.game.scene.GameOverText;
import snake.game.scene.Snake;
import snake.graphics.window.GameWindow;

import static snake.graphics.basic.Color.BLACK;

@SuppressWarnings("ALL")
public class Game {

    private static final Logger LOGGER = LoggerFactory.getLogger(Game.class);
    public static final int WINDOW_WIDTH = 400;
    public static final int WINDOW_HEIGHT = 400;
    private static final String WINDOW_TITLE = "Snake!";
    private static final int MAX_SNAKE_SPEED = 50;

    private GameWindow gameWindow;
    private Snake snake;
    private Food food;
    private volatile boolean running;

    public void start () {
        LOGGER.debug("Starting the game....");
        gameWindow = new GameWindow(WINDOW_TITLE, WINDOW_WIDTH, WINDOW_HEIGHT);

        setupKeyPressedHandler();
        setupWindowClosedHandler();
        addElementsToScreen();
        startGameLoop();
    }

    private void setupKeyPressedHandler() {
        gameWindow.onKeyPressed(k -> {
            LOGGER.debug("Key pressed: {}", k);
            switch (k) {
                case UP -> snake.up();
                case DOWN -> snake.down();
                case LEFT -> snake.left();
                case RIGHT -> snake.right();
                case ESC -> System.exit(0);
            }
        });
    }

    private void setupWindowClosedHandler(){
        gameWindow.onWindowClosed(() -> running = false);
    }

    private void addElementsToScreen() {
        gameWindow.addDrawable(
                new Background(WINDOW_WIDTH, WINDOW_HEIGHT, BLACK)
        );

        snake = new Snake();
        gameWindow.addDrawable(snake );

        food = new Food(gameWindow.drawingArea(), snake);
        gameWindow.addDrawable(food);

    }

    private void startGameLoop() {
        running = true;
        do {
            updateScene();
        } while (!isGameOver());

        processGameOver();

        LOGGER.debug("The End!");
    }

    private void updateScene() {
        snake.move();
        food.eatIfFood(snake);
        gameWindow.update();
        sleep(MAX_SNAKE_SPEED - snake.speed());
    }

    private boolean isGameOver() {
        return !running || snake.collidedWithItself() || snake.collidedWithWindowBounds(gameWindow.drawingArea());
    }

    private void processGameOver() {
        gameWindow.removeDrawable(snake);
        gameWindow.removeDrawable(food);
        gameWindow.addDrawable(new GameOverText(food.getEatenTimes()));
        gameWindow.update();
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
