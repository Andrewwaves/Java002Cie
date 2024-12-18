package SemanaLunes16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Principal4 {
		
		   static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
		   static final String USER = "root";
		   static final String PASS = "";
		   static final String QUERY = "SELECT * from Personas";

		   public static void main(String[] args) {
		      // Open a connection
		    try {
					 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
				     Statement sentencia = conexion.createStatement();
				     
				     Scanner sc = new Scanner (System.in);
				     
				     System.out.println("Introduce el nombre:");
						
						String nombre=sc.next();
						
						System.out.println("Introduce el apellido:");
						
						String apellidos=sc.next();
						
						System.out.println("Introduce la edad:");
						
						int edad=sc.nextInt();
						
				    sentencia.executeUpdate("insert into personas values ('"+ nombre+"','"+apellidos+"','"+edad+"')");
				    sc.close();
				     
			} catch (SQLException e) {
				
				e.printStackTrace();
			} 
		    
		   }

}