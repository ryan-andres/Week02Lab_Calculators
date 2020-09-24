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
public class AgeCalculatorServlet extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String userAge = request.getParameter("age");
       request.setAttribute("outputAge", userAge);
       
       String letters = "^[A-Za-z]"; 

    if (userAge == null || userAge.equals("")){
        request.setAttribute("message", "You must enter your current age."); 
    
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
            return;
            
            } else if (userAge.matches(letters)){
                 request.setAttribute("messageLetters", "You must enter a numeric value."); 
    
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
            return;
   
    }else{ 
            int outputAge = Integer.parseInt(userAge);  
             request.setAttribute("outputAge", outputAge + 1);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
            return;
    }  
     
    }
}
