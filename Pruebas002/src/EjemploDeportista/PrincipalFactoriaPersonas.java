package EjemploDeportista;

public class PrincipalFactoriaPersonas {

	public static void main(String[] args) {
		
		Persona Andrea= FactoriaPersonas.crearPersona("Deportista", "Andrea");
		
		Andrea.andar();

	}

}
