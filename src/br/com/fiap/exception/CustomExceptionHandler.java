package br.com.fiap.exception;

import java.util.Iterator;
import java.util.Map;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.application.NavigationHandler;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.event.ExceptionQueuedEvent;
import javax.faces.event.ExceptionQueuedEventContext;
 

//Inicialmente devemos implementar a classe CustomExceptionHandler que extende a classe ExceptionHandlerWrapper
public class CustomExceptionHandler extends ExceptionHandlerWrapper {
 
    private ExceptionHandler wrapped;
 
    //Obt�m uma inst�ncia do FacesContext
    final FacesContext facesContext = FacesContext.getCurrentInstance();
 
    //Obt�m um mapa do FacesContext
    final Map requestMap = facesContext.getExternalContext().getRequestMap();
 
    //Obt�m o estado atual da navega��o entre p�ginas do JSF
    final NavigationHandler navigationHandler = facesContext.getApplication().getNavigationHandler();
 
    //Declara o construtor que recebe uma exceptio do tipo ExceptionHandler como par�metro
    CustomExceptionHandler(ExceptionHandler exception) {
        this.wrapped = exception;
    }
 
    //Sobrescreve o m�todo ExceptionHandler que retorna a "pilha" de exce��es
    @Override
    public ExceptionHandler getWrapped() {
        return wrapped;
    }
 
    //Sobrescreve o m�todo handle que � respons�vel por manipular as exce��es do JSF
    @Override
    public void handle() throws FacesException {
        final Iterator iterator = getUnhandledExceptionQueuedEvents().iterator();
        while (iterator.hasNext()) {
            ExceptionQueuedEvent event = (ExceptionQueuedEvent) iterator.next();
            ExceptionQueuedEventContext context = (ExceptionQueuedEventContext) event.getSource();
 
            // Recupera a exce��o do contexto
            Throwable exception = context.getException();
 
            // Aqui tentamos tratar a exe��o
            try {
            	
            	String erro = "";
            	
            	if ( exception instanceof DAOException ) {
            		erro = "Problemas no acesso ao banco de dados.";
            	} else if ( exception instanceof BusinessException){
            		erro = "N�o foi poss�vel efetuar a opera��o. Verifique os detalhes e tente novamente!";
            	} else {
            		erro = "Ops :! - Erro Fatal!";
            	}
            	           	
            	Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
            	flash.put("error", erro);
            	flash.put("errorDetails", exception.getMessage());
                facesContext.getExternalContext().redirect("/fiap-jsf/error.xhtml?faces-redirect=true");
                
            } catch (Exception e){
            	
                
            } finally {
                // Remove a exe��o da fila
                iterator.remove();
            }
        }
        // Manipula o erro
        getWrapped().handle();
    }
}