<%@ page language="java" pageEncoding="SHIFT-JIS" contentType="text/html; charset=SHIFT-JIS"%>
<%@ include file="check.jsp" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>

<html>
	<head>
		<title>JSP for deleteForm form</title>
	</head>
	<body>
		<div style="font-weight:700;font-size:16px">
			�w�����Ǘ��V�X�e�� Struts+Spring+iBATIS�� �폜���
			<span style="position:absolute;right:25px">
				<a href="mainMenu.jsp">���j���[</a>
			</span>
		</div>
		<hr size="1" style="border:thin dashed #008080"><br>
		<html:errors property="studentId" />
		<html:form action="/jsp/spring/delete">
			<table border="0" cellspacing="1" cellpadding="1">
				<tr>
					<td align="right"><span class="style1">ID�F</span></td>
					<td align="left">
						<html:text property="studentId" />
						<input type="submit" name="Submit" value="Delete">
					</td>
				</tr>
			</table>
		</html:form>
	</body>
</html>
