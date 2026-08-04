package br.univille;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Query {

    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/poo_2";
            String user = "root";
            String password = "univille";
            Connection con = DriverManager.getConnection(url,user,password);
            System.out.println("Conexão com sucesso!");
            String query = "select id, nome, sobrenome, idade from pessoa";

            PreparedStatement pre = con.prepareStatement(query);
            ResultSet rs = pre.executeQuery();
            // inicialmente o cursor não aponta para um registro
            // aponta o cursor para o próximo registro
            while(rs.next()){
                // Obter os valores de cada coluna
                int id = rs.getInt(1);
                String nome = rs.getString("nome");
                String sobrenome = rs.getString("sobrenome");
                int idade = rs.getInt("idade");
                System.out.println(id+" "+nome+" "+sobrenome+" "+idade);
            }

        } catch (Exception e) {
            System.out.println("Deu erro!");
            e.printStackTrace();
        }
    }

}
