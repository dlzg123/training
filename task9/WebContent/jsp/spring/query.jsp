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
			�w�����Ǘ��V�X�e�� Struts+Spring+iBATIS�� �������
			<span style="position:absolute;right:25px">
				<a href="mainMenu.jsp">���j���[</a>
			</span>
		</div>
		<hr size="1" style="border:thin dashed #008080">
		<html:errors property="studentName" />
		<html:form action="/jsp/spring/query">
			<table>
				<tr>
					<td width="10"></td>
					<td>���O����͂��ĉ�����:</td>
					<td><html:text property="studentName" size="26" /></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
					<td><html:submit value="   �m�F   " /><html:cancel value="�L�����Z��" /></td>
				</tr>
			</table>
		</html:form>
	</body>
</html>
