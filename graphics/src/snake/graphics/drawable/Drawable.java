package snake.graphics.drawable;

import snake.graphics.basic.Color;

import java.awt.*;

/*super classe para encapsular os outros elementos desenháveis*/

@SuppressWarnings("ALL")
public abstract class Drawable {
    private Color color;

    public Drawable(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return getClass().getSimpleName();
    }

    public void setColor(Color color) {
        this.color = color;
    }

    /* vai receber um Graphics que é o elemento do awt Swing que representa a caneta
    * e cada um dos Drawables que estender de Drawable terá de fornecer uma implementação
    * informando como essa caneta será utilizada.
    * Ou seja, essa é a classe base que será utilizada para renderização.
    * */
    public abstract void draw(Graphics g);
}
