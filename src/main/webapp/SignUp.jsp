<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Title </title>
</head>
<body>
<%String str = (String)request.getAttribute("error"); %>
<%= str %>
	<form action="SignUpController" method="post" align="center">
	
		<h1>Form</h1>
		<pre>First name            : <input type="text" name="firstName"></pre><br>
		<pre>Last name             : <input type="text" name="lastName"></pre><br>
		<pre>Email                 : <input type="text" name="email"></pre><br>
		<pre>Password              : <input type="password" name="password"></pre><br>
		<pre>Confirm Password      : <input type="password" name="cnfPassword"></pre><br>
		Hobby                 : <input type="radio" name="hobby">Cricket<input type="radio" name="hobby">Football<input type="radio" name="hobby">Lawn-Tennis<input type="radio" name="hobby">Badminton<br><br><br>
		
		
		<label for="city">City                  :
		</label><select name="city" id="city">
		<option value="----">----</option>
		<option value="mumbai">Mumbai</option>
		<option value="kolkata">Kolkata</option>
  		<option value="pune">Pune</option>
  		<option value="chennai">Chennai</option>  		
  		<option value="ahmedabad">Ahmedabad</option>
  		<option value="indore">Indore</option>
		</select><br><br><br>
		
		
		Gender                : <input type="radio" name="gender">Male<input type="radio" name="gender">Female<br><br>
		
		<input type="submit" value="Sign Up">
	</form>
</body>
</html>