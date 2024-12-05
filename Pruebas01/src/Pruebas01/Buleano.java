package Pruebas01;

import java.util.Scanner;

public class Buleano {

	public static void main(String[] args) {
		
		int notaFinal=0;
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Asiste a clase");
		boolean asiste=sc.nextBoolean();
		
		if(asiste) {
			notaFinal=notaFinal+2;
		}
		
		System.out.println("Hizo los deberes");
		boolean deberes=sc.nextBoolean();
		
		if(deberes) {
			notaFinal=notaFinal+3;
		}
		
		System.out.println("Aprobó los exámenes");
		boolean examen=sc.nextBoolean();
		
		if(examen) {
			notaFinal=notaFinal+5;
	}
		System.out.println(notaFinal);
		sc.close();
	}
}
