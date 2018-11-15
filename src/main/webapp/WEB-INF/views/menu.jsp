<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<meta charset="UTF-8">
<title>Menu</title>
<link rel="stylesheet" href="/style.css" />
<span>
			Hello ${ profile.first_name } ${ profile.last_name }
		</span>
</head>

<body>

	<div class="header">
		<h1>GC COFFEE</h1>

	</div>
	<div class="body">
		<h2>Menu</h2>

		<table class="table table-sm">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Price</th>
					<th scope="col">Name</th>
					<th scope="col">Description</th>
					<th scope="col">Add to Cart</th>
				</tr>
			</thead>
			<tr>
			</tr>
			<c:forEach var="item" items="${ items }">
				<tr>
					<td>$<fmt:formatNumber type="number" pattern="##.##"
							value="${ item.price}" /></td>
					<td>${item.name }</td>
					<td>${ item.description}</td>
					<td><a class="btn btn-danger" href="/addCartItem?id=${item.id }">Add
							to Cart</a></td>
				</tr>
			</c:forEach>
		</table>
		<a class="btn btn-danger" href="/cartItem">View Cart</a>
	</div>
</body>
</html>