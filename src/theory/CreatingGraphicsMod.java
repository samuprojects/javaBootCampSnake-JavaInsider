package theory;

@SuppressWarnings("ALL")
public class CreatingGraphicsMod {

    /*
    *
    * Será criado mais dois módulos, o Config e o Graphics
    *
    * O Graphics será responsável pela interface gráfica
    *
    * O módulo Game, portanto, possui duas dependências diretas
    *
    * GAME    ------>    CONFIG
    *  |
    *  |
    *  |------------>    GRAPHICS
    *
    * Optado por iniciar pela parte gráfica para ficar mais claro cada etapa do desenvolvimento
    * trazendo os resultados visualmente
    *
    * Para isso na estrutura do projeto foi criado esse módulo, depois um pacote
    * snake.graphics e um module-info
    *
    * Depois acrescentamos no module-info do game um requires para o módulo graphics
    * criando a estrutura de dependência
    *
    * */
}
