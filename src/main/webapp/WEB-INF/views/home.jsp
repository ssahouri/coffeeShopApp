<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css" />
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<title>Home</title>


</head>
<body>
	<div class="headz">
		<h1>GC COFFEE</h1>
		

	</div>


<span>
			Hello ${ profile.first_name } ${ profile.last_name }
		</span>


	
	
	<div class="body">
		<br>
		<h2>Welcome to GC Coffee!</h2>
	<div class = "links">

		<a class="btn btn-light" href="/userRegistration" role="button">Click
			here to register!</a> <a class="btn btn-light" href="/menu" role="button">View
			Menu!</a> <a class="btn btn-light" href="/itemAdmin" role="button">Admin
			Menu!</a>
			<a class="btn btn-light" href="/login" role="button">Log In!</a><a class="btn btn-light" href="/logout">Logout</a>
</div>
	</div>

</body>
</html>