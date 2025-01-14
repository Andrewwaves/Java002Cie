package examen14;

import java.util.ArrayList;

public class ejercicio_arraylistnumericamedia {

	public static void main(String[] args) {
		
		ArrayList <Integer> lista= new ArrayList<Integer>();
		lista.add(3);
		lista.add(7);
		lista.add(10);
		lista.add(5);
		lista.add(2);
		
		int examenesaprobados=0;
		int suma=0;
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
			if(lista.get(i)>=5) {
				suma=suma+lista.get(i);
				examenesaprobados++;
			}
		}
		System.out.println("Media = "+suma/examenesaprobados);
	}
}