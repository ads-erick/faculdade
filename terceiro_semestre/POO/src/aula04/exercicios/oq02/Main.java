//Modele uma classe que represente um cı́rculo. A classe deve ter um
//atributo indicando o seu raio e um método para calcular a sua área. Crie o
//diagrama de classe da UML e o código java correspondente. Crie alguns
//objetos da classe e calcule a sua área.

package aula04.exercicios.oq02;

public class Main {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo();

        circulo1.raio = 10;
        circulo2.raio = 20;

        System.out.println("Área do circulo 1 = " + circulo1.calculaArea());
        System.out.println("Área do circulo 2 = " + circulo2.calculaArea());

    }
}
