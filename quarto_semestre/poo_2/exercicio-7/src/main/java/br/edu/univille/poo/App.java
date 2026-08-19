package br.edu.univille.poo;

import br.edu.univille.poo.entity.Tarefa;
import br.edu.univille.poo.persistence.TarefaDAO;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        TarefaDAO dao = new TarefaDAO();

        Optional<Tarefa> resultado = dao.findById(100);
        if (resultado.isPresent()) {
            System.out.println(resultado.get());
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }
}