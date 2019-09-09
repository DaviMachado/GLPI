package br.com.wi2.glpi.view.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException{
		// Informa que o tipo da resposta do "Response" será em HTML
		resp.setContentType("text/html");
		 
	    PrintWriter writer = resp.getWriter();
	     
	    writer.print("Projeto GLPI Wi2");
	 
	    writer.print("<ul>");
	 
	    writer.print("<li>");
	    writer.print("Teste");
	    writer.print("</li>");
	 
	    writer.print("<li>");
	    writer.print("Teste");
	    writer.print("</li>");
	 
	    writer.print("</ul>"); 
	}
}