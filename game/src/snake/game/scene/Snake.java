package snake.game.scene;

import snake.graphics.basic.Dimension;
import snake.graphics.basic.Point;
import snake.graphics.drawable.Rect;
import snake.graphics.drawable.Shape;

import static snake.graphics.basic.Color.WHITE;

public class Snake extends Shape {

    public Snake() {
        super(WHITE);

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

    }
}
