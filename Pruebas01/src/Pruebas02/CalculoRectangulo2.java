package Pruebas02;

import Objetos.Rectangulo2;

public class CalculoRectangulo2 {

	public static void main(String[] args) {
		
		Rectangulo2 r1= new Rectangulo2();
		
		r1.setLado1(2);
		r1.setLado2(3);

		Rectangulo2 r2= new Rectangulo2();
		
		r2.setLado1(8);
		r2.setLado2(3);
		
		Rectangulo2 r3= new Rectangulo2();
		
		r3.setLado1(10);
		r3.setLado2(2);
		
		Rectangulo2 r4= new Rectangulo2();
		
		r4.setLado1(8);
		r4.setLado2(2);
		
		
		double areasTotales=0;
		
		Rectangulo2[] listaR= new Rectangulo2[] {r1,r2,r3,r4};
		for(int i=0;i<listaR.length;i++) {
			System.out.println(listaR[i].calcularArea());
			areasTotales=areasTotales+listaR[i].calcularArea();
			}
		
		System.out.println(areasTotales);
	}

}
