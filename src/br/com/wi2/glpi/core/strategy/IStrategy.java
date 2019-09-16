package br.com.wi2.glpi.core.strategy;

import br.com.wi2.glpi.core.dominio.EntidadeDominio;

/**
 * Interface IStrategy
 * @author Davi Rodrigues
 * @date 16/09/2019
 */
public interface IStrategy {
	
	public String validar(EntidadeDominio entidade);
	
}
