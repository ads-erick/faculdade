//Escreva um programa em java que receba um inteiro. Realize a soma do
//nu´mero 1 at´e o valor informado pelo usu´ario. Apresente o resultado em
//tela.

package aula03.qo2;

import java.util.Scanner;

public class SomaInteiroFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i<= num; i++) {
            soma += i;
        }
        System.out.println(soma);
    }
}
