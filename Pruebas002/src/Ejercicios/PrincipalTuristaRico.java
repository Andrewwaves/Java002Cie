package Ejercicios;

import java.util.ArrayList;

import Objeto.Maleta;
import Objeto.TuristaRico;

public class PrincipalTuristaRico {

	public static void main(String[] args) {
		
		TuristaRico Pepe=new TuristaRico("Pepe");
		Maleta m1 =new Maleta("Gucci",10);
		Maleta m2=new Maleta("prada",12);
		
		Pepe.addMaleta(m1);
		Pepe.addMaleta(m2);
		
		ArrayList <Maleta> maletas= Pepe.getMaletas();
		
		for(int i=0; i<maletas.size();i++) {
			
			Maleta maletaR=maletas.get(i);
			System.out.println(maletaR.getModelo());
			System.out.println(maletaR.getPeso());
			
			System.out.println(maletas.get(i).getModelo());
			System.out.println(maletas.get(i).getPeso());
			
			
			
			
		}

	}

}
