package br.com.unimed.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="desenvolvedor")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "http://unimedsa.com.br/")
public class Desenvolvedor {
	
	@XmlElement(name="nome", required = true)
	private String nome;
	
	@XmlElement(name="idade", required = true)
	private Integer idade;
	
	@XmlElement(name="cargo", required = true)
	private String cargo;		
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
			
}
