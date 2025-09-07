package com.app.member.controller;

import java.io.IOException;

import com.app.Action;
import com.app.Result;
import com.app.domain.member.vo.MemberVO;
import com.app.repository.member.dao.MemberDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 	로그인 처리 컨트롤러 클래스 
public class LoginOkController implements Action{
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		객체 생성 
		MemberVO memberVO = new MemberVO();
		MemberDAO memberDAO = new MemberDAO();
		Result result = new Result();
		
//		request 파라미터에서 이메일과 비밀번호를 받아서 memberVO에서 사용 
		memberVO.setMemberEmail(req.getParameter("memberEmail"));
		memberVO.setMemberPassword(req.getParameter("memberPassword"));
		
		
//		로그인 정보 조회 
		MemberVO member = memberDAO.selectForLogin(memberVO);
		
//		로그인 후 이동할 경로 설정 
		result.setPath("/");
		result.setRedirect(true);
		
		return result;
	}
}













