package Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;

import Objeto.Maleta;
import Objeto.TuristaRico;

public class PrincipalTuristaRico02 {

	public static void main(String[] args) {
		
		TuristaRico Pepe=new TuristaRico("Pepe");
		//creamos dos maletas con sus parametros
		Maleta m1 =new Maleta("Gucci",10);
		Maleta m2=new Maleta("prada",12);
		
		//usamos el metodo addmaleta de la clase TuristaRico
		Pepe.addMaleta(m1);
		Pepe.addMaleta(m2);
		
		//lamo al getMaleta de pepe y asigno la variable
		ArrayList <Maleta> maletas= Pepe.getMaletas();
		
		
		//for each, es un iterador [java.util.iterator<+
		//por cada maleta m en la lista de maletas, imprimemelo, imprime el siguiente
		
		//for(Maleta m :maletas) {
			
			//System.out.println(m.getModelo());
			//System.out.println(m.getPeso());
			
		Iterator<Maleta> it= maletas.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().getModelo());
			
			
			
		}

	}

}
