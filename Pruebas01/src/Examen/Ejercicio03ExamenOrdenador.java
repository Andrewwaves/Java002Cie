package Examen;

public class Ejercicio03ExamenOrdenador {

	public static void main(String[] args) {
		
		Ordenador ordenador1=new Ordenador(false);
		
		System.out.println(ordenador1.estaEncendido());
		
		ordenador1.encender();
		
		System.out.println(ordenador1.estaEncendido());
		
		ordenador1.apagar();
		
		System.out.println(ordenador1.estaEncendido());
		
		
	}

}
