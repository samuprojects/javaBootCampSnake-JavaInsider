package theory;

@SuppressWarnings("ALL")
public class RenderingModuleConcept {

    /*
    *
    *   Até o momento criamos um módulo Graphics que contém a classe JFrameGameWindow (representa a janela) para mostrar coisas na tela por meio do Renderer
    *   O Renderer pode desenhar elementos do tipo Drawable, que podem ser os elementos criados Rect, Shape (vários Rects) ou Text
    *   Cada um deles utilizam os três elementos básicos de Color, Dimension e Point (estrutura básica)
    *   Quem interage com esse módulo é o Game.
    *   A classe JFrameGameWindow herda de JFrame, que é um componente da API Swing do Java.
    *   Se exteriorizar essa classe JFrameGameWindow o módulo Game terá acesso as implementações e isso não é interessante.
    *   O módulo Game não pode ser dependente do Swing, pois se quiser mudar a forma de renderizar terá problemas.
    *   Para evitar esse problema a seguir será criado uma nova classe chamada GameWindow que é quem ficará exposta para outros módulos.
    *   Dessa forma toda vez que Game precisar de uma janela vai chamar essa nova classe que vai acionar a JFrameGameWindow tornando-a um elemento interno,
    *   assim como as demais estruturas.
    *   Com isso temos como um escudo, um ponto único de comunicação que não externaliza as dependências internas de Graphics, permitindo a mudança de
    *   estrutura se for necessário.
    *   Ficará exposto para o GameWindow os Drawables e as estruturas básicas.
    *
    *
    * GAME                                      Módulo GRAPHICS
    *  |             |----------------------------------------------------------------------
    *  |             |                                                                     |
    *  |             |                                                                     |
    *  |             |      JFRAMEGAMEWINDOW (interno                                      |
    *  |             |        ^         |                                                  |
    *  |             |       /          |                                COLOR             |
    *  |             |     /            V                                DIMENSION         |
    *  |------->   GAME  /           RENDERER    ---->   DRAWABLE        POINT             |
    *             WINDOW                (interno)           |                              |
    *                |                                      |---->RECT                     |
    *                |                                      |---->SHAPE -> Série de Rects  |
    *                |                                      |---->TEXT                     |
    *                |                                                                     |
    *                |---------------------------------------------------------------------|
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    * */
}
