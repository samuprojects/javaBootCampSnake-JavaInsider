package theory;

@SuppressWarnings("ALL")
public class AbstractionLevels {

    /*
    *
    * É importante entender a abstração da renderização
    *
    * O Game depende de um módulo Graphics.
    * O Graphics depende de um módulo chamado java.desktop
    * Esse módulo tem a implementação de janelas, eventos, etc, é onde está o Swing.
    * Porém não queremos, por uma questão de abstração, que o Game dependa diretamente de java.desktop
    * A ideia é que o Game se comunique com Graphics da forma mais alto nível do que com o Swing
    * Isso traz a vantagem de poder, por exemplo, mudar um mecanismo de renderização se em algum
    * momento não quiser usar mais o Swing
    * Ou seja, sem essa dependência é só alterar o caminho saindo de graphics e indo pra outro lugar
    * que automaticamente o Game continuará funcionando.
    * Por isso não é uma boa prática criar uma dependência de Game com o Swing.
    * O desenho da parede, exemplifica que o Game só comunica com Graphics.
    *
    * O game vai trabalhar o conceito da snake e do food enquanto em graphics vai trabalhar com
    * rect (conjunto de retângulos para formar a snake) e shape (que é o conceito de agrupar retângulos para
    * desenhar uma forma). Assim como o food também pode ser representado por um retângulo.
    *
    * Para renderizar rect e shape, será utilizado os conceitos de color, point (x, y), dimension (largura/altura)
    * que são encontrados na API do Swing.
    * O problema é que para desenhar snake, food, ou a tela de Game over é necessário especificar cores, dimensões, coordenadas
    * e se não desejamos criar uma dependência entre game e Swing, significa que precisamos das classes
    * Color, Point e Dimension definidas dentro do módulo Graphics. E expostas para que o Game possa utilizar.
    *
    * Esses serão os passos das próximas aulas para montar a estrutura base de renderização.
    *
    *
    *              |
    *    |---------|----X---------------------> JAVA.DESKTOP
    *    |         |                               ^
    *    |         |                               |
    *    |         |                               |
    *    |         |                               |
    *  GAME -------|------------>  GRAPHICS --------
    *              |                               ^
    *              |                               |
    * SNAKE        |               RECT       --> COLOR
    * FOOD         |               SHAPE      --> POINT
    *   |          |                       -> --> DIMENSION
    *   |          |                      |
    *   |----------------------------------
    *
    *
    * */
}
