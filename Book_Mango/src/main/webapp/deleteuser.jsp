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
<%customer ctm = (customer)session.getAttribute("customer");%>
<h2> are you sure to delete account  then select /yes/ and back to  home select /no/ </h2>
name<input type="text" name="name" value="<%=ctm.getName()%>" readonly="readonly"><br>
<form action="deleteuser" method="post">
<input type="hidden" name="id" value="<%=ctm.getId()%>" ><br>
yes<input type="radio" name="del" value="yes"><br><br>


no<input type="radio" name="del" value="no"><br><br>

<input type="submit" value="submit">

</form>
</body>
</html>