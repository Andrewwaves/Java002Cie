package SemanaLunes16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FacturasRepository {

	 static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
	   static final String USER = "root";
	   static final String PASS = "";
	   static final String QUERY = "SELECT * from Facturas";
	   
	   public static void main(String[] args) {
		      // Open a connection
		    try {
					 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
				     Statement sentencia = conexion.createStatement();
				     ResultSet conjuntoResultados = sentencia.executeQuery(QUERY);
				   {		      
				     while(conjuntoResultados.next()){
				        //Display values
				        System.out.println(conjuntoResultados.getInt("numero"));
				        System.out.println(conjuntoResultados.getString("concepto"));
				        System.out.println(conjuntoResultados.getDouble("importe"));
				       
				     }
				  }
			} catch (SQLException e) {
				
				e.printStackTrace();
			} 
	   }
	   
	   public void insertar (Facturas facturas) {
		   try {
				 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			     Statement sentencia = conexion.createStatement();
			     sentencia.executeUpdate("insert into facturas values ('"+ facturas.getNumero()+"','"+facturas.getConcepto()+"','"+facturas.getImporte()+"')");
			     
			} catch (SQLException e) {
				
				e.printStackTrace();
			} 
	}
	   
	   public void borrar (Facturas facturas) {
		   try {
				 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			     Statement sentencia = conexion.createStatement();
			     sentencia.executeUpdate("delete from facturas where numero ='" +facturas.getNumero()+"'");
			     
			} catch (SQLException e) {
				
				e.printStackTrace();
			} 
	}
}
