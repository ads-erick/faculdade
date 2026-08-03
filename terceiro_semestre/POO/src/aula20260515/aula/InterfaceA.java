package aula20260515.aula;

// heranca de interfaces
// pode ser multiplos
public interface InterfaceA extends Printable, Cloneable {

    // publico, final e estatico
    // valor constante e pertence a Interface, nao pertence ao objeto
    // public static final double PI
    double PI = 3.1415;

    // default -> permite apresentar uma implementacao padrao
    default void metodo() {
        System.out.println("Metodo na interfaceA");
        metodoPrivado();
    }

    // metodo privado
    private static void metodoPrivado() {
        System.out.println("Método privado");
    }

}
