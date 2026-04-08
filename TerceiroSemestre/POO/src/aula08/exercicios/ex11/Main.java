package aula08.exercicios.ex11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Questionario quiz = new Questionario();

        List<String> alt1 = new ArrayList<>();
        alt1.add("Ubuntu");
        alt1.add("Windows");
        alt1.add("MacOS");
        quiz.adicionarPergunta("Qual SO você usa no terminal?", alt1, 0);

        List<String> alt2 = new ArrayList<>();
        alt2.add("Java");
        alt2.add("Python");
        alt2.add("Elixir");
        quiz.adicionarPergunta("Qual dessas linguagens é fortemente tipada?", alt2, 0);

        quiz.exibirQuestionario();
    }
}