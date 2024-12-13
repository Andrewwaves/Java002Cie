package EjemploDeportista;

public class FactoriaPersonas {

	//patrón factory, usa el polimorfismo, una abstracción total
	
	public static Persona crearPersona(String tipo, String nombre) {
		
		if(tipo.equals("Persona")) {
			return new Persona (nombre);
			
		}else if (tipo.equals("Deportista")) {
			return new Deportista (nombre,"padel");
			
		}else {
			return new DeportistaPro (nombre,"padel","Profesional");
		}
	}
	
	
}
