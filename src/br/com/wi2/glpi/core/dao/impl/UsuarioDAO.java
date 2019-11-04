package br.com.wi2.glpi.core.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.wi2.glpi.core.dominio.Usuario;
import br.com.wi2.glpi.util.ConnectionFactory;

public class UsuarioDAO {
	
	// a conexão com o banco de dados
	private Connection connection;
	
	// construtor para conexão com o Banco de Dados
	public UsuarioDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	// Salvar Usuario
	public void salvar (Usuario usuario) {
		String sql = "insert into usuario "+
				"(login,senha,email,cd_usuario,setor)" +
				"values (?,?,?,?,?)";
		
		try {
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			// seta os valores
			stmt.setString(1, usuario.getLogin());
			stmt.setString(2, usuario.getSenha());
			stmt.setString(3, usuario.getEmail());
			stmt.setString(4, usuario.getCdUsuario());
			stmt.setString(5, usuario.getSetor());
			
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	// Alterar Usuario
	public void alterar (Usuario usuario) {
		String sql = "update usuario set login=?, senha=?," +
				" email=?, setor=? where cd_cliente=?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, usuario.getLogin());
			stmt.setString(2, usuario.getSenha());
			stmt.setString(3, usuario.getEmail());
			stmt.setString(4, usuario.getSetor());
			
			stmt.setString(5, usuario.getCdUsuario());
			
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	// Excluir Usuario
	public void excluir (Usuario usuario) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from usuario where cd_cliente=?");
			
			stmt.setString(1, usuario.getCdUsuario());
			
			stmt.executeUpdate();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	// Listar Usuario
	public List<Usuario> getLista(){
		try {
			List<Usuario> usuarios = new ArrayList<Usuario>();
			PreparedStatement stmt = connection.prepareStatement("select * from usuario");
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				Usuario usuario = new Usuario();
				
				usuario.setLogin(rs.getString("login"));
				usuario.setSenha(rs.getString("senha"));
				usuario.setEmail(rs.getString("email"));
				usuario.setCdUsuario(rs.getString("CdUsuario"));
				usuario.setSetor(rs.getString("setor"));
				
				usuarios.add(usuario);
			}
			rs.close();
			stmt.close();
			return usuarios;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
