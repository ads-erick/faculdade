package aula08.exercicios.ex10;

public class Main {
    public static void main(String[] args) {

    Funcionario erick = new Funcionario("Erick", "Estagiário");
    Funcionario gemini = new Funcionario("Gemini", "Assitente de IA");

    Departamento departamento = new Departamento("TI");

    departamento.adicionarFuncionario(erick);
    departamento.adicionarFuncionario(gemini);

    System.out.println("O funcionário " + erick.getNome() + " do cargo " + erick.getCargo() + " foi adicionado ao departamento " + departamento.getNome());
    System.out.println("O funcionário" + gemini.getNome() + "do cargo " + gemini.getCargo() + " foi adicionado ao departamento " + departamento.getNome());

    }
}
