package snake.game.scene;

import snake.graphics.basic.Point;
import snake.graphics.drawable.Text;

import static snake.graphics.basic.Color.RED;

@SuppressWarnings("ALL")
public class GameOverText extends Text {

    public GameOverText(int score) {
        super("Fim de jogo. \nPontos: " + score, new Point(400 / 2 - 70, 400 / 2), RED);
    }
}
