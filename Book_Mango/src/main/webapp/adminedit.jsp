<%@page import="dio.productdao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@page import ="com.model.*" %>
 <%@page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/fieldset.css">
</head>
<body style=" background:url(css/m1.jpg);">
<% 
HttpSession session1= request.getSession();
ArrayList<product> pdarl= (ArrayList<product>)session1.getAttribute("pdview");%>



 <% int id= Integer.parseInt(request.getParameter("id"));
 
 product pd= new product();
 productdao pdo= new productdao();
 ArrayList<product> arl = new ArrayList<product>();
 arl=pdo.pdviewproduct(id);%>
 
 <%for (product i:arl)
	 
 {%>
<div class="head">

        <h1 class="a">update product</h1>
    </div>

<form action="adminedit" method="post">
<Div class="field1">
    <fieldset class="field">


id <input type="text" name="id" value="<%=i.getP_id()%>" readonly="readonly"><br>

name<input type="text" name="name" value="<%=i.getP_name()%>"><br>

category<input type="text" name="category" value="<%=i.getP_category()%>"><br>

quality <input type="text" name="quality" value="<%=i.getP_quality()%>"/><br>

price <input type="text" name="price" value="<%=i.getP_price_pr_dz()%>"/><br>

avaibility <input type="text" name="avaibility" value="<%=i.getP_avaibility_dz()%>"><br>
 
description<input type="text" name="description" value="<%=i.getDescription()%>"><br>
<input type="submit" value="update"><br>
</fieldset>
</Div>
</form>
<% } %>
<%@include file="footer.jsp"%>
</body>
</html>