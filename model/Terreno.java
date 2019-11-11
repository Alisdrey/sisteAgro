package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "terreno")
public class Terreno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne(cascade = CascadeType.ALL)
	private Fazenda fazenda;
	private Double metros_q;
	
	

	public Terreno(int id, Fazenda fazenda, Double metros_q) {
		super();
		this.id = id;
		this.fazenda = fazenda;
		this.metros_q = metros_q;
	}



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



	public Double getMetros_q() {
		return metros_q;
	}



	public void setMetros_q(Double metros_q) {
		this.metros_q = metros_q;
	}



	public Terreno() {}
	
	
	

	
}
