package snake.game.scene;

import snake.game.Game;
import snake.graphics.basic.Point;
import snake.graphics.drawable.Text;

import static snake.graphics.basic.Color.RED;

public class GameOverText extends Text {

    public GameOverText(int score) {
        super("Fim de jogo. \nPontos: " + score, new Point(Game.WINDOW_WIDTH / 2 - 70, Game.WINDOW_HEIGHT / 2), RED);
    }
}