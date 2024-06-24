package theory;

@SuppressWarnings("ALL")
public class CheckingTools {

    /*
    *
    * Professor explicou para checar o funcionamento das ferramentas diretamente em linha de comando
    *
    * no terminal caso o java esteja configurado nas vareiáveis de ambiente basta apenas digitar
    * java --version
    * e verificar se é a mesma da utilizada na IDE
    *
    * Ele falou que prefere utilizar o caminho completo para não perder tempo com as configurações, para isso em Project Structure... da IDE,
    * no Edit a frente do SDK, copiou o caminho completo, de onde vem o JDK usado na IDE (JDK home path), e colou no terminal acrescentando a pasta bin e
    * digitando o mesmo comando
    * Exemplo no caso do caminho do professor pelo windows:  C:\Users\ctosin\.jdks\openjdk-21\bin\java --version
    *
    * Outras duas ferramentas a serem utilizadas são jdeps
    * exemplo professor: C:\Users\ctosin\.jdks\openjdk-21\bin\jdeps --version
    *
    * e o jlink
    * exemplo: C:\Users\ctosin\.jdks\openjdk-21\bin\jlink -- version
    *
    * O importante é certificar-se de utilizar as ferramentas todas do mesmo JDK.
    * Não pode compilar o código com uma versão X do JDK, e na hora de gerar o pacote usar uma versão Y do JDK, pois haverá algum tipo de conflito.
    *
    *
    * */
}
