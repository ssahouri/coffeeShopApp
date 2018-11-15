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
<h1>Login</h1>
	
	<p class="message">${ message }</p>
	
	<form action="/login" method="post">
	<p>
			<label for="username">Username:</label> <input id="username" name="username" value="${ param.username }" required minlength="2" />
		</p>		<p>
			<label for="password">Password:</label> <input id="password" type="password" name="password" required minlength="8" />
		</p>
		
		<p>
			<button>Submit</button>
		</p>
	</form>
	

</body>
</html>