package Objetos;

public class Rectangulo2 {

	
	private double lado1;
	private double lado2;
	
	
	public double getLado1() {
		return lado1;
	}

	//entrara un 2
	public void setLado1(double lado1) {
		//las condiciones se establecen en el set
		if(lado1>0)
		//lado1=2
		//el operador 'this' es un operador de ambito (especificas a que variable te refieres)
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if(lado2>0)
		this.lado2 = lado2;
	}

	public double calcularArea() {
		return lado1*lado2;
	}
	
}
