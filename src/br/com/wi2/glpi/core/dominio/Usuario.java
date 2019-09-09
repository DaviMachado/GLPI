package br.com.wi2.glpi.core.dominio;

/**
 * Classe para representar o Usuario
 * @author Davi Rodrigues
 * @date 09/09/2019
 */
public class Usuario extends EntidadeDominio {
	private String login;
	private String senha;
	private int CdCliente;
	private String email;
	private String setor;
	
	
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
	public int getCdCliente() {
		return CdCliente;
	}
	public void setCdCliente(int cdCliente) {
		CdCliente = cdCliente;
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
}
