package br.com.unimed.modelo;

import java.util.Collection;
import java.util.Date;
import javax.xml.bind.annotation.*;


@XmlRootElement(name="Atendimento")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
		name = "Protocolo",
		propOrder = {"protocolo", "codigoBeneficiario", "dataAbertura","desenvolvedor","telefones"} ,
		namespace = "http://unimedsa.com.br/"
)
public class Atendimento {
	
	@XmlElement(name="protocolo")
	private String protocolo;

	@XmlElement(name="codigoBeneficiario")	
	private String codigoBeneficiario;
	
	@XmlElement(name="dataAbertura")		
	private Date dataAbertura;

	@XmlElement(name="desenvolvedor")
	private Desenvolvedor desenvolvedor = new Desenvolvedor();
		
        @XmlElementWrapper(name = "Telefones")
        @XmlElement(name = "Telefone")  
	private Collection<Telefone> telefones;
	

	public Atendimento(){
		super();
	}
	
	public Atendimento(String protocolo, String codigoBeneficiario){
		super();
		this.protocolo = protocolo;
		this.codigoBeneficiario = codigoBeneficiario;
	}
	
	public String getProtocolo() {
		return protocolo;
	}
	
	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}
	
	public String getCodigoBeneficiario() {
		return codigoBeneficiario;
	}
	
	public void setCodigoBeneficiario(String codigoBeneficiario) {
		this.codigoBeneficiario = codigoBeneficiario;
	}
	
	public Date getDataAbertura() {
		return dataAbertura;
	}
	
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public Desenvolvedor getDesenvolvedor() {
		return desenvolvedor;
	}

	public void setDesenvolvedor(Desenvolvedor desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}
	
	public Collection<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(Collection<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	@Override
	public String toString(){
		return "frotocolo :" + this.protocolo + ";";
	}
	
	
}
