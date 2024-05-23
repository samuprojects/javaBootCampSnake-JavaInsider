package theory;

@SuppressWarnings("ALL")
public class LogAPI {

    /*
    *
    * Realizado processo de integração do jogo com uma API de Log
    *
    * O objetivo é analisar se as implementações de código estão funcionando como esperado
    *
    * Para isso foi realizado busca em https://search.maven.org para encontrar os jars necessários
    * mas sem a utilização do maven propriamente dito, pois a integração será promovida manualmente dentro do projeto.
    *
    * Na caixa de busca digitado logback e sem dar ENTER já aparece uma opção com os artefatos descritos como
    * ch.qos.logback, selecionando essa opção localizar 2 jars:
    * o logback-classic
    * e o logback-core
    *
    * localizar ambos na mesma versão e realizar o download (professor acessou o link browse
    * e depois escolheu a opção logback-classic-1.4.11.jar
    * + logback-core-1.4.11.jar
    *
    * Em seguida na caixa de pesquisa digitou slf4j para selecionar o do grupo org.slf4j e dentro dele
    * baixar o slf4j-api, no caso dele a versão mais nova era a slf4j-api-2.0.9.jar
    *
    *
    * Após isso dentro da pasta principal do projeto na ide criado um novo Directory com nome libs para agrupar
    * todos os jars externos (realizou um simples control C, control V).
    * Lembrando que eles não são automaticamente incorporados, por isso, com botão direito na pasta libs selecionar
    * Add as Library... na tela sequinte só dar ok.
    *
    * Para associar essa biblioteca da pasta lib no módulo game acessar em File/Project Structure...
    * nos módulos (aba dependencias) foi observado que estava presente o libs na principal mas não no módulo game
    * Para isso no botão + acima da descrição do openjdk... selecionar Library... depois libs, Add Selected,
    * depois Apply, ok.
    *
    * Para utilizar essas dependencias, porque a estrutura do projeto é modularizada, no module-info.java
    * acrescentar a referencia ao slf4j.
    *
    * Depois criado um log para testar.
    *
    * Em seguida criado uma pasta com nome resources no módulo game para configurar o logback.
    * Com o botão direito do menu sobre ela selecionar Mark Directory as , Resources Root.
    * Isso vai indicar para o intellij que no momento da compilação vai juntar tudo num lugar só.
    * Essa pasta também permite separar o código java de outros arquivos que não são java da aplicação.
    *
    * Dentro dessa pasta foi criado um arquivo logback.xml (na verdade foi colado, pois professor explicou
    * que geralmente se aproveita de outros projetos ou modelo base encontrado na internet
    * e vai adequando conforme suas necessidades).
    *
    * Será feito logs diretamente para o console utilizando o nome do módulo e utilizando um nível de DEBUG, com um appender
    * possuindo um padrão de saída
    *
    *
    *
    *
    * */
}
