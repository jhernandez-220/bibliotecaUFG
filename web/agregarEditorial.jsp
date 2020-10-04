<%-- 
    Document   : agregarEditorial
    Created on : Sep 25, 2020, 5:12:34 AM
    Author     : glori
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>AGREGAR EDITORIAL</h1>
        <form action="editorialesController">
            Nombre:<br>
            <input type="text" name="txtNombreEditorial" placeholder="Ejemplo: Nombre de editorial"><br>
            Dirección:<br>
            <input type="text" name="txtDireccion" placeholder="Ejemplo: Ciudad, estado"><br>
            Teléfono:<br>
            <input type="text" name="txtTelefono" placeholder="Ejemplo: +503 78962500"><br>
            Correo:<br>
            <input type="text" name="txtCorreo" placeholder="Ejemplo: correo@editorial.com"><br>
            País:<br>
            <input type="text" name="txtPais" placeholder="Ejemplo: Nombre de país"><br>
            <br>
            <input type="submit" name="accion" value="Agregar"><br>
        </form>
    </body>
</html>
