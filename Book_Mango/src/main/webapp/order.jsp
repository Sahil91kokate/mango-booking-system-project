<%@page import="com.model.orders"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.model.customer"%>
<%@page import="dio.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="navbar.jsp"%>
<%customer ctm =(customer)request.getSession().getAttribute("customer"); %>

 <%String message = (String)request.getAttribute("delete"); %>
<%if(message!=null){ %>

	<h3 style="color:red;"><%=message %></h3>

<%} %>


<% orderdao odo= new orderdao();
ArrayList<orders> arl=odo.getorder(ctm.getId()); %>

<table border="1" cellspacing="20%" cellpadding="20%">
<tr><td>order_id</td>
	<td>name</td>
	<td>email</td>
	<td>producti_id</td>
	<td>category</td>
	<td>quality</td>
	<td>quantity_dz</td>
	<td>total_price</td>
	<td>order_date</td>
	<td>shipping_address</td>>

</tr>

<% for(orders o:arl){%>
<tr><td><%=o.getO_id()%></td>
<td><%=o.getName() %></td>
<td><%=o.getEmail() %></td>
<td><%=o.getPd_id() %></td>
<td><%=o.getCategory() %></td>
<td><%=o.getQuality() %></td>
<td><%=o.getDozen()%></td>
<td><%=o.getTotal() %></td> 
<td><%=o.getO_date()%></td>
<td><%=o.getAddress() %></td>
<td> <button><a href="deleteorder?o_id=<%=o.getO_id() %>" > Delete </a></button></td>
</tr>

<%} %>
</table>

<%@include file="footer.jsp"%>
</body>
</html>