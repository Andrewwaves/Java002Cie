<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="es.ascender.biblioteca.negocio.Socio"%>
<%@ page import="es.ascender.biblioteca.repositories.jdbc.SocioRepositoryJDBC"%>
<%@ page import="es.ascender.biblioteca.repositories.SocioRepository"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	
	SocioRepository repo = new SocioRepositoryJDBC();
	List<Socio> lista = repo.buscarTodos();
	
	
	if(request.getParameter("orden")!=null){
		out.println("Jerarquía a base de "+request.getParameter("orden"));
		lista=repo.buscarTodosOrdenados(request.getParameter("orden"));
	}else {
		out.println("No Jerarquía");
		lista=repo.buscarTodos();
	}

	%>
	<table>
	<thead>
	<tr>
	<th><a href="?orden=dni">Dni</a></th>
	<th><a href="?orden=nombre">Nombre</a></th>
	<th><a href="?orden=apellidos">Apellidos</a></th>
	<th>Borrar</th>
	</tr>
	</thead>
	
	<% for(Socio s:lista) {%>
		<!--  esto es una fila -->
		<tr>
			<!--  esto es una columna o celda -->
			<td><%=s.getDni() %></td>
			<td><%=s.getNombre() %></td>
			<td><%=s.getApellidos() %></td>
			<td><a href="borrarsociojdbc.jsp?dni=<%=s.getDni()%>">borrar</a></td>
			
		</tr>
		<%} %>
	</table>
	
	<!-- ancla, es un enlace a otra página -->
	<a href="formulariosocio.html">insertar nuevos socios</a>
	
</body>
</html>