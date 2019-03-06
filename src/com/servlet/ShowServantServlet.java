package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.biz.StudentBiz;
import com.util.SpringTool;
public class ShowServantServlet extends HttpServlet{
	private StudentBiz stuBiz = (StudentBiz)SpringTool.getBean("studentBizImpl");
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("utt-8");
		request.setAttribute("stuList", stuBiz.getAll());
		request.getRequestDispatcher("listStudents.jsp").forward(request, response);
	}
}
