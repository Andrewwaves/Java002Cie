package Pruebas01;

public class ejercicio06 {

	public static void main(String[] args) {
	
		int [] lista=new int[] {2,5,6,7,25};
		
		for (int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
			int suma=sumaNTerminos(lista);
			System.out.println("---------------");
			System.out.println(suma);
			
	}
	public static int sumaNTerminos(int[] MiArray) {
		
		int suma=0;
		for(int i=0;i<MiArray.length;i++) {
			
			suma=suma+MiArray[i];
		}
		return suma;
	}
}

