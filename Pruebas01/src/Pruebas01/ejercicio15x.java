package Pruebas01;

public class ejercicio15x {

	public static void main(String[] args) {
	
		//establecemos la cadena
		String cadena="hola que x tal esxtás";
		//recorremos la cadena entera
		for (int i=0;i<cadena.length();i++) {
		//System.out.println(cadena.charAt(i)); para imprimir todos los caracteres
		//esto se puede hacer o no
	char caracter= cadena.charAt(i);
	//la condicion de que si es x imprimir la posicion
			if (caracter=='x') {System.out.println(i);}
			//o ahorrarte la variable caracter y hacer:
			//if(cadena.charAt(i)=='x') System.out.println(i);
	}
}
}
