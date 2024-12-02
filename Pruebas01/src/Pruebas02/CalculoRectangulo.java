package Pruebas02;

import Objetos.Rectangulo;

public class CalculoRectangulo {

	public static void main(String[] args) {
		
		Rectangulo rec1=new Rectangulo();
		rec1.lado1=60;
		rec1.lado2=20;
		
		Rectangulo rec2=new Rectangulo();
		rec2.lado1=100;
		rec2.lado2=10;
	
		Rectangulo rec3=new Rectangulo();
		rec3.lado1=200;
		rec3.lado2=40;
		
		Rectangulo rec4=new Rectangulo();
		rec4.lado1=60;
		rec4.lado2=40;
		
		double areasTotales=0;
		
		Rectangulo[] listaR= new Rectangulo[] {rec1,rec2,rec3,rec4};
		for(int i=0;i<listaR.length;i++) {
			System.out.println(listaR[i].calcularArea());
			areasTotales=areasTotales+listaR[i].calcularArea();
			}
		System.out.println(areasTotales);
	}
	

}
