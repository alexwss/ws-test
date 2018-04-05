package br.com.unimed.servico;



import java.util.ArrayList;
import java.util.Collection;

import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.unimed.dao.AtendimentoDao;
import br.com.unimed.modelo.Atendimento;
import br.com.unimed.modelo.Desenvolvedor;
import br.com.unimed.modelo.Telefone;


@WebService(endpointInterface = "br.com.unimed.servico.SEIAtendimento")
public class SIBAtendimento implements SEIAtendimento {
	
	
	@SuppressWarnings("null")
	@Override
	public Atendimento ler(String protocolo){
		
		AtendimentoDao dao = new AtendimentoDao();
		Atendimento atendimento;
		
		Desenvolvedor developer = new Desenvolvedor();
		developer.setCargo("System Analist");
		developer.setIdade(26);
		developer.setNome("Alex Wellington Santos da Silva");
		
		Collection<Telefone> telefones = new ArrayList<Telefone>();
		Telefone telefone = new Telefone();
		telefone.setNumero(998409669);
		telefones.add(telefone);
		
		Telefone telefone2 = new Telefone();
		telefone2.setNumero(123456789);
		telefones.add(telefone2);				
		
		try {
			atendimento = dao.carregarAtendimento(protocolo);
			atendimento.setDesenvolvedor(developer);
			atendimento.setTelefones(telefones);
		} catch (Exception e) {
            e.printStackTrace();
            return null;
		}
		
		return atendimento;

	}
	
}
