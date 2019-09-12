package br.com.wi2.glpi.view.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.wi2.glpi.core.dominio.EntidadeDominio;
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
        IViewHelper vh = (IViewHelper) context.getBean(uri);
        
        //O viewhelper retorna a entidade especifica para a tela que chamou esta servlet
        EntidadeDominio entidade = vh.getEntidade(request);
        
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
