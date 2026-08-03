package aula20260515.aula;

public class Main {
    public static void main(String[] args) {
        // nao podemos criar objetos a partir de interface
        // Printable p = new Printable();

        Person p1 = new Person();
        p1.setName("Tom Cruise");
        p1.print();
        // polimorfismo
        Printable printable = new Person();
        printable.print();

        Person p2 = (Person) printable;
        System.out.println(InterfaceA.PI);
    }

}
