package MasObjetos;

public class Caja {

	private int Alto;
	private int Largo;
	private int Profundo;
	
	public int getAlto() {
		return Alto;
	}
	public void setAlto(int alto) {
		if(alto>0)
		this.Alto = alto;
	}
	public int getLargo() {
		return Largo;
	}
	public void setLargo(int largo) {
		if(largo>0)
		this.Largo = largo;
	}
	public int getProfundo() {
		return Profundo;
	}
	public void setProfundo(int profundo) {
		if(profundo>0)
		this.Profundo = profundo;
	}
	
	public Caja(int alto, int largo, int profundo) {
		
		setAlto(alto);
		setLargo(largo);
		setProfundo(profundo);
	}
	
	public int Volumen() {
		return Alto*Largo*Profundo;
	}
}
