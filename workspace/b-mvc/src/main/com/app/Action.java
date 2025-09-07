package com.app;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//	공동 컨트롤러 인터페이스 
public interface Action {
//	execute: 요청을 처리하고, 적절한 응답을 준비한다. 서버로 온 요청과 서버가 보낼 응답의 결과를 execute에 담는다. 
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
}
