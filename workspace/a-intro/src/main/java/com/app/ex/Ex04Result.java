package com.app.ex;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex04Result extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String place = req.getParameter("place");
		String city;
		
        if ("경기도".equals(place)) {
            city = "남양주시";
        } else if ("서울".equals(place)) {
            city = "강남구";
        } else {
            city = "해당 없음";
        }
		
		req.setAttribute("place",place);
		req.setAttribute("city",city);
		
		req.getRequestDispatcher("/ex04-result.jsp").forward(req, resp);
	}
}











