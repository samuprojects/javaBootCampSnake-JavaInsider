package theory;

@SuppressWarnings("ALL")
public class OverridePaintMethod {

    /*
    *
    * Como estamos utilizando a API Swing do Java é necessário entender como funciona o desenho na tela
    *
    * Dentro da janela temos o espaço para desenho que é definido por uma coordenada.
    * Eixo X
    * Eixo Y
    *
    * No canto superior esquerdo da janela temos a coordenada 0,0 ou seja, x = 0, y = 0
    * Por exemplo a janela de 400x400, significa que no canto inferior direito é a posição
    * 399,399
    *
    * O Y cresce de cima para baixo na janela
    * O X cresce da esquerda para a direita
    *
    * Não há valores negativos de X e de Y, o canto mais a esquerda é 0 em X
    * e o mais à direita é o tamanho da janela em largura
    *
    * E no Y o canto superior mais acima é o 0 e o mais abaixo em y é a altura da janela
    *
    * É importante entender isso para poder desenhar corretamente as coisas na tela.
    *
    * Para entender na prática seguir o código na classe JFrameGameWindow com a sobrescrita do método paint()
    * (que é um método que faz parte do JFrame e controla como as coisas são desenhadas na tela)
    *
    *     (0,0)               400 X 400
    *      ------------------------------------------------------------
    *      |                                                          |
    *      |    ----------> x                                         |
    *      |    |                                                     |
    *      |    |                                                     |
    *      |    |                                                     |
    *      |    V                                                     |
    *      |    y                                                     |
    *      |                                                          |
    *      |                                                          |
    *      |                                                          |
    *      |                                                          |
    *      |                                                          |
    *      |                                                          |
    *      ------------------------------------------------------------(399,399)
    *
    *
    *
    *
    *
    * */
}
