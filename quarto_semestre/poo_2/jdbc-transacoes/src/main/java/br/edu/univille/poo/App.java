package br.edu.univille.poo;

import br.edu.univille.poo.entity.Prioridade;
import br.edu.univille.poo.entity.Tarefa;
import br.edu.univille.poo.persistence.TarefaDAO;
import br.edu.univille.poo.persistence.ConnectionFactory;
import java.sql.SQLException;

import java.sql.Connection;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TarefaDAO dao = new TarefaDAO();

        Scanner scanner = new Scanner(System.in);

        try (Connection con = ConnectionFactory.getInstance().get()) {
            con.setAutoCommit(false);

            Tarefa novaTarefa = new Tarefa(
                    0,
                    "teste",
                    Prioridade.MEDIO,
                    false,
                    LocalDateTime.now().plusDays(1)
            );

            dao.inserir(novaTarefa, con);

            System.out.println("-- Tarefas antes da decisão --");
            for (Tarefa tarefa : dao.findAll(con)) {
                System.out.println(tarefa);
            }

            System.out.println("Deseja salvar as alterações? [s/n]: ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("s")) {
                con.commit();
                System.out.println("Alterações salvas");
            } else {
                con.rollback();
                System.out.println("Alterações desfeitas.");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco.");
            e.printStackTrace();
        }

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

    }
}
