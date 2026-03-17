// Escreva um programa em java que receba dois inteiros. Realize a divisão
//entre os números e apresente o resultado em tela. Observe o que acontece
//quando se divide um número por zero.

package aula02.q03;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Divisão entre 2 números em Java");

        System.out.println("Insira o dividendo: ");
        int num1 = entrada.nextInt();

        System.out.println("Insira o divisor: ");
        int num2 = entrada.nextInt();

        int resultado = num1 / num2;

        System.out.println("O resultado da divisão de " + num1 + " / " + num2 + " = " + resultado);

        entrada.close();

    }
}
