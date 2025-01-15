package es.cie.repositories;

import java.util.List;

import es.cie.negocio.libro;

public interface LibroRepository {

	List<libro> buscarTodos();

	List<libro> buscarPorTitulo(String titulo);

	List<libro> buscarPorAutor(String autor);

}