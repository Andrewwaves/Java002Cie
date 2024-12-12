package Objeto;

public class Libro {
	
	//EJERCICIO SOBRE CARGA: LIBRO
		
		private String titulo;
		private int totalPaginas;
		private int paginaActual;
		
		
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public int getTotalPaginas() {
			return totalPaginas;
		}
		public void setTotalPaginas(int totalPaginas) {
			this.totalPaginas = totalPaginas;
		}
		public int getPaginaActual() {
			return paginaActual;
		}
		public void avanzarPagina() {
			paginaActual++;
		}
		
		
	

}
