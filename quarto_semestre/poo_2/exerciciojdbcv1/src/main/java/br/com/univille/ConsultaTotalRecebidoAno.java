package br.com.univille;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaTotalRecebidoAno {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/aulajdbc";
        String usuario = "postgres";
        String senha = "052404";

        String sql =
                "SELECT SUM(t.valor) AS total " +
                        "FROM transacao t " +
                        "JOIN categoria c ON t.id_categoria = c.id " +
                        "JOIN tipo_categoria tc ON c.id_tipo_categoria = tc.id " +
                        "WHERE tc.tipo = 'Entrada' " +
                        "AND EXTRACT(YEAR FROM t.data_pagamento) = 2026";

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            Statement statement = conexao.createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            if (resultado.next()) {
                double total = resultado.getDouble("total");
                System.out.println("Total recebido em 2026: R$ " + total);
            }

            resultado.close();
            statement.close();
            conexao.close();

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}