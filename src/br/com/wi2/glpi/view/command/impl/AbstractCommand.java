package br.com.wi2.glpi.view.command.impl;

import br.com.wi2.glpi.core.fachada.IFachada;
import br.com.wi2.glpi.core.fachada.impl.Fachada;
import br.com.wi2.glpi.view.command.ICommand;

/**
 * Classe abstrata AbstractCommand,
 * para instanciar a Fachada.
 * @author Davi Rodrigues
 * @date 12/09/2019
 */
public abstract class AbstractCommand implements ICommand {
	
	protected IFachada fachada = new Fachada();
	
}
