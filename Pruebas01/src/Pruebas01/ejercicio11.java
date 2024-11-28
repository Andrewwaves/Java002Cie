package Pruebas01;

public class ejercicio11 {

	public static void main(String[] args) {
	
	
	Persona paula=new Persona();
	paula.edad=28;
	paula.nombre="paula";
	paula.altura=1.57;
	
	Persona manu=new Persona();
	manu.edad=26;
	manu.nombre="manu";
	manu.altura=1.75;
	
	Persona[] alumnos =new Persona[] {paula,manu};
	for (int i=0;i<alumnos.length;i++){
	
	System.out.println(alumnos[i].nombre);
	System.out.println(alumnos[i].edad);
	System.out.println(alumnos[i].altura);
	}
	
}
}

