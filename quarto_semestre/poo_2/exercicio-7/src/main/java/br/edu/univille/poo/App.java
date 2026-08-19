package br.edu.univille.poo;

import br.edu.univille.poo.entity.Tarefa;
import br.edu.univille.poo.persistence.TarefaDAO;

import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        TarefaDAO dao = new TarefaDAO();

        dao.deletarTarefaById(3);

        Optional<Tarefa> resultado = dao.findById(3);
        if (resultado.isPresent()) {
            System.out.println(resultado.get());
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }
}