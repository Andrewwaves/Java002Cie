package Pruebas01;

import MasObjetos.Factura;

public class EjercicioFacturas {

	public static void main(String[] args) {
		
		Factura f1=new Factura(257,600);
		
		System.out.println("Factura Numero: " +f1.getNumero());
		System.out.println("Importe: " +f1.getImporte());
		System.out.println("-----------------");
		System.out.println("Total con IVA: "+f1.calculoIVA());

	}

}
