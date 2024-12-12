package Ejercicios;

import java.util.ArrayList;

import Objeto.Maleta;
import Objeto.TuristaRico;

public class PrincipalTuristaRico {

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
		
		for(int i=0; i<maletas.size();i++) {
			
			//variable que apunta a la lista de las maletas para manejar mejor la informacion
			Maleta maletaR=maletas.get(i);
			//2 opciones:
			
			System.out.println(maletaR.getModelo());
			System.out.println(maletaR.getPeso());
			
			System.out.println(maletas.get(i).getModelo());
			System.out.println(maletas.get(i).getPeso());
			
			
			
			
		}

	}

}
