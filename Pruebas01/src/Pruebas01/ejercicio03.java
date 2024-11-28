package Pruebas01;

public class ejercicio03 {

	public static void main(String[] args) {
	
		//Cual es el numero mayor
		
		int numero1=2;
		int numero2=4;
		
		int mayor= numeroMayor(numero1,numero2);
		
		System.out.println(mayor);
		
		}

	public static int numeroMayor(int n1,int n2) {
		if(n1>n2) {
			return n1;
		}else {
			return n2;
		}
	}

}

