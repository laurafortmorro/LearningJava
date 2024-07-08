package Entidades;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "aula")
public class Aula implements Serializable {

	@Id
	@Column(name = "aula_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String tituloAula;
	private float metros;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTituloAula() {
		return tituloAula;
	}
	
	public void setTituloAula(String tituloAula) {
		this.tituloAula = tituloAula;
	}
	
	public float getMetros() {
		return metros;
	}
	
	public void setMetros(float metros) {
		this.metros = metros;
	}
	
	
	

}