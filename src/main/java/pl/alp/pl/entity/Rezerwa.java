package pl.alp.pl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Rezerwa {
	@Id
	@GeneratedValue
	private Integer id;
	private String  data;
	private String  dataroz;
	private String  datazak;
	private String cel;
	private Integer sala;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getDataroz() {
		return dataroz;
	}
	public void setDataroz(String dataroz) {
		this.dataroz = dataroz;
	}
	public String getDatazak() {
		return datazak;
	}
	public void setDatazak(String datazak) {
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

}
