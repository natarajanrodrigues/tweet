<%-- 
    Document   : index.jsp
    Created on : 26/08/2016, 20:04:07
    Author     : Natarajan Rodrigues
--%>

<%@page import="br.edu.ifpb.tweet.service.Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
    
    Service service = new Service();
//    request.setAttribute("messages", service.getMessages());

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tweets</title>
    </head>
    <body>
        <h1>Tweets</h1>
        <c:forEach var="message" items="messages">
            <p>${message.content}</p>
        </c:forEach>
    </body>
</html>
