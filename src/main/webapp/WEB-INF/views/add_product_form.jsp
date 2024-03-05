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

				<h1 class="text-center mb-3">Fill the product Details</h1>
				<form action="handle-product" method="post">
					<div class="form-group">
						<lable>Producct Name</lable>
						<input type="text" class="form-control" name="p_name"
							placeholder="Enter the product here">
					</div>
					<div class="form-group">
						<lable>Producct Description</lable>
						<textarea rows="5" class="form-control" name="p_desc"
							placeholder="enter the description"></textarea>
					</div>
					<div class="form-group">
						<label>Product Price</label> 
						<input type="text" name="p_price"
							placeholder="Enetr price" class="form-control">
					</div>
					<div class="container text-center">
					
					<a href="${pageContext.request.contextPath }/" class="btn btn-outline-danger">Back</a>
					<button type="submit" class="btn btn-primary">Add</button>
					
					</div>
				</form>

			</div>
		</div>
	</div>
</body>
</html>