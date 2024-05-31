package snake.graphics.window;

import snake.graphics.drawable.Drawable;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/*
* Classe do objeto responsável por renderizar a cena na janela
* ele terá uma lista de drawables que é o que será renderizado
*
* */

@SuppressWarnings("ALL")
public class Renderer {
    private final List<Drawable> drawables;

    public Renderer() { // começa com a lista vazia
        drawables = new ArrayList<>();
    }

    public void render(Graphics g) {
        for (Drawable d : drawables) {
            g.setColor(Color.GREEN); // a cor será definido posteriormente
            d.draw(g); // render entrega a caneta para os drawables, pois não tem a lógica de cada um dos elementos, delega para o método draw de cada um drawables, alterando somente a cor da caneta
        }
    }

    /* utilizar métodos para adicionar ou remover elementos da cena */

    public void add(Drawable drawable) {
        drawables.add(drawable);
    }

    public void remove(Drawable drawable) {
        drawables.remove(drawable);
    }
}


