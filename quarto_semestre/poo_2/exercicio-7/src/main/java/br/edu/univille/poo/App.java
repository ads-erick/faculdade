package br.edu.univille.poo;

import br.edu.univille.poo.entity.Tarefa;
import br.edu.univille.poo.persistence.TarefaDAO;

import java.util.List;

public class App {
    public static void main(String[] args) {
        TarefaDAO dao = new TarefaDAO();

        List<Tarefa> abertasHoje = dao.findAbertasHoje();
        for (Tarefa t : abertasHoje) {
            System.out.println(t);
        }
    }
}