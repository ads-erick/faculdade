//Modele uma classe que represente um dado de 6 faces. A classe deve ter
//um método que simule a ação de rolar um dado. Crie o diagrama de classe
//da UML e o código java correspondente. Crie alguns objetos da classe e
//execute a ação de rolar o dado.

package aula04.exercicios.q03;

import java.util.Random;

public class Dado {

    Random resultado = new Random();

    public int rolaDado() {
        return resultado.nextInt(1, 7);
    }
}
