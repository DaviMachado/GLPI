package br.com.wi2.glpi.view.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.wi2.glpi.core.dominio.EntidadeDominio;
import br.com.wi2.glpi.core.dominio.Resultado;
import br.com.wi2.glpi.view.command.ICommand;
import br.com.wi2.glpi.view.command.impl.AlterarCommand;
import br.com.wi2.glpi.view.command.impl.ConsultarCommand;
import br.com.wi2.glpi.view.command.impl.ExcluirCommand;
import br.com.wi2.glpi.view.command.impl.SalvarCommand;
import br.com.wi2.glpi.view.helper.IViewHelper;

/**
 * Responsavel por processar todas as requisições feita pelo usuario,
 * configurado conforme o arquivo web.xml
 * 
 * @author Davi Rodrigues
 * @date 10/09/2019
 */
public class ControllerServlet extends HttpServlet {
	
	// Servlet principal que processa todas as requisições
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
        // para aceitar acentuacao tanto na requisição e na resposta
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        //Obtém a uri que invocou esta servlet
        String uri = request.getRequestURI();
		
        //Obtêm um viewhelper indexado pela uri que invocou esta servlet
        //IViewHelper vh = (IViewHelper) context.getBean(uri);
        
        //O viewhelper retorna a entidade especifica para a tela que chamou esta servlet
        //EntidadeDominio entidade = vh.getEntidade(request);
        
        //Obtém a operação executada
        String operacao = request.getParameter("operacao");

        // Recupera o command correspondente com a operacao
        //ICommand command = commands.get(operacao);

        /*Executa o command que chamará a fachada para executar a operação requisitada
        * o retorno é uma instância da classe resultado que pode conter mensagens derro
        * ou entidades de retorno
         */
        //Resultado resultado = command.execute(entidade);

        /*
        * Executa o método setView do view helper específico para definir como deverá ser apresentado
        * o resultado para o usuário
         */
        //vh.setView(resultado, request, response);
	}
	
	// Method doGet que redireciona para o processRequest
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		processRequest(request, response);
	}
	
	// Method doPost que redireciona para o processRequest
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		processRequest(request, response);
	}
	
}
