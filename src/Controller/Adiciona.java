package Controller;

import DAO.ContatoDAO;
import Modelo.Contato;

public class Adiciona {
	public static void main(String[] args) {
		
		ContatoDAO dao = new ContatoDAO();
		Contato contato = new Contato();
		
		contato.setNome("davi");
		contato.setEmail("davi@teste.com.br");
		contato.setEndereco("rua teste 123");
		contato.setDataNascimento("2019-07-30");
		
		dao.adiciona(contato);
	}
}
