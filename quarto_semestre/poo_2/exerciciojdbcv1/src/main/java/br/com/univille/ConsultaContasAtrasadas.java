package br.com.univille;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaContasAtrasadas {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/aulajdbc";
        String usuario = "postgres";
        String senha = "052404";

        String sql =
                "SELECT c.nome AS categoria, t.descricao, t.valor, t.data_vencimento " +
                        "FROM transacao t " +
                        "JOIN categoria c ON t.id_categoria = c.id " +
                        "WHERE t.pago = false " +
                        "AND t.data_vencimento < CURRENT_DATE";

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            Statement statement = conexao.createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            System.out.println("Contas em atraso:");

            while (resultado.next()) {
                String categoria = resultado.getString("categoria");
                String descricao = resultado.getString("descricao");
                double valor = resultado.getDouble("valor");
                String vencimento = resultado.getString("data_vencimento");

                System.out.println("- " + descricao + " (" + categoria + ") | R$ " + valor + " | venceu em: " + vencimento);
            }

            resultado.close();
            statement.close();
            conexao.close();

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}