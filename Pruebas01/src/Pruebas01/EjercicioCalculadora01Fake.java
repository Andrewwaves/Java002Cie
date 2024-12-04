package Pruebas01;

import MasObjetos.CalculadoraFake;

public class EjercicioCalculadora01Fake {

	public static void main(String[] args) {
		
		CalculadoraFake operacion1=new CalculadoraFake(10,2);
		
		System.out.println("Primer numero = "+operacion1.getNumero1());
		System.out.println("Segundo numero = "+operacion1.getNumero2());
		
		System.out.println("OPERACIONES:");
		System.out.println("Suma = "+operacion1.Sumar());
		System.out.println("Resta = "+operacion1.Restar());
		System.out.println("Multiplicacion = "+operacion1.Multiplicar());
		System.out.println("Division = "+operacion1.Dividir());

		
	}

}
