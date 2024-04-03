<%-- 
    Document   : index
    Created on : Apr 3, 2024, 5:56:52 AM
    Author     : andrews
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> <%--Apertura o cierre para directivas/atributos de configuracionde JSP --%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! </h1>
        <% String hola = "hola munndo desde java"; %> <%-- inclusion de sentencias de codigo Java en general--%>
        <%=hola %>  <%--mostrar el resultado de una expresion o contenido de una variable --%>
        <%-- apaertura para hacer uso de declaracion de varibles y metodos de instancia que se comparten entre varios JSP asociados al mismo servlet--%>
    </body>
</html>
