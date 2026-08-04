package br.univille;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class App {

    public static void main( String[] args ) {
        //
        try{
            String url = "jdbc:mysql://localhost:3306/poo_2";
            String user = "root";
            String password = "univille";
            Connection con = DriverManager.getConnection(url,user,password);
            System.out.println("Conexão com sucesso!");
            /*String insert = "insert into pessoa(nome,sobrenome,idade) " +
                    "values('Peter','Parker',16)";
            // Statement -> interface para enviar comandos para o BD
            // via conexão
            Statement stat = con.createStatement();
            stat.execute(insert);
            */
            /*String delete = "delete from pessoa";
            // Statement -> interface para enviar comandos para o BD
            // via conexão
            Statement stat = con.createStatement();
            stat.execute(delete);*/
            String insert = "insert into pessoa(nome,sobrenome,idade) " +
                    "values(?,?,?)";
            // PreparedStatement -> trabalha com parâmetros
            // Valida a instruções, evita o SQL Injection
            // Pode ser reutilizado.
            PreparedStatement pre = con.prepareStatement(insert);
            // a primeira posição/coluna é 1
            pre.setString(1,"Marie");
            pre.setString(2,"Jane");
            pre.setInt(3,16);
            pre.execute();
            // reutilizar
            pre.setString(1,"Duende");
            pre.setString(2,"Verde");
            pre.setInt(3,16);
            pre.execute();

        } catch (Exception e) {
            System.out.println("Deu erro!");
            e.printStackTrace();
        }
    }

}
