package aula08.exercicios.ex08;

public class Main {
    public static void main(String[] args) {

        Produto banana = new Produto("banana", 1.00, 5);
        Produto leite = new Produto("Leite", 7.00, 4);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(banana);
        carrinho.adicionarProduto(leite);

        System.out.println("Valor total das compras = R$"+ carrinho.somarValor());

    }
}
