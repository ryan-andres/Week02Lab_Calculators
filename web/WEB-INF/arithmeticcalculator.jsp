<%-- 
    Document   : arithmeticcalculator
    Created on : 24-Sep-2020, 12:14:30 PM
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
        <h1>Hello World!</h1>
        <form method ="post" action ="">
            <label>First Number:</label><input type ="text" value ="" name="firstNumber">
            <br>
            <label>Second Number:</label><input type ="text" value ="" name="secondNumber">
            <br>
            <input type ="submit" value ="+" name = "add">
            <input type ="submit" value ="-" name = "subtract">
            <input type ="submit" value ="*" name = "times">
            <input type ="submit" value ="%" name = "modulus">

            <p>Result: ${message}</p>
            <a href ="./age">Age Calculator</a>
            
        </form>
    </body>
</html>
