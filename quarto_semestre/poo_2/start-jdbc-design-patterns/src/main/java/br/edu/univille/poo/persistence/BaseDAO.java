package br.edu.univille.poo.persistence;

import java.sql.Connection;
import java.sql.SQLException;

// Design Pattern : DAO - Data Access Object
// Mapeamento de objetos para banco de dados
// Dados do banco para Objetos
class BaseDAO {

    // con() -> Encapsula a chamada para Fábrica de conexões.
    protected Connection con() throws SQLException {
        return ConnectionFactory.getInstance().get();
    }

}