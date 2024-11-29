package Pruebas01;

public class ejercicio16 {

	public static void main(String[] args) {
	//establecer la cadena
		String cadena="hola que tal estás";
		//establecer una variavle que sea un contador
		int contador=0;
		//recorrer entera la lista
		for (int i=0;i<cadena.length();i++) {
			
			//establecer otra variable char(de letra) que sea el recorrido entero caracter por caracter
	char caracter= cadena.charAt(i);
	//si es a contarlo
			if (caracter=='a'|| caracter=='á') {System.out.println(caracter);
			contador++;
			}
			}
		//sumar todas las veces que el sistema lee a
		System.out.println(contador);
}
}
