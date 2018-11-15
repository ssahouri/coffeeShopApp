<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Delete</title>
<link rel="stylesheet" href="/style.css" />
<span>
			Hello ${ profile.first_name } ${ profile.last_name }
		</span>
</head>
	<div class="header">
		<h1>GC COFFEE</h1>

	</div>
<body>
<div class="container">
		<h2>Add an Item</h2>
		<form action="/add" method="post">
		<table class="table">
			<tr>
				<th scope="row">Price</th>
				<td><input type="number" name="price" autofocus/></td>
			</tr>
			<tr>
				<th scope="row">Name</th>
				<td><input type="text" name="Name" /></td>
			</tr>
				<tr>
				<th scope="row">Description</th>
				<td><input type="text" name="Description" /></td>
			</tr>

		</table>
		<button type="submit" class="btn btn-primary" href="/add">Add</button>
		<a class="btn link" href="/itemAdmin">Cancel</a>
		</form>
	</div>

</body>
</html>