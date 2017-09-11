<%@ page language="java" pageEncoding="SHIFT-JIS" contentType="text/html; charset=SHIFT-JIS"%>
<%@ include file="check.jsp"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<html>
	<head>
		<title>JSP for queryForm form</title>
	</head>
	<body>
		<div style="font-weight:700;font-size:16px">
			学生情報管理システム Struts+Spring+iBATIS版 検索画面
			<span style="position:absolute;right:25px">
				<a href="mainMenu.jsp">メニュー</a>
			</span>
		</div>
		<hr size="1" style="border:thin dashed #008080">
		<html:errors property="studentName" />
		<html:form action="/jsp/spring/query">
			<table>
				<tr>
					<td width="10"></td>
					<td>名前を入力して下さい:</td>
					<td><html:text property="studentName" size="26" /></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
					<td><html:submit value="   確認   " /><html:cancel value="キャンセル" /></td>
				</tr>
			</table>
		</html:form>
	</body>
</html>
