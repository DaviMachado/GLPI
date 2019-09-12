package br.com.wi2.glpi.view.command.impl;

import br.com.wi2.glpi.core.dominio.EntidadeDominio;
import br.com.wi2.glpi.core.dominio.Resultado;

/**
 * Classe ConsultarCommand
 * @author Davi Rodrigues
 * @date 12/09/2019
 */
public class ConsultarCommand extends AbstractCommand {

	@Override
	public Resultado execute(EntidadeDominio entidade) {
		return fachada.consultar(entidade);
	}

}
