package snake.graphics.drawable;

/*
* Classe para representar o conceito de uma forma geométrica
* Para nosso jogo o shape representará uma lista de retângulos
*
* */

import snake.graphics.basic.Color;
import snake.graphics.basic.Point;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class Shape extends Drawable {
    private final List<Rect> rects;

    public Shape(Color color) {
        super(color);
        rects = new ArrayList<>();
    }

    public void addRect(Rect rect) {
        rect.setColor(getColor()); // para a cor do retângulo assumir a cor do shape porque a snake terá apenas uma cor
        rects.add(rect); // para adicionar o elemento retângulo dentro do shape
    }

    public List<Rect> rects() {
        return rects;
    }

    /* métodos para retornar o primeiro retângulo e o último, a fim de identificar
    * a cabeça e a cauda da snake importantes para a lógica do jogo */

    public Rect firstRect() {
        return rects.getFirst(); // getFirst adicionado na versão 21 do Java
    } // outra forma de implementar antes do java 21 → rects.get(0);

    public Rect lastRect() {
        return rects.getLast(); // getLast adicionado na versão 21 do Java
    } // outra forma de implementar antes do java 21 → rects.get(rects.size() - 1);

    public boolean intersects(Rect other) { // método para identificar se um retângulo encostou no outro
        return rects
                .stream()
                .anyMatch(r -> r.intersects(other));
    }

    @Override
    public void draw(Graphics g) { // fazer um draw de shape é fazer de cada um dos elementos desse shape
        rects.forEach(r -> r.draw(g)); // o professor prefere utilizar a programação funcional do Java quando possível
    }

    public Rect duplicateRect(Rect baseRect, Point direction) {
        int baseX = baseRect.location().x();
        int baseY = baseRect.location().y();
        int baseWidth = baseRect.dimension().width();
        int baseHeight = baseRect.dimension().height();

        Point p = new Point(baseX + direction.x() * baseWidth, baseY + direction.y() * baseHeight);
        return new Rect(p, baseRect.dimension());
    }
}
