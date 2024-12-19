package SemanaLunes16;

import java.util.ArrayList;

public class Ejercicio9PrincipalFacturaMejorada {

	public static void main(String[] args) {
		
		FacturasRepositoryMejorado repo = new FacturasRepositoryMejorado();
		
		ArrayList<Facturas> lista = repo.buscarTodos();
		
		for (Facturas f: lista) {

			System.out.println(f.getNumero());
			System.out.println(f.getConcepto());
			System.out.println(f.getImporte());
		}

	}

}
