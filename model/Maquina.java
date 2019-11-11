package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "maquina")
public class Maquina {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne(cascade = CascadeType.ALL)
	private Fazenda fazenda;
	private String nome;
	private String marca;
	private String modelo;
	private String ano;
	private String descriao;
	private String funcao;
	private Boolean em_campo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Fazenda getFazenda() {
		return fazenda;
	}
	public void setFazenda(Fazenda fazenda) {
		this.fazenda = fazenda;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getDescriao() {
		return descriao;
	}
	public void setDescriao(String descriao) {
		this.descriao = descriao;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public Boolean getEm_campo() {
		return em_campo;
	}
	public void setEm_campo(Boolean em_campo) {
		this.em_campo = em_campo;
	}
	
	public Maquina(int id, Fazenda fazenda, String nome, String marca, String modelo, String ano, String descriao,
			String funcao, Boolean em_campo) {
		super();
		this.id = id;
		this.fazenda = fazenda;
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.descriao = descriao;
		this.funcao = funcao;
		this.em_campo = em_campo;
	}
	
	public Maquina() {}
	
	
}
