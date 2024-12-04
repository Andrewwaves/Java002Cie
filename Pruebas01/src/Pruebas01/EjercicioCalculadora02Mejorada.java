package Pruebas01;

import MasObjetos.CalculadoraMejorada;

public class EjercicioCalculadora02Mejorada {

	public static void main(String[] args) {
		//CalculadoraMejorada c=new CalculadoraMejorada();
	
		//Math. algo para hacer directamente los calculo a traves de este funcion.
	System.out.println(Math.pow(5, 2));
	
		//metodo estatico, invocas a la funcion directamente por la clase
		System.out.println(CalculadoraMejorada.sumar(2,2));

		System.out.println(CalculadoraMejorada.restar(2,2));
		
		System.out.println(CalculadoraMejorada.multiplicar(2,2));
		
		System.out.println(CalculadoraMejorada.dividir(2,2));
	}

}
