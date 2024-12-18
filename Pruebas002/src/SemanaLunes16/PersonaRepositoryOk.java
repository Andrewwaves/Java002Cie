package SemanaLunes16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonaRepositoryOk {

	   static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
	   static final String USER = "root";
	   static final String PASS = "";
	   static final String QUERY = "SELECT * from Personas";
	   
	   //capa de persistencia
	   //capa de negocio: separar las responsabilidades y agruparlas (objetos):
	public void insertar (Persona persona) {
		
		//recibes una persona, reduces el numero de parámetros
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
		     //Dividir más para ver más claro los errores :
		     
		     //String consultaQuitar="delete from personas where nombre ='" +nombre+"'";
		     //System.out.println (consultaQuitar);
		     //sentencia.executeUpdate(consultaQuitar);
		     
		     sentencia.executeUpdate("delete from personas where nombre ='" +persona.getNombre()+"'");
		     
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
	}
	
	public ResultSet buscarTodos() {

		ResultSet rs=null;
		try {
			//conecto a la base de datos
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			//preparo la sentencia
			Statement sentencia = conexion.createStatement();
			//ejecuto la sentencia, el listado
			rs = sentencia.executeQuery("select * from Personas");
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return rs;
	}
}