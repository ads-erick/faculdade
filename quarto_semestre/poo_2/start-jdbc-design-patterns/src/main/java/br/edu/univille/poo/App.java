package br.edu.univille.poo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        Pessoa p = new Pessoa(0, "Clark", "Kent", 21);

        PessoaDAO dao = new PessoaDAO();
        dao.inserir(p);
    }
}
