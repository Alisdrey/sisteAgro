package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "armazem")
public class Armazem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne(cascade = CascadeType.ALL)
	private Fazenda fazenda;
	private Double largura;
	private Double comprimento;
	private int sacas_atual;
	



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




	public Double getLargura() {
		return largura;
	}




	public void setLargura(Double largura) {
		this.largura = largura;
	}




	public Double getComprimento() {
		return comprimento;
	}




	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}




	public int getSacas_atual() {
		return sacas_atual;
	}




	public void setSacas_atual(int sacas_atual) {
		this.sacas_atual = sacas_atual;
	}


	


	public Armazem(int id, Fazenda fazenda, Double largura, Double comprimento, int sacas_atual) {
		super();
		this.id = id;
		this.fazenda = fazenda;
		this.largura = largura;
		this.comprimento = comprimento;
		this.sacas_atual = sacas_atual;
	}




	public Armazem() {}
	
}
