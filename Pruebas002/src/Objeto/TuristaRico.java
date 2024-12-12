package Objeto;

import java.util.ArrayList;

public class TuristaRico {

	private ArrayList <Maleta> maletas=new ArrayList <Maleta>();
	private String nombre;
	public ArrayList<Maleta> getMaletas() {
		return maletas;
	}
	public void setMaletas(ArrayList<Maleta> maletas) {
		this.maletas = maletas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public TuristaRico(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void addMaleta(Maleta maletita) {
		maletas.add(maletita);
	}
}
