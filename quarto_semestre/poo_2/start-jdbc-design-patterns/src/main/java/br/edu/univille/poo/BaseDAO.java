package br.edu.univille.poo;

import java.sql.Connection;
import java.sql.SQLException;

// Design Pattern : DAO - Data Acces Object
// Mapeamento de objetos para banco de dados
// Dados do banco para Objetos
public class BaseDAO {

    // con() -> Encapsula a chamada para a fabrica de conexoes.
    protected Connection con() throws SQLException {
        return ConnectionFactory.getInstance().get();
    }

}
