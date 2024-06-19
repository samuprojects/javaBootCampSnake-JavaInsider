package snake.game.scene;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import snake.game.core.Direction;
import snake.graphics.basic.Dimension;
import snake.graphics.basic.Point;
import snake.graphics.drawable.Rect;
import snake.graphics.drawable.Shape;

import static snake.game.core.Direction.*;
import static snake.graphics.basic.Color.WHITE;

@SuppressWarnings("ALL")
public class Snake extends Shape {

    private static final Logger LOGGER = LoggerFactory.getLogger(Snake.class);

    private Direction direction;

    public Snake() {
        super(WHITE);

        direction = NONE;

        Point p = new Point(200, 100);
        Dimension d = new Dimension(10, 10);

        Rect rect = new Rect(p, d);
        addRect(rect);

        Point direction = new Point(-1, 0);

        for (int i = 0; i < 10; i++) {
            rect = duplicateRect(rect, direction);
            addRect(rect);
        }
    }

    public void move() {
        if (direction != NONE) {
            Rect head = firstRect();
            Rect.shift(rects());

            Rect newHead = duplicateRect(head, direction.point());
            rects().set(0, newHead);
        }
    }

    public void up() {
        if (direction.canChangeTo(UP))
            direction = Direction.UP;
    }

    public void down() {
        if (direction.canChangeTo(DOWN))
            direction = DOWN;
    }

    public void left() {
        if (direction.canChangeTo(LEFT) && direction != NONE)
            direction = LEFT;
    }

    public void right() {
        if (direction.canChangeTo(RIGHT))
            direction = RIGHT;
    }

    public boolean collidedWithItself() {
        Rect head = firstRect();

        boolean collided = rects().stream().skip(1).anyMatch(r -> head.intersects(r));

        if (collided) {
            LOGGER.debug("Collided with itself!");
        }

        return collided;
    }
}
