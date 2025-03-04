<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="es.cie.repositories.*"%>
<%@ page import="es.cie.negocio.Libro"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="estilo.css">
</head>

<%
LibroRepository repo = new LibroRepositoryJDBC();
String tipobusqueda = request.getParameter("tipobusqueda");

String textobusqueda = request.getParameter("textobusqueda");
List<Libro> lista = null;

if (tipobusqueda != null && textobusqueda != null) {
	if (tipobusqueda.equalsIgnoreCase("titulo")) {
		lista = repo.buscarPorTitulo(textobusqueda);
	} else if (tipobusqueda.equalsIgnoreCase("autor")) {
		lista = repo.buscarPorAutor(textobusqueda);

	} else {
	}
} else {
	lista = repo.buscarTodos();
}
%>
<body>

	<form method="get">
		<select name="tipobusqueda">
			<option>titulo</option>
			<option>autor</option>
		</select> <input type="text" name="textobusqueda" /> <input type="submit"
			value="Buscar" />
	</form>


	<h1>Lista De Libros</h1>
	<table border=1>
		<caption>LIBROS</caption>
		<tr>
			<th>isbn</th>
			<th>titulo</th>
			<th>autor</th>
			<th>paginas</th>
		</tr>

		<%
		//for each
		for (Libro libro : lista) {
		%>

		<!-- fila o row tr (table row) -->
		<tr>
			<td><%=libro.getIsbn()%></td>
			<td><%=libro.getTitulo()%></td>
			<td><%=libro.getAutor()%></td>
			<td><%=libro.getPaginas()%></td>



		</tr>

		<%
		}
		%>
	</table>


</body>
</html>