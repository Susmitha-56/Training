<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Technical Support Request</h1><br>
<hr>
<form action="check" method="post">

<h2>
Email:<input type="text" name="email"><br>
Software:
<select>
  <option value="mv">Microsoft Word</option>
  <option value="me">Microsoft Excel</option>
  <option value="mp">Microsoft PowerPoint</option>
</select>
<br>
Operating System:
<select>
  <option value="ub">Ubuntu</option>
  <option value="win">Windows 2000</option>
</select>
<br>
Problem Description:<br>
<textarea name="pd" rows="10" cols="30">
</textarea>
<input type="submit" name="b1" value="Submit Request">

</h2>
</form>
</body>
</html>