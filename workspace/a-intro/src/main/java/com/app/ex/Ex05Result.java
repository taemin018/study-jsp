package com.app.ex;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex05Result extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		
        if("test".equals(id) && "1234".equals(password)) {
        	req.setAttribute("id", id);
    		req.getRequestDispatcher("/ex05-result.jsp").forward(req, resp);
        }else {
        	resp.sendRedirect(req.getContextPath() + "/ex05.jsp?error=1");
        }
		
	}
		
}











