package Pruebas01;

public class EjercicioArray {

	public static void main(String[] args) {
		
		String[] lista= new String[] {"Hola","Buenos","Dias","Amigo"};
		
		int i=0;
		int letras=0;
		int posicion = 0;
		while (i<lista.length) {
			System.out.print(lista[i]);
			System.out.println(lista[i].length());

		
	if (letras<lista[i].length()) { 
		 letras = lista[i].length();
		 posicion=i;
	}
		i++;
	}
		System.out.println("Mayor numero de letras: "+ letras);
		System.out.println("La palabra es: "+ lista[posicion]);
	}

}