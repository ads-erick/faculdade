package aula03.q07;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números da sequência de Fibonacci você deseja ver? ");
        int n = scanner.nextInt();

        int anterior = 0;
        int atual = 1;

        System.out.println("Sequência de Fibonacci com " + n + " termos:");

        for (int i = 1; i <= n; i++) {
            System.out.print(anterior + " ");

            int proximo = anterior + atual;

            anterior = atual;
            atual = proximo;
        }

        System.out.println("\nFim do programa.");
        scanner.close();
    }
}