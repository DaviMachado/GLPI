package br.com.wi2.glpi.view.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.wi2.glpi.core.dao.impl.UsuarioDAO;
import br.com.wi2.glpi.core.dominio.Usuario;

@WebServlet(name="Cadastro Servlet2", urlPatterns="/cadastro2")
public class CadastroServlet2 extends HttpServlet {
	
	
	// Servlet principal
	protected void ControllerServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		// vamos indicar que a nossa resposta será em HTML ao invés de texto
		response.setContentType("text/html");
		
		// Usa para escrever na tela
		PrintWriter writer = response.getWriter();
		
		// instanciando as classes
		Usuario usuario = new Usuario();
		UsuarioDAO dao = new UsuarioDAO();
		
		// Pegando as informações digitadas nos Forms do HTML
		usuario.setLogin(request.getParameter("login"));
		usuario.setSenha(request.getParameter("senha"));
		usuario.setEmail(request.getParameter("email"));
		usuario.setCdUsuario(request.getParameter("CdUsuario"));
		usuario.setSetor(request.getParameter("setor"));
		
		// Verificando quais botões foram clicados na tela
		String operacao = (request.getParameter("operacao"));
		
		if (("SALVAR").equals(operacao)) {
			// Salva o que foi digitado na tela
			dao.salvar(usuario);
			
			writer.println("<h1>Cadastro salvo com sucesso!</h1>");
			
			// Mostra o que foi gravado
		    writer.println("<ul>");
		    writer.println("<li>Login: " + usuario.getLogin() + "</li>");
		    writer.println("<li>Senha: " + usuario.getSenha() + "</li>");
		    writer.println("<li>E-mail: " + usuario.getEmail() + "</li>");
		    writer.println("<li>Cd Usuario: " + usuario.getCdUsuario() + "</li>");
		    writer.println("<li>Setor: " + usuario.getSetor() + "</li>");
		    writer.println("</ul>");
		    
		    writer.println("<input type=\"button\" value=\"Voltar\" onclick=\"history.back()\">");
		}
		else if (("ALTERAR").equals(operacao)) {
			// Edita o usuario
			dao.alterar(usuario);
			
			writer.println("<h1>Cadastro Editado com sucesso!</h1>");
			
			writer.println("<ul>");
		    writer.println("<li>Login: " + usuario.getLogin() + "</li>");
		    writer.println("<li>Senha: " + usuario.getSenha() + "</li>");
		    writer.println("<li>E-mail: " + usuario.getEmail() + "</li>");
		    writer.println("<li>Cd Usuario: " + usuario.getCdUsuario() + "</li>");
		    writer.println("<li>Setor: " + usuario.getSetor() + "</li>");
		    writer.println("</ul>");
		    
		    writer.println("<input type=\"button\" value=\"Voltar\" onclick=\"history.back()\">");
		}
		else if (("EXCLUIR").equals(operacao)) {
			// Deleta o cadastro do usuario conforme o codigo do usuario
			dao.excluir(usuario);
			
			writer.println("<h1>Cadastro Removido com sucesso!</h1>");
			
			writer.println("<input type=\"button\" value=\"Voltar\" onclick=\"history.back()\">");
		}
		else if (("CONSULTAR").equals(operacao)) {
			
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ControllerServlet(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ControllerServlet(request, response);
	}

}
