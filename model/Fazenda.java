package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fazenda")
public class Fazenda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome_fazenda;
	private String cidade;
	private String uf;
	private String cnpj;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome_fazenda() {
		return nome_fazenda;
	}
	public void setNome_fazenda(String nome_fazenda) {
		this.nome_fazenda = nome_fazenda;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}

	public Fazenda(int id, String nome_fazenda, String cidade, String uf, String cnpj) {
		super();
		this.id = id;
		this.nome_fazenda = nome_fazenda;
		this.cidade = cidade;
		this.uf = uf;
		this.cnpj = cnpj;
		
	}
	
	
	public Fazenda() {}
}
