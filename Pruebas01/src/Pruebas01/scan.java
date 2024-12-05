package Pruebas01;

import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Dame una edad:");
		
		//lectura de la consola
		int edad=scanner.nextInt();
		
		if (edad>0 && edad<18) {
			System.out.println("Entrada Gratuita");
		
		}else if (edad>=18 && edad<50) {
			System.out.println("Entrada 20€");
			
		}else if (edad>=50 && edad<65) {
			System.out.println("Entrada con 40% de Descuento");
			
		}else {
			System.out.println("Entrada con 75% de Descuento");
		}
		
		scanner.close();
	}

}
