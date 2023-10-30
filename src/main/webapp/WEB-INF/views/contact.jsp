<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page isELIgnored = "false" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>
<div class="container">
<h3>${Header }</h3>
	<form action="processForm" method="POST">
		<div class="form-group">
			<label for="exampleInputEmail1">Email address</label> <input
				type="email" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" placeholder="Enter email" name="email"> 
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Name</label> <input type="text"
				class="form-control" id="userName" placeholder="Enter Name" name="name">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Password</label> <input
				type="password" class="form-control" id="userpassword"
				placeholder="Enter Password" name="password">
		</div>
		<div class="container text-center">
		<button type="submit" class="btn btn-primary">Submit</button>
		</div>
	</form>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		></script>
</body>
</html>