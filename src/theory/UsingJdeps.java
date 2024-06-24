package theory;

@SuppressWarnings("ALL")
public class UsingJdeps {

    /*
    *
    * Para utilizar o jdeps primeiro copiou o diretório do projeto com o botão de menu na IDE selecionando
    * Copy Path / Reference... e depois Absolute Path
    *
    * Colando o caminho no terminal acrescentou no início o cd para entrar no diretório do projeto
    *
    * (Professor abriu um parênteses para explicar que tudo que está compilado encontra-se na pasta out/production do projeto
    * que é o ponto de partida para realizar o empacotamento)
    *
    * A primeira ação é saber quais as dependencias do projeto para isso informamos o comando jdeps --module-path
    * passando a pasta ./out/production e a pasta libs seguido do nome do módulo game
    *
    * No windows do professor ficou:
    * jdeps --module-path .\out\production;libs game
    * No linux
    * jdeps --module-path ./out/production:libs game
    *
    * deu Error: slf4j-api-2.0.11.jar is a multi-release jar file but --multi-release option is not set
    *
    * explicou que se trata do jar do gson ter várias versões de código dentro dele, por isso acrescentou os comandos a seguir:
    * jdeps --module-path .\out\production;libs --multi-release 9 --module game
    * (sobre usar o 9 informou que é a versão que suporta módulos como os da nossa aplicação)
    *
    * No linux ficou
    * jdeps --module-path ./out/production:libs --multi-release 9 --module game
    *
    * o resultado é o que foi copiado a seguir
game
 [file:///home/CAMINHO_PESSOAL_ALTERADO/IdeaProjects/javaBootCampSnake-JavaInsider/./out/production/game/]
   requires config
   requires graphics
   requires mandated java.base (@21.0.2)
   requires org.slf4j (@2.0.11)
game -> config
game -> graphics
game -> java.base
game -> org.slf4j
   snake.game                                         -> java.lang                                          java.base
   snake.game                                         -> snake.game.core                                    game
   snake.game.core                                    -> java.lang                                          java.base
   snake.game.core                                    -> java.lang.invoke                                   java.base
   snake.game.core                                    -> java.util.function                                 java.base
   snake.game.core                                    -> org.slf4j                                          org.slf4j
   snake.game.core                                    -> snake.config                                       config
   snake.game.core                                    -> snake.config.loader                                config
   snake.game.core                                    -> snake.game.scene                                   game
   snake.game.core                                    -> snake.graphics.basic                               graphics
   snake.game.core                                    -> snake.graphics.drawable                            graphics
   snake.game.core                                    -> snake.graphics.window                              graphics
   snake.game.scene                                   -> java.lang                                          java.base
   snake.game.scene                                   -> java.lang.invoke                                   java.base
   snake.game.scene                                   -> java.util                                          java.base
   snake.game.scene                                   -> java.util.function                                 java.base
   snake.game.scene                                   -> java.util.stream                                   java.base
   snake.game.scene                                   -> org.slf4j                                          org.slf4j
   snake.game.scene                                   -> snake.config                                       config
   snake.game.scene                                   -> snake.config.model                                 config
   snake.game.scene                                   -> snake.game.core                                    game
   snake.game.scene                                   -> snake.game.util                                    game
   snake.game.scene                                   -> snake.graphics.basic                               graphics
   snake.game.scene                                   -> snake.graphics.drawable                            graphics
    *
    *
    * Como trouxe muita informação o professor falou que pode ser resumido acrescentando um -s depois do libs ficando assim
    * jdeps --module-path ./out/production:libs -s --multi-release 9 --module game
    *
    * o resultado será apenas um sumário, um resumo das dependências
    * game -> config
    * game -> graphics
    * game -> java.base
    * game -> org.slf4j
    *
    *
    * Até aqui não houve nenhuma criação de pacote, pois estamos solicitando apenas para o JDK exibir quais são as dependências do módulo game
    * Se fizer a mesma coisa para o módulo config o resultado será
    *
    * jdeps --module-path ./out/production:libs -s --multi-release 9 --module config
    * config -> com.google.gson
    * config -> java.base
    *
    * Se fizer com o graphics
    * jdeps --module-path ./out/production:libs -s --multi-release 9 --module graphics
    * graphics -> java.base
    * graphics -> java.desktop
    * graphics -> org.slf4j
    *
    * Essa ferramenta é extremamente importante em projetos de médio ou grande porte para mapear as dependências, pois,
    * ao realizar o empacotamento é necessário conhecer as dependências para entender como determinado pacote será montado.
    *
    * */
}
