<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

	<div class="header">
		<h1>GC COFFEE</h1>

	</div>
	<div class= "body">
	<h2>Menu</h2>
	
	<table class="table table-sm">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Price</th>
      <th scope="col">Name</th>
      <th scope="col">Description</th>
    </tr>
  </thead>
	<tr>
	</tr>
	<c:forEach var = "item" items="${ items }">
	<tr>
	<td>$${ item.price}</td><td>${item.name }</td><td>${ item.description}</td>
	</tr>
</c:forEach>
	</table>
</div>
</body>

</html>