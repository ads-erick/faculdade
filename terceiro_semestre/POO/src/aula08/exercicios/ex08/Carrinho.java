package aula08.exercicios.ex08;

import java.util.List;
import java.util.ArrayList;

public class Carrinho {
    private List<Produto> itens = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        this.itens.add(p);
    }

    public double somarValor() {
        double total = 0.00;

        for (Produto p : itens) {
            total += p.getPreco() * p.getQuantidade();
        }
        return total;
    }

}
