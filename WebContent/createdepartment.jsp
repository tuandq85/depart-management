<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>create department</title>
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
   <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
   <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="col-12 d-flex align-items-center justify-content-center mt-5">
		 <form class="col-6" action="#" method="POST">
		      <h3 class="text-left mb-5">Add Phòng Ban</h3>
			  <div class="form-group">
			    <label for="maphong">Mã Phòng Ban</label>
			    <input type="text" name="maphong" class="form-control" id="maphong" required="required">
			  </div>
			  <div class="form-group">
			    <label for="tenphong">Tên Phòng Ban</label>
			    <input type="text" name="tenphong" class="form-control" id="tenphong" required="required" >
			  </div>
			  <div class="form-group">
			    <label for="truongphong">Trưởng Phòng</label>
			    <input type="text" name="truongphong" class="form-control" id="truongphong" required="required" >
			  </div>
			
		  	  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>