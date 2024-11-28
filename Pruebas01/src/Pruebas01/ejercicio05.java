package Pruebas01;

public class ejercicio05 {

	public static void main(String[] args) {
	
		int [] lista=new int[] {2,5,6,7,25};
		
		for (int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
		int mayor=numeroMayor(lista);
		System.out.println("------------");
		System.out.println(mayor);
		
	}
	public static int numeroMayor(int[] miArray) {
		
		int mayor=0;
		
		for (int i=0;i<miArray.length;i++) {
			
			if (miArray[i]>mayor) {
				mayor=miArray[i];
			}
		}
		return mayor;
	}

}

