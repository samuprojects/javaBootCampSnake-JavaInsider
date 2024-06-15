package snake.graphics.drawable;

/*
*  Classe para representar o retângulo, vamos usar implementação parcial
* utilizando recurso de delegação por meio de um objeto Rectangle do awt
* que já possui algumas implementações diversas para um retângulo, como
* o método intersects que é muito utilizado para detectar colisão, ou seja,
* se duas figuras geométricas estão encostando uma na outra.
* Não utilizamos a classe Rectangle diretamente, pois precisamos de coisas específicas
* para a nossa realidade e por isso será implementado em Rect que servirá como um adaptador,
* utilizando internamente a classe Rectangle para execução de toda a lógica, escondendo algumas coisas,
* e transformando outras para atender a camada de renderização do jogo.
*
* */


import snake.graphics.basic.Point;
import snake.graphics.basic.Dimension;

import java.awt.*;


import static snake.graphics.basic.Color.BLACK;

@SuppressWarnings("ALL")
public class Rect extends Drawable {
    private final Rectangle rectangle;

    public Rect(int x, int y, int width, int height) {
        super(BLACK);
        this.rectangle = new Rectangle(x, y, width, height);
    }

    public Rect(Point point, Dimension dimension) {
        this(point.x(), point.y(), dimension.width(), dimension.height());
    }

    public Rect() {
        this(0, 0, 0, 0);
    }

    public Point location() { // retornar a localização de x , y, pois a classe Rectangle já deixa público os atributos sem a necessidade getters
        return new Point(rectangle.x, rectangle.y);
    }

    public void location(Point point) {
        rectangle.x = point.x();
        rectangle.y = point.y();
    }

    public Dimension dimension() { // a mesma coisa para a dimensão
        return new Dimension(rectangle.width, rectangle.height);
    }

    public void location(Dimension dimension) {
        rectangle.width = dimension.width();
        rectangle.height = dimension.height();
    }

    public void dimension(int width, int height) { // método para alterar a dimensão
        rectangle.width = width;
        rectangle.height = height;
    }


    /* métodos a seguir para retornar as coordenadas mínimas e máximas em cada um dos eixos */

    public int minX() {
        return (int) rectangle.getMinX();
    }

    public int minY() {
        return (int) rectangle.getMinY();
    }

    public int maxX() {
        return (int) rectangle.getMaxX();
    }

    public int maxY() {
        return (int) rectangle.getMaxY();
    }

    /* método para detectar colisão */
    public boolean intersects(Rect rect) {
        return rectangle.intersects(rect.rectangle);
    }

    @Override
    public void draw(Graphics g) {
        g.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }
}
