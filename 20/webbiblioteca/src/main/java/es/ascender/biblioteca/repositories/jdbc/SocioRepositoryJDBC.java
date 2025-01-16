package es.ascender.biblioteca.repositories.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.ascender.biblioteca.negocio.Socio;
import es.ascender.biblioteca.repositories.SocioRepository;

public class SocioRepositoryJDBC implements SocioRepository{

	//CONECTAR A LA BASE DE DATOS
	
	static final String DB_URL="jdbc:mysql://localhost:3306/biblioteca";
	static final String USER="root";
	static final String PASS="";
	
	
	@Override
	public List<Socio> buscarTodos() {
		
		Connection conexion = null;
		Statement sentencia=null;
		ResultSet rs =null;
		List <Socio> lista= new ArrayList<Socio>();
		
		//registra el Driver para poder conectarme
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion=DriverManager.getConnection(DB_URL, USER, PASS);
			
			//para preparar la sentencia sql a lanzar
			sentencia=conexion.createStatement();
			
			rs = sentencia.executeQuery("select * from socios");
			
			//mientras haya más registros
			 while(rs.next()) {
				 Socio s=new Socio(rs.getString("dni"),rs.getString("nombre"),rs.getString("apellidos"));
				 lista.add(s);
			 }
			 
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	

}
