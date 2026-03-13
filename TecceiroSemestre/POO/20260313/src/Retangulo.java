public class Retangulo {

    private double largura;
    private double altura;

    public Retangulo(){
        System.out.println("Retangulo Inicializado");
    }

    public Retangulo(double largura, double altura) {
        setLargura(largura);
        setAltura(altura);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura < 0) return;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}