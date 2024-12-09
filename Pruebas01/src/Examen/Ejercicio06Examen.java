package Examen;

public class Ejercicio06Examen {

	public static void main(String[] args) {
		
		double[] cadena = new double [] {2, 8, 15, 20, 18};
		
		
		double grande = 0;
		for( int i=0; i < cadena.length ;i++) {
			
			System.out.println(cadena[i]);
			
			if (grande < cadena[i]) { 
				
				grande = cadena[i];
			}
			
		}
		System.out.println("Número más grande = "+grande);

	}

}
