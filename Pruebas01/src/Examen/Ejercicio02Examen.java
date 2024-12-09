package Examen;

public class Ejercicio02Examen {

	public static void main(String[] args) {
		
	double [] lista=new double[] {2,5,6,7,10};
		
		double suma=0;
		int i=0;
		while (i<lista.length) {
			System.out.println(lista[i]);
	
			suma=suma+lista[i];
		i++;
	}
			System.out.println(suma);
	}
}
