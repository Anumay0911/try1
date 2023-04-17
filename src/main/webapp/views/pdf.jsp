<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	
	<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    
    <!-- Custom CSS -->
    
	<style>
      body {
      	background-color: #595959;
      }
      .card {
        background-color: rgba(255, 255, 255, 0.6);
        box-shadow: 0px 0px 10px 2px rgba(0,0,0,0.25);
      }
      button.btn-primary {
		background-image: linear-gradient(to top left, #009999, #4dffff);
	  }
      button.btn-primary:hover {
		background-image: linear-gradient(to bottom right, #ff0066, #ffcc00);
	  }
	  .card:hover {
	  	box-shadow: 10px 10px 10px 10px rgba(0,0,0,0.5);
	  	background-image: linear-gradient(to top left, #4dffff, #009999);
	  	opacity: 0.9;
	  }
    </style>
</head>
<body>
	<div class="fixed-top">
	  <div class="collapse" id="navbarToggleExternalContent">
	    <div class="bg-dark p-4">
	      <h5 class="text-white h4">Library Management System</h5>
	      <span class="text-muted">One of the most trending e-library in the world</span>
	    </div>
	  </div>
	  <nav class="navbar navbar-dark bg-dark">
	    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarToggleExternalContent" aria-controls="navbarToggleExternalContent" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	  </nav>
	</div>
	<br><br>
    <div class="container">
      <div class="row justify-content-center">
        <div class="col-md-6">
          <div class="card mt-5">
            <div class="card-body">
              <h1 class="card-title text-center mb-4">PDF Donation</h1>
              <form method="post" action="/pdf/submit" enctype="multipart/form-data">
                <div class="form-group">
                  <label for="title">PDF Title</label>
                  <input type="text" class="form-control" id="title" name="title" required>
                </div>
                <div class="form-group">
                  <label for="owner">Owner</label>
                  <input type="text" class="form-control" id="owner" name="owner" required>
                </div>
                <div class="form-group">
                  <label for="publisher">Publisher</label>
                  <input type="text" class="form-control" id="publisher" name="publisher" required>
                </div>
                <div class="form-group">
                  <label for="description">Description</label>
                  <input type="text" class="form-control" id="description" name="description" required>
                </div>
                <div class="form-group">
                  <label for="photo">Thumbnail</label>
                  <input type="file" class="form-control" id="photo" name="photo" required>
                </div>
                <div class="form-group">
                  <label for="keywords">Keywords</label>
                  <input type="text" class="form-control" id="keywords" name="keywords" required>
                </div>
                <div class="form-group">
                  <label for="donorName">Donor Name</label>
                  <input type="text" class="form-control" id="donorName" name="donorName">
                </div>
                <div class="form-group">
                  <label for="donationDate">Donation Date</label>
                  <input type="date" class="form-control" id="donationDate" name="donationDate" required>
                </div>
                <div class="form-group">
                  <label for="category">Category</label>
                  <select class="form-control" id="category" name="category">
                    <option value="">Select category...</option>
                    <option value="student">Student</option>
                    <option value="teacher">Teacher</option>
                    <option value="researcher">Researcher</option>
                    <option value="regular">Regular</option>
                  </select>
                </div>
                <button type="submit" class="btn btn-primary btn-block">Donate</button>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
    <br><br>

    <!-- Bootstrap JS -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>