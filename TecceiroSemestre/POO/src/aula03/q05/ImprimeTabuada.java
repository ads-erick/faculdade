//Escreva um programa que imprima em tela a tabuada do número
//informado pelo usuário.

package aula03.q05;

import java.util.Scanner;

public class ImprimeTabuada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número para ver sua tabuada: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }

        System.out.println("Fim do programa.");

    }
}
