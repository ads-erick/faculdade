package aula13.revisaoaula;

public class Gato extends Animal{
    public void emitirSom() {
        // executa o metodo da classe generica
        super.emitirSom();
        System.out.println("Miau");
    }
}
