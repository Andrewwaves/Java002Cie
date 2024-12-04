package MasObjetos;

public class Caja {

	private int alto;
	private int largo;
	private int profundo;
	
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		if(alto>0)
		this.alto = alto;
	}
	public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		if(largo>0)
		this.largo = largo;
	}
	public int getProfundo() {
		return profundo;
	}
	public void setProfundo(int profundo) {
		if(profundo>0)
		this.profundo = profundo;
	}
	
	public Caja(int alto, int largo, int profundo) {
		
		setAlto(alto);
		setLargo(largo);
		setProfundo(profundo);
	}
	
	public int Volumen() {
		return alto*largo*profundo;
	}
}
