<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%!
		int sum(int a, int b){
		return a+b;
	}
	int dif(int a, int b){
		return a-b;
	}
	int comp(int a, int b){
		return a*b;
	}
	int div(int a, int b){
		return a/b;
	}
%>
</head>
<body>
	<%
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
		String sign = request.getParameter("sign");
		if(n1 == null || n2 == null || sign == null){%>
			<h1>Параметры не указаны</h1>
			<%} else {
				int a = Integer.parseInt(n1);
				int b = Integer.parseInt(n2);
				switch(sign){
					case "sum": %>
						<h2><%=sum(a,b) %></h2>
						<% break;
					case "dif": %>
					<h2><%=dif(a,b) %></h2>
					<% break;
					case "comp": %>
					<h2><%=comp(a,b) %></h2>
					<% break;
					case "div": %>
					<h2><%=div(a,b) %></h2>
					<% break;
				}
		}
	%>
</body>
</html>