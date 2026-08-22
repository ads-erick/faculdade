package br.edu.univille.poo.persistence;

import java.sql.Connection;
import java.sql.SQLException;

class BaseDAO {
    protected Connection con() throws SQLException {
        return ConnectionFactory.getInstance().get();
    }
}
