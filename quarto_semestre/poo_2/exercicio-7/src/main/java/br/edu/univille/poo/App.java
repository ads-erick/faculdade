package br.edu.univille.poo;

import br.edu.univille.poo.entity.Prioridade;
import br.edu.univille.poo.entity.Tarefa;
import br.edu.univille.poo.persistence.TarefaDAO;

import java.util.List;

public class App {
    public static void main(String[] args) {
        TarefaDAO dao = new TarefaDAO();

        List<Tarefa> naoFinalizadas = dao.findByFeito(false);
        for (Tarefa t : naoFinalizadas) {
            System.out.println(t);
        }
    }
}