package Objetos;

public class Cuadrado {

	private int lado1;
	private int lado2;
	
	//lado1=lado2;
	
	public int getLado1() {
		return lado1;
	}
	
	public void setLado1(int l1) {
		if(lado1==lado2)
		lado1=l1;
	}
	
	public int getLado2() {
		return lado2;
	}
	
	public void setLado2(int l2) {
		lado2=l2;
	}
}
