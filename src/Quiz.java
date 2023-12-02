import java.util.Scanner; // Importação  a classe Scanner para leitura de entrada do usuário

public class Quiz {
     Pergunta[] perguntas; // Declara um array de objetos Pergunta
     int pontuacao; // Declara uma variável para armazenar a pontuação

    public Quiz(Pergunta[] perguntas) { // Construtor da classe Quiz
        this.perguntas = perguntas; // Inicializa o array de perguntas com as perguntas fornecidas
        this.pontuacao = 0; // Inicializa a pontuação como zero
    }

    public void jogar() { // Método com os comandos de leitura do jogo e laços de repetição
        Scanner scanner = new Scanner(System.in); //  objeto Scanner para ler entradas do usuário

        for (int i = 0; i < perguntas.length; i++) { // Loop pelas perguntas
            Pergunta pergunta = perguntas[i]; // Obtém a pergunta atual
            System.out.println(pergunta.getPergunta()); // Exibe a pergunta
            String[] opcoes = pergunta.getOpcoes(); // Obtém as opções de resposta

            for (int j = 0; j < opcoes.length; j++) { // Loop pelas opções de resposta
                System.out.println(opcoes[j]); // Exibe as opções
            }

            System.out.print("Digite sua resposta (A, B, C ou D): ");
            char resposta = scanner.next().charAt(0); // Lê a resposta do usuário
            resposta = Character.toUpperCase(resposta); // Converte a resposta para maiúscula

            if (resposta == pergunta.getRespostaCorreta()) { // Verifica se a resposta está correta
                System.out.println("Resposta correta!"); // Exibe mensagem de resposta correta
                pontuacao++; // Incrementa a pontuação
            } else {
                System.out.println("Resposta incorreta. A resposta correta era: " + pergunta.getRespostaCorreta() + "\n"); // Exibe mensagem de resposta incorreta e a resposta correta
                System.out.println("Vai de olho fechado se for capaz rsrsrs ");
            }

        }

        scanner.close(); // Fecha o Scanner
        System.out.println("Pontuação final: " + pontuacao + " de " + perguntas.length); // Exibe a pontuação final
    }

