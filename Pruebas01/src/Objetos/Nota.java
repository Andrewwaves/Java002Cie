package Objetos;

public class Nota {

	//cambiamos de public a private
	private double Valor;
	
	//generar getvalor publica
	//si la variable es privada, vamos a poder modificar las cosas a traves de funciones
	//funcion que nos devuelve el valor como funcion publica
	public double getValor() {
		
		return Valor;
	}
	//void poque ejecuta cosas pero no devuelve nada
	public void setValor (double v) {
		if(v>=0 && v<=10)
		Valor=v;
	}
	

	
}
