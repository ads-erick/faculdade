package br.edu.univille.poo;

import br.edu.univille.poo.entity.Prioridade;
import br.edu.univille.poo.entity.Tarefa;
import br.edu.univille.poo.persistence.TarefaDAO;

import java.util.List;

public class App {
    public static void main(String[] args) {
        TarefaDAO dao = new TarefaDAO();
        List<Tarefa> tarefasAltas = dao.findByPrioridade(Prioridade.ALTO);
        for (Tarefa t : tarefasAltas) {
            System.out.println(t);
        }
    }
}