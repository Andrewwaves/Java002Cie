package Pruebas01;

public class ejercicio02 {

	public static void main(String[] args) {
		
		int numero1=5;
		int numero2=7;
		int numero8=9;
		
			System.out.println(funcion(numero1,numero2,numero8));
			
			System.out.println(sumaNTerminos(5));
			
	
	}
		
		public static int funcion(int n1, int n2, int n3) {
			
			int fun=n1+n2*n3;
			System.out.println("el resultado de la funcion es: "+fun);
			return fun;
		}
		
		public static int sumaNTerminos(int n) {
			
			int suma=0;
			for(int i=0;i<n;i++) {
				
				suma=suma+i;
			}
			return suma;
		}
}
