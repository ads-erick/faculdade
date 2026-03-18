//Escreva um programa que calcule a média final em um bimestre. O
//usuário deve informar quantas atividades teve no bimestre. Em seguida, o
//programa deve solicitar as notas de cada atividade e calcular a média
//aritmética. Apresente o resultado em tela.

package aula03.q04;

import java.util.Scanner;

public class CalculcaMedia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double soma = 0;

        System.out.print("Insira a quantidade de atividades do semestre: ");
        int qtdAtividades = scanner.nextInt();

        for (int i = 1; i <= qtdAtividades; i++) {
            System.out.print("Insira a nota da " + i +"º atividade: ");
            float nota = scanner.nextFloat();
            soma += nota;
        }

        double media = (soma / qtdAtividades);
        System.out.println("A sua média é = " + media);
        System.out.println("Fim do programa");

    }
}
