package br.com.wi2.glpi.util.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.wi2.glpi.core.dao.impl.ContatoDAO;
import br.com.wi2.glpi.core.dominio.Contato;
import br.com.wi2.glpi.util.ConnectionFactory;

public class Conexao {
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conex�o aberta!");
		connection.close();
		
		Contato contato = new Contato();
		
		contato.setNome("Caelum");
		contato.setEmail("Contato@caelum.com.br");
		contato.setEndereco("R. Vergueiro 3185 cj57");
		contato.setDataNascimento("2019-07-30");
		
//		Caso precise deixar o "dataNascimento" como Calendar
//		contato.setDataNascimento(Calendar.getInstance());
//		"(Calendar.getInstance());" -> pega a data atual
		
		// gave nesssa conex�o!!!
		ContatoDAO dao = new ContatoDAO();
		
		// m�todo elegante
		dao.adiciona(contato);
		
		System.out.println("Gravado!");
	}
}
