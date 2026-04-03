//Modele uma classe que represente um dado de 6 faces. A classe deve ter
//um método que simule a ação de rolar um dado. Crie o diagrama de classe
//da UML e o código java correspondente. Crie alguns objetos da classe e
//execute a ação de rolar o dado.

package aula04.exercicios.q03;

public class Main {
    public static void main(String[] args) {

        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        System.out.println("O resultado do primeiro dado foi " + dado1.rolaDado());
        System.out.println("O resultado do segundo dado foi " + dado2.rolaDado());

    }
}
