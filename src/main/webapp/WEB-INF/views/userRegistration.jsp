<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<meta charset="UTF-8">
<title>User Registration</title>
<link rel="stylesheet" href="/style.css" />
</head>
<body>
<div class = "header">
  <h1>GC COFFEE</h1>
  
</div>
<div class = "body">
<br>
<h3>User Registration</h3>
<form action="/userRegistration" method="POST">
<p>
First Name: <input name = "first_name" required minlength="2" maxlength="12"/>
</p>
<p>
Last Name: <input name = "last_name" required minlength="2" maxlength="20"/>
</p>
<p>
User Name: <input name = "username" required minlength="2" maxlength="20"/>
</p>

<p>
Password: <input type="Password" name = "password" required minlength="8"/>
</p>

<p>
<button class="btn btn-dark">Register</button>
</p>

</form>
</div>
</body>
</html>