package MasObjetos;

public class Factura {

	private int numero;
	private double importe;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	public Factura(int numero, int importe) {
	
		this.numero = numero;
		this.importe = importe;
		//si los metodos set tienen alguna limitacion:
		//setNumero(numero);
		//setImporte(importe);
	}
	
		public double calculoIVA() {
			return importe*1.21;
	}
	
}
