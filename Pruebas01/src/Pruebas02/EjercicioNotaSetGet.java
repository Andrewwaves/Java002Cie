package Pruebas02;

import Objetos.Nota;

public class EjercicioNotaSetGet {

	public static void main(String[] args) {
		
		//estableces la conexion con la clase nota organize imports
		//lamar clase, nombre variable= espacio nuevo, llamar a la clase con parentesis
		Nota nota1=new Nota();
		nota1.setValor(700);
		//importante porner el .valor que has establecido en el objeto de Nota donde pusiste:
		//public double valor;
		//ahora no puedo acceder porque es privada
		//nota1.valor=700;
		
		System.out.println(nota1.getValor());
		

	}

}
