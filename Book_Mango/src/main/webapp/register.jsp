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
    <%String message = (String)request.getAttribute("error"); %>
<%if(message!=null){ %>

	<h3 style="color:red;"><%=message %></h3>

<%} %>

    <div class="center">
        <h1>Register</h1>
        <form action="registerservlet" method="post">
            <div class="txt-field">
                <input type="text" name="c_name" required>
                <span></span>
                <label>Name:</label>
            </div>
            <div class="txt-field">
                <input type="text" name="c_mobile" required>
                <span></span>
                <label class="lbl">Mobile:</label>
            </div>
            <div class="txt-field">
                <input type="text"  name="c_address" required>
                <span></span>
                <label class="lbl">Address:</label>
            </div> <div class="txt-field">
                <input type="text" name="c_email" required>
                <span></span>
                <label class="lbl1">Email:</label>
            </div>
            <div class="txt-field">
                <input type="text" name="c_password" required>
                <span></span>
                <label class="lbl2">Create-password:</label>
            </div>
            <input type="submit" value="Register">
            <div class="signup-link">
                Already a Member? <a href="login.jsp">Login</a>
            </div>
        </form>
    </div>
</body>
</html>