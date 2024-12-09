package Pruebas01;

public class Alumno {

		// crear una clase Alumno que tiene una propiedad
		//nota es int
		//disponemos de un constructor que recibe la nota
		//creamos un metodo que nos imprime por la consola
		//si es suspenso aprobado bien notable o sobresaliente
		//el metodo se llama imprimir nota
		
		private int nota;

		public int getNota() {
			return nota;
		}

		public void setNota(int nota) {
			if (nota<5) System.out.println("Suspenso");
		//	else if (nota>=5 && nota<6) 
		//	{System.out.println("Aprobado");
			}
		//	else if (nota>=6 && nota<8) 
		//	{System.out.println("Notable");
		//	} else (nota>=8 && nota<=10) {System.out.println("Sobresaliente");}
			
			

		public Alumno(int nota) {
			setNota(nota);
		}
		
		public int imprimirNota() {
			return nota;
		}

}
