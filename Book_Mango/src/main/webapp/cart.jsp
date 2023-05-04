<%@page import="java.util.List"%>
<%@page import="com.model.cart"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="dio.*" %>
     <%@page import="controller.*" %>
      <%@page import="com.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="navbar.jsp"%>

<%customer ctm =(customer)request.getSession().getAttribute("customer"); 

if(ctm!=null){
request.setAttribute("customer", ctm);

}%>
<%ArrayList<product> pdarl= (ArrayList<product>)session.getAttribute("pdview");%>

 <% ArrayList<cart> cart_list=(ArrayList<cart>)session.getAttribute("cart_list"); 
	
	List<cart> cartproduct=null;
	
	productdao pdo= new productdao();
	cartproduct =pdo.getcart(cart_list);
	request.setAttribute("cart_list", cart_list);
	
	%>
<%=cart_list %>	
<table cellpadding="15" border="1">

<tr>
<td>id</td>
<td>name</td>
<td>category</td>
<td>quality</td>
<td>price_pr_dz</td>
<td>avaibility_dz</td>
<td>description</td>
<td>quantity</td>
</tr>

<%for(cart p:cartproduct){%>
<tr>
<td><%=p.getP_id() %></td>
<td><%=p.getP_name() %></td>
<td><%=p.getP_category() %></td>
<td><%=p.getP_quality() %></td>
<td><%=p.getP_price_pr_dz()%></td>
<td><%=p.getP_avaibility_dz() %></td>
<td><%=p.getDescription() %></td>
<td><%=p.getQuantity()%>  <input type="text" value=""></td>
</tr>
<%} %>
</table>
<%@include file="footer.jsp"%>		
</body>
</html>