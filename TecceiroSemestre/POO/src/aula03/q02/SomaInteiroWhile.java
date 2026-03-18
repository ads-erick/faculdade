//Escreva um programa em java que receba um inteiro. Realize a soma do
//nu´mero 1 at´e o valor informado pelo usu´ario. Apresente o resultado em
//tela.

package aula03.q02;

import java.util.Scanner;

public class SomaInteiroWhile {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        int num2 = 1;
        int soma = 0;

        while (num2<=num) {
            soma += num2;
            num2++;
        }
        System.out.print(soma);
    }
}
