<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="es.cie.repositories.*" %>
    <%@ page import="es.cie.negocio.libro" %>
    <%@ page import="java.util.List" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="estilo.css">
</head>

<%
LibroRepository repo=new LibroRepositoryMemoria();
List<libro> lista=repo.buscarTodos();
%>
<body>
<h1> Lista De Libros</h1>
	<table border=1>
	<caption> LIBROS </caption>
		<tr>
			<th>ISBN</th>
			<th>Título</th>
			<th>Autor</th>
			<th>Páginas</th>
		</tr>
	
<%
	//for each
		for(libro libro:lista){
	%>

	<!-- fila o row tr (table row) -->
	<tr>
		<td><%=libro.getIsbn()%></td>
		<td><%=libro.getTitulo()%></td>
		<td><%=libro.getAutor()%></td>
		<td><%=libro.getPaginas()%></td>
		
		
		
	</tr>

<% } %>
	</table>


</body>
</html>