//Escreva um programa em java que realize a soma dos númmeros entre 1 e
//1000. Utilize uma estrutura de repetição e apresente o resultado em tela.

package aula03.q01;

public class SomaNumeros {
    public static void main (String[] args) {
        int numero = 1;
        int soma = 0;
        while (numero<=1000) {
            soma += numero;
            numero++;
        }

System.out.println("A soma de todos os números de 1 a 1000 é " + soma);

    }
}
