package com.app.ex;

import java.io.IOException;
import java.net.URLEncoder;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex02 extends HttpServlet{
   
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      req.getRequestDispatcher("/ex02.jsp").forward(req, resp);
   }
   
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String number1= req.getParameter("number1");
      String number2 = req.getParameter("number2");
      
      int sum = Integer.parseInt(number1) + Integer.parseInt(number2);
      
      resp.sendRedirect(req.getContextPath() + "/ex02-result?numberSum=" + sum);
   }
}






