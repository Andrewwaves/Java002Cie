package es.cie.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.cie.negocio.Libro;

public class LibroRepositoryJDBC implements LibroRepository {

	static final String DB_URL = "jdbc:mysql://localhost:3306/cie";
	static final String USER = "root";
	static final String PASS = "";

	@Override
	public List<Libro> buscarTodos() {
		
		ResultSet rs=null;
		Connection conexion=null;
		ArrayList<Libro> lista= new ArrayList<Libro>();
		try {
			 Class.forName("com.mysql.jdbc.Driver");
		
			conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			
			Statement sentencia = conexion.createStatement();
			
			rs = sentencia.executeQuery("select * from libros");
			while (rs.next()) {
				
				Libro p= new Libro(rs.getString("isbn"),
						rs.getString("titulo"),rs.getString("autor"), rs.getInt("paginas"));
				
				lista.add(p);
}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} finally {
			
			if (conexion!=null) {
				try {
					conexion.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
		return lista;
	}

	@Override
	public List<Libro> buscarPorTitulo(String titulo) {
		
		return null;
	}

	@Override
	public List<Libro> buscarPorAutor(String autor) {
	
		return null;
	}
}
