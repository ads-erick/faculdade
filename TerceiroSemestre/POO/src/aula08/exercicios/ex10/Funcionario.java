package aula08.exercicios.ex10;

public class Funcionario {
    private String nome;
    private String cargo;

// Constructor
    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

// Getters
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

// Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
