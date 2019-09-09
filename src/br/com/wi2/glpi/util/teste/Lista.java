package br.com.wi2.glpi.util.teste;

import java.util.List;

import br.com.wi2.glpi.core.dao.ContatoDAO;
import br.com.wi2.glpi.core.dominio.Contato;

public class Lista {
	public static void main(String[] args) {
		
		ContatoDAO dao = new ContatoDAO();
		
		List<Contato> contatos = dao.getLista();
		
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " + contato.getDataNascimento() + "\n");
//			System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime() + "\n");
		}
	}
}