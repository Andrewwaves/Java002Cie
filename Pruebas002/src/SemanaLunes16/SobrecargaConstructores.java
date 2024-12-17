package SemanaLunes16;

public class SobrecargaConstructores {
	
	private String marca;
	private String modelo;
	
	
	//constructor
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
	//}

	//public coche(String marca, String modelo) {
		
		this.marca = marca;
		this.modelo = modelo;
	//}
	
	//public coche (String modelo) {
		
		this.modelo=modelo;
		this.marca="Toyota";
		
		
	}
	
	

}
