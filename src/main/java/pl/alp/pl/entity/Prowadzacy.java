package pl.alp.pl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Prowadzacy {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String imie;
	private String nazwisko;
	private String telefon;
	private Integer admin;
	private String password;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public Integer isAdmin() {
		return admin;
	}
	public void setAdmin(Integer admin) {
		this.admin = admin;
	}
}
