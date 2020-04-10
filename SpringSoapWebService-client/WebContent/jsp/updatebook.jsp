<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>updatebook</title>
</head>
<body bgcolor="#ffffee" leftmargin="10px" rightmargin="10px">

	<form method="post" modelAttribute="book"
		action="/SpringSoapWebService-client/processUpdateBook.do">
		<h2>
			<center>Update Book</center>
		</h2>
		<center>
			<table cellpadding="0" cellspacing="0" width="50%"">
				<tr>


					<td bgcolor="#FAFAF9" style="padding-left: 10px;">Book Id</td>
					<td><input type="text" name="bookid" maxlength="10"
						value=${book.bookid} /></td>
				</tr>

				<tr>

					<td bgcolor="#FAFAF9" style="padding-left: 10px;">Book Name</td>
					<td><input type="text" name="bookName" maxlength="10"
						value=${book.bookName} /></td>

				</tr>
				<tr>

					<td bgcolor="#FAFAF9" style="padding-left: 10px;">Author</td>
					<td><input type="text" name="author" maxlength="10"
						value=${book.author} /></td>

				</tr>
				<tr>

					<td bgcolor="#FAFAF9" style="padding-left: 10px;">Genere</td>
					<td><input type="text" name="category" maxlength="10"
						value=${book.category} /></td>

				</tr>
				<tr>

					<td bgcolor="#FAFAF9" style="padding-left: 10px;">Available Copies</td>
					<td><input type="text" name="noOfCopies" maxlength="10"
						value=${book.noOfCopies} /></td>

				</tr>
				<tr>
					<td colspan="2" align="center"><br>
						<table width="50%">
							<tr>
								<td><input type="submit" name="Update" value="Update" /></td>
							</tr>
						</table></td>
				</tr>
			</table>
		</center>
	</form>
</body>
</html>