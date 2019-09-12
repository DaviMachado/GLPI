package br.com.wi2.glpi.core.fachada;

import br.com.wi2.glpi.core.dominio.EntidadeDominio;
import br.com.wi2.glpi.core.dominio.Resultado;

/**
 * Interface IFachada
 * @author Davi Rodrigues
 * @date 12/09/2019
 */
public interface IFachada {
	
	public Resultado salvar(EntidadeDominio entidade);
    public Resultado alterar(EntidadeDominio entidade);
    public Resultado excluir(EntidadeDominio entidade);
    public Resultado consultar(EntidadeDominio entidade);
	
}
