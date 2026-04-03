//Escreva um programa em java que receba um número. O programa deve
//encerrar quando o usuário informar -1. Caso contrário o programa deverá
//pedir novamente um número.

package aula03.q03;

import java.util.Scanner;

public class InsereNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = 0;
        do {
            System.out.print("Digite um número: ");
            num = scanner.nextInt();
        }  while (num != -1);

        System.out.println("Fim de programa.");

    }
}