    public static void main(String[] args) { // Método principal (ponto de entrada do programa)
        System.out.println(" Faculdade: Unifan Alfredo nascer. \n Aluno: Carlos Eduardo de Souza Machado. \n Porfessor: Brenno Pimenta. \n QUIZ: Tecnologia " );
        System.out.println("===================================================================== ");

        Pergunta[] perguntas = { // Perguntas e resposta - A parte dificil foi descobir como colocar as opçoes da respopsta correra mais a IDE me ajudou

                new Pergunta("O que é uma estrutura de dados homogênea?",
                        new String[]{"A) Uma estrutura de dados com tipos de dados diferentes.", "B) Uma estrutura de dados com tipos de dados semelhantes.", "C) Uma estrutura de dados com apenas um tipo de dado.", "D) Uma estrutura de dados que não contém dados."}, 'B'),

                new Pergunta("Qual é a diferença entre matriz e vetor?",
                        new String[]{"A) Uma matriz é unidimensional, enquanto um vetor é bidimensional.", "B) Uma matriz é uma coleção de vetores.", "C) Um vetor é unidimensional, enquanto uma matriz é bidimensional.", "D) Matriz e vetor são termos intercambiáveis."}, 'C'),

                new Pergunta("O que a propriedade `.length` representa em arrays em Java?",
                        new String[]{"A)  O número de elementos no array.", "B) O tamanho físico do array na memória.", "C) O tamanho máximo permitido para o array.", "D) A capacidade do array para crescimento dinâmico."}, 'A'),

                new Pergunta("Pergunta: Quais são alguns métodos comuns em ArrayList (java Collections)?",
                        new String[]{"A) add(), remove(), size(), get()", "B) push(), pop(), length(), retrieve()", "C) insert(), delete(), length(), fetch()", "D) append(), discard(), count(), retrieve()"}, 'A'),

                new Pergunta("O que é garbage collection em Java?",
                        new String[]{"A) Um método para alocar memória manualmente.", "B) Um processo automático de gerenciamento de memória.", "C) Um tipo de coleção de dados em Java.", "D) Um método para liberar a memória ocupada pelo sistema operacional."}, 'B'),

                new Pergunta("Qual é o objetivo principal de um construtor em programação orientada a objetos?",
                        new String[]{"A) Definir variáveis locais", "B) Inicializar objetos.", "C) Realizar operações matemáticas.", "D) Manipular exceções."}, 'B'),

                new Pergunta("O que é um diagrama de classe?",
                        new String[]{"A) Um gráfico de barras representando classes em um programa", "B) Uma lista de métodos de classe.", "C) Uma estrutura de dados para armazenar informações sobre classes.", "D) Uma representação visual das classes em um sistema e seus relacionamentos."}, 'D'),

                new Pergunta("O que é um SSD em computação?",
                        new String[]{"A) ", "B) Uma estrutura de dados para armazenar informações sobre classes.", "C) Uma lista de métodos de classe.", "D) Uma representação visual das classes em um sistema e seus relacionamentos."}, 'D'),

                new Pergunta("Qual é o princípio de uma pilha (LIFO) em estruturas de dados?",
                        new String[]{"A) Os elementos são removidos em ordem alfabética.", "B) Os elementos são removidos aleatoriamente.", "C) O último elemento inserido é o primeiro a ser removido.", "D) O primeiro elemento inserido é o primeiro a ser removido."}, 'C'),

                new Pergunta("Quais são alguns métodos comuns usados em uma pilha?",
                        new String[]{"A) add(), remove(), size()", "B) insert(), delete(), retrieve()", "C) push(), pop(), peek()", "D) append(), discard(), count()"}, 'C'),

                new Pergunta("O que a classe Stack do Java é usada para?",
                        new String[]{"A) Representar uma pilha de elementos", "B) Realizar operações matemáticas complexas.", "C) Ordenar elementos em ordem alfabética.", "D) Gerar números aleatórios."}, 'A'),

                new Pergunta("O que é uma classe deque?",
                        new String[]{"A) Uma classe para criar diagramas de classe.", "B) Uma classe para ordenar elementos em ordem crescente", "C) Uma classe para criar matrizes bidimensionais.", "D) Uma estrutura de dados que permite a inserção e remoção de elementos em ambas as extremidades"}, 'D'),

                new Pergunta("O que é uma estrutura do tipo fila em programação?",
                        new String[]{"A) Uma estrutura de dados que armazena elementos em ordem aleatória.", "B) Uma estrutura de dados que armazena elementos em ordem alfabética.", "C) Uma estrutura de dados que segue o princípio FIFO (First-In-First-Out).", "D) Uma estrutura de dados que segue o princípio LIFO (Last-In-First-Out)."}, 'C'),

                new Pergunta("Em programação, o que é um 'for' e qual é o seu propósito principal?",
                        new String[]{"A) Um 'for' é uma estrutura de controle usada para realizar operações matemáticas complexas", "B) Um 'for' é usado para definir classes em Java.", "C) Um 'for' é uma estrutura de repetição usada para iterar sobre uma sequência de instruções um número específico de vezes.", "D) Um 'for' é uma estrutura de dados para armazenar elementos em ordem crescente."}, 'C'),

                new Pergunta("Qual é a diferença entre uma matriz e um ArrayList em Java?",
                        new String[]{"A) Uma matriz é uma estrutura de dados dinâmica, enquanto um ArrayList é uma estrutura de dados estática.", "B) Uma matriz pode armazenar diferentes tipos de objetos, enquanto um ArrayList armazena apenas objetos do mesmo tipo.", "C) Uma matriz é uma estrutura de dados unidimensional, enquanto um ArrayList é bidimensional.", "D) Uma matriz tem um tamanho fixo, enquanto um ArrayList pode crescer dinamicamente."}, 'D'),

        };

        Quiz quiz = new Quiz(perguntas); // Cria um objeto Quiz com as perguntas
        quiz.jogar(); // Inicia o quiz
    }
}
/*
  Foi adicionado varios comentario por que eu me perdia no codigo varias vezes. E pq como eu estava ajudando um pessoal eu usei esse codigo como explicação

  PASSO A PASSO DO CODIGO QUIZ:
OBSERVAÇÃO ESSE PASSO A PASSO FOI PEGO PELO CHATGPT. E EU TRANFORMEI ELE EM CODIGO NA LINGUAGEM JAVA. EU SÓ PRECISAVA DA LOGICA.

Passo 1: Definição da classe Pergunta
   - Declara a classe `Pergunta` com os atributos `pergunta`, `opcoes`, e `resposta Correta`.
   - Criar um construtor que recebe a pergunta, as opções e a resposta correta como argumentos e inicializa os atributos da classe.

Passo 2: Definição dos métodos da classe Pergunta
   - `getPergunta()`: Método público que retorna a pergunta.
   - `getOpcoes()`: Método público que retorna as opções de resposta.
   - `getRespostaCorreta()`: Método público que retorna a resposta correta.

Passo 3: Definição da classe Quiz
   - Declaramos a classe `Quiz` com os atributos `perguntas` e `pontuacao`.
   - Criar um construtor que recebe um array de perguntas e inicializa os atributos da classe.

Passo 4: Método `jogar()` na classe Quiz
   - Inicializar um objeto `Scanner` para ler as respostas do usuário.
   - Inicializar a pontuação como zero.
   - Em um loop, iteramos por todas as perguntas.
   - Para cada pergunta:
      - Exibir a pergunta.
      - Exibir as opções de resposta.
      - Solicitar uma resposta ao usuário e a lemos.
      - Converter a resposta para maiúscula.
      - Verificar se a resposta está correta comparando-a com a resposta correta da pergunta.
      - Se a resposta estiver correta, incrementamos a pontuação.
      - Caso contrário, exibimos a resposta correta.
   - Fechamos o objeto `Scanner`.
   - Exibimos a pontuação final.

Passo 5: Método `main()`
   - Criar um array de objetos `Pergunta` com todas as perguntas e respostas corretas.
   - Criar um objeto `Quiz` com as perguntas.
   - Chamar o método `jogar()` no objeto `Quiz` para iniciar o jogo.

Nota: Certifique-se de adicionar todas as perguntas e respostas corretas no array de perguntas de acordo com suas necessidades.

Este é um jogo simples de Quiz em Java que exibe perguntas, opções de resposta e calcula a pontuação final com base nas respostas do usuário.*/