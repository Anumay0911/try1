<%@page import="com.example.demo.model.book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
	<style>
		img {
			height: 60px;
			width: 100px;
		}
		tr,td,table {
			text-align: center;
		}
	</style>
</head>
<body>
	<table class="table table-hover table-dark">
	  <thead>
	    <tr>
	      <th scope="col">Book Thumbnail</th>
	      <th scope="col">Title</th>
	      <th scope="col">Description</th>
	      <th scope="col">Author</th>
	      <th scope="col">Publisher</th>
	      <th scope="col">Category</th>
	      <th scope="col">Keywords</th>
	      <th scope="col">Edition</th>
	      <th scope="col">Donor Name</th>
	      <th scope="col">Donation Date</th>
	      <th scope="col">Approval</th>
	    </tr>
	  </thead>
	<%
		List<book> us=(List<book>) request.getAttribute("users");
		for(book u:us) {
	%>
	  <tbody>
	    <tr>
	      <th scope="row"><img src="/uploads/<%= u.getFile()%>"></th>
	      <td><span><%= u.getTitle()%></span></td>
	      <td><%= u.getDescription()%></td>
	      <td><%= u.getAuthor()%></td>
	      <td><%= u.getPublisher()%></td>
	      <td><%= u.getCategory()%></td>
	      <td><%= u.getKeywords()%></td>
	      <td><%= u.getEdition()%></td>
	      <td><%= u.getDonorName()%></td>
	      <td><%= u.getDonationDate()%></td>
	      <td><button type="button" class="btn btn-outline-success">Approve</button><button type="button" class="btn btn-outline-danger">&nbsp;Reject&nbsp;</button></td>
	    </tr>
	<%
		}
	%>
	</table>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
</body>
</html>