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
		学生情報管理システム Struts+Spring+iBATIS版 登録画面
		<span style="position:absolute;right:25px">
			<a href="mainMenu.jsp">メニュー</a>
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
					<td align="right">名前: </td>
					<td ><html:text property="studentName" size="26"/></td>
				</tr>
				<tr>
					<td align="right">生年月日: </td>
					<td ><html:text property="studentBirthdate" size="26"/></td>
				</tr>
				<tr>
					<td align="right" valign="top">住所: </td>
					<td><html:textarea property="studentAddress" cols="30" rows="3"/></td>
				</tr>
				<tr> 
					<td>&nbsp;</td>
					<td><html:submit value="   確認   "/><html:cancel value="キャンセル" /></td> 
				</tr>
			</table>
		</html:form>
	</body>
</html>
