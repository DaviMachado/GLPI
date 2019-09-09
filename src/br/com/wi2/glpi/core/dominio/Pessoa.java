package br.com.wi2.glpi.core.dominio;

/**
 * Classe para representar uma Pessoa
 * @author Davi Rodrigues
 * @date 09/09/2019
 */
public class Pessoa extends EntidadeDominio {
	private String nome;
	private int CPF;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}
}
