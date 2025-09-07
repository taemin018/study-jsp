package com.app.ex;

import java.io.IOException;
import java.net.URLEncoder;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex05 extends HttpServlet{
   
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      req.getRequestDispatcher("/ex05.jsp").forward(req, resp);
   }
   
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String id = req.getParameter("id");
      String password = req.getParameter("password");
      
      resp.sendRedirect(req.getContextPath() + "/ex05-result?id=" + URLEncoder.encode(id, "UTF-8") + "&password=" + URLEncoder.encode(password, "UTF-8"));
   }
}






