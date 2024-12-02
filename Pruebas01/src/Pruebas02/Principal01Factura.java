package Pruebas02;

import Objetos.Factura;

public class Principal01Factura {

	public static void main(String[] args) {
		
		Factura f = new Factura();
		f.importe=100;
		System.out.println(f.importe);
		
		
		System.out.println(f.calcularConIVA());
	}

}
