<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container w-75 mt-5 mx-auto">
		<h2>${news.title}</h2>
		<hr>
		<div class="card w-75 mx-auto">
			<img class="card-img-top" src="${news.img}"/>
			<div class="card-body">
				<h4 class="card-title">Date: ${news.date}</h4>
				<p class="card-text">Content: ${news.content}</p>
			</div>
		</div>
		<hr>
		<a href="javascript:history.back()" class="btn btn-primary"><< Back</a>
	</div>
</body>
</html>