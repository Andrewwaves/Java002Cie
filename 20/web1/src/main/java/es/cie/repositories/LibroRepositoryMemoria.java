package es.cie.repositories;

import java.util.ArrayList;
import java.util.List;

import es.cie.negocio.Libro;

public class LibroRepositoryMemoria {

private static List <Libro> lista = new ArrayList <Libro>();
	
	static {
		
		lista.add(new Libro("1","El señor de los anillos","Tolkien",700));
		lista.add(new Libro("2","It","Stephen King",1500));
		lista.add(new Libro("3","El camino de los reyes","Brandon Sanderson",1300));
		lista.add(new Libro("4","El gran Gatsbi","Scott Fidgerald",600));
		lista.add(new Libro("5","La vida invisible de Addie LaRue","Victoria Schwab",650));
		
	}
	
	public List <Libro> buscarTodos(){
		return lista;
	}
	
	public List <Libro> buscarPorTitulo (String titulo) {
		
		//este método genera una nueva lista
		//que contiene los libros cuyo título sea similar al que pasamos
		List<Libro> listaNueva = new ArrayList <Libro>();
		for (Libro l: lista) {
			String tituloLibro=l.getTitulo();
			//titulo del libro
			if(tituloLibro.toLowerCase().contains(titulo.toLowerCase())) {
				listaNueva.add(l);
			}
		}
		return listaNueva;
	}
	public List <Libro> buscarPorAutor (String autor) {
		
		List<Libro> listaNueva = new ArrayList <Libro>();
		for (Libro l: lista) {
			String autorLibro=l.getAutor();
			if(autorLibro.contains(autor)) {
				listaNueva.add(l);
			}
		}
		return listaNueva;
	}
}
