<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Manager </title>
    </head>
    <body>
    			<h1>Successfully logged</h1>
    		
   			
	

		 	<div align="center">
	        <h1>Student List</h1>
	        <h3><a href="newStudent">New Student</a></h3>
	        <table border="1">
	        	<th>No</th>
	        	<th>Name</th>
	        	<th>Email</th>
	        	<th>Address</th>
	        	<th>Telephone</th>
	        	<th>Faculty</th>	
	        	<th>Action</th>
	        	
				<c:forEach var="student" items="${listStudent}" varStatus="status">
	        	<tr>
	        		<td>${status.index + 1}</td>
					<td>${student.name}</td>
					<td>${student.email}</td>
					<td>${student.address}</td>
					<td>${student.telephone}</td>
					<td>${student.faculty}</td>
					
					<td>
						<a href="editStudent?id=${student.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="deleteContact?id=${student.id}">Delete</a>
					</td>
							
	        	</tr>
				</c:forEach>	        	
			</table>
    	</div>
    </body>
</html>
