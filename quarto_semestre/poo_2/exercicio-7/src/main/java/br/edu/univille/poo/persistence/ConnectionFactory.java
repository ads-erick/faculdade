package br.edu.univille.poo.persistence;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

class ConnectionFactory {
    private static ConnectionFactory instance;

    private String url;
    private String user;
    private String password;

    private ConnectionFactory() {
        Properties props = new Properties();
        try (InputStream input = ConnectionFactory.class.getClassLoader().getResourceAsStream("application.properties")) {
            props.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao carregar application.properties", e);
        }

        this.url = props.getProperty("db.url");
        this.user = props.getProperty("db.user");
        this.password = props.getProperty("db.password");
    }

    public synchronized static ConnectionFactory getInstance() {
        if (instance == null) {
            instance = new ConnectionFactory();
        }
        return instance;
    }

    public Connection get() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

}
