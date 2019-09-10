package br.com.wi2.glpi.view.helper;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.wi2.glpi.core.dominio.EntidadeDominio;
import br.com.wi2.glpi.core.dominio.Resultado;

/**
 * interface IViewHelper
 * @author Davi Rodrigues
 * @date 10/09/2019
 */
public interface IViewHelper {
	public EntidadeDominio getEntidade(HttpServletRequest request);

    public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;
}
