package examen14;

import java.util.ArrayList;

public class ejercicio3_arraylist {

	public static void main(String[] args) {
		
		ArrayList <String> cadena = new ArrayList <String>();
		
		cadena.add("hola");
		cadena.add("que");
		cadena.add("tal");
		cadena.add("estas");

		for(int i=cadena.size()-1;i>=0;i--) {
			System.out.println(cadena.get(i));
		}
	}
}
