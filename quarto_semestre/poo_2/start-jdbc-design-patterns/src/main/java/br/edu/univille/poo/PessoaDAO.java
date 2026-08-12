package br.edu.univille.poo;

import java.sql.Connection;
import java.sql.PreparedStatement;

// DAO -> Geralmente é um para cada tabela
public class PessoaDAO extends BaseDAO{

    public void inserir(Pessoa p) {
        String sql = """
        insert into pessoa(nome,sobrenome,idade) values(?,?,?);
        """;
        // try-with-resources - fecha os recursos abertos
        // automaticamente
        // Design Pattern : Autocloseable
        try(Connection con = con();
            PreparedStatement pre = con.prepareStatement(sql)) {
            pre.setString(1, p.getNome());
            pre.setString(2, p.getSobrenome());
            pre.setInt(3, p.getIdade());
            pre.execute();

        } catch (Exception e) {
            System.out.println("Erro ao inserir a pessoa.");
            e.printStackTrace();
        }
    }

}
