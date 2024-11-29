package Pruebas01;

public class ejercicio15 {

	public static void main(String[] args) {
	
		String cadena="hola que x tal estás";
		for (int i=0;i<cadena.length();i++) {
			
	char caracter= cadena.charAt(i);
			if (caracter=='x') {System.out.println(i);
			}
	}
}
}
