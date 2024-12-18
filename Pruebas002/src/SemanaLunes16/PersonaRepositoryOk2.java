package SemanaLunes16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonaRepositoryOk2 {
	
	//CAMBIO CON ARRAY Y CERRAR CONEXION

	   static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
	   static final String USER = "root";
	   static final String PASS = "";
	   static final String QUERY = "SELECT * from Personas";
	  
	public void insertar (Persona persona) {
		
		
		  try {
				 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			     Statement sentencia = conexion.createStatement();
			     sentencia.executeUpdate("insert into personas values ('"+ persona.getNombre()+"','"+persona.getApellidos()+"','"+persona.getEdad()+"')");
			     
			} catch (SQLException e) {
				
				e.printStackTrace();
			} 
	}
		  
	public void quitar (Persona persona) {
		
		 try {
			 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
		     Statement sentencia = conexion.createStatement();
		     
		     
		     sentencia.executeUpdate("delete from personas where nombre ='" +persona.getNombre()+"'");
		     
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
	}
	
	public ArrayList<Persona> buscarTodos() {

		ResultSet rs=null;
		Connection conexion=null; 
		//creamos una lista para recopilar la lista
		ArrayList<Persona> lista= new ArrayList<Persona>();
		
		try {
			//conecto a la base de datos
			conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			//preparo la sentencia
			Statement sentencia = conexion.createStatement();
			//ejecuto la sentencia, el listado
			rs = sentencia.executeQuery("select * from Personas");
			//recorrer la lista
			while(rs.next()) {
				Persona p =new Persona (rs.getString("nombre"),rs.getString("apellidos"),rs.getInt("edad"));
				//añadir la informacion
				lista.add(p);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			
			//cerramos la conexion con el repositorio
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
	
	
	public ResultSet mostrarapellidos() {
		ResultSet rs=null;
		try {
			//conecto a la base de datos
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			//preparo la sentencia
			Statement sentencia = conexion.createStatement();
			//ejecuto la sentencia, el listado
			rs = sentencia.executeQuery("select apellidos from Personas");
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return rs;
	}
	}
