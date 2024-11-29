package Pruebas01;

public class ejercicio13 {

	public static void main(String[] args) {
	
		String cadena1= "hola";
		//System.out.println(cadena1);
	//	System.out.println(cadena1.charAt(0));
		
		//char caracter1= cadena1.charAt(1);
		//System.out.println(caracter1);
		
		for (int i=0;i<cadena1.length();i++) {
			System.out.println(cadena1.charAt(i));
		}
		
		for (int i=cadena1.length()-1;i>=0;i--) {
			System.out.println(cadena1.charAt(i));
		}


}
}

