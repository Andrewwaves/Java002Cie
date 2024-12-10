package Examen;

public class Ordenador {
	
	private boolean encendido;
	
	public boolean estaEncendido() {
		return encendido;
	}
	
	public void encender() {
		if(!encendido)
			//if (encendido != true)
		encendido=true;
	}
	
	public void apagar() {
		if(encendido)
			//if (encendido=true)
		encendido=false;
	}

	public Ordenador(boolean encendido) {
		super();
		this.encendido = encendido;
	}

}
