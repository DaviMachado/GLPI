package Controller;

import DAO.ContatoDAO;
import Modelo.Contato;

public class Remove {
	public static void main(String[] args) {
		
		ContatoDAO dao = new ContatoDAO();
		Contato contato = new Contato();
		
		contato.setId("1");
		
		dao.remove(contato);
	}
}
