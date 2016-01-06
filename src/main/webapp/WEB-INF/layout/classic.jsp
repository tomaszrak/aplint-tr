<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="calendar.js"></script>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" >

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" ></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:getAsString name="title"/></title>
</head>
<body>

<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>

<tilesx:useAttribute name="current"/>


<div class="container">

 <!-- Static navbar -->
      <nav class="navbar navbar-default">
        <div class="container-fluid">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<spring:url value="/"/>">System rezerwacji sal</a>
          </div>
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="${current == 'index' ? 'active' : '' }"><a href='<spring:url value="/"/>'>Home</a></li>
              <li class="${current == 'users' ? 'active' : '' }"><a href='<spring:url value="/users.html"></spring:url>'>Prowadzacy</a></li>
              <li class="${current == 'wyszukajrez' ? 'active' : '' }"><a href='<spring:url value="/wyszukajrez.html"></spring:url>'>Zapełnienie sali</a></li>
              <security:authorize access="hasRole('ROLE_ADMIN')"> 
              <li class="${current == 'dodajprowadzacego' ? 'active' : '' }"><a href='<spring:url value="/dodajprowadzacego.html"></spring:url>'>Dodaj Prowadzacego</a></li>
                </security:authorize> 
                <security:authorize access="! isAuthenticated()">   
              <li class="${current == 'login' ? 'active' : '' }"><a href='<spring:url value="/login.html"></spring:url>'>Zaloguj się</a></li>
            </security:authorize> 
            <security:authorize access="isAuthenticated()">  
           <li class="${current == 'dodajrez' ? 'active' : '' }"><a href='<spring:url value="/dodajrez.html"></spring:url>'>Dodaj rezerwacje</a></li>
            <li> <a href='<spring:url value="/logout" ></spring:url>'>Wyloguj się</a></li>
            </security:authorize>
            </ul>
           
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </nav>


<tiles:insertAttribute name="body"/>
<br><br>

<tiles:insertAttribute name="footer"/>

</div>
</body>
</html>