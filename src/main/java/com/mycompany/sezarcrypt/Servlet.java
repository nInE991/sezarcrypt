/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sezarcrypt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet extends HttpServlet {
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          response.setContentType("text/html");
        rotation sez = new rotation();
        
        sez.setQtext(request.getParameter("text"));
        request.setAttribute("text", sez.getQtext());
        
        
    if( request.getParameter("encrypt")!= null){
        
         request.setAttribute("ztext",sez.emethod(sez.getQtext(), 3));
     }
     else if(request.getParameter("decrypt")!=null){
         request.setAttribute("ztext",sez.dmethod(sez.getQtext(), 3));
     }
     else if(request.getParameter("clear")!=null){
         sez.setQtext("");
         sez.setRtext("");
         
         request.setAttribute("text", sez.getQtext());
         request.setAttribute("ztext", sez.getRtext());
        
     }
     
     
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }

  
   
}
