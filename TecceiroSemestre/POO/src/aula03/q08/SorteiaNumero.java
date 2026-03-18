//Escreva um programa que gere aleatóriamente um número ( por exemplo,
//entre 1 e 10) e peça para o usuário adivinhar. O programa deve dizer se o
//número informado pelo usuário é maior ou menor que o número sorteado.
//O programa finaliza quando acaba as tentativas ou quando o usuário
//acerta o número sorteado. Utilize a classe Random para sortear o número.

package aula03.q08;

import java.util.Scanner;
import java.util.Random;

public class SorteiaNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int sort = random.nextInt(1, 10);

        System.out.println("Sorteei um número de 1 a 10, tente adivinhar");

        for (int i = 1; i <= 3; i++) {
            System.out.print(i + "° tentativa: ");
                int num = scanner.nextInt();
                if (num == sort) {
                    System.out.println("Parabéns! Você acertou o número!");
                } else if (num < sort) {
                    System.out.println("O número sorteado é maior..");
                } else {
                    System.out.println("O número sorteado é menor..");
                }

                if (i == 3 & num != sort) {
                    System.out.println("Suas tentativas acabaram. O número era " + sort);
                }
        }
    }
}