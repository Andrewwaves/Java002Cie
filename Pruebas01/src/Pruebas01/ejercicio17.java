package Pruebas01;

public class ejercicio17 {

	public static void main(String[] args) {
	
		String cadena="hola que tal estás";
		int contador=0;
		for (int i=0;i<cadena.length();i++) {
			
	char caracter= cadena.charAt(i);
			if (caracter=='a'|| caracter=='á') {System.out.println(caracter);
			contador++;
			}
			}
		System.out.println(contador);
}
}
