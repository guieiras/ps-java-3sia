package br.com.fiap.business;

import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.exception.BusinessException;
import br.com.fiap.model.UsuarioModel;

public class UsuarioBusiness {
	
	public UsuarioModel login (String login, String senha) throws Exception {
		
		if ( senha.length() < 4 ) {
			throw new BusinessException("Erro no tamanho da senha!");
		}
		
		return new UsuarioDAO().login(login, senha);
	}
	
}
