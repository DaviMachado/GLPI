package br.com.wi2.glpi.util.teste;

import br.com.wi2.glpi.core.dao.ContatoDAO;
import br.com.wi2.glpi.core.dominio.Contato;

public class Remove {
	public static void main(String[] args) {
		
		ContatoDAO dao = new ContatoDAO();
		Contato contato = new Contato();
		
		contato.setId("1");
		
		dao.remove(contato);
	}
}
