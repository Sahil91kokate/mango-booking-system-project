<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="com.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%int id=Integer.parseInt(request.getParameter("id")); %>
<h2> are you sure to delete product  then select /yes/ and back to  home select /no/ </h2>
<form action="admindelete" method="post">
<input type="hidden" name="id" value="<%=id%>" ><br>


yes<input type="radio" name="del" value="yes"><br><br>
no<input type="radio" name="del" value="no"><br><br>

<input type="submit" value="submit">

</form>

</body>
</html>