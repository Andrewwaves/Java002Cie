<% @ page language="java" contentType="text/html; charset=UTF-8";
    pageEncoding="UTF-8";%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resumen Libro</title>
</head>
<body>
<%
String isbn= request.getParameter("isbn");
String titulo= request.getParameter("titulo");
String autor= request.getParameter("autor");
String paginas= request.getParameter("paginas");
String genero= request.getParameter("genero");
String idioma= request.getParameter("idioma");

int disponibilidad= Integer.parseInt(request.getParameter("disponibilidad"));

out.println("</br>");
out.println("Título: "+titulo);
out.println("</br>");
out.println("Isbn: "+isbn);
out.println("</br>");
out.println("Autor: "+autor);
out.println("</br>");
out.println("Rango de páginas: "+paginas);
out.println("</br>");
out.println("Género: "+genero);
out.println("</br>");
out.println("Idioma: "+idioma);
out.println("</br>");

if(disponibilidad==1){
	out.println("Disponible");
}else {
	out.println("No Disponible");
}

%>
</body>
</html>