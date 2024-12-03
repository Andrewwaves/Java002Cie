package Pruebas02;

import Objetos.Bombilla;

public class EjercicioBombilla {

	public static void main(String[] args) {
		
		Bombilla b=new Bombilla();
		
		System.out.println("La intensidad de la bombilla es: "+b.getIntensidad());
		
		b.setIntensidad(0);
		b.Incrementar();
		System.out.println("La intensidad de la bombilla es: "+b.getIntensidad());
		
		b.Decrementar();
		System.out.println("La intensidad de la bombilla es: "+b.getIntensidad());
		
		b.Decrementar();
		System.out.println("La intensidad de la bombilla es: "+b.getIntensidad());
		}
	
	
}