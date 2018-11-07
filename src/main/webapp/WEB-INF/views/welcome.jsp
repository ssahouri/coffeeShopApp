<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome!</title>
<link rel="stylesheet" href="resources/style.css" />
</head>
<body>
<div class = "header">
  <h1>GC COFFEE</h1>
  
</div>
<br>
<h2>Welcome, ${ fname }!</h2>
<h5>Registration Details</h5>
<p>Name: ${ fname } ${ lname } </p>
<p>User Name: ${ uname }</p>
<p>Email: ${ email }</p>
<p>You drink coffee ${ select } times a day</p>
<h5>Thanks for registering!</h5>

</body>
</html>