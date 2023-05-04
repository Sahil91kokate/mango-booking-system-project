<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/login.css">
</head>
<body>
<div id="error">
 <%String e=(String) request.getAttribute("errorMsg");%> 
 <% if(e!=null) {%>
 
 <h3 style="color:red"> <%=e%></h3>
 
 <% }%>
 
 
</div>


	<div class="center">
        <h1>Login</h1>
        <form action="adminlogin" method="post">
            <div class="txt-field">
                <input type="text" name="uname" required>
                <span></span>
                <label>Email:</label>
            </div>
            <div class="txt-field">
                <input type="text" name="pass" required>
                <span></span>
                <label class="lb">  Password:</label>
            </div>
            <input type="submit" value="admin_Login">
            <div class="signup-link">
                
            </div>
        </form>
    </div>
</body>
</html>