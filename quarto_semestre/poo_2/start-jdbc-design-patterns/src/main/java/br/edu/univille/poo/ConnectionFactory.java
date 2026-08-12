package br.edu.univille.poo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Design Pattern : Factory
// Criar objetos -> Conexões com o Banco de dados.
// Design Pattern : Singleton
// Manter apenas uma instância da classe
public class ConnectionFactory {

    private static ConnectionFactory instance;

    // Oculta o construtor da Classe
    private ConnectionFactory(){}

    // Problemas de concorrência
    // synchronized -> organiza a chamada do metodo
    // para evitar chamadas em paralelo (cpus diferentes)
    public synchronized static ConnectionFactory getInstance() {
        if (instance == null) instance = new ConnectionFactory();
        return instance;
    }

    // Cria as conexões
    public Connection get() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/poo_2";
        String user = "postgres";
        String password = "052404";
        return DriverManager.getConnection(url, user, password);
        }
    }
