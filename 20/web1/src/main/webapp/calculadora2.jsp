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
double resultado=0;
if (operacion.equals("+")){
	resultado=numero1+numero2;
}
else if (operacion.equals("-")){
	resultado=numero1-numero2;
}
else if (operacion.equals("*")){
	resultado=numero1*numero2;
}
else {resultado=numero1/numero2;}

out.println(numero1 +" "+operacion+" "+numero2+" "+"="+" "+resultado);

%>
</body>
</html>