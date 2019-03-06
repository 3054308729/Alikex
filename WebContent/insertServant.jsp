<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>添加</title>
</head>
<body>
	<div align="center">
		<h1>insert Servant message information</h1>
		<form action="insertServant" method="post" onsubmit="">
			<table>
				<tr>
					<td>servantName</td>
					<td><input type="text" name="stuName" id="stuName" /></td>
				</tr>
				<tr>
					<td>servantSex</td>
					<td><input type="radio" value="男" name="stuSex" id="stuSex"
						checked="checked">男 <input type="radio" value="女"
						name="stuSex" id="stuSex">女</td>
				</tr>
				<tr>
					<td>servantAge</td>
					<td><input type="text" name="stuAge" id="stuAge" /></td>
				</tr>
				<tr>
					<td>servantBirthday</td>
					<td><input type="text" name="stuBirthday" id="stuBirthday" /></td>
				</tr>
				<tr>
					<td>chaldea</td>
					<td><select name="chaldeaId" id="chaldeaId">
							<c:forEach items="${chaldeList }" var="c">
								<option value="${c.chaldeaId }">${c.chaldeaName }</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td><input type="submit" value="Save" /></td>
				</tr>
			</table>

		</form>
	</div>
</body>
</html>