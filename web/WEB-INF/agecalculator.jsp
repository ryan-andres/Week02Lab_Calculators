<%-- 
    Document   : agecalculator
    Created on : 23-Sep-2020, 3:41:31 PM
    Author     : ryana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method = "post" action = "age">
        <h1>Age Calculator</h1>
        <label>Enter your Age:</label>
        <input type ="text" name ="age" value ="">
        <br>
        <input type ="submit" value ="Age next birthday">
        <p>${outputAge}</p>
        <p>${message}</p>
        <p>${messageLetters}</p>
        </form>
    </body>
</html>
