package com.app;

// 컨트롤러 실행 결과를 담는 클래스
// 요청 처리 후 어디로 어떻게 이동할지 정보를 저장한다. 
public class Result {
	private String path;
	private boolean isRedirect;
	
	public Result() {;}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isRedirect() {
		return isRedirect;
	}

	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
}
