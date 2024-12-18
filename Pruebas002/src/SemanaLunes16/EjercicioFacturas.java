package SemanaLunes16;

public class EjercicioFacturas {

	public static void main(String[] args) {
		
		FacturasRepository repo1=new FacturasRepository();
		
		//AÑADIR:
		//Facturas f1= new Facturas (7,"impresion",60.2);
		//repo1.insertar(f1);
		
		//BORRAR:
		Facturas f2=new Facturas (7);
		repo1.borrar(f2);

	}

}
