package br.com.univille;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaSaldoMes {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/aulajdbc";
        String usuario = "postgres";
        String senha = "052404";

        String sql =
                "SELECT tc.tipo, SUM(t.valor) AS total " +
                        "FROM transacao t " +
                        "JOIN categoria c ON t.id_categoria = c.id " +
                        "JOIN tipo_categoria tc ON c.id_tipo_categoria = tc.id " +
                        "WHERE EXTRACT(MONTH FROM t.data_pagamento) = 8 " +
                        "AND EXTRACT(YEAR FROM t.data_pagamento) = 2026 " +
                        "GROUP BY tc.tipo";

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            Statement statement = conexao.createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            double entradas = 0;
            double saidas = 0;

            while (resultado.next()) {
                String tipo = resultado.getString("tipo");
                double total = resultado.getDouble("total");

                if (tipo.equals("Entrada")) {
                    entradas = total;
                } else if (tipo.equals("Saída")) {
                    saidas = total;
                }
            }

            double saldo = entradas - saidas;

            System.out.println("Entradas: " + entradas);
            System.out.println("Saídas: " + saidas);
            System.out.println("Saldo de Agosto/2026: " + saldo);

            resultado.close();
            statement.close();
            conexao.close();

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
