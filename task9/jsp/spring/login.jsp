<%@ page language="java" pageEncoding="SHIFT-JIS" contentType="text/html; charset=SHIFT-JIS"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for loginForm form</title>
	</head>
	<body>
		<div style="font-weight:700;font-size:16px">
			学生情報管理システム Struts+Spring+iBATIS版 ログイン画面
			<span style="position:absolute;right:25px">
		      <a href="<%=request.getContextPath()%>/index.jsp">トップ</a>
		    </span>
		</div>
		<hr size="1" style="border:thin dashed #008080"><br>
		<html:errors/>
		<html:form action="/jsp/spring/login">
			<table>
				<tr>
					<td width="10"></td>
					<td>ユーザー ID: </td>
					<td><html:text property="userId" size="26"/></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>パスワード: </td>
					<td><html:password property="password" size="20"/></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
					<td><html:submit value="   確認   "/><html:reset value="  クリア  "/></td> 
				</tr>
			</table>
		</html:form>
	</body>
</html>
