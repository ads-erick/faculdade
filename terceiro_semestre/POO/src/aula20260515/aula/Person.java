package aula20260515.aula;

// implements -> implementando a interface
public class Person implements Printable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Person " + name);
    }

}
