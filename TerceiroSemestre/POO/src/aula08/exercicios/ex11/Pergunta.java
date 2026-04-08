package aula08.exercicios.ex11;

// Imports
import java.util.List;
import java.util.ArrayList;

// Atributos da classe
public class Pergunta {
    private String enunciado;
    private List<String> alternativas;
    private int indiceCorreto;

// Constructor
    public Pergunta(String enunciado, List<String> alternativas, int indiceCorreto) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.indiceCorreto = indiceCorreto;
    }

// Getters
    public String getEnunciado() {
        return enunciado;
    }

    public List<String> getAlternativas() {
        return alternativas;
    }

    public int getIndiceCorreto() {
        return indiceCorreto;

    }
}
