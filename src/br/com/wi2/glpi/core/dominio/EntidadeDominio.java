package br.com.wi2.glpi.core.dominio;

/**
 * Classe entidade dominio
 * @author Davi Rodrigues
 * @date 09/09/2019
 */
public class EntidadeDominio implements IEntidade {
	private int id;
	private String dtCriacao;
    private boolean ativo;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDtCriacao() {
		return dtCriacao;
	}
	public void setDtCriacao(String dtCriacao) {
		this.dtCriacao = dtCriacao;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
