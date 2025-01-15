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
String titulo= request.getParameter("titulo");
String autor = request.getParameter ("autor");
List<libro> lista =null;

if(titulo!=null){
	lista=repo.buscarPorTitulo(titulo);
}else if (autor!=null){
	lista=repo.buscarPorAutor(autor);
	
}else { lista=repo.buscarTodos();}
%>
<body>

<form method="get">
Título: <input type="text" name="titulo"/>
<input type="submit" value="Buscar"/>
</form>

<form method="get">
Autor: <input type="text" name="autor"/>
<input type="submit" value= "Buscar"/>
</form>

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
for(libro libro:lista){%>

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