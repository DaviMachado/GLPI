package br.com.wi2.glpi.core.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.wi2.glpi.core.dominio.EntidadeDominio;

/**
 * Interface IDAO
 * @author Davi Rodrigues
 * @date 11/09/2019
 */
public interface IDAO {
	
	public void salvar(EntidadeDominio entidade) throws SQLException;

    public void alterar(EntidadeDominio entidade) throws SQLException;

    public void excluir(EntidadeDominio entidade) throws SQLException;

    public List<EntidadeDominio> consultar(EntidadeDominio entidade) throws SQLException;

	
}
