package Pruebas01;

public class EjercicioClase02Vocales {

	public static void main(String[] args) {
		// recorrer la cadena "hola amigos que tal estas"e imprimir sus vocales por la consola
		//establecer la cadena
		String cadena="hola amigo que tal estás";
		//y comenzar con el contador para que te haga recuento de cuantas vocales hay
		int contador=0;
		//recorremos la lista
		for (int i=0;i<cadena.length();i++) {
			
			//y ponemos el char para que te lea los caracteres
			//recalcar esto para no mirarlo
			char caracter=cadena.charAt(i);
			//la condicion de las vocales
			if(caracter =='a' || caracter=='e' || caracter=='i' || caracter=='o' || caracter=='u' || caracter=='á') 
				//vamos imprimiendolas
			{System.out.println(caracter);
			//y si es vocal vamos subiendo el contador
			contador++;
			}
		}
		//al final imprimimos el contador(fuera del bucle) para que sepamos cuantas vocales hay en toda la frase
		System.out.println(contador);
	}

}
