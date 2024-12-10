package Pruebas01;

public class Alumno {
		
		private int nota;

		public int getNota() {
			return nota;
		public void setNota(int nota) {
			if (nota<5) System.out.println("Suspenso");
			else if (nota>=5 && nota<6) 
			{System.out.println("Aprobado");
			}
			else if (nota>=6 && nota<8) 
			{System.out.println("Notable");
			} else if (nota>=8 && nota<=10) {System.out.println("Sobresaliente");
			}else {System.out.println("Error");
			}
			}

		public Alumno(int nota) {
			setNota(nota);
		}
		
		public int imprimirNota() {
			return nota;
		}

}
