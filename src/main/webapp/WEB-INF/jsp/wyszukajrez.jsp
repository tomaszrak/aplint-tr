<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ include file="../layout/taglib.jsp"%>
  
  <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
  Wyszukaj sale
</button>

<!-- Modal -->
<form:form commandName="rezerwa1" cssClass="form-horizontal">



	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Wyszukiwanie</h4>
				</div>
				
				<div class="modal-body">


					<div class="form-group">
						<label for="sala" class="col-sm-5 control-label">Numer
							sali</label>
						<div class="col-sm-6">
							<div class="form-group">
								<form:input path="sala" cssClass="form-control" />
							</div>
						</div>



						<div class="form-group">
							<label for="data" class="col-sm-5 control-label">Data
								rezerwacji:</label>
							<div class="col-sm-6">
								<form:input path="data" cssClass="form-control" />
							</div>
						</div>

					</div>



				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Zamknij</button>
					<input type="submit" class="btn btn-primary" value="Wyszukaj">
				</div>
			</div>
		</div>
	</div>

</form:form>
<br/><br/>

<table class="table table-bordered table-haver table-striped">
	<thead>
		<tr>
			<th>Sale zajęte są w terminach:</th>
		</tr>
		
		
		<tr>
			
			<th>Numer sali</th>
			<th>Data</th>
			<th>Godzina rozpoczęcia</th>
			<th>Godzina zkończenia</th>
			<th>Prowadzący</th>
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
				<td>${rez.imie} ${rez.nazwisko}</td>
				<td>${rez.cel}</td>

			</tr>

		</c:forEach>
	
	<c:forEach items="${rez1}" var="rez1">
			<tr>
				
				
				<td>${rez1.sala}</td>
				<td>${rez1.data}</td>
				<td>${rez1.dataroz}</td>
				<td>${rez1.datazak}</td>
				<td>${rez1.imie} ${rez1.nazwisko}</td>
				<td>${rez1.cel}</td>

			</tr>

		</c:forEach>

		
	</tbody>
</table>