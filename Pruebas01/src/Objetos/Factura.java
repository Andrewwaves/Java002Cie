package Objetos;

public class Factura {

	
	public double importe;
	
	public double calcularConIVA() {
		return importe*1.21;
	}
	
	public double calcularSoloIVA() {
		return importe*0.21;
		
	}
}
