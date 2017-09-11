<%@ page language="java" pageEncoding="SHIFT-JIS" contentType="text/html; charset=SHIFT-JIS"%>
<% 
	String userName=(String)session.getAttribute("userId");
	if (userName==null || userName.length()==0){
		response.sendRedirect("logon.jsp");
	}
%>
