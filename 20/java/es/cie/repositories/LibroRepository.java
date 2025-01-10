package es.cie.repositories;

import java.util.ArrayList;
import java.util.List;

import es.cie.negocio.libro;

public class LibroRepository {
	
	private static List <libro> lista = new ArrayList <libro>();
	
	static {
		
		lista.add(new libro ("1","El señor de los anillos","Tolkien",700));
		lista.add(new libro("2","It","Stephen King",1500));
		
	}
	
	public List <libro> buscarTodos(){
		
		return lista;
	}
}
