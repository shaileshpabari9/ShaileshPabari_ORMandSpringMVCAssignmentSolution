<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8"
	crossorigin="anonymous"></script>
<title>Customar Login Page</title>
</head>
<body>
	<div class="container">

		<div class="bg-success text-white">
			<h1 style="text-align: center; color: black; padding-top: 40px;">CUSTOMAR
				RELETIONSHIP MANAGMENT</h1>
			<br> <br>
		</div>
		<br>
	</div>
	<div class=" container bg-warning text-white" style="margin-left: 190px;margin-right: 190px;">
		<div class="container"
			style="padding-top: 40px; padding-bottom: 40px;">
			<form action="List" method=get>
         <h2 class="text-danger" style="height: 30px;" >LOG-IN TO CONTINUE</h2>
         <hr style="background-color: grey;">
				<div class="mb-3">

					<input type="text" class="form-control" id="exampleInputEmail1"
						aria-describedby="emailHelp" placeholder="Enter Email Or Phone"
						name="log_InString" value="${Authantication.log_InString}"
						required>
					<div class="valid-feedback">Valid.</div>
					<div class="invalid-feedback">Please fill out this field.</div>
					<div id="emailHelp" class="form-text">We'll never share your
						email with anyone else.</div>
				</div>
				<div class="mb-3">
					<input type="password" class="form-control"
						placeholder="Enter Password" id="exampleInputPassword1"
						name="passwordString" value="${Authantication.passwordString}"
						required>
					<div class="valid-feedback">Valid.</div>
					<div class="invalid-feedback">Please fill out this field.</div>
				</div>
				<div class="form-group form-check">
					<input class="form-check-input" type="checkbox" name="remember"
						required> Check Me Out.
					<div class="valid-feedback">Valid.</div>
					<div class="invalid-feedback">Check this checkbox to
						continue.</div>

				</div>
				<button type="submit" class="btn btn-primary">Sign In</button>

			</form>
		</div>
	</div>
</body>
</html>