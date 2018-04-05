package br.com.unimed.servico;

//import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.com.unimed.modelo.Atendimento;

@WebService //expoe servico como webservice
@SOAPBinding(style = Style.DOCUMENT) //usará a classe para tipos complexos //como xsd por exemplo
public interface SEIAtendimento {
	
	//metodo do webservice
	@WebMethod(operationName="pegarAtendimento")
	@WebResult(name = "atendimento")
	Atendimento ler(@WebParam(name = "protocolo") String protocolo);
	
}
