package br.com.univille;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaGastosPorCategoria {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/aulajdbc";
        String usuario = "postgres";
        String senha = "052404";

        String sql =
                "SELECT c.nome AS categoria, SUM(t.valor) AS total " +
                        "FROM transacao t " +
                        "JOIN categoria c ON t.id_categoria = c.id " +
                        "JOIN tipo_categoria tc ON c.id_tipo_categoria = tc.id " +
                        "WHERE tc.tipo = 'Saída' " +
                        "AND EXTRACT(MONTH FROM t.data_vencimento) = 8 " +
                        "AND EXTRACT(YEAR FROM t.data_vencimento) = 2026 " +
                        "GROUP BY c.nome";

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            Statement statement = conexao.createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            System.out.println("Gastos por categoria - Agosto/2026:");

            while (resultado.next()) {
                String categoria = resultado.getString("categoria");
                double total = resultado.getDouble("total");

                System.out.println("- " + categoria + ": R$ " + total);
            }

            resultado.close();
            statement.close();
            conexao.close();

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}