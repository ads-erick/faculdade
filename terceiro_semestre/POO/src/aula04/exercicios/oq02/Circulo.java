//Modele uma classe que represente um cı́rculo. A classe deve ter um
//atributo indicando o seu raio e um método para calcular a sua área. Crie o
//diagrama de classe da UML e o código java correspondente. Crie alguns
//objetos da classe e calcule a sua área.

package aula04.exercicios.oq02;

public class Circulo {

    double raio;

    public double calculaArea() {
         return Math.PI*Math.pow(raio, 2);
    }
}
