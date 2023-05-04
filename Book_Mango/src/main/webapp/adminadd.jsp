<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="css/fieldset.css">
</head>
<body style=" background:url(css/m1.jpg);">

<div id="error">
 <%String e=(String) request.getAttribute("errorMsg");%> 
 <% if(e!=null) {%>
 
 <h3 style="color:red"> <%=e%></h3>
 
 <% }%>
 <div class="head">

        <h1 class="a">ADD PRODUCT</h1>
    </div>
    

<form action="adminadd" method="post">
<Div class="field1">
    <fieldset class="field">

        id <input type="text" name="id" value=""><br>

        name<input type="text" name="name" value=""><br>

        category<input type="text" name="category" value=""><br>

        quality <input type="text" name="quality" value=""><br>

        price <input type="text" name="price" value=""><br>

        avaibility <input type="text" name="avaibility" value=""><br>

        description<input type="text" name="description" value=""><br>
        <input type="submit" value="add"><br>
    </fieldset>
</Div></form>

</body>
</html>