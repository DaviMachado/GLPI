package br.com.wi2.glpi.view.helper.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.wi2.glpi.core.dominio.EntidadeDominio;
import br.com.wi2.glpi.core.dominio.Resultado;
import br.com.wi2.glpi.core.dominio.Usuario;
import br.com.wi2.glpi.view.helper.IViewHelper;

/**
 * Classe UsuarioHelper
 * @author Davi Rodrigues
 * @date 10/09/2019
 */
public class UsuarioHelper implements IViewHelper {
	
	Usuario u = null;

	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		String operacao = request.getParameter("operacao");
		
		String login = null;
        String senha = null;
        String email = null;
        String CdUsuario = null;
        String setor = null;
		
        if(("SALVAR").equals(operacao)) {
        	u = new Usuario();
        	
        	login = request.getParameter("login");
        	senha = request.getParameter("senha");
        	email = request.getParameter("email");
        	CdUsuario = request.getParameter("CdUsuario");
        	setor = request.getParameter("setor");
        	
        	u.setLogin(login);
        	u.setSenha(senha);
        	u.setEmail(email);
        	u.setCdUsuario(CdUsuario);
        	u.setSetor(setor);
        }
        else if(("CONSULTAR").equals(operacao)) {
        	
        }
        else if(("ALTERAR").equals(operacao)) {
        	
        }
        else if(("EXCLUIR").equals(operacao)) {
        	
        }
        
		return u;
	}

	@Override
	public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
	}

}
