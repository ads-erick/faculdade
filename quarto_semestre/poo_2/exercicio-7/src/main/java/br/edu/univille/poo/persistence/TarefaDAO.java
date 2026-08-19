package br.edu.univille.poo.persistence;

import br.edu.univille.poo.entity.Prioridade;
import br.edu.univille.poo.entity.Tarefa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TarefaDAO extends BaseDAO {

    public List<Tarefa> findAll() {
        List<Tarefa> lista = new ArrayList<>();
        String sql = "SELECT * FROM tarefa";
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

    public List<Tarefa> findByPrioridade(Prioridade prioridade) {
        List<Tarefa> lista = new ArrayList<Tarefa>();
        String sql = "SELECT * FROM tarefa WHERE prioridade = ?";
        try (Connection con = con();
             PreparedStatement pre = con.prepareStatement(sql)) {
            String prioridadeStr = prioridade.name().toLowerCase();
            pre.setString(1, prioridadeStr);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                String prioridadeColuna = rs.getString("prioridade");
                Prioridade prioridadeTarefa = Prioridade.valueOf(prioridadeColuna.toUpperCase());
                boolean feito = rs.getBoolean("feito");
                LocalDateTime prazoFinal = rs.getTimestamp("prazo_final").toLocalDateTime();

                Tarefa tarefa = new Tarefa(id, descricao, prioridadeTarefa, feito, prazoFinal);
                lista.add(tarefa);
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar as tarefas dessa prioridade.");
            e.printStackTrace();
        }
        return lista;
    }

    public List<Tarefa> findByFeito(boolean feito) {
        List<Tarefa> lista = new ArrayList<>();
        String sql = "SELECT * FROM tarefa WHERE feito = ?";
        try (Connection con = con();
             PreparedStatement pre = con.prepareStatement(sql)) {
            pre.setBoolean(1, feito);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                String prioridadeStr = rs.getString("prioridade");
                Prioridade prioridade = Prioridade.valueOf(prioridadeStr.toUpperCase());
                boolean feitoColuna = rs.getBoolean("feito");
                LocalDateTime prazoFinal = rs.getTimestamp("prazo_final").toLocalDateTime();

                Tarefa tarefa = new Tarefa(id, descricao, prioridade, feitoColuna, prazoFinal);
                lista.add(tarefa);
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar as tarefas em aberto.");
            e.printStackTrace();
        }
        return lista;
    }

    public List<Tarefa> findByAtraso() {
        List<Tarefa> lista = new ArrayList<>();
        String sql = "SELECT * FROM tarefa WHERE feito = ? AND prazo_final < ?";
        try (Connection con = con();
             PreparedStatement pre = con.prepareStatement(sql)) {
            pre.setBoolean(1, false);
            pre.setTimestamp(2, Timestamp.valueOf(LocalDateTime.now()));
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                String prioridadeStr = rs.getString("prioridade");
                Prioridade prioridade = Prioridade.valueOf(prioridadeStr.toUpperCase());
                boolean feitoColuna = rs.getBoolean("feito");
                LocalDateTime prazoFinal = rs.getTimestamp("prazo_final").toLocalDateTime();

                Tarefa tarefa = new Tarefa(id, descricao, prioridade, feitoColuna, prazoFinal);
                lista.add(tarefa);
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar as tarefas em atraso.");
            e.printStackTrace();
        }
        return lista;
    }

}
