<%@ page language="java" pageEncoding="SHIFT-JIS" contentType="text/html; charset=SHIFT-JIS"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-template" prefix="template"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-nested" prefix="nested"%>
<html:html locale="true">
<head>
	<html:base />
	<title>logon.jsp</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<% session.invalidate(); %>
</head>
<body>
	<div style="font-weight:700;font-size:16px">
		学生情報管理システム Struts+Spring+iBATIS版 ログアウト画面
	</div>
	<hr size="1" style="border:thin dashed #008080"><br>
	ログアウトしました。
	<br>
	<a href="login.jsp">ログイン
</body>
</html:html>
