package SemanaLunes16;

public class Principal6 {
	public static void main(String[] args) {
		
		PersonaRepositoryNueva repo= new PersonaRepositoryNueva();
		
		Persona p1=new Persona("juan","gomez",60);
		repo.insertar(p1);
	}
		
}