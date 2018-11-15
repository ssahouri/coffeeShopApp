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
</head>

<body>

	<div class="headz">
		<h1>GC COFFEE</h1>

	</div>
	<span>
			Hello ${ profile.first_name } ${ profile.last_name }
		</span>
	<div class="body">
		<table class="table table-sm">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Quantity</th>
					<th scope="col">Name</th>
					<th scope="col">Price</th>
					<th scope="col">Subtotal</th>
					<th scope="col">Delete</th>
				</tr>
			</thead>
			<tr>
			</tr>
			<c:forEach var="cartItem" items="${ cartItems }">
				<tr>
					<td>${ cartItem.quantity}</td>
					<td>${cartItem.menuItem.name }</td>
					<td>$<fmt:formatNumber type="number" pattern="##.##"
							value="${ cartItem.menuItem.price}"/></td>
					<td><jsp:text>
  						$${cartItem.quantity * cartItem.menuItem.price}
							</jsp:text></td>
							<td><a class="btn btn-danger" href="/deleteFromCart?id=${cartItem.id }">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<a class="btn btn-danger" href="/menu">Back to Menu</a>
	</div>
</body>
</html>