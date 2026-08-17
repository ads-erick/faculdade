package br.edu.univille.poo.persistence;

import br.edu.univille.poo.entity.Prioridade;
import br.edu.univille.poo.entity.Tarefa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TarefaDAO extends BaseDAO{
    public List<Tarefa> findAll() {
        List<Tarefa> lista = new ArrayList<>();
        String sql = "SELECT * from tarefa";
        try (Connection con = con();
             PreparedStatement pre = con.prepareStatement(sql)) {
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                String prioridadeStr = rs.getString("prioridade");
                Prioridade prioridade = Prioridade.valueOf(prioridadeStr.toUpperCase());
                boolean feito = rs.getBoolean("feito");
                LocalDateTime prazoFinal = rs.getTimestamp("prazo_final").toLocalDateTime();

                Tarefa tarefa = new Tarefa(id, descricao, prioridade, feito, prazoFinal);
                lista.add(tarefa);
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar todas as tarefas.");
            e.printStackTrace();
        }
        return lista;
    }
}
