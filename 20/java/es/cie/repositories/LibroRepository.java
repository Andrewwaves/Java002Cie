package es.cie.repositories;

import java.util.ArrayList;
import java.util.List;

import es.cie.negocio.libro;

public class LibroRepository {
	
	private static List <libro> lista = new ArrayList <libro>();
	
	static {
		
		lista.add(new libro("1","El señor de los anillos","Tolkien",700));
		lista.add(new libro("2","It","Stephen King",1500));
		lista.add(new libro("3","El camino de los reyes","Brandon Sanderson",1300));
		lista.add(new libro("4","El gran Gatsbi","Scott Fidgerald",600));
		lista.add(new libro("5","La vida invisible de Addie LaRue","Victoria Schwab",650));
		
	}
	
	public List <libro> buscarTodos(){
		return lista;
	}
	
	public List <libro> buscarPorTitulo (String titulo) {
		
		//este método genera una nueva lista
		//que contiene los libros cuyo título sea similar al que pasamos
		List<libro> listaNueva = new ArrayList <libro>();
		for (libro l: lista) {
			String tituloLibro=l.getTitulo();
			//titulo del libro
			if(tituloLibro.toLowerCase().contains(titulo.toLowerCase())) {
				listaNueva.add(l);
			}
		}
		return listaNueva;
	}
	public List <libro> buscarPorAutor (String autor) {
		
		List<libro> listaNueva = new ArrayList <libro>();
		for (libro l: lista) {
			String autorLibro=l.getAutor();
			if(autorLibro.contains(autor)) {
				listaNueva.add(l);
			}
		}
		return listaNueva;
	}
}
