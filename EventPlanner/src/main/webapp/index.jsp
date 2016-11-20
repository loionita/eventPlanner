<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
<title>Event Planner</title>

<meta name="_csrf" content="${_csrf.token}" />
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/default.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>

<body>
	<div class="container">
		<!-- <form method="post" action="login.jsp"> -->
			<div class="page-header" class="text-center">Event planning</div>		
				<form class="form-horizontal" method="post" action="login.jsp">
					<div class="form-group">
						<label class="control-label col-sm-2" for="email">Email:</label>
						<div class="col-sm-10">
							<input type="email" class="form-control" id="email" placeholder="Enter email">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="password">Password:</label>
						<div class="col-sm-10">
							<input type="password" class="form-control" id="password" placeholder="Enter password">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<div class="checkbox">
								<label><input type="checkbox">Remember me</label>
							</div>
						</div>
					</div>
					<div class="form-group">
					 	<div class="col-sm-offset-2 col-sm-10">
							<button type="submit">Submit</button>
						</div>						
					</div>	
					<div class = "form-group">
						<div class="col-sm-offset-2 col-sm-10">
							Don't have an account! <a href="reg.jsp">Sign Up Here</a>
						</div>			
					</div>
				</form>
				
				<!-- <table class="table">
					<thead>
						<tr>
							<th colspan="2">Login Here</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>User Name</td>
							<td><input type="text" name="uname" value="" /></td>
						</tr>
						<tr>
							<td>Password</td>
							<td><input type="password" name="pass" value="" /></td>
						</tr>
						<tr>
							<td><input type="submit" value="Login" /></td>
							<td><input type="reset" value="Reset" /></td>
						</tr>
						<tr>
							<td colspan="2">Yet Not Registered!! <a href="reg.jsp">Register
									Here</a></td>
						</tr>
					</tbody>
				</table> -->
				<!-- <div class="well">
					Username <input type="text" name="uname" value="">
				</div>
				<div class="well">
					Password <input type="password" name="pass" value="" />
				</div> -->
		<!-- </form> -->
	</div>
</body>
</html>