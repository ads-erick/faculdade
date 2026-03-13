public class Main {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        r1.altura = 10;
        r1.largura = 20;

        Retangulo r2 = new Retangulo(5.0, 5.0);

        System.out.println(r1);
        System.out.println(r2);
    }
}