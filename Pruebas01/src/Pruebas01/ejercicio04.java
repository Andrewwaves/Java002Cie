package Pruebas01;

public class ejercicio04 {

	public static void main(String[] args) {
	
		//numero
		
		int numero1=2;
		
		cambiar(numero1);
		
		System.out.println(numero1);
		
		}

	
	//es una copia de la varible, no es la original
	public static void cambiar(int n1) {
		 n1=7;
		System.out.println("cambio a " +n1);

	}

}

