<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="java.util.Calendar" %>
<%@page import="java.util.Date" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="java.text.DateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String nombre= request.getParameter("nombre");
String apellidos= request.getParameter("apellidos");
String fechaTexto= request.getParameter("fecha");
String lenguaje= request.getParameter("lenguaje");

//parse es para traducir
int nivel= Integer.parseInt( request.getParameter("nivel"));

Calendar calendario=Calendar.getInstance();
DateFormat formateador= new SimpleDateFormat("yyyy-MM-dd");

//convierto un texto de cadena en una fecha Date con un formateador
Date fecha=formateador.parse(fechaTexto);
calendario.setTime(fecha);

int mes=calendario.get(Calendar.MONTH)+1;
out.println(nombre);
out.println(apellidos);
out.println(calendario.getTime());

out.println("</br>");
out.println("</br>");
if(nivel==1){
	out.println("el nivel es: Básico");
}else if (nivel==2){
	out.println("el nivel es: Avanzado");
}else{
	out.println("el nivel es: Pro");
}
//out.println("el nivel es "+ "nivel" + nivel);
%>

<p>
<!--<-= es para imprimir java -->
el lenguaje favorito es:
<%=lenguaje %>
</p>
<p>
el año es:
<%=calendario.get(Calendar.YEAR) %>
</p>
<p>
el mes es: 
<%= mes %>
</p>
<p>
el día es:
<%=calendario.get(Calendar.DAY_OF_MONTH)%>
</p>
<% 
//si pones E es el dia de la semana
DateFormat nuevoFormateador= new SimpleDateFormat("dd/MM/yyyy");
out.println(nuevoFormateador.format(fecha));
%>

</body>
</html>