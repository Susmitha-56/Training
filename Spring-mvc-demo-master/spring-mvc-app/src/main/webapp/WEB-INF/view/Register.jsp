<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

.form-inline {  
  display: flex;
  flex-flow: row wrap;
  align-items: center;
}

.form-inline label {
  margin: 5px 10px 5px 0;
}

.form-inline input {
  vertical-align: middle;
  margin: 5px 10px 5px 0;
  padding: 10px;
  background-color: #fff;
  border: 1px solid #ddd;
}

.form-inline button {
  padding: 10px 20px;
  background-color: dodgerblue;
  border: 1px solid #ddd;
  color: white;
  cursor: pointer;
}

.form-inline button:hover {
  background-color: royalblue;
}

@media (max-width: 800px) {
  .form-inline input {
    margin: 10px 0;
  }
  
  .form-inline {
    flex-direction: column;
    align-items: stretch;
  }
}
</style>
</head>
<body>

<h2>Registration Form</h2>
<form class="form-inline" action="/users/Register" method="POST">
  <label for="uname">Name:</label>
  <input type="text"  placeholder="Enter Name" name="name">
   <label for="DOB">DOB:</label>
  <input type="date"  placeholder="Enter DOB" name="dateOfBirth">
   <label for="departmentName">Department Name:</label>
  <input type="text"  placeholder="Enter Name" name="departmentName">
  <button type="submit">Submit</button>
</form>

</body>
</html>