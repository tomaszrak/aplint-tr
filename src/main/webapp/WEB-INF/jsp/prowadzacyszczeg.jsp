<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="../layout/taglib.jsp" %>

<h1>

${user.imie}
${user.nazwisko}<br />

</h1>
<h4>
Numer telefonu: ${user.telefon}
</h4>
<table class="table table-bordered table-haver table-striped">
	<thead>
	<tr>
			<th>Rezerwacje:</th>
			</tr>
		<tr>
			<th>Numer sali</th>
			<th>Data</th>
			<th>Godzina rozpoczęcia</th>
			<th>Godzina zkończenia</th>
			<th>Cel</th>
		</tr>

	</thead>

	<tbody>
		<c:forEach items="${rez}" var="rez">
			<tr>
				<td>${rez.sala}</td>
				<td>${rez.data}</td>
				<td>${rez.dataroz}</td>
				<td>${rez.datazak}</td>
				<td>${rez.cel}</td>
				
			</tr>

		</c:forEach>
	</tbody>
</table>
