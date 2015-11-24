<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp" %>

<table class="table table-bordered table-haver table-striped">
	<thead>
		<tr>
			<th>Prowadzacy</th>
		</tr>
	</thead>

	<tbody>
		<c:forEach items="${prowadzacy}" var="prowadzacy">
			<tr>
				<td>
				<a href="<spring:url value="/users/${prowadzacy.id}.html"/>">
				${prowadzacy.imie}
				</a>
				</td>
			</tr>

		</c:forEach>
	</tbody>
</table>