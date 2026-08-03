package aula13.exercicios.ex01;

public class Lider extends Funcionario{

    // Constructor
    public Lider(double valor_hora, double qtde_horas) {
        super(valor_hora, qtde_horas);
    }

    @Override
    public double calcularSalario() {
        double salariobase = super.calcularSalario();

        return salariobase * 1.02;
    }
}
