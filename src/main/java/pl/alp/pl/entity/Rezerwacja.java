package pl.alp.pl.entity;

import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rezerwacja {

	@Id
	@GeneratedValue
	private Integer id;
	java.sql.Date data;
	java.sql.Time dataroz;
	java.sql.Time datazak;
	private String cel;
	private Integer sala;

	public Integer getSala() {
		return sala;
	}


	public void setSala(Integer sala) {
		this.sala = sala;
	}


	public Integer getId() {
		return id;
	}


	public java.sql.Date getData() {
		return data;
	}


	public void setData(java.sql.Date data) {
		this.data = data;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCel() {
		return cel;
	}


	public void setCel(String cel) {
		this.cel = cel;
	}


	public java.sql.Time getDataroz() {
		return dataroz;
	}


	public void setDataroz(java.sql.Time dataroz) {
		this.dataroz = dataroz;
	}


	public java.sql.Time getDatazak() {
		return datazak;
	}


	public void setDatazak(java.sql.Time datazak) {
		this.datazak = datazak;
	}


	
	
	
}
