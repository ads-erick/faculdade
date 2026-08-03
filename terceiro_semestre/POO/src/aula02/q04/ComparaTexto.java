//Escreva um programa em java que receba dois textos. Verifique se os dois
//textos são iguais e apresente o resultado em tela. Observe e analise os
//resultados.

package aula02.q04;

import java.util.Scanner;

public class ComparaTexto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Comparação de textos");

        System.out.print("Insira o primeiro texto: ");
        String text1 = scanner.nextLine();

        System.out.print("Insira a segunda frase: ");
        String text2 = scanner.nextLine();

        if (text1.equals(text2)) {
            System.out.print("Os textos são iguais.");
        } else {
            System.out.print("Os textos não são iguais.");
        }

        scanner.close();

    }
}
