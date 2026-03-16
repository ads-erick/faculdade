// Escreva um programa em java que receba um inteiro. Verifique se o valor
// é par ou ı́mpar. Apresente o resultado em tela.

package aula02.q02;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é Par.");
        } else {
            System.out.println("O número " + numero + " é Ímpar.");
        }

        entrada.close();
    }
}
