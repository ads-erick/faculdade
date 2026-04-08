package aula08.exercicios.ex11;

// Imports
import java.util.List;
import java.util.ArrayList;

// Atributos
public class Questionario {
    private List<Pergunta> perguntas = new ArrayList<>();

// Constructor
    public Questionario() {
        this.perguntas = new ArrayList<>();
    }

// Getters
    public List<Pergunta> perguntas() {
        return perguntas;
    }

// Metodo adicionarPergunta
    public void adicionarPergunta(String enunciado, List<String> alternativas, int indiceCorreto) {
        Pergunta novaPergunta = new Pergunta(enunciado, alternativas, indiceCorreto);
        this.perguntas.add(novaPergunta);
    }

// Metodo exibirQuestionario
    public void exibirQuestionario() {
        System.out.println("--- QUESTIONÁRIO ---");
        for (Pergunta p : perguntas) {
            System.out.println("Pergunta: " + p.getEnunciado());
            System.out.println("Alternativas: " + p.getAlternativas());
            System.out.println("Índice da Correta: " + p.getIndiceCorreto());
            System.out.println("--------------------");
        }
    }

}
