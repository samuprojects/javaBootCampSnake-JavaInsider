package snake.game.scene;

import snake.graphics.basic.Point;
import snake.graphics.drawable.Rect;

import static snake.game.util.RandomUtils.random;
import static snake.graphics.basic.Color.RED;

@SuppressWarnings("ALL")
public class Food extends Rect {
    private static final int SIZE = 5;

    private final Rect drawingArea;
    private int eatenTimes;

    public Food(Rect drawingArea, Snake snake) {
        this.drawingArea = drawingArea;

        moveToRandomLocation(snake);
        dimension(SIZE, SIZE);
        setColor(RED);
    }

    public void moveToRandomLocation(Snake snake) {
        int distanceFromBorder = 5;

        do {

            int x = random(drawingArea.minX() + distanceFromBorder, drawingArea.maxX() - SIZE - distanceFromBorder);
            int y = random(drawingArea.minY() + distanceFromBorder, drawingArea.maxY() - SIZE - distanceFromBorder);

            location(new Point(x, y));

        } while (snake.intersects(this));
    }

    public void eatIfFood(Snake snake) {
        if (snake.intersects(this)) {
            eatenTimes++;
            moveToRandomLocation(snake);
        }
    }

    public int getEatenTimes() {
        return eatenTimes;
    }
}
