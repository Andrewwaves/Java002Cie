package Objetos;

public class Factura {
//en la plantilla no va main
	
	public double importe;
	
	//(double importe) - parametro, si se quita se accede a la propiedad.
	//public double calcularConIVA(double importe) {
	public double calcularConIVA() {
		return importe*1.21;
	}
	
	public double calcularSoloIVA() {
		return importe*0.21;
		
	}
}
