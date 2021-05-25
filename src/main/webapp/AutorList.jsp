<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Books Store Application</title>
</head>
<body>
    <center>
        <h1>Books Management</h1>
        <h2>
            <a href="/new">Añadir Autores</a>
            &nbsp;&nbsp;&nbsp;
            <a href="autores/list">Listar Autores</a>
             
        </h2>
    </center>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>Lista de libros</h2></caption>
            <tr>
                <th>ID</th>
                <th>Edad</th>
                <th>Genero</th>
                <th>nombre</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="autor" items="${autor}">
                <tr>
                    <td><c:out value="${autor.id}" /></td>
                    <td><c:out value="${autor.edad}" /></td>
                    <td><c:out value="${autor.genero}" /></td>
                    <td><c:out value="${autor.nombre}" /></td>
                    <td>
                        <a href="/edit?id=<c:out value='${autor.id}' />">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/delete?id=<c:out value='${autor.id}' />">Delete</a>                     
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>   
</body>
</html>