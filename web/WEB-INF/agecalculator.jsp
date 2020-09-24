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
        <br>
        <span>Your age next birthday will be: ${outputAge}</span>
        <span>${messageLetters}</span>
        <span>${message}</span>
        <br>
        <a href ="./arithmetic">Arithmetic Calculator</a>
       
        </form>
    </body>
</html>
