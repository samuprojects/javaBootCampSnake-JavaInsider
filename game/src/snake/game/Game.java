package snake.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import snake.graphics.basic.Color;
import snake.graphics.basic.Point;
import snake.graphics.drawable.Rect;
import snake.graphics.drawable.Text;
import snake.graphics.window.GameWindow;

public class Game {

    private static final Logger LOGGER = LoggerFactory.getLogger(Game.class);

    public void start () {
        LOGGER.debug("Starting");
        GameWindow gameWindow = new GameWindow("Snake!", 400, 400);

        gameWindow.addDrawable(new Rect(20, 20, 200, 100));
        gameWindow.addDrawable(new Text("Hello!", new Point(200, 200), Color.RED));
    }
}
