<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/estilo.css">
</head>
<body>
<h1>BIENVENIDO</h1>

<h2>Este sistema permite:</h2>
<br>
<ol>
<li>Planificar sus actividades y las ejecucion de las mismas</li>
<li>La gestion de sus clientes</li>

<li>Generar reportes y estadisticas</li>
</ol>
<h2>Ingresa a tu oficina virtual</h2>

<table width="25%">
  
    <tr>
      <td><label for="usuario">Usuario: </label></td>
      <td><input type="text" name="usuario" id="usuario"></td>
    </tr>
    <tr>
      <td><label for="clave">Clave: </label></td>
      <td><input type="text" name="clave" id="clave"></td>
    </tr>
    <tr>
      <td colspan="2" align="center"><input type="submit" name="button" id="button" value="Enviar"></td>
    </tr>

  </table>

</body>
</html>