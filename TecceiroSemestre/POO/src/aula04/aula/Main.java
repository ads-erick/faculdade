package aula04.aula;

public class Main {
    public static void main(String[] args) {
        Retangulo r = new Retangulo();

        r.altura = 10;
        r.largura = 50;

        System.out.println("Altura: " + r.altura);
        System.out.println("Largura: " + r.largura);
        System.out.println("Área: " +r.obterArea());
    }
}
