package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.biz.StudentBiz;
import com.entity.Student;
import com.util.SpringTool;
public class insertServant extends HttpServlet{
	private StudentBiz stuBiz = (StudentBiz)SpringTool.getBean("studentBizImpl");
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		Student stu = new Student();
		stu.setStuName(request.getParameter("stuName"));
		stu.setStuSex(request.getParameter("stuSex"));
		Integer stuAge = Integer.parseInt(request.getParameter("stuAge"));
		stu.setStuAge(stuAge);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(request.getParameter("stuBirthday"));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		stu.setStuBirthday(date);
		Integer chaldeaId = Integer.parseInt(request.getParameter("chaldeaId"));
		stu.getChaldea().setChaldeaId(chaldeaId);
		int i = stuBiz.insert(stu);
		PrintWriter out = response.getWriter();
		if(i>0) {
			out.println("<script type='text/javascript'>" + "alert('添加成功');" 
					+ "location.href='ShowServantServlet'"
					+ "</script>");
		}
//		response.sendRedirect("ShowServantServlet");
		
		
	}
}
