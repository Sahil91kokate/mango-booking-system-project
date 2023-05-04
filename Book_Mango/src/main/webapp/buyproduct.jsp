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

<%String p_id=request.getParameter("id"); %>
<%String p_price=request.getParameter("p_price"); %>

<h1 class="a">buy product</h1>
<form action="buyproduct"  method="post">
<Div class="field1">
    <fieldset class="field">


product_id<input type="text" name="p_id" value="<%=p_id%>" readonly="readonly"><br>
customer_id<input type="text" name="c_id" value="<%=ctm.getId()%>" readonly="readonly"><br>
customer_name<input type="text" name="c_name" value="<%=ctm.getName()%>" readonly="readonly"><br>
 price<input type="text" name="p_price" value="<%=p_price%>" readonly="readonly" ><br>
how many dz mango you want<input type="number" name="dz" required><br>
Enter your shipping address <input type="text" name="add" required><br><br><br>

<input type="submit" value=buy>
</fieldset>
</Div>


<%@include file="footer.jsp" %>

</form>
</body>
</html>