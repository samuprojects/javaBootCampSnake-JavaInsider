package theory;

@SuppressWarnings("ALL")
public class UsingJlink {

    /*
    *
    * Para realizar o pacote seguindo o padrão do comando anterior trocamos para jlink
    * adicionamos add-modules com nome do módulo do game e
    * --output para informar onde será montado o pacote
    *
    * jlink --module-path ./out/production:libs --add-modules game --output build
    *
    * após a execução aparecerá na raiz do projeto dentro da IDE a pasta build contendo o jogo completo
    * incluindo um JDK personalizado somente com o necessário em termos de JRE e coisas do jogo.
    *
    * Se quiser distribuir esse conteúdo pode utilizar o mesmo comando acrescendo da propriedade --launcher
    * para criar um executável do jogo passando o nome para esse arquivo seguido de onde está a classe main (utilizando o
    * fully qualified name) conforme a seguir
    *
    * (Excluir a pasta do build realizado a pouco para não gerar erro informando que já existe, para seguir o comando abaixo)
    *
    * jlink --module-path ./out/production:libs --add-modules game --output build --launcher snake=game/snake.game.Launcher
    *
    * Com isso será gerado um novo build com o arquivo executável.
    *
    * Verificado no terminal linux para executar informar sh snake porque o arquivo gerado está sem extensão. Já graficamente, na pasta do build,
    * o linux oferece para executar como um programas sem problemas.
    *
    *
    * */
}
