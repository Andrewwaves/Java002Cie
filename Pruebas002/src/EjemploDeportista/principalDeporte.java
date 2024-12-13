package EjemploDeportista;

public class principalDeporte {

	public static void main(String[] args) {
	
		DeportistaPro deportista = new DeportistaPro ("luis","tenis","profesional");
		
		System.out.println(deportista.getNombre());
		System.out.println(deportista.getDeporte());
		
		deportista.andar();
		
		Deportista deportista2 = new Deportista ("Andrea","andar");
		
		System.out.println(deportista2.getNombre());
		System.out.println(deportista2.getDeporte());
		
		deportista2.andar();
		
//polimorfismo dinámico:
		Persona luis =new DeportistaPro ("luis","tenis","profesional");
		
		luis.andar();
	}

}
