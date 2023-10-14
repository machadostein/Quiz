public class Pergunta {
    private String pergunta; // Declara uma variável privada para armazenar a pergunta
    private String[] opcoes; // Declara uma variável privada para armazenar as opções de resposta
    private char respostaCorreta; // Declara uma variável para armazenar a resposta correta

    public Pergunta(String pergunta, String[] opcoes, char respostaCorreta) {
        // Construtor da classe Pergunta que recebe a pergunta, opções e resposta correta como argumentos
        this.pergunta = pergunta; // Inicializa a variável de instância 'pergunta' com o valor fornecido
        this.opcoes = opcoes; // Inicializa a variável de instância 'opcoes' com o array de opções fornecido
        this.respostaCorreta = respostaCorreta; // Inicializa a variável de instância 'respostaCorreta' com a resposta correta fornecida
    }

    public String getPergunta() {
        // Método público para obter a pergunta
        return pergunta; // Retorna a pergunta armazenada na variável de instância 'pergunta'
    }

    public String[] getOpcoes() {
        // Método público para obter as opções de resposta
        return opcoes; // Retorna o array de opções armazenado na variável de instância 'opcoes'
    }

    public char getRespostaCorreta() {
        // Método público para obter a resposta correta
        return respostaCorreta; // Retorna a resposta correta armazenada na variável de instância 'respostaCorreta'
    }
}
