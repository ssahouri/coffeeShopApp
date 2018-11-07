<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
<link rel="stylesheet" href="resources/style.css" />
</head>
<body>
<div class = "header">
  <h1>GC COFFEE</h1>
  
</div>
<br>
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
  <option value="less than 1">less than 1</option>
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3 or more">3 or more</option>
</select>
</p>
<p>
<button>Register</button>
</p>
</form>
</body>
</html>