package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.*;
import DAO.*;

// Registrando uma Servlet sem a necessidade do arquivo "web.xml".
// Parâmetros: nome da Servlet e a URL que ela vai acessar.
@WebServlet(name="Cadastro Servlet", urlPatterns="/cadastro")
public class CadastroServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	    throws ServletException, IOException {
		
		// vamos indicar que a nossa resposta será em HTML ao invés de texto
		resp.setContentType("text/html");
		
		// Usa para escrever na tela
		PrintWriter writer = resp.getWriter();
		
		// instanciando as classes
		Contato contato = new Contato();
		ContatoDAO dao = new ContatoDAO();
		
		// Pegando as informações digitadas nos Forms do HTML
		contato.setId(req.getParameter("id"));
		contato.setNome(req.getParameter("nome"));
		contato.setEmail(req.getParameter("email"));
		contato.setEndereco(req.getParameter("endereco"));
		contato.setDataNascimento(req.getParameter("dataNascimento"));
		
		// Verificando se os botões foram clicados na tela
		boolean cadastrar = Boolean.parseBoolean((req.getParameter("cadastrar")!=null?"true":"false"));
		boolean editar = Boolean.parseBoolean((req.getParameter("editar")!=null?"true":"false"));
		boolean remover = Boolean.parseBoolean((req.getParameter("remover")!=null?"true":"false"));
		boolean listar = Boolean.parseBoolean((req.getParameter("listar")!=null?"true":"false"));
		
		if(cadastrar) {
			// Salva o que foi digitado na tela
			dao.adiciona(contato);
		     
		    writer.println("<h1>Cadastro salvo com sucesso!</h1>");
		     
		    // Mostra o que foi gravado
		    writer.println("<ul>");
		    writer.println("<li>nome: " + contato.getNome() + "</li>");
		    writer.println("<li>email: " + contato.getEmail() + "</li>");
		    writer.println("<li>endereco: " + contato.getEndereco() + "</li>");
		    writer.println("<li>dataNascimento: " + contato.getDataNascimento() + "</li>");
		    writer.println("</ul>");
		    
		    writer.println("<input type=\"button\" value=\"Voltar\" onclick=\"history.back()\">");
		}
		
		if(editar) {
			// Edita o cadastro
			dao.altera(contato);
			
			writer.println("<h1>Cadastro Editado com sucesso!</h1>");
		     
		    // Mostra o que foi gravado
		    writer.println("<ul>");
		    writer.println("<li>nome: " + contato.getNome() + "</li>");
		    writer.println("<li>email: " + contato.getEmail() + "</li>");
		    writer.println("<li>endereco: " + contato.getEndereco() + "</li>");
		    writer.println("<li>dataNascimento: " + contato.getDataNascimento() + "</li>");
		    writer.println("</ul>");
		    
		    writer.println("<input type=\"button\" value=\"Retornar\" onclick=\"history.back()\">");
		}
		
		if(remover) {
			// Deleta o cadastro indicado
			dao.remove(contato);
			
			writer.println("<h1>Cadastro Removido com sucesso!</h1>");
			
			writer.println("<input type=\"button\" value=\"Voltar\" onclick=\"history.back()\">");
		}
		
		if(listar) {
			// Lista todos os contatos do BD
			writer.println("<h1>Listagem dos Contatos!</h1>");
			
			Contato retorno = new Contato();
			
			// o objeto retorno recebe o contato alterado no metodo da DAO
			retorno = dao.AlteraId(contato);
			
			// manda o objeto retorno para o arquivo .jsp (editar.jsp)
			// parametros: req.setAttribute("nomeDoAtributo", valorDoAtributo);
			req.setAttribute("retorno", retorno);
			
			req.getRequestDispatcher("JSP/editar.jsp").forward(req, resp);
			
			// Redireciona para o arquivo .jsp
			//req.getRequestDispatcher("JSP/lista-contatos-scriptlet.jsp").forward(req, resp);
		}
	}
}