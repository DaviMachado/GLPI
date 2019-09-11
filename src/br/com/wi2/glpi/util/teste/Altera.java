package br.com.wi2.glpi.util.teste;

import br.com.wi2.glpi.core.dao.impl.ContatoDAO;
import br.com.wi2.glpi.core.dominio.Contato;

public class Altera {
	public static void main(String[] args) {
		
		ContatoDAO dao = new ContatoDAO();
		Contato contato = new Contato();
		
		contato.setNome("davi");
		contato.setEmail("davi@teste.com.br");
		contato.setEndereco("rua teste 123");
		contato.setDataNascimento("2019-07-30");
		contato.setId("1");
		
		dao.altera(contato);
	}
}
