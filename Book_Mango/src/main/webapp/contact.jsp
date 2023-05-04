<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="css/contact.css">

</head>
<body>
 <%@include file="navbar.jsp" %>
    <div class="container">
        <h1>Connect With Us</h1>
        <p>we would like to respond to your queries and help you succed. Feel free to get in touch with us.</p>
        <div class="contact-box">
            <div class="contact-left">
                <h3>Sent your request</h3>
                <form >
                    <div class="input-row">
                        <div class="input-group">
                            <label>Name:</label>
                            <input type="text" name="" placeholder="Enter your name">
                        </div>
                        <div class="input-group">
                            <label>Phone:</label>
                            <input type="text" name="" placeholder="Enter your number">
                        </div>
                    </div>
                        <div class="input-row">
                        <div class="input-group">
                            <label>Email:</label>
                            <input type="email" name="" placeholder="Enter your email">
                        </div>
                        <div class="input-group">
                            <label>Subject:</label>
                            <input type="text" name="" placeholder="Enter subject here">
                        </div>
                    </div>
                    <label class="lbl">Message:</label>
                    <textarea name=""  rows="5" placeholder=" Your message"></textarea>
                    <button type="submit">Send</button>
                </form>
            </div>
            <div class="contact-right">
                <h3>React us</h3>
                <table>
                    <tr>
                        <td>Email</td>
                        <td>contactus@gmail.com</td>
                    </tr>
                    <tr>
                        <td>Phone</td>
                        <td>+1 0123 456 789</td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td>#222, Ground flour, 7th cross <br>
                        some layout, some road, nangrag, mumbai 203300</td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
    
    <%@ include file="footer.jsp" %>>
</body>

</html>