<%@ page language="java" pageEncoding="SHIFT-JIS" contentType="text/html; charset=SHIFT-JIS"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for loginForm form</title>
	</head>
	<body>
		<div style="font-weight:700;font-size:16px">
			�w�����Ǘ��V�X�e�� Struts+Spring+iBATIS�� ���O�C�����
			<span style="position:absolute;right:25px">
		      <a href="<%=request.getContextPath()%>/index.jsp">�g�b�v</a>
		    </span>
		</div>
		<hr size="1" style="border:thin dashed #008080"><br>
		<html:errors/>
		<html:form action="/jsp/spring/login">
			<table>
				<tr>
					<td width="10"></td>
					<td>���[�U�[ ID: </td>
					<td><html:text property="userId" size="26"/></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>�p�X���[�h: </td>
					<td><html:password property="password" size="20"/></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
					<td><html:submit value="   �m�F   "/><html:reset value="  �N���A  "/></td> 
				</tr>
			</table>
		</html:form>
	</body>
</html>
