package Pruebas02;

import Objetos.NotaGetYSet;

public class EjercicioNotaSetGet {

	public static void main(String[] args) {
		
		//estableces la conexion con la clase nota organize imports
		//lamar clase, nombre variable= espacio nuevo, llamar a la clase con parentesis
		NotaGetYSet nota1=new NotaGetYSet();
		nota1.setValor(700);
		//importante porner el .valor que has establecido en el objeto de Nota donde pusiste:
		//public double valor;
		//ahora no puedo acceder porque es privada
		//nota1.valor=700;
		
		System.out.println(nota1.getValor());
		

	}

}
