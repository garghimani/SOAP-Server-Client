<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bookhomepage</title>
</head>
<body bgcolor="#ffffee" leftmargin="10px" rightmargin="10px">

	<h2>
		<center>Books</center>
	</h2>
	<p align="center">
		<!-- --Tab Links -->
	<center>
		<div class="tab">
			<button class="tablinks"
				onClick="location.href = '/SpringSoapWebService-client/jsp/viewbook.jsp'">View
				Book</button>
			<br>
			<br>
			<button class="tablinks"
				onClick="location.href = '/SpringSoapWebService-client/jsp/addbook.jsp'">Add 
				Book</button>
			<br><br>
			<button class="tablinks"
				onClick="location.href = '/SpringSoapWebService-client/jsp/modifybook.jsp'">Update
				Book</button>
			<br><br>
			<button class="tablinks"
				onClick="location.href = '/SpringSoapWebService-client/jsp/deletebook.jsp'">Delete
				Book</button>

		</div>

		</p>
		</form>
</body>
</html>