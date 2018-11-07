<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
</head>
<body>
<h3>User Registration</h3>
<form action="/welcome" method="POST">
<p>
First Name: <input name = "fname"/>
</p>
<p>
Last Name: <input name = "lname"/>
</p>
<p>
User Name: <input name = "uname"/>
</p>
<p>
Email: <input type ="Email" name = "email"/>
</p>
<p>
Password: <input type="Password" name = "pword"/>
</p>
<p>How many times a day do you drink coffee?
<select name = "select">
   <option selected disabled= "disabled">--Select--</option>
  <option value="0">less than 1</option>
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3 or more</option>
</select>
</p>
<p>
<button>Register</button>
</p>
</form>
</body>
</html>