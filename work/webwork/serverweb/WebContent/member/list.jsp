<%@page import="member.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	 //서블릿 공유해준 ArrayList<DeptDTO>객체 가져오기
	 ArrayList<MemberDTO> dto = (ArrayList<MemberDTO>)request.getAttribute("memlist");
	%>
	<%int size = dto.size(); %>
	<h1>부서목록보기</h1>
		<hr/>
		<table border='1' width = '500px'>
		<tr>
		<th>아이디</th>
		<th>비밀번호</th>
		<th>이름</th>
		<th>주소</th>
		<th>부서번호</th>
		<th>등급</th>
		<th>뽀인트</th>
		<th>삭제</th>
		</tr>
		
	 <% for(int i=0; i <size; i++) { 
			MemberDTO mem = dto.get(i);%>
		<tr>
			<td><%= mem.getId() %></td>
			<td><%= mem.getPass() %></td>
			<td><a href="/serverweb/member/read.do?id=<%=mem.getId() %>"><%=mem.getName()%></a></td>
			<td><%= mem.getAddr() %></td>
			<td><%= mem.getDeptNo()%></td>
			<td><%= mem.getGrade()%></td>
			<td><%= mem.getPoint()%></td>
			<td><a href="/serverweb/member/delete.do?id=<%= mem.getId() %>">삭제</a></td>
			</tr>
		<% }%>
</table>
</body>
</html>