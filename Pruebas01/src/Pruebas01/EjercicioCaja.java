package Pruebas01;

import MasObjetos.Caja;

public class EjercicioCaja {

	public static void main(String[] args) {
		
		
		Caja caja1=new Caja(20,10,10);
		
	System.out.println("Alto: " +caja1.getAlto());
	System.out.println("Ancho: " +caja1.getLargo());
	System.out.println("Profundo: " +caja1.getProfundo());

	System.out.println("-----------");
	System.out.println("Volumen= " +caja1.Volumen());
	}

}
