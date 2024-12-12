package Objeto;

public class Maleta {

	private String modelo;
	private double peso;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	public Maleta(String modelo, int peso) {
		super();
		this.modelo = modelo;
		this.peso = peso;
	}
	
	
	
}
