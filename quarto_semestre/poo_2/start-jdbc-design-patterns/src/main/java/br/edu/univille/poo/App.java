package br.edu.univille.poo;


import br.edu.univille.poo.entity.Pessoa;
import br.edu.univille.poo.persistence.PessoaDAO;

import java.util.Optional;

public class App {
    public static void main( String[] args ) {
        Pessoa p = new Pessoa(0,"Bruce","Wayne",16);

        PessoaDAO dao = new PessoaDAO();
        //dao.inserir(p);
        for(Pessoa p1 : dao.findAll()){
            System.out.println(p1);
        }
        System.out.println("-- Optional --");
        Optional<Pessoa> opt = dao.findById(4);
        if(opt.isPresent()) System.out.println(opt.get());
        else System.out.println("Pessoa não foi encontrada.");
    }
}
