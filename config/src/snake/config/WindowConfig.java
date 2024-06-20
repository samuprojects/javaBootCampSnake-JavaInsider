package snake.config;

@SuppressWarnings("ALL")
public record WindowConfig(
        int width,
        int height,
        String title,
        String backgroundColor
) {}

/*
*
* Dentro de config foi criado pasta resources e marcada como Resources Root para fazer parte do projeto no bytecode
* Depois criado arquivo json com algumas informações.
* Na sequência criado objeto java para representar essa estrutura, e para isso utilizado um record porque é somente para agrupar os dados
* e no construtor passou as informações necessárias (que são as mesmas do json).
*
* Importante: quando os nomes são iguais ocorre um mapeamento direto, deixando a necessidade de informar qual informação do json vai em qual campo.
*
*
* */