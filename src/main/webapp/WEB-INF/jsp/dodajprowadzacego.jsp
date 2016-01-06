<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="../layout/taglib.jsp" %>


<form:form commandName="prowadzacy" class="form-horizontal">

<c:if test="${param.success eq true}"> 
	<div class="alert alert-success">Dadano użytkownika.</div>
</c:if>
	<div class="form-group">
		<label for="imie" class="col-sm-2 control-label">Imie:</label>
		<div class="col-sm-10">
			<form:input path="imie" cssClass="form-control" />
		</div>
	</div>
	<div class="form-group">
		<label for="nazwisko" class="col-sm-2 control-label">Nazwisko:</label>
		<div class="col-sm-10">
			<form:input path="nazwisko" cssClass="form-control" />
		</div>
	</div>
	<div class="form-group">
		<label for="login" class="col-sm-2 control-label">Login:</label>
		<div class="col-sm-10">
			<form:input path="login" cssClass="form-control" />
		</div>
	</div>
	<div class="form-group">
		<label for="telefon" class="col-sm-2 control-label">Numer tefefonu:</label>
		<div class="col-sm-10">
			<form:input path="telefon" cssClass="form-control" />
		</div>
	</div>
	

<div class="form-group">
		<label for="password" class="col-sm-2 control-label">Hasło:</label>
		<div class="col-sm-10">
			<form:password path="password" cssClass="form-control" />
		</div>
	</div>
	<div class="form-group">

		<div class="col-sm-2">
			<input type="submit" value="Save" class="btn btn-lg btn-primary"/>
		</div>
	</div>
	
</form:form>
