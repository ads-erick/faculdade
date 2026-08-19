package br.edu.univille.poo;

import br.edu.univille.poo.entity.Prioridade;
import br.edu.univille.poo.entity.Tarefa;
import br.edu.univille.poo.persistence.TarefaDAO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        TarefaDAO dao = new TarefaDAO();

        System.out.println("-- Todas as tarefas --");
        for (Tarefa t : dao.findAll()) {
            System.out.println(t);
        }

        System.out.println("\n-- Tarefas por prioridade (ALTO) --");
        for (Tarefa t : dao.findByPrioridade(Prioridade.ALTO)) {
            System.out.println(t);
        }

        System.out.println("\n-- Tarefas não finalizadas --");
        for (Tarefa t : dao.findByFeito(false)) {
            System.out.println(t);
        }

        System.out.println("\n-- Tarefas atrasadas --");
        for (Tarefa t : dao.findAtrasadas()) {
            System.out.println(t);
        }

        System.out.println("\n-- Tarefas abertas do dia --");
        for (Tarefa t : dao.findAbertasHoje()) {
            System.out.println(t);
        }

        System.out.println("\n-- Tarefa pelo id (1) --");
        Optional<Tarefa> tarefaPorId = dao.findById(1);
        if (tarefaPorId.isPresent()) {
            System.out.println(tarefaPorId.get());
        } else {
            System.out.println("Tarefa não encontrada.");
        }

        System.out.println("\n-- Finalizar tarefa pelo id (1) --");
        dao.finalizarTarefaById(1);
        System.out.println(dao.findById(1).orElse(null));

        System.out.println("\n-- Atualizar tarefa pelo id (1) --");
        Tarefa tarefaAtualizada = new Tarefa(
                1,
                "Estudar para a prova de POO - revisado",
                Prioridade.MEDIO,
                false,
                LocalDateTime.of(2026, 8, 25, 18, 0)
        );
        dao.atualizarTarefa(tarefaAtualizada);
        System.out.println(dao.findById(1).orElse(null));

        System.out.println("\n-- Deletar tarefa pelo id (2) --");
        dao.deletarTarefaById(2);
        Optional<Tarefa> tarefaDeletada = dao.findById(2);
        System.out.println(tarefaDeletada.isPresent() ? tarefaDeletada.get() : "Tarefa não encontrada (deletada com sucesso).");
    }
}