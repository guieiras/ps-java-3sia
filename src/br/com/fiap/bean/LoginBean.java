package br.com.fiap.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.fiap.business.UsuarioBusiness;
import br.com.fiap.exception.BusinessException;
import br.com.fiap.model.UsuarioModel;
import br.com.fiap.session.SessionContext;

@ManagedBean
@SessionScoped
public class LoginBean {
	
	
	private UsuarioModel usuario;
	private String erro;
	
	public LoginBean(){
		usuario = (UsuarioModel) SessionContext.getInstance().getAttribute("usuarioLogado");
		if ( usuario == null ) {
			usuario = new UsuarioModel();
		}
	}

	public String login() throws Exception {
		
		String retorno = "login";
		
		try {
			
			usuario = new UsuarioBusiness().login(usuario.getLoginUsuario(), usuario.getSenhaUsuario());
			if ( usuario != null ) {
				SessionContext.getInstance().setAttribute("usuarioLogado", usuario);
				retorno = "admin/index";
			} else {
				erro = "Não foi possível efetuar o login";
				retorno = "login";
			}
			
		} catch (BusinessException e) {
			erro = e.getMessage();
		} catch (Exception e) {
			throw e;
		}
		
		
		return retorno;
	}
	
	
	
	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}


	public String getErro() {
		return erro;
	}


	public void setErro(String erro) {
		this.erro = erro;
	}

	
	
	
	
}
