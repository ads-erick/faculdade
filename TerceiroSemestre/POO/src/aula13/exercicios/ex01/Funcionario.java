package aula13.exercicios.ex01;

public class Funcionario {

    // Atrbutos da classe
    private double valor_hora;
    private double qtde_horas;

    // Constructor
    public Funcionario(double valor_hora, double qtde_horas) {
        this.valor_hora = valor_hora;
        this.qtde_horas = qtde_horas;
    }

    // Getters
    public double getValor_hora() {
        return valor_hora;
    }

    public double getQtde_horas() {
        return qtde_horas;
    }

    // Setters
    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }

    public void setQtde_horas(double qtde_horas) {
        this.qtde_horas = qtde_horas;
    }

    // Metodo calcular salario
    public double calcularSalario() {
        double salario = this.valor_hora * qtde_horas;
                return salario;
    }


}
