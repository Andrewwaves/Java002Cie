package Objetos;

public class Cuadrado {

	private int lado1;
	private int lado2;
	
	//lado1=lado2;
	
	public int getLado1() {
		return lado1;
	}
	
	public void setLado1(int lado1) {
		this.lado1=lado1;
		this.lado2=lado1;
	}
	
	public int getLado2() {
		return lado2;
	}
	
	public void setLado2(int lado2) {
		this.lado2=lado2;
		this.lado1=lado2;
	}

	public Cuadrado(int lado1, int lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	//public static double area(int lado){
	//return lado*lado;
	
		public double area() {
			return lado1*lado2;
		}
		
		//public double area(){
		//return Cuadrado.area(lado1);
}
