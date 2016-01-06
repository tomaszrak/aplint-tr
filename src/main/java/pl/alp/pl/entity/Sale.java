package pl.alp.pl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sale {
	@Id
	@GeneratedValue
	private Integer id;
	private Integer pojemnosc;
	private Integer numer;

	private Integer typ_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPojemnosc() {
		return pojemnosc;
	}

	public void setPojemnosc(Integer pojemnosc) {
		this.pojemnosc = pojemnosc;
	}

	public Integer getNumer() {
		return numer;
	}

	public void setNumer(Integer numer) {
		this.numer = numer;
	}

	public Integer getTyp_id() {
		return typ_id;
	}

	public void setTyp_id(Integer typ_id) {
		this.typ_id = typ_id;
	}


}
