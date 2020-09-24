/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ryana
 */
public class ArithmeticCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String letters = "^[A-Za-z]"; 
            String firstValue = request.getParameter("firstNumber");
            String secondValue = request.getParameter("secondNumber");
            
            
            if(firstValue == null || firstValue.equals("") || secondValue == null || secondValue.equals("") || firstValue.matches(letters ) || secondValue.matches(letters)){
                request.setAttribute("message", "Invalid");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            }
        else if(request.getParameter("add") != null){
                int userAnswerOne = Integer.parseInt(firstValue);
                 int userAnswerTwo = Integer.parseInt(secondValue);
                 
                 int finalAnswer = userAnswerOne + userAnswerTwo;
                    request.setAttribute("message", finalAnswer);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            }
            else if(request.getParameter("subtract") != null){
                 int userAnswerOne = Integer.parseInt(firstValue);
                 int userAnswerTwo = Integer.parseInt(secondValue);
                 
                 int finalAnswer = userAnswerOne - userAnswerTwo;
                    request.setAttribute("message", finalAnswer);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            }
            
            else if(request.getParameter("times") != null){
                 int userAnswerOne = Integer.parseInt(firstValue);
                 int userAnswerTwo = Integer.parseInt(secondValue);
                 
                 int finalAnswer = userAnswerOne * userAnswerTwo;
                
                    request.setAttribute("message", finalAnswer);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            }
            else if(request.getParameter("modulus") != null){
                 int userAnswerOne = Integer.parseInt(firstValue);
                 int userAnswerTwo = Integer.parseInt(secondValue);
                 
                 int finalAnswer = userAnswerOne % userAnswerTwo;
                    request.setAttribute("message", finalAnswer);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            }

    
    }   
        
}
