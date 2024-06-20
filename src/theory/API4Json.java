package theory;

@SuppressWarnings("ALL")
public class API4Json {

    /*
    *
    * Existem várias coisas num jogo que podem ser configuradas sem ter a necessidade de mexer no código principal como por exemplo:
    * cores;
    * velocidade inicial da snake;
    * incremento do valocidade da snake;
    * posição inicial da snake na tela;
    * tamanho da janela, etc.
    *
    * Para isso uma boa prática é externalizar utilizando um arquivo de configuração para que o jogo leia durante a execução.
    *
    * O professor explicou que o arquivo de configuração pode ser em qualquer formato, porém, optou por utilizar o Json
    * por ser de fácil entendimento e ao mesmo tempo expressivo, podendo criar estruturas mais complexas do que outros tipos
    * de arquivo de configuração que se baseiam em apenas chave=valor.
    *
    * Seguindo é necessário utilizar uma API para trabalhar com Json.
    *
    * Foi observado o caminho https://central.sonatype.com
    * (repositório do maven)
    *
    * Em search incluído a busca por gson e selecionado a primeira opção que veio
    * Depois na aba version baixou a última versão disponível (no link Browse) do jar
    *
    * No projeto na pasta libs realizou control C + control V para adicionar às bibliotecas.
    *
    * O mecanismo de configuração será executado por um módulo a parte por isso na pasta raiz do projeto foi criado um novo módulo com nome config
    * (apagou a classe main criada automaticamente).
    *
    * Para fazer o Game depender de config em Project Structure... da IDE... em Modules e selecionando game no + e depois no outro +
    * selecionou Module Dependency... e por último config.
    *
    * No src de config criado um module-info.java para informar a dependência do jar adiconado do gson com requires com.google.gson
    * como deu um erro foi em Project Structure / Modules / config / + / Library... / selecionou libs / Add Selected... / Apply / OK
    *
    * Na sequencia será definido a estrutura do arquivo de configuração e a lógica que fará o parse das informações para o jogo.
    *
    *
    *
    *
    * */
}
