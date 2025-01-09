<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Operacion</title>
</head>
<body>
<%

double numero1= Double.parseDouble( request.getParameter("numero1"));
double numero2= Double.parseDouble( request.getParameter("numero2"));


String operacion=request.getParameter("operacion");
if (operacion.equals("+")){
	out.println("La suma es = " +(numero1+numero2));
}else if (operacion.equals("-")){
	out.println("La resta es = " +(numero1-numero2));
}else if (operacion.equals("*")){
	out.println("La multiplicación es = "+(numero1*numero2));
}else {out.println("La división es = "+(numero1/numero2));
}

%>
</body>
</html>