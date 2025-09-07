package com.app.member.controller;

import java.io.IOException;

import com.app.Action;
import com.app.Result;
import com.app.domain.member.vo.MemberVO;
import com.app.repository.member.dao.MemberDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 회원가입 컨트롤러 클래스 
// Action 인터페이스르르 구현 
public class JoinOkController implements Action{
//	회원가입 처리 후 결과를 반환
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		MemberDAO 객체 생성 
		MemberDAO memberDAO = new MemberDAO();
		MemberVO memberVO = new MemberVO();
//		Result 객체 생성 
		Result result = new Result();
		
//		파라미터에서 회원정보 받아서 memberVO에 저장 
		memberVO.setMemberEmail(req.getParameter("memberEmail"));
		memberVO.setMemberPassword(req.getParameter("memberPassword"));
		memberVO.setMemberName(req.getParameter("memberName"));
		memberVO.setMemberAge(Integer.parseInt(req.getParameter("memberAge")));
		memberVO.setMemberGender(req.getParameter("memberGender"));
		
//		회원 정보 추가
		memberDAO.insert(memberVO);
		
//		로그인 성공 결과를 이동할 경로 설정 
		result.setPath(req.getContextPath() + "/login.member");
		
//		redirect는 완료 
		result.setRedirect(true);
		
		return result;
	}
}

























