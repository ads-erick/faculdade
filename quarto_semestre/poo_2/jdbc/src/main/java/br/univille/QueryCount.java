package br.univille;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class QueryCount {

    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/poo_2";
            String user = "root";
            String password = "univille";
            Connection con = DriverManager.getConnection(url,user,password);
            System.out.println("Conexão com sucesso!");
            String query = "select count(*) from pessoa";

            PreparedStatement pre = con.prepareStatement(query);

            ResultSet rs = pre.executeQuery();
            // inicialmente o cursor não aponta para um registro
            // aponta o cursor para o próximo registro
            if(rs.next()){
                // Obter os valores de cada coluna
                int total = rs.getInt(1);
                System.out.println("Total de registros: "+total);
            }

        } catch (Exception e) {
            System.out.println("Deu erro!");
            e.printStackTrace();
        }
    }

}
