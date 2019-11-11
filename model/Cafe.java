package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cafe")
public class Cafe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne(cascade = CascadeType.ALL)
	private Fazenda fazenda;
	private String dia_plantio;
	private String dia_colheita;
	private int qt_plantado;
	private int qtd_perdido;
	@OneToOne(cascade = CascadeType.ALL)
	private Terreno terreno;
	private String unidade_medida;
	
	
	
	
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




	public String getDia_plantio() {
		return dia_plantio;
	}




	public void setDia_plantio(String dia_plantio) {
		this.dia_plantio = dia_plantio;
	}




	public String getDia_colheita() {
		return dia_colheita;
	}




	public void setDia_colheita(String dia_colheita) {
		this.dia_colheita = dia_colheita;
	}




	public int getQt_plantado() {
		return qt_plantado;
	}




	public void setQt_plantado(int qt_plantado) {
		this.qt_plantado = qt_plantado;
	}




	public int getQtd_perdido() {
		return qtd_perdido;
	}




	public void setQtd_perdido(int qtd_perdido) {
		this.qtd_perdido = qtd_perdido;
	}




	public Terreno getTerreno() {
		return terreno;
	}




	public void setTerreno(Terreno terreno) {
		this.terreno = terreno;
	}




	public String getUnidade_medida() {
		return unidade_medida;
	}




	public void setUnidade_medida(String unidade_medida) {
		this.unidade_medida = unidade_medida;
	}


	


	public Cafe(int id, Fazenda fazenda, String dia_plantio, String dia_colheita, int qt_plantado, int qtd_perdido,
			Terreno terreno, String unidade_medida) {
		super();
		this.id = id;
		this.fazenda = fazenda;
		this.dia_plantio = dia_plantio;
		this.dia_colheita = dia_colheita;
		this.qt_plantado = qt_plantado;
		this.qtd_perdido = qtd_perdido;
		this.terreno = terreno;
		this.unidade_medida = unidade_medida;
	}




	public Cafe() {}
}
