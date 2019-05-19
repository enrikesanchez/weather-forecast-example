<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
    <head>
        <title>Weather Application</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
		    <%@ include file="include/header.jspf" %>
		    
		    <%@ include file="include/form.jspf" %>
		    
		    <br/>
		    
	<table class="table table-hover">
    <thead>
      <tr>
        <th>Date/Time</th>
        <th>Temperature</th>
        <th>Weather</th>
        <th>&nbsp;</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>2014-07-23 09:00:00</td>
        <td>32</td>
        <td>Overcast clouds</td>
        <td><img src="http://openweathermap.org/img/w/10d.png" alt="Overcast clouds"/></td>        
      </tr>
      <tr>
        <td>2014-07-23 09:00:00</td>
        <td>32</td>
        <td>Overcast clouds</td>
        <td><img src="http://openweathermap.org/img/w/10d.png" alt="Overcast clouds"/></td>        
      </tr>
    </tbody>
  </table>
        </div>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </body>
</html>