package es.ascender.biblioteca.controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.ascender.biblioteca.negocio.Socio;
import es.ascender.biblioteca.repositories.SocioRepository;
import es.ascender.biblioteca.repositories.jdbc.SocioRepositoryJDBC;


@WebServlet("/SociosServlet")
public class SociosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	SocioRepository repo = new SocioRepositoryJDBC();
	List<Socio> lista = repo.buscarTodos();	
  
	//el metodo que se ejecuta cuando pido el servlet
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		if(request.getParameter("comando")==null) {
			

		if(request.getParameter("orden")!=null){
			//out.println("Jerarquía a base de "+request.getParameter("orden"));
			lista=repo.buscarTodosOrdenados(request.getParameter("orden"));
		}else {
			//out.println("No Jerarquía");
			//tengo los datos de los socios
			lista=repo.buscarTodos();
		}
		
		//peticion
		request.setAttribute("lista", lista);
		RequestDispatcher despachador=request.getRequestDispatcher("listasociosjdbc.jsp");
		//pasas la lista de repo.buscarTodos al jsp
		despachador.forward(request, response);
		
	}else {
		
		String comando=request.getParameter("comando");
		if(comando.equals("formulariosocio")) {
			
			//mandame a:
			RequestDispatcher despachador=request.getRequestDispatcher("formulariosocio.html");
			
			despachador.forward(request, response);
		}else if(comando.equals("salvarsocio")) {
			
			//nueva insercion y volver a cargar el listado
			//copiado de:insertarsociojdbc.jsp
			String dni= request.getParameter("dni");
			String nombre= request.getParameter("nombre");
			String apellidos= request.getParameter("apellidos");

			Socio s= new Socio(dni,nombre,apellidos);
			SocioRepository repo= new SocioRepositoryJDBC();
			repo.insertar(s);
			
			//cargar la lista otra vez
			lista=repo.buscarTodos();
			
			//volver al listado con todo cargado
			request.setAttribute("lista", lista);
			RequestDispatcher despachador=request.getRequestDispatcher("listasociosjdbc.jsp");
			despachador.forward(request, response);
		}else if(comando.equals("borrarsocio")) {
			
			String dni= request.getParameter("dni");

			Socio s= new Socio(dni);
			SocioRepository repo= new SocioRepositoryJDBC();
			repo.borrar(s);
			
			lista=repo.buscarTodos();
			
			request.setAttribute("lista", lista);
			RequestDispatcher despachador=request.getRequestDispatcher("listasociosjdbc.jsp");
			despachador.forward(request, response);
		}
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
