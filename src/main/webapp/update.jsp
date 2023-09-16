<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="update_row" method="post">
<h1>updating form</h1>
ID : <input type="number" name="uid"  value="<%=request.getParameter("id")%>" readonly="readonly"><br>
NAMAE : <input type="text" name="uname" value="<%=request.getParameter("name")%>"><br>
MAIL : <input type="email" name="um" value="<%=request.getParameter("mail")%>"><br>
PASSWORD : <input type="password" name="up" value="<%=request.getParameter("password")%>"><br>
PHONE : <input type="number" name="unumber" value="<%=request.getParameter("phone")%>"><br>
GENDER : 
male:<input type="radio" name="ugender" value="<%=request.getParameter("gender")%>">
female<input type="radio" name="ugender" value="<%=request.getParameter("gender")%>"><br>
<button>submit</button>
</form>
</body>
</html>