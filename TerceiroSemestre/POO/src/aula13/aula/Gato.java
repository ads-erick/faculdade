package aula13.aula;

// extends - ativa a herança da classe
public class Gato extends Felino{

    @Override
    public void emitirSom() {
        // super - acessa os métodos e atributos da classe pai
        super.emitirSom();
        System.out.println("Miau Miau!");
    }

    // assinatura do metodo
    // nome (conjunto de parâmetros)
    public void emitirSom(TipoDoSom tipo) {
        switch (tipo) {
            case NORMAL -> emitirSom();
            case ASSUSTADO -> System.out.println("Miauuuuuuuuuuuuuuu");
        }
    }

}
