package pl.alp.pl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Rezerwacja2 {
	@Id
	@GeneratedValue
	private Integer id;
	java.sql.Date data;
	java.sql.Time dataroz;
	java.sql.Time datazak;
	private String cel;
	private Integer sala;
	private String imie;
	private String nazwisko;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public java.sql.Date getData() {
		return data;
	}
	public void setData(java.sql.Date data) {
		this.data = data;
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
	public String getCel() {
		return cel;
	}
	public void setCel(String cel) {
		this.cel = cel;
	}
	public Integer getSala() {
		return sala;
	}
	public void setSala(Integer sala) {
		this.sala = sala;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
}
