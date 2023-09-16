<%@page import="dto.PatientDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<table width="50%" highet="50%" border="" style="border-collapse:collapse; text-align: center;">
<tr>
<th>ID</th>
<th>NAME</th>
<th>EMAIL</th>
<th>PASSOWRD</th>
<th>PHONE</th>
<th>GENDER</th>
<th>DELETE</th>
<th>UPDATE</th>
</tr>
<%--<%Object obj=request.getAttribute("objects");%>--%>
<%List<PatientDto> list=(List<PatientDto>)request.getAttribute("objects");%>
<%for(PatientDto dt:list) {%>
<tr>
<td><%=dt.getId()%></td>
<td><%=dt.getName() %></td>
<td><%=dt.getEmail() %></td>
<td><%=dt.getPassword()%></td>
<td><%=dt.getPhno()%></td>
<td><%=dt.getGender() %></td>
<td><a href="delete?pk=<%=dt.getId()%>">remove</a></td>
<td><a href="update.jsp?id=<%=dt.getId()%>&&name=<%=dt.getName()%>&&mail=<%=dt.getEmail()%>&&password<%=dt.getPassword()%>&&phone=<%=dt.getPhno()%>&&gender=<%=dt.getGender()%>">update</a></td>
</tr>
<%}%>


</table>
</center>
</body>
</html>