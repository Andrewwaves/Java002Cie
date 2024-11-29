package Objetos;

public class Persona {

	//añadiendo public delante para que desde otros paquetes se pueda acceder a la informacion
	
	public int edad;
	public String nombre;
	public double altura;
	
	public boolean esMAyorDeEdad() {
		return edad>18;
	
		
	}
}
