<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center">Welcome To Product App</h1>

				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Product Name</th>
							<th scope="col">Descriptio</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${product}" var="prod">
							<tr>
								<th scope="row">TECHONLY${prod.p_id}</th>
								<td>${prod.p_name}</td>
								<td>${prod.p_desc}</td>
								<td class="font-weight-bold">&#x20B9;${prod.p_price}</td>
								<td><a href="delete/${prod.p_id}"><i
										class="fas fa-trash-alt text-danger" style="font-size: 25px"></i></a>
									<a href="update/${prod.p_id }">&nbsp;&nbsp;&nbsp;&nbsp;<i class="fas fa-pen"
										style="font-size: 25px"></i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>


			</div>
			<div class="container text-center">
				<a href="add_product" class="btn btn-outline-success">Add
					Product</a>
			</div>
		</div>
	</div>

</body>
</html>