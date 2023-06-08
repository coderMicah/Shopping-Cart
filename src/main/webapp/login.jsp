<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<%@ include file="includes/head.jsp"%>
</head>
<body>

	<div class="container">
	
		<div class="card w-50 mx-auto my-5">
			<div class="card-header text-center">Login</div>
			<div class="card-body">
				<form action="user-login" method="post">
				<div class="form-group">
					<label for="email">Email</label> <input type="email"
						class="form-control" name="email" id="email"
						placeholder="Enter Your Email" required>
				</div>

				<div class="form-group">
					<label for="password">Password</label> <input type="password"
						class="form-control" name="password" id="password" required>
				</div>

				<div class="text-center">
					<button type="submit" class="btn btn-primary">Login</button>
				</div>
				</form>
			</div>
		</div>
	</div>

	<%@ include file="includes/footer.jsp"%>
</body>
</html>