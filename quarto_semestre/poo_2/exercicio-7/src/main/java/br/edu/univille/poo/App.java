package br.edu.univille.poo;

import br.edu.univille.poo.entity.Prioridade;
import br.edu.univille.poo.entity.Tarefa;
import br.edu.univille.poo.persistence.TarefaDAO;

import java.time.LocalDateTime;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        TarefaDAO dao = new TarefaDAO();

        Tarefa tarefaAtualizada = new Tarefa(1, "Estudar para a prova de POO - revisado", Prioridade.MEDIO, false, LocalDateTime.of(2026, 8, 25, 18, 0));
        dao.atualizarTarefa(tarefaAtualizada);

        Optional<Tarefa> resultado = dao.findById(1);
        if (resultado.isPresent()) {
            System.out.println(resultado.get());
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }
}