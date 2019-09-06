package Controller;

import java.sql.Connection;
import java.sql.SQLException;

import Factory.ConnectionFactory;
import DAO.ContatoDAO;
import Modelo.Contato;

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
