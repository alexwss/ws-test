package br.com.unimed.servico;

import javax.xml.ws.Endpoint;

public class Publica {
	public static void main(String[] args){
		
		String porta = "8090";
		System.out.println("Publicando o serviço na porta 8090...");
		Endpoint.publish("http://localhost:"+porta+"/atendimentos", new SIBAtendimento());
		System.out.println("Servico publicado na porta 8090");
	}
}
	