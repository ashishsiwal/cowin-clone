<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
  <head>
  	<meta charset="UTF-8">
  	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  	<meta name="viewport" content="width=device-width,initial-scale=1">
    <title>Document</title>
    <h1>Welcome to Vaccine Booking Service Based on CO-WIN</h1>
    	<form action="/getOTP" method="post">
  			<label for="mobNumber">Mobile Number:</label>
  			<input type="text" id="mobNumber" name="mobNumber"><br><br>
  			<input type="submit" value="Request OTP">
		</form>
  </head>
  <body>  
  </body>
</html> 