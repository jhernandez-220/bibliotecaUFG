<%-- 
    Document   : listarEditorial
    Created on : Sep 25, 2020, 5:13:00 AM
    Author     : glori
--%>

<%@page import="DAO.editorialesDAO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="modelo.editoriales"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>EDITORIALES</h1>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NOMBRE</th>
                        <th>DIRECCIÓN</th>
                        <th>TELEFONO</th>
                        <th>CORREO</th>
                        <th>PAÍS</th>
                    </tr>
                </thead>
                <%
                    editorialesDAO dao = new editorialesDAO();
                    List<editoriales> list = dao.listarEditorial();
                    Iterator<editoriales> iter = list.iterator();
                    editoriales edi = null;
                    while(iter.hasNext()){
                        edi = iter.next();
                    }
                %>
                <tbody>
                    <tr>
                        <td><%= edi.getIdEditorial()%></td>
                        <td><%= edi.getNombreEditorial()%></td>
                        <td><%= edi.getDireccion()%></td>
                        <td><%= edi.getTelefono()%></td>
                        <td><%= edi.getCorreo()%></td>
                        <td><%= edi.getPais()%></td>
                        <td>
                            <a>EDITAR</a>
                            <a>BORRAR</a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>
