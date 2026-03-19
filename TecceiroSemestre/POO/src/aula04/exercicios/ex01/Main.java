package aula04.exercicios.ex01;

public class Main {
    public static void main(String[] args) {

        Lampada lampadaQuarto = new Lampada();
        Lampada lampadaCozinha = new Lampada();

        lampadaCozinha.turnOn();
        lampadaQuarto.turnOn();

        if (lampadaQuarto.estaLigada) {
            System.out.println("Quarto: Acesa");
        } else {
            System.out.println("Quarto: Apagada");
        }

        if (lampadaCozinha.estaLigada) {
            System.out.println("Cozinha: Acesa");
        } else {
            System.out.println("Cozinha: Apagada");
        }

    }
}
