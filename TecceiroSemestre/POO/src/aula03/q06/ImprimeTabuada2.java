package aula03.q06;

public class ImprimeTabuada2 {
    public static void main(String[] args) {

        int contador = 1;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++)
                System.out.println(contador + " x " + j + " = " + (j*contador));
            System.out.println("----------------------------");
            contador+=1;
        }
    }
}
