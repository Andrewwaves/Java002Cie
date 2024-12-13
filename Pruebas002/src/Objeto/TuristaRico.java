package Objeto;

import java.util.ArrayList;

public class TuristaRico extends SuperTurista {

	private ArrayList <Maleta> maletas=new ArrayList <Maleta>();
	
	public ArrayList<Maleta> getMaletas() {
		return maletas;
	}
	public void setMaletas(ArrayList<Maleta> maletas) {
		this.maletas = maletas;
	}
	
	public TuristaRico(String nombre) {
		super();
		this.setNombre(nombre);
	}
	
	public void addMaleta(Maleta maletita) {
		maletas.add(maletita);
	}
}
