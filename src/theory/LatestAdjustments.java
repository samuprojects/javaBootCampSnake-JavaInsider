package theory;

@SuppressWarnings("ALL")
public class LatestAdjustments {

    /*
    *
    * Da forma em que está o slf4j apresenta um pequeno erro devido bind dos serviços desabilitado no momento do empacotamento
    *
    * para habilitar basta utilizar o comando anterior acrescentando --bind-services
    *
    * por isso excluído novamente a pasta build e refazer com o comando abaixo
    *
    * jlink --module-path ./out/production:libs --add-modules game --output build --launcher snake=game/snake.game.Launcher --bind-services
    *
    *
    *
    * */
}
