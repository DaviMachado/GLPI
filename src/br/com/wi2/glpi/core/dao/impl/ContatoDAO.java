package br.com.wi2.glpi.core.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import br.com.wi2.glpi.core.dominio.Contato;
import br.com.wi2.glpi.util.ConnectionFactory;

public class ContatoDAO {
	// a conexão com o banco de dados
	private Connection connection;
	
	// construtor para conexão com o Banco de Dados
	public ContatoDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	// Método para Adicionar o Contato
	public void adiciona(Contato contato) {
		String sql = "insert into contatos "+
					"(nome,email,endereco,dataNascimento)" +
					"values (?,?,?,?)";
		
		try {
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			// seta os valores
			stmt.setString(1,contato.getNome());
			stmt.setString(2,contato.getEmail());
			stmt.setString(3,contato.getEndereco());
			stmt.setString(4, contato.getDataNascimento());
//			Caso precise deixar o "dataNascimento" como Calendar
//			stmt.setDate(4, new java.sql.Date(contato.getDataNascimento().getTimeInMillis()));
			
			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	// Método para Mostrar/Listar o Contato
	public List<Contato> getLista() {
		try {
			List<Contato> contatos = new ArrayList<Contato>();
			PreparedStatement stmt = this.connection.
					prepareStatement("select * from contatos");
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				// criando o objeto Contato
				Contato contato = new Contato();
//				Caso precise deixar o "id" como o tipo "long"
//				contato.setId(rs.getLong("id"));
				contato.setId(rs.getString("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));
				contato.setDataNascimento(rs.getString("dataNascimento"));
				
				// montando a data através do Calendar
//				Calendar data = Calendar.getInstance();
//				data.setTime(rs.getDate("dataNascimento"));
//				contato.setDataNascimento(data);
				
				// adicionando o objeto à lista
				contatos.add(contato);
			}
			rs.close();
			stmt.close();
			return contatos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	// Método para alterar o Contato
	public void altera (Contato contato) {
		String sql = "update contatos set nome=?, email=?," +
				" endereco=?, dataNascimento=? where id=?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setString(4, contato.getDataNascimento());
//			Caso precise deixar o "dataNascimento" como Calendar
//			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
//			Caso precise deixar o "id" como o tipo "long"
//			stmt.setLong(5, contato.getId());
			stmt.setString(5, contato.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	// Método para remove o Contato
	public void remove (Contato contato) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from contatos where id=?");
//			Caso precise deixar o "id" como o tipo "long"
//			stmt.setLong(1, contato.getId());
			stmt.setString(1, contato.getId());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	// Retorna somente um contato especifico
	public Contato AlteraId (Contato contato) {
		try {
			PreparedStatement stmt = connection.prepareStatement("select * from contatos where id=?");
			stmt.setString(1, contato.getId());
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				Contato retorno = new Contato();
				
				retorno.setId(rs.getString("id"));
				retorno.setNome(rs.getString("nome"));
				retorno.setEmail(rs.getString("email"));
				retorno.setEndereco(rs.getString("endereco"));
				retorno.setDataNascimento(rs.getString("dataNascimento"));
				
				return retorno;
			}
			else {
				return null;
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}