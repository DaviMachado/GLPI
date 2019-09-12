package br.com.wi2.glpi.view.command;

import br.com.wi2.glpi.core.dominio.EntidadeDominio;
import br.com.wi2.glpi.core.dominio.Resultado;

/**
 * Interface ICommand
 * @author Davi Rodrigues
 * @date 12/09/2019
 */
public interface ICommand {
	public Resultado execute(EntidadeDominio entidade);
}
