package Pruebas02;

import Objetos.Persona;

public class Ejercicio02 {

	//Manejo de objetos
	public static void main(String[] args) {

		//caracteristicas de la primera Persona
		Persona p1=new Persona();
		p1.edad=20;
		p1.nombre="Andrea";
		
		//caracteristicas de la segunda Persona
		Persona p2=new Persona();
		p2.edad=25;
		p2.nombre="Javier";
		
		
		
		//declaramos las variables nuevas para luego
		double sumaTotal=0;
		//double vueltas=0;
		
		//es un array, llevara corchete
		//Persona[] porque es una lista del objeto Personas
		Persona[] lista= new Persona[] {p1,p2};
		//for para recorrer la lista
		for (int i=0;i<lista.length;i++) {
			
			//imprimo a lo largo de la lista todos los nombres
			System.out.println(lista[i].nombre);
			
			//imprimo a lo largo de la lista todas las edades
			System.out.println(lista[i].edad);
			
			//sumas de las edades entre si
			//normbre de varible que será lo que tenemos más recorrer edades de la lista
			sumaTotal=sumaTotal+lista[i].edad;
			
			//sumas una vuelta para la media
			//vueltas++;
		}
		System.out.println("Total: "+sumaTotal);
		System.out.println("Media: "+(sumaTotal/lista.length));
	}

}
