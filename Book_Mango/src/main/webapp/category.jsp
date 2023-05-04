<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

    <%@page  import ="com.model.product"%>
    <%@page import="java.util.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="navbar.jsp"%>

<%ArrayList<product> pdarl= (ArrayList<product>)session.getAttribute("pdview");%>

<table border="1" cellpading="15px" cellspacing="10px" style="height: 50%; width: 100%; border: 2px solid black; background-color: rgb(248, 234, 102);">

<tr>
<td>id</td>
<td>name</td>
<td>category</td>
<td>quality</td>
<td>price_pr_dz</td>
<td>avaibility_dz</td>
<td>description</td>
</tr>

<%for(product p:pdarl){%>

<tr>
<td><%=p.getP_id()%></td>
<td><%=p.getP_name()%></td>
<td><%=p.getP_category()%></td>
<td><%=p.getP_quality()%></td>
<td><%=p.getP_price_pr_dz()%></td>
<td><%=p.getP_avaibility_dz()%></td>
<td><%=p.getDescription() %></td>
<td><a href="buyproduct.jsp?id=<%=p.getP_id()%>&p_price=<%=p.getP_price_pr_dz()%>">buy</a></td>
<td><a href="addtocartservlet?id=<%=p.getP_id()%>">add_to_cart</a></td>
<td></td>

</tr>
<%} %>
</table>
</body>
</html>