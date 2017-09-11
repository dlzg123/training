<%@ page language="java" pageEncoding="SHIFT-JIS" contentType="text/html; charset=SHIFT-JIS"%>
<%@ include file="check.jsp"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-template" prefix="template"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-nested" prefix="nested"%>
<html:html locale="true">
<head>
	<html:base />
	<title>view.jsp</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
</head>
<body>
	<div style="font-weight:700;font-size:16px">
		学生情報管理システム Struts+Spring+iBATIS版 検索結果画面
		<span style="position:absolute;right:25px">
			<a href="mainMenu.jsp">メニュー</a>
		</span>
	</div>
	<hr size="1" style="border:thin dashed #008080">
	<br>
	<div style="position:absolute;left:10;height:442;width:981; overflow:auto;">
		<table border="0" cellspacing="1" cellpadding="3" bgcolor="#000000">
			<tr align="left">
				<th bgcolor="#A9A9A9">
					ID
				</th>
				<th bgcolor="#A9A9A9">
					名前
				</th>
				<th bgcolor="#A9A9A9">
					生年月日
				</th>
				<th bgcolor="#A9A9A9">
					住所
				</th>
			</tr>
			<logic:present name="collection">
				<logic:iterate id="student" name="collection">
					<tr>
						<td bgcolor="#ffffff">
							<bean:write name="student" property="id" />
							&nbsp;
						</td>
						<td bgcolor="#ffffff">
							<bean:write name="student" property="name" />
							&nbsp;
						</td>
						<td bgcolor="#ffffff">
							<bean:write name="student" property="birthDate" />
							&nbsp;
						</td>
						<td bgcolor="#ffffff">
							<bean:write name="student" property="address" />
							&nbsp;
						</td>
					</tr>
				</logic:iterate>
			</logic:present>
		</table>
	</div>
</body>
</html:html>
