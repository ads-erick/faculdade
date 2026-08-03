//Modele uma classe que represente uma lâmpada. A classe deve ter um
//atributo indicando se a lâmpada está ligada ou desligada e métodos para
//poder ligar ou desligar. Crie o diagrama de classe da UML e o código java
//correspondente. Crie alguns objetos da classe e execute a ação de
//ligar/desligar.

package aula04.exercicios.ex01;

public class Lampada {
    boolean estaLigada = false;

    public void turnOn() {
        estaLigada = true;
    }

    public void turnOff() {
        estaLigada = false;
    }
}
