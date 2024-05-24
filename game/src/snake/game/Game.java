package snake.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import snake.graphics.window.JFrameGameWindow;

public class Game {

    private static final Logger LOGGER = LoggerFactory.getLogger(Game.class);

    public void start () {
        LOGGER.debug("Starting");

        new JFrameGameWindow("Snake!", 400, 400);
    }
}
