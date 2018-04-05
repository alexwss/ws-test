package br.com.unimed.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "telefone")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "http://unimedsa.com.br/")
public class Telefone {
	
    @XmlElement(name = "numero", required = true)
    private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
    
}
