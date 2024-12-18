package SemanaLunes16;

//import java.io.BufferedWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal7 {

	public static void main(String[] args) {
		PersonaRepositoryOk repo = new PersonaRepositoryOk();
		// el metodo nuestro de buscarTodos
			// los datos
		ResultSet rs = repo.buscarTodos();
		
		//viejo método:
		try{
			while(rs.next()){
					System.out.println(rs.getString("nombre"));
					System.out.println(rs.getString("apellidos"));
					System.out.println(rs.getInt("edad"));
			}
			
		}catch (SQLException e){
			e.printStackTrace();	
		}
		
		System.out.println("-------");
		
		
		PersonaRepositoryOk repo1 = new PersonaRepositoryOk();
		// el metodo nuestro de buscarTodos
			// los datos
		ResultSet rs1 = repo1.mostrarapellidos();
		
		//viejo método:
		try{
			while(rs1.next()){
					System.out.println(rs1.getString("apellidos"));
			}
			
		}catch (SQLException e){
			e.printStackTrace();
			
		}
	}
		//nuevo método:
		//generar un fichero con la info para poder utilizarlo en otro tipo de casos
		//generaficheropersonas(rs);
		

	//private static void generaficheropersonas(ResultSet rs) {
		//try (FileWriter fstream = new FileWriter("personas.txt"); 
				//BufferedWriter info = new BufferedWriter(fstream)) {

			//while (rs.next()) {
				//info.write(rs.getString("nombre"));
				//info.write(rs.getString("apellidos"));
				//info.write(rs.getInt("edad"));
			//}

		//} catch (Exception e) {
			//e.printStackTrace();
		//}
	//}

}
