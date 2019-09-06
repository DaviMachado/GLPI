package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormularioServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	          throws ServletException, IOException {
		// Método que indica qual é o arquivo que ele vai abrir quando acessar essa Servlet
		// ".forward(req, resp)" -> indica para ele direcionar para o arquivo especificado. ("formulario.html")
	    req.getRequestDispatcher("HTML/formulario.html").forward(req, resp);
	}

}