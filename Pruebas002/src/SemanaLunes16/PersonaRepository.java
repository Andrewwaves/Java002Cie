package SemanaLunes16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonaRepository {

	 static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
	   static final String USER = "root";
	   static final String PASS = "";
	   static final String QUERY = "SELECT * from Personas";
	   
	public void insertar (String nombre, String apellidos,int edad) {
		
		  try {
				 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			     Statement sentencia = conexion.createStatement();
			     sentencia.executeUpdate("insert into personas values ('"+ nombre+"','"+apellidos+"','"+edad+"')");
			     
			} catch (SQLException e) {
				
				e.printStackTrace();
			} 
		   }
		

}