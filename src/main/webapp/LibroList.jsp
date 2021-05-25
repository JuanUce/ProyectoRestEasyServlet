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
            <a href="/new">Añadir Libro</a>
            &nbsp;&nbsp;&nbsp;
            <a href="/list">Listar Libro</a>
             
        </h2>
    </center>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>Lista de Libro</h2></caption>
            <tr>
                <th>ID</th>
                <th>isbn</th>
                <th>title</th>
                <th>autor_id</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="libro" items="${libro}">
                <tr>
                    <td><c:out value="${libro.id}" /></td>
                    <td><c:out value="${libro.isbn}" /></td>
                    <td><c:out value="${libro.title}" /></td>
                    <td><c:out value="${libro.autor_id}" /></td>
                    <td>
                        <a href="/edit?id=<c:out value='${libro.id}' />">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/delete?id=<c:out value='${libro.id}' />">Delete</a>                     
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>   
</body>
</html>