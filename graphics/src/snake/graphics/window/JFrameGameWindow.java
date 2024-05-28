package snake.graphics.window;

/*
*
* Será utilizado Swing para montar a parte gráfica
* Como a aplicação está modularizada não é possível utilizar JFrame diretamente
* Por isso adicionamos uma dependência no module-info de graphics para java.desktop
*
* sobre os métodos:
* setResizable(false) não permite que a tela seja redimensionada
*
* setLocationRelativeTo(null) permite definir a localização da janela com base na localização de outra janela
* com o parâmetro null indica que definimos a localização com base na tela
* de forma que ao inicializar sempre abrirá centralizado.
*
* setDefaultCloseOperation(EXIT_ON_CLOSE) definido inicialmente para encerrar a aplicação
* ao clicar no X do canto superior da tela.
*
* Depois criado pacote para essa classe de graphics e informado no módulo sobre a exportação desse pacote
* Dessa forma todos que dependem de graphics terão acesso a esse pacote, como na classe Game.
*
* Como o mecanismo de dependência foi definido como o próprio intellij é necessário no project structure,
* adicionar o módulo graphics para o game.
*
* Ao executar o JFrame é possível ver uma janela renderizada e ao fechar a JVM encerra a aplicação.
*
* */

import javax.swing.*;
import java.awt.*;

public class JFrameGameWindow extends JFrame {

    public JFrameGameWindow(String title, int width, int height) {
        setTitle(title);
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) { // o objeto Graphics passado nesse método é como se fosse a caneta de desenho
        //g.setColor(Color.RED);
        //g.fillRect(200, 100, 70, 70); // permite desenhar um retangulo preenchido (por padrão a tela é branca e o desenho em preto)

        //g.setColor(Color.BLUE); // alterar a cor da caneta para outra cor
        //g.fillRect(100,20, 70, 50);

        //g.fillRect(0,300, 80, 80); // também será azul, pois foi a última cor definida em color

        // será muito utilizado, pois é o que vai desenhar a snake (vários retângulos na tela)

        // para deixar toda a tela escura usar os conceitos acima em toda a tela,
        // ou seja, não existe uma técnica para cor de fundo, e sim pintar da cor desejada
        // na dimensão total da tela, para dar a impressão de fundo preto.
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 400, 400);

    }
}
