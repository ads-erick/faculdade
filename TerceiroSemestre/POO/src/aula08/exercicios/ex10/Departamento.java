package aula08.exercicios.ex10;

import java.util.List;
import java.util.ArrayList;

public class Departamento {

    private String nome;
    private List<Funcionario> funcionarios = new ArrayList<>();

// Constructor
    public Departamento(String nome) {
        this.nome = nome;
    }

// Getters
    public String getNome() {
        return nome;
    }

// Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

// Metodo adicionar funcionario
    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

}
