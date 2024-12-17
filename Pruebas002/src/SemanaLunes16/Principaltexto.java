package SemanaLunes16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Principaltexto {

	public static void main(String[] args) {
		
			Path ruta = Paths.get ("hola.txt");
			
			try {
				List <String> lineas = Files.readAllLines(ruta);
				
				for(String linea : lineas){
					
					System.out.println(linea);
				}
			}catch (IOException e) {
				e.printStackTrace();
				 //clausula que se ejecuta siempre para cerrar la conexión. Solo se pone aquí.
			}finally {
				System.out.println("cerrar");
			}

			}

}
