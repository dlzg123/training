<%@ page language="java" pageEncoding="SHIFT-JIS" contentType="text/html; charset=SHIFT-JIS"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@ include file="check.jsp" %>
<html> 
	<head>
		<title>JSP for addForm form</title>
	</head>
	<body>
	<div style="font-weight:700;font-size:16px">
		�w�����Ǘ��V�X�e�� Struts+Spring+iBATIS�� �o�^���
		<span style="position:absolute;right:25px">
			<a href="mainMenu.jsp">���j���[</a>
		</span>
	</div>
	<hr size="1" style="border:thin dashed #008080"><br>
	<html:errors/>
		<html:form action="/jsp/spring/add">
			<table>
				<tr>
					<td align="right">ID: </td>
					<td ><html:text property="studentId" size="26"/></td>
				</tr>
				<tr>
					<td align="right">���O: </td>
					<td ><html:text property="studentName" size="26"/></td>
				</tr>
				<tr>
					<td align="right">���N����: </td>
					<td ><html:text property="studentBirthdate" size="26"/></td>
				</tr>
				<tr>
					<td align="right" valign="top">�Z��: </td>
					<td><html:textarea property="studentAddress" cols="30" rows="3"/></td>
				</tr>
				<tr> 
					<td>&nbsp;</td>
					<td><html:submit value="   �m�F   "/><html:cancel value="�L�����Z��" /></td> 
				</tr>
			</table>
		</html:form>
	</body>
</html>
