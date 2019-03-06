<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="com.entity.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<title>Show Servant Information</title>
</head>
<body>

	<div align="center">
		<div align="center" style="font-size: 30px">Servant Information</div>
		<form action="">
			<table border="1" width="800" style="text-align: center">
				<tr>
					<th>ServantId</th>
					<th>ServantName</th>
					<th>ServantSex</th>
					<th>ServantAge</th>
					<th>ServantBirthday</th>
					<th>Chladea</th>
					<th>Action</th>
				</tr>
				<c:forEach items="${requestScope.stuList}" var="stu" varStatus="i">
					<tr
						<c:if test="${i.index % 2 ==1}">style="background-color:#9CD1F3;"</c:if>>
						<td><a style="text-decoration: none;"
							href="StudentServlet?id=${stu.stuId}&action=goupdate">${i.count}</a></td>
						<td>${stu.stuName}</td>
						<td>${stu.stuSex}</td>
						<td>${stu.stuAge}</td>
						<td><fmt:formatDate value="${stu.stuBirthday}"
								pattern="yyyy-MM-dd" /></td>
						<td>${stu.chaldea.chaldeaName}</td>
						<td><a style="text-decoration: none;"
							onclick="return confirm('确定要删除Servant信息吗？') "
							href="StudentServlet?id=${stu.stuId}&action=delete">删除</a></td>
					</tr>
				</c:forEach>
			</table>
			<div align="left" style="width: 800px" style="text-decoration: none;">
				<a href="BeforInsertServlet">Insert Servant</a>
			</div>
	</div>
	</form>
	</div>
</body>


</html>