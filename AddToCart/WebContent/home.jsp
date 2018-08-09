<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align=right>
		<a href="cart.app">cart</a>()
	</div>
	<div align=center>
		<h2>BookList</h2>
		<table>
			<tr>
				<th>BookName</th>
				<th>Price</th>
				<th>Description</th>
			</tr>
			<jstl:forEach var="bk" items="${requestScope.k }">
				<tr>
					<td>${bk.bookName }</td>
					<td>${bk.bookPrice }</td>
					<td>${bk.bookDescription }</td>
					<td><a href="addcart.app?bookName=${bk.bookName }">Add to Cart</a></td>
				</tr>
			</jstl:forEach>
		</table>
</body>
</html>