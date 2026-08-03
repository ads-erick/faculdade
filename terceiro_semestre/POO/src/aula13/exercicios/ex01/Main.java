package aula13.exercicios.ex01;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(10, 100);
        System.out.println("O funcionário ganha R$" + funcionario.calcularSalario() + "por mês");

        Lider lider = new Lider(10, 100);
        System.out.println("O líder ganha R$" + lider.calcularSalario() + "por mês");

        Gerente gerente = new Gerente(10, 100);
        System.out.println("O gerente ganha R$" + gerente.calcularSalario() + "por mês");

    }
}
