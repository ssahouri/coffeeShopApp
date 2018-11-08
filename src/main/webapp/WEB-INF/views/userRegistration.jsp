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
<form action="/welcome" method="POST">
<p>
First Name: <input name = "firstName" required minlength="2" maxlength="12"/>
</p>
<p>
Last Name: <input name = "lastName" required minlength="2" maxlength="20"/>
</p>
<p>
User Name: <input name = "username" required minlength="2" maxlength="20"/>
</p>
<p>
Email: <input type ="Email" name = "email" required/>
</p>
<p>
Password: <input type="Password" name = "password" required minlength="8"/>
</p>
<p>How many cups of coffee a day do you drink?
<select name = "cupsPerDay">
   <option selected disabled= "disabled">--Select--</option>
  <option value="less than 1">less than 1</option>
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3 or more">3 or more</option>
</select>
</p>
<p>
<button class="btn btn-dark">Register</button>
</p>

</form>
</div>
</body>
</html>