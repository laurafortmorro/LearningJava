package tarea1Diciembre;

public class Moto {
	//5 atributos
	private String marca;
	private String modelo;
	private int agno;
	private String matricula;
	private double kilometraje;
	
	//contructor con 5 parámetros
	public Moto(String marca, String modelo, int agno, String matricula, double kilometraje) {
		this.marca = marca;
		this.modelo = modelo;
		this.agno = agno;
		this.matricula = matricula;
		this.kilometraje = kilometraje;
		
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

	public int getAgno() {
		return agno;
	}

	public void setAgno(int agno) {
		this.agno = agno;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}

	
}
