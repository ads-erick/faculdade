package aula13.revisaoaula;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.emitirSom(); // Som do animal

        GatoEnum gato = new GatoEnum();
        gato.emitirSom(TipoDeSom.NERVOSO);
        gato.emitirSom();

    }
}
