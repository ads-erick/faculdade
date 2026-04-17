package aula13.aula;

public class Main {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.emitirSom();

        Gato g = new Gato();
        g.emitirSom();

        // Polimorfismo
        Animal gato = new Gato();

        Animal felino = new Felino();
        felino.emitirSom();

        Animal leopardo = new Felino();
        leopardo.emitirSom();

    }
}
