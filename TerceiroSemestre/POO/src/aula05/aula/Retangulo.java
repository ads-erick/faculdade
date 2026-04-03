package aula05.aula;

public class Retangulo {
    private double largura;
    private double altura;

    // Constructor
    public Retangulo(double largura,
                     double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public Retangulo() {}

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculaArea() {
        return largura * altura;
    }

    public boolean isQuadrado() {
        return largura == altura;
    }

}
