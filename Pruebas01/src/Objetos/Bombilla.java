package Objetos;

public class Bombilla {
	//una funcion realiza una tarea. Hay veces que quieres que te devuelva algo y hay veces que no.
	private int intensidad;
	
	public int getIntensidad () {
		return intensidad;
	}
	
	public void setIntensidad (int i) {
		if(i>=0 && i<=3) intensidad=i;
		
	}
		//como es un metodo o una funcion la declaro publica, incrementa en uno
	// es void porque si te devuelve en valor incrementado (1 en este caso) crearía confusion
	public void Incrementar() {
		//ejecuta la funcion de arriba 
		setIntensidad(getIntensidad()+1);
		//intensidad=intensidad+1;
		}
	public void Decrementar() {
		setIntensidad(getIntensidad()-1);
		//intensidad=intensidad-1;
		//con los ultimos cambios se utiliza la condicion directamente del setIntensidad donde incrementas o decrementas junto con el get que es donde tienes el valor actual
	}
}

