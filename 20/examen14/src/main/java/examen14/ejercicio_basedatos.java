package examen14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

public class ejercicio_basedatos {

	  static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
	   static final String USER = "root";
	   static final String PASS = "";
	   static final String QUERY = "SELECT * from Libros ORDER BY titulo ASC";

	   public static void main(String[] args) {
	      // Open a connection
	    try {
	    	 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
		     Statement sentencia = conexion.createStatement();
		     ResultSet conjuntoResultados = sentencia.executeQuery(QUERY);
		     
		     {while (conjuntoResultados.next()) {
		    	 System.out.println(conjuntoResultados.getString("titulo"));
		    	 
		     }
		     
		     }
	} catch (SQLException e) {
		
		e.printStackTrace();
	} 
}
}		

