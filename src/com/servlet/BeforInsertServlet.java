package com.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.biz.ChaldeaBiz;
import com.biz.StudentBiz;
import com.util.SpringTool;
public class BeforInsertServlet extends HttpServlet{
	private ChaldeaBiz chaldeBiz = (ChaldeaBiz)SpringTool.getBean("chaldeaBizImpl");
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("utt-8");
		request.setAttribute("chaldeList", chaldeBiz.getAll());
		request.getRequestDispatcher("insertServant.jsp").forward(request, response);
	}
}
