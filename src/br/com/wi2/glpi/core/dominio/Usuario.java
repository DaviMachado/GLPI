package br.com.wi2.glpi.core.dominio;

import java.util.List;

/**
 * Classe para representar o Usuario
 * @author Davi Rodrigues
 * @date 09/09/2019
 */
public class Usuario extends Pessoa {
	private String login;
	private String senha;
	private String CdUsuario;
	private String email;
	private String setor;
	private List<Endereco> endereco;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCdUsuario() {
		return CdUsuario;
	}
	public void setCdUsuario(String cdUsuario) {
		this.CdUsuario = cdUsuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public List<Endereco> getEndereco() {
		return endereco;
	}
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
}
