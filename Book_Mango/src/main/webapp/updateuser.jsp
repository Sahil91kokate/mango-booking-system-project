<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.model.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/fieldset.css">
</head>
<body>
<%@include file="navbar.jsp"%>
<%customer ctm = (customer)session.getAttribute("customer");%>



 <h1 class="a">update user info</h1>
    


<Div class="field1">
    <fieldset class="field">

<form action="updateuser" method="post">
 id<br><input type="text" name="id" value="<%=ctm.getId()%>" readonly="readonly"><br><br>
upadte your name<br><input type="text" name="name" value="<%=ctm.getName()%>"><br><br>
update your mobile<input type="text" name="mobile" value="<%=ctm.getMoblie()%>"><br><br>
update your address<input type="text" name="address" value="<%=ctm.getAddress()%>"><br><br>
upadte your password<input type="text" name="password" value="<%=ctm.getPassword()%>"><br><br>
<!--  <input type="text" name="id" value="<%=ctm.getId()%>" readonly="readonly">-->
<input type="submit" value="update">
</fieldset>
</Div>


</form>
</body>
</html>