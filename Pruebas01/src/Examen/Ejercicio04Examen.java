package Examen;

public class Ejercicio04Examen {

	public static void main(String[] args) {
		
		String cadena = "hola me llamo pepe y soy informatico";
		
		int contador=0;
		for (int i=0 ; i<cadena.length() ; i++) {
			
		char caracter=cadena.charAt(i);
		if (caracter =='e') 
			
		{System.out.println(caracter);
		contador++;
		}
		
	}
		System.out.println(contador);
	}
}
