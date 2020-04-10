<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bookdetails</title>
</head>
<body>
	<center>
		<h1>
			<font color=red>Book Details</font>
		</h1>
	</center>
	<center>
		<form method="post" modelAttribute="book">
			<h3>
				<font>Book Details</font>
			</h3>
			<table border="1" cellpadding="1" cellspacing="0" width="40%"">
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">Book Id</td>
					<td>${book.bookid}</td>
				</tr>
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">Book Name</td>
					<td>${book.bookName}</td>
				</tr>
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">Author</td>
					<td>${book.author}</td>
				</tr>
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">Genere</td>
					<td>${book.category}</td>
				</tr>
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">Available
						Copies</td>
					<td>${book.noOfCopies}</td>
				</tr>
			</table>
		</form>
		<br>

		<table width="50%">
			<tr>
				<td><input type="button"
					onClick="location.href = '/SpringSoapWebService-client/jsp/home.jsp'"
					value="Home Page" style="margin: 0 34" /></td>
			</tr>
		</table>

	</center>
</body>
</html>