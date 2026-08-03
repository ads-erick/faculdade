package aula05.aula;

public class Main {
    public static void main(String[] args) {

        Retangulo r1 = new Retangulo();
        r1.setLargura(5.0);
        r1.setAltura(10.0);

        Retangulo r2 = new Retangulo(10, 10);

        System.out.println("Área R1: " + r1.calculaArea());
        System.out.println("Área R2: " + r2.calculaArea());

        System.out.println("R1 é quadrado? " + r1.isQuadrado());
        System.out.println("R2 é quadrado? " + r2.isQuadrado());

    }
}
