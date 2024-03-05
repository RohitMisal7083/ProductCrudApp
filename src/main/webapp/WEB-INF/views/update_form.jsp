<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">

		<div class="row">

			<div class="col-md-6 offset-md-3">

				<h1 class="text-center mb-3">Change the product Details</h1>
				<form action="${pageContext.request.contextPath}/handle-product" method="post">
				<div class="form-group">
						<lable>Product id</lable>
						<input type="text" class="form-control" name="p_id"
							placeholder="Enter the product id" value="${product.p_id}">
					</div>
					<div class="form-group">
						<lable>Product Name</lable>
						<input type="text" class="form-control" name="p_name"
							placeholder="Enter the product here" value="${product.p_name}">
					</div>
					<div class="form-group">
						<lable>Product Description</lable>
						<textarea rows="5" class="form-control" name="p_desc"
							placeholder="enter the description">${product.p_desc }</textarea>
					</div>
					<div class="form-group">
						<label>Product Price</label> 
						<input type="text" name="p_price"
							placeholder="Enetr price" class="form-control" value="${ product.p_price}">
					</div>
					<div class="container text-center">
					
					<a href="${pageContext.request.contextPath }/" class="btn btn-outline-danger">Back</a>
					<button type="submit" class="btn btn-warning">Update</button>
					
					</div>
				</form>

			</div>
		</div>
	</div>
</body>
</html>