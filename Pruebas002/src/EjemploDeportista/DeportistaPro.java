package EjemploDeportista;

public class DeportistaPro extends Deportista {

	private String nivel;

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public DeportistaPro(String nombre,String deporte,String nivel) {
	
		super(nombre,deporte);
		this.nivel = nivel;
	}

	@Override
	public void andar() {
		System.out.println("anda a 9 km/hora");
	}
	
	
}
