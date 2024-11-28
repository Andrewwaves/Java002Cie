package Pruebas01;

public class ejercicio01 {

	public static void main(String[] args) {
		
		int numero1=5;
		int numero2=7;
		int numero8=9;
		
			System.out.println(restar(numero1,numero2,numero8));
			
		int numero3=8;
		int numero4=9;
		int numero10=5;
		
			System.out.println(restar(numero3,numero4,numero10));
			
		int numero5=9;
		int numero6=2;
		int numero7=5;
			System.out.println(sumar(numero5,numero6,numero7));
		
		int numero11=5;
		int numero12=9;
		int numero15=2;
			System.out.println(multiplicar(numero11,numero12,numero15));
			
		int numero13=40;
		int numero14=2;
			System.out.println(dividir(numero13,numero14));
	
	}
		
		public static int restar(int n1, int n2, int n3) {
			
			int resta=n1-n2-n3;
			System.out.println("el resultado de la resta es: "+resta);
			return resta;
		}

		public static int sumar(int n1, int n2, int n3) {
			
			int suma=n1+n2+n3;
			System.out.println("el resultado de la suma es: "+suma);
			return suma;
		}
		public static int multiplicar(int n1, int n2, int n3) {
			
			int multi=n1*n2*n3;
			System.out.println("el resultado de la multiplicacion es: "+multi);
			return multi;
		}
		
		public static int dividir(int n1, int n2) {
			
			int div=n1/n2;
			System.out.println("el resultado de la division es: "+div);
			return div;
		}
}
