package Pruebas01;

import MasObjetos.Persona;

public class Principal01PersonaConstructor {

	public static void main(String[] args) {
	
		//falla porque new Persona() es un constructor de por si
		//Persona p=new Persona();
		Persona p= new Persona("pedro",10);
		//se quita esto:
		//p.setEdad(10);
		//p.setNombre("Pedro");
		
		System.out.println(p.getNombre());
		System.out.println(p.getEdad());

		//funcion constructura: nos permite inicializar el objeto con unas propiedades concretas.
	}

}
