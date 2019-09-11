package br.com.wi2.glpi.core.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.wi2.glpi.util.ConnectionFactory;

import br.com.wi2.glpi.core.dao.IDAO;


/**
 * Classe abstrata AbstractJdbcDAO,
 * para abrir a conexão com o BD.
 * @author Davi Rodrigues
 * @date 11/09/2019
 */
public abstract class AbstractJdbcDAO implements IDAO {
	
	protected Connection connection;
	
	
	protected void openConnection() {
        try {

            if (connection == null || connection.isClosed()) {
                connection = ConnectionFactory.getConnection();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
}
