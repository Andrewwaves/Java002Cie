package examen14;

import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class ejercicio4_fecha {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Dame una fecha dd/MM/yyyy");
		
		String fechaEntrada=sc.nextLine();

		System.out.println(fechaEntrada);
		
		SimpleDateFormat formateador= new SimpleDateFormat("dd/MM/yyyy");
		
		Calendar calendario=Calendar.getInstance();
		
		try {
			calendario.setTime(formateador.parse(fechaEntrada));
			System.out.println("El año es: "+calendario.get(Calendar.YEAR));
		} catch (ParseException e) {
			
			System.out.println("Formato de fecha inválido.");
		}
		
		sc.close();
}
}
